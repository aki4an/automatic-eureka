import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("Введите номер задания (0 - Выход. 1 - Строки. 2 - Циклы №1. 3 - Циклы №2. 4 - Циклы №3. 5 - Циклы №4): ");
            n = scanner.nextInt();
            scanner.nextLine();

            switch (n) {
                case 0 -> System.out.println("Выход...");
                case 1 -> strings();
                case 2 -> loopsOne();
                case 3 -> loopsTwo();
                case 4 -> loopsThree();
                case 5 -> loopsFour();
                default -> System.out.println("Такого задания нет!");
            }
        } while (n != 0);
    }

    private static void strings() {
        System.out.println("Hi, I'm Ksenia Kireeva and I'm just a chill girl.");

        byte valueByte = 2;
        short valueShort = 20;
        int valueInt = 200;
        long valueLong = 2000;
        float valueFractionalOne = 2.2f;
        double valueFractionalTwo = 2.21;
        boolean valueHappy = true;
        char valueSymbol = 8756;
        System.out.println("Byte: " + valueByte + "\nShort: " + valueShort + "\nInt: " + valueInt + "\nLong: " + valueLong
                + "\nFloat: " + valueFractionalOne + "\nDouble: " + valueFractionalTwo + "\nBoolean: " + valueHappy
                + "\nChar: " + valueSymbol);

        System.out.print("Input text: ");
        String textOne = scanner.nextLine();
        System.out.println("Length: " + textOne.length());
        System.out.println("Is empty: " + textOne.isEmpty());
        System.out.print("Input symbol number: ");
        int symbolNum = scanner.nextInt();
        System.out.println("Symbol: " + textOne.charAt(symbolNum - 1));
        System.out.print("Input another text: ");
        scanner.nextLine();
        String textTwo = scanner.nextLine();
        System.out.println("The text and symbols is the same: " + textOne.equals(textTwo));
        System.out.println("The text is the same: " + textOne.equalsIgnoreCase(textTwo));
        System.out.print("Input beginning of the first text: ");
        String beginning = scanner.nextLine();
        System.out.println("The first text starts with \"" + beginning + "\": " + textOne.startsWith(beginning));
        System.out.print("Input ends of the first text: ");
        String ends = scanner.nextLine();
        System.out.println("The first text ends with \"" + ends + "\": " + textOne.endsWith(ends));
        System.out.print("Input text: ");
        String textForContaints = scanner.nextLine();
        System.out.println("The first text containts \"" + textForContaints + "\": " + textOne.contains(textForContaints));
        System.out.print("Input replacement text: ");
        String replacementText = scanner.nextLine();
        System.out.print("Input text for replacement: ");
        String textForReplacement = scanner.nextLine();
        System.out.println("First text with replacement: " + textOne.replace(replacementText, textForReplacement));
        System.out.println("First text lowercase: " + textOne.toLowerCase());
        System.out.printf("I remind you: Second text - %s, Char - %s", textTwo, valueSymbol);
        StringBuffer manyText = new StringBuffer("One");
        manyText.append(" two");
        manyText.append(" three");
        System.out.println(manyText);
    }

    private static void loopsOne() {
        System.out.print("Please enter your score: ");
        int score = scanner.nextInt();

        while (score < 0 || score > 100) {
            System.out.print("Enter the correct score: ");
            score = scanner.nextInt();
        }

        if (score >= 90) {
            System.out.println("Your grade is A!");
        } else if (score >= 80) {
            System.out.println("Your grade is B!");
        } else if (score >= 70) {
            System.out.println("Your grade is C!");
        } else if (score >= 60) {
            System.out.println("Your grade is D!");
        } else if (score >= 50) {
            System.out.println("Your grade is E!");
        } else System.out.println("Your grade is F!");
    }

    private static void loopsTwo() {
        String userInput = "";

        while (!userInput.equals("Exit")) {
            System.out.print("Please enter something: ");
            userInput = scanner.nextLine();
            System.out.println("You've entered: " + userInput);
        }
    }

    private static void loopsThree() {
        System.out.print("Please enter a number: ");
        int x = scanner.nextInt();
        int sum = 0;

        for (int i = 0, j = 0; i <= x || j >= x; i++, j--) {
            if (x >= 0) sum += i;
            else sum += j;
        }

        System.out.printf("The sum of all numbers from 0 to %d is %d\n", x, sum);
    }

    private static void loopsFour() {
        int channel;
        String[] tvChannels = new String[]{"1 - Беларусь 1", "2 - Беларусь 2", "3 - Беларусь 3", "4 - Беларусь 4", "5 - Беларусь 5"};

        do {
            System.out.print("Введите номер канала (0 - Выход): ");
            channel = scanner.nextInt();

            if (channel > 0 && channel <= tvChannels.length) {
                System.out.println(tvChannels[channel - 1]);
            } else if (channel == 0) {
                System.out.println("Выход...");
            } else System.out.println("Такого канала не существует!");
        } while (channel != 0);
    }
}