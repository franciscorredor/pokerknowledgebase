/**
 * 
 */
package com.wirelesssoft.main;

import java.util.Date;

import com.wirelesssoft.object.Deck;
import com.wirelesssoft.play.Hand;

/**
 * @author HP
 *
 */
public class EjecutarKnowledgeBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("inicio" + new Date());
		int numJugada = 0;
		for (int i = 0; i <1000; i++) {
			//System.out.println("-- Iteracion ["+(i)+"] --");
			Deck d1 = new Deck();
			//System.out.println("numJugada%15:"+(numJugada%15));
			Hand h = new Hand(d1, numJugada++);
			if (numJugada%5 == 0){
				numJugada = 0;
			}
		}
		
		System.out.println("fin" + new Date());

	}
	
	//Escenarios de Prueba
	//01: As, J, Q, K, 10
	//02: 2, as, JK, Q , K

}
