package ru.skypro.homework6;

public class Main {

    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.print("Данные ФИО сотрудника для административного отдела — ");
        System.out.println(fullName.replace(' ', ';'));
        replaceCharsInFullName();
    }

    public static void replaceCharsInFullName() {
        String oldFullName = "Иванов Семён Семёнович";
        String newFullName = "";

        if (oldFullName.contains("ё")) {
            newFullName = oldFullName.replace('ё', 'е');
        } else {
            newFullName = oldFullName;
        }
        System.out.println("ФИО сотрудника — " + newFullName);
    }
}
