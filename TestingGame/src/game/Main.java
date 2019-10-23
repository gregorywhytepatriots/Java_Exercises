package game;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
        String letter = "FJ";
        String getLetter;
        boolean play = true;
        int play1 = 0;
        Random r = new Random();
        char correctLetter;


        while(play1 < 5){

            System.out.println("Type Letter that Displays(You have 5 tries)");

            System.out.println(letter.charAt(r.nextInt(letter.length())));
            correctLetter = letter.charAt(r.nextInt(letter.length()));
            getLetter = k.nextLine();
            if(Character.toString(correctLetter).matches(getLetter)){
                System.out.println("You type the letter corretly");
            }else {
                System.out.println("Try again");
            }

            ++play1;

        }
       /* String letter = "FJ";
        for (int i = 0; i < 10; i++) {
            System.out.print(letter.charAt(r.nextInt(letter.length())));
        }*/


      /*  int roll = rand.nextInt();
        String type = " ";
        String reply = "yes";
        int score = 0;

        for(int i = 0; i <10; i++ ){
            System.out.println(letters[ro].charAt());
        }*/
        /*while(!reply.equals("no")){
           // System.out.println(letters[roll]);
            System.out.println(roll);
        }*/



        /*for (int i =0; i< 20; i++) {

            System.out.println("Please type the letter that appear on the Screen");
            System.out.println(letters[roll]);

            type = sc.nextLine();
            if(type.equals(letters[roll])){
                score++;
            }
            else {
                System.out.println("Try again");
            }

            }*/
        }
    }

