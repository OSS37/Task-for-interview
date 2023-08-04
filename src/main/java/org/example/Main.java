package org.example;

//напишите пример перехвата и обработки исключения в блоке try-catch-метода
public class Main {

    static int [] number = {0,1,2,3,4,5};
    public static void main(String[] args) {
        check(6);

    }

    public static void check (int index) {
        try {
            System.out.println(number[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный индекс, введите значение до :" + (number.length-1));

        }
    }

}