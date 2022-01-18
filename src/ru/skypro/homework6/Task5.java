package ru.skypro.homework6;

public class Task5 {

    public static void main(String[] args) {

        String fullName = "Ivanov Ivan Ivanovich";
        char separator = ' ';
        int firstSepIndex = fullName.indexOf(separator);
        int lastSepIndex = fullName.lastIndexOf(separator);
        String firstName = fullName.substring(firstSepIndex + 1, lastSepIndex);
        String middleName = fullName.substring(lastSepIndex + 1);
        String lastName = fullName.substring(0, firstSepIndex);

        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);
    }
}
