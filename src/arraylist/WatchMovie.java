/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Enter the movie ticket price \n");
        Scanner sc = new Scanner(System.in);
        int movieprice = sc.nextInt();
        int movierating = sc.nextInt();
        if (movieprice >= 12 && movierating ==5 ) {
        	System.out.println("Ok");
        	
        }
        

    }
}
