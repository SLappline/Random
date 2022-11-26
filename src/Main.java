import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
        Random random = new Random();
        byte[] mas = new byte[15];
        random.nextBytes(mas);
        for (int i = 0; i<mas.length; i++){
            mas[i] = (byte) Math.round((Math.random() * 40) - 20);
        }
        System.out.println(Arrays.toString(mas));
        //1. Выведите максимальный и минимальный элемент массива.
        int max = 0;
        int min = 0;
        for (int i = 0; i<mas.length; i++){
            if (mas[i] > max){
                max = mas[i];
            }
            else if (mas[i] < min){
                min = mas[i];
            }
        }
        System.out.println("Максимальное: " + max);
        System.out.println("Минимальное: " + min);
        //2. Из максимального и минимального значения выведите наибольшее по модулю.
        int result1 = Math.abs(max);
        int result2 = Math.abs(min);
        if (result1 > result2){
            System.out.println("Наибольшее по модулю: " + (result1));
        }
        else{
            System.out.println("Наибольшее по модулю: " + (result2));
        }
    }
}