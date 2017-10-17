/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessin_game;

import java.util.*;

/**
 *
 * @author micha
 */
/**
 * Computer selects comparison operators (< or >). User wins if the computer
 * chooses < operator and user value is less than 50 or if the computer chooses
 * >
 * operator and user value > 50. Otherwise, the computer wins.
 *
 */

public class step3 {

    public static void main(String[] args) {

        //create a random object
        Random bool = new Random();
        boolean booln = bool.nextBoolean();
        System.out.println("Input a number");
        //create scanner object
        Scanner val = new Scanner(System.in);
        int value = val.nextInt();

        if ((booln == true) && (value < 50)) {
            System.out.println("Number is lass than 50");
            System.out.println("Boolean value is True");
            System.out.println("You win!!");

        } else if ((booln == false) && (value > 50)) {
            System.out.println("Number is greater than 50");
            System.out.println("Boolean value is False");
            System.out.println("You win!!");

        } else {
            System.out.println("You loose!!");
        }
    }

}
