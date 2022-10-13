import java.util.Scanner;
public class Bingo{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Lucky Number: ");

        int luckyNUmber = scanner.nextInt();
        int random = (int)(Math.random()* 10);

        System.out.println("Bingo Number: " + random);

        if (luckyNUmber == random)
            System.out.println(" * Congratulations  !!!***" + "\n * You are a winner !!!***");

        else
            System.out.println("Sorry !!! better luck next time !!!");

    }
}