package ru.skypro.homework1.task5;

public class TaskFive {

    public static void main(String[] args) {

        double masha = 67_760;
        double denis = 83_690;
        double kristina = 76_230;
        double mashaAfterIncrease = masha * 0.1 + masha;
        double denisAfterIncrease = denis * 0.1 + denis;
        double kristinaAfterIncrease = kristina * 0.1 + kristina;
        double mashaYearDifference = mashaAfterIncrease * 12 - masha * 12;
        double denisYearDifference = denisAfterIncrease* 12 - denis * 12;
        double kristinaYearDifference = kristinaAfterIncrease * 12 - kristina * 12;

        System.out.print("Маша теперь получает " + mashaAfterIncrease + " рублей.");
        System.out.println("Годовой доход вырос на " + mashaYearDifference + " рублей");
        System.out.print("Денис теперь получает " + denisAfterIncrease+ " рублей.");
        System.out.println("Годовой доход вырос на " + denisYearDifference + " рублей");
        System.out.print("Кристина теперь получает " + kristinaAfterIncrease + " рублей.");
        System.out.println("Годовой доход вырос на " + kristinaYearDifference + " рублей");
    }
}
