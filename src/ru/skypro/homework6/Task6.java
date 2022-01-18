package ru.skypro.homework6;

public class Task6 {

    public static void main(String[] args) {

        String fullName = "ivanov ivan ivanovich";
        char[] fullNameAsArray = fullName.toCharArray();
        for (int i = 0; i < fullNameAsArray.length; i++) {
            if (i == 0 || fullNameAsArray[i - 1] == ' ') {
                fullNameAsArray[i] = Character.toUpperCase(fullNameAsArray[i]);
            }
        }
        System.out.print("Верное написание Ф. И. О. сотрудника с заглавных букв - ");
        System.out.println(String.valueOf(fullNameAsArray));
    }
}
