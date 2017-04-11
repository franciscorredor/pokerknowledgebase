package com.wirelesssoft.object;

import java.util.HashMap;
import java.util.Map;

public class CardValue {
	
	private Map<String, Integer> hmCrdVle;
	private Map<Integer, String> hmVleCrd;
	
	public CardValue(){
		hmCrdVle = new HashMap<String, Integer>(52);
		hmVleCrd = new HashMap<Integer, String>(52);
		
		//*******************
		//Obtiene el valor entero, dada una carta
		//********************
		//suitType: Corazones
		hmCrdVle.put("AC", 0);
		hmCrdVle.put("2C", 1);
		hmCrdVle.put("3C", 2);
		hmCrdVle.put("4C", 3);
		hmCrdVle.put("5C", 4);
		hmCrdVle.put("6C", 5);
		hmCrdVle.put("7C", 6);
		hmCrdVle.put("8C", 7);
		hmCrdVle.put("9C", 8);
		hmCrdVle.put("10C", 9);
		hmCrdVle.put("JC", 10);
		hmCrdVle.put("QC", 11);
		hmCrdVle.put("KC", 12);
		
		//suitType: Picas
		hmCrdVle.put("AP", 0);
		hmCrdVle.put("2P", 1);
		hmCrdVle.put("3P", 2);
		hmCrdVle.put("4P", 3);
		hmCrdVle.put("5P", 4);
		hmCrdVle.put("6P", 5);
		hmCrdVle.put("7P", 6);
		hmCrdVle.put("8P", 7);
		hmCrdVle.put("9P", 8);
		hmCrdVle.put("10P", 9);
		hmCrdVle.put("JP", 10);
		hmCrdVle.put("QP", 11);
		hmCrdVle.put("KP", 12);
		
		//suitType: Diamantes
		hmCrdVle.put("AD", 0);
		hmCrdVle.put("2D", 1);
		hmCrdVle.put("3D", 2);
		hmCrdVle.put("4D", 3);
		hmCrdVle.put("5D", 4);
		hmCrdVle.put("6D", 5);
		hmCrdVle.put("7D", 6);
		hmCrdVle.put("8D", 7);
		hmCrdVle.put("9D", 8);
		hmCrdVle.put("10D", 9);
		hmCrdVle.put("JD", 10);
		hmCrdVle.put("QD", 11);
		hmCrdVle.put("KD", 12);
		
		//suitType: TREBOLES
		hmCrdVle.put("AT", 0);
		hmCrdVle.put("2T", 1);
		hmCrdVle.put("3T", 2);
		hmCrdVle.put("4T", 3);
		hmCrdVle.put("5T", 4);
		hmCrdVle.put("6T", 5);
		hmCrdVle.put("7T", 6);
		hmCrdVle.put("8T", 7);
		hmCrdVle.put("9T", 8);
		hmCrdVle.put("10T", 9);
		hmCrdVle.put("JT", 10);
		hmCrdVle.put("QT", 11);
		hmCrdVle.put("KT", 12);
		
		//*******************
		//Obtiene la carta dada un valor entero
		//********************
		//suitType: Corazones
		hmVleCrd.put( 0,"AC");
		hmVleCrd.put( 1,"2C");
		hmVleCrd.put( 2,"3C");
		hmVleCrd.put( 3,"4C");
		hmVleCrd.put( 4,"5C");
		hmVleCrd.put( 5,"6C");
		hmVleCrd.put( 6,"7C");
		hmVleCrd.put( 7,"8C");
		hmVleCrd.put( 8,"9C");
		hmVleCrd.put( 9,"10C");
		hmVleCrd.put(10,"JC");
		hmVleCrd.put(11,"QC");
		hmVleCrd.put(12,"KC");
		
		//suitType: Picas
		hmVleCrd.put( 0,"AP");
		hmVleCrd.put( 1,"2P");
		hmVleCrd.put( 2,"3P");
		hmVleCrd.put( 3,"4P");
		hmVleCrd.put( 4,"5P");
		hmVleCrd.put( 5,"6P");
		hmVleCrd.put( 6,"7P");
		hmVleCrd.put( 7,"8P");
		hmVleCrd.put( 8,"9P");
		hmVleCrd.put( 9,"10P");
		hmVleCrd.put( 10,"JP");
		hmVleCrd.put( 11,"QP");
		hmVleCrd.put( 12,"KP");
		
		//suitType: Diamantes
		hmVleCrd.put( 0,"AD");
		hmVleCrd.put( 1,"2D");
		hmVleCrd.put( 2,"3D");
		hmVleCrd.put( 3,"4D");
		hmVleCrd.put( 4,"5D");
		hmVleCrd.put( 5,"6D");
		hmVleCrd.put( 6,"7D");
		hmVleCrd.put( 7,"8D");
		hmVleCrd.put( 8,"9D");
		hmVleCrd.put( 9,"10D");
		hmVleCrd.put( 10,"JD");
		hmVleCrd.put( 11,"QD");
		hmVleCrd.put( 12,"KD");

		//suitType: TREBOLES
		hmVleCrd.put( 0,"AT");
		hmVleCrd.put( 1,"2T");
		hmVleCrd.put( 2,"3T");
		hmVleCrd.put( 3,"4T");
		hmVleCrd.put( 4,"5T");
		hmVleCrd.put( 5,"6T");
		hmVleCrd.put( 6,"7T");
		hmVleCrd.put( 7,"8T");
		hmVleCrd.put( 8,"9T");
		hmVleCrd.put( 9,"10T");
		hmVleCrd.put( 10,"JT");
		hmVleCrd.put( 11,"QT");
		hmVleCrd.put( 12,"KT");
	}

	/**
	 * @return the hmCrdVle
	 */
	public Map<String, Integer> getHmCrdVle() {
		return hmCrdVle;
	}
	
	public Map<Integer, String> getHmVleCrd() {
		return hmVleCrd;
	}

	/**
	 * @param hmCrdVle the hmCrdVle to set
	 */
//	public void setHmCrdVle(HashMap hmCrdVle) {
//		this.hmCrdVle = hmCrdVle;
//	}

}
