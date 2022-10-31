import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-- Set B --");

        boolean isRaining = false;
        double bank = 10.50;
        int minutes = 45;
        boolean shop;
        boolean stay;

        shop = (bank >= 8.00) && (minutes < 60) && !isRaining;
        System.out.println(shop);

        stay = !(bank > 5) || minutes > 30 || isRaining;
        System.out.println(stay);

        int score = 65;
        if (score < 0 || score > 100 || score % 2 != 0)
        {
            System.out.println("Illegal score");
        }
        else if (score >= 0 && score <= 100 && score % 2 == 0)
        {
            System.out.println("Legal score");
        }
        else
        {
            System.out.println("Invalid!");
        }

        System.out.println("- part 2 -");

        score = 80;
        if (score < 0 || score > 100 || score % 2 != 0)
        {
            System.out.println("Illegal score");
        }
        else if (score >= 0 && score <= 100 && score % 2 == 0)
        {
            System.out.println("Legal score");
        }
        else
        {
            System.out.println("Invalid!");
        }

        String word = "Apple";
        if (!word.toLowerCase().equals("apple"))
        {
            System.out.println("beep!");
        }
        else
        {
            System.out.println("boop!");
        }
    }
}
