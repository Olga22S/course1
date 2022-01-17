package ru.skypro.homework6;

public class Task7 {

    public static void main(String[] args) {

        String first = "135";
        String second = "246";
        StringBuilder str = new StringBuilder((first));
        for (int i = 0, j = 0; j < second.length(); i += 2, j++) {
            str.insert(i + 1, second.charAt(j));
        }
        System.out.println("Данные строки - " + str);
    }
}
