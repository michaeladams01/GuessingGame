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
//select one of the comparison operators (< or >) randomly and prints it

public class step2 {

    public static void main(String[] args) {

        Random val = new Random();
        boolean value = val.nextBoolean();

        if (value == true) {
            System.out.println("<");
        } else {
            System.out.println(">");
        }

    }

}
