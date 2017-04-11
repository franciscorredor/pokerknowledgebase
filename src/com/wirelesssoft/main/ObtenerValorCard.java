/**
 * 
 */
package com.wirelesssoft.main;

import java.util.Map;
import java.util.Scanner;

import com.wirelesssoft.object.CardValue;

/**
 * @author Francisco
 *
 */
public class ObtenerValorCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		CardValue cv = new CardValue();
		
		while (true) {

            System.out.print("--> ");
            String input = scanner.nextLine();
            
            Map<String, Integer> value = cv.getHmCrdVle();
            
            System.out.println(value.get(input.toUpperCase()));
            
            if ("x".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            
		}

	}

}
