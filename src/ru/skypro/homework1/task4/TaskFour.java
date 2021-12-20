package ru.skypro.homework1.task4;

public class TaskFour {

    public static void main(String[] args) {

        int purpose = 7 * 1000;
        int caseOne = purpose / 250;
        int caseTwo = purpose / 500;
        int common = caseOne + caseTwo;
        int average = common / 2;
        
        System.out.println("In case weight loss 250 gram per day: " + caseOne + " days");
        System.out.println("In case weight loss 500 gram per day: " + caseTwo + " days");
        System.out.println("Average number of days: " + average + " days");
    }
}
