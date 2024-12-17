import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        Scanner scanner = new Scanner(System.in);
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
        System.out.println(String.format("I remind you: Second text - %s, Char - %s", textTwo, valueSymbol));
        StringBuffer manyText = new StringBuffer("One");
        manyText.append(" two");
        manyText.append(" three");
        System.out.println(manyText);
    }
}