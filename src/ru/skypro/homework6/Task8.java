package ru.skypro.homework6;

public class Task8 {

    public static void main(String[] args) {

        String str = "aabccddefgghiijjkk";
        for (int i = 0; i < str.length(); i++) {
            if (str.lastIndexOf(str.charAt(i)) != i) {
                System.out.print(str.charAt(i));
                i = str.lastIndexOf(str.charAt(i));
            }
        }
    }
}
