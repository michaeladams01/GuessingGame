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
public class step4 {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        System.out.println(number(num));
        System.out.println("");
        System.out.println(comparisonOperator());
        System.out.println("");
        boolean b = comparisonOperator();
        System.out.println(game(b, num));

    }

    public static int number(int num) {
        return num;
    }

    public static boolean comparisonOperator() {
        Random val = new Random();
        boolean value = val.nextBoolean();
        String operator;
        if (value == true) {
            operator = "<";
            return true;
        } else {
            return false;
        }
    }

    public static String game(boolean b, int a) {
        String result;
        if ((b == true) && (a < 50)) {
            result = "You win!!";
            return result;
        } else if ((b == false) && (a > 50)) {
            result = "You win!!";
            return result;
        } else {
            result = "You loose!!";
            return result;
        }
    }

}
