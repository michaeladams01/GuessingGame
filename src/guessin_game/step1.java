/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessin_game;

import java.util.Scanner;

/**
 *
 * @author micha
 */
//prints whether the number entered by the user is greater or less than 50

public class step1 {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        if (num > 50) {
            System.out.println("Number is greater than 50");
        } else {
            System.out.println("Number is less than 50");
        }

    }

}
