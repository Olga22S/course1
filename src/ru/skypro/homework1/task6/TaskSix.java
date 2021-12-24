package ru.skypro.homework1.task6;

public class TaskSix {

    public static void main(String[] args) {
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result = a * (b + (c - d * e));
        result = -result;
        System.out.println(result);
    }
}
