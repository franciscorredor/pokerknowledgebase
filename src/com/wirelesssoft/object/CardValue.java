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
		hmCrdVle.put("AC", 1);
		hmCrdVle.put("2C", 2);
		hmCrdVle.put("3C", 3);
		hmCrdVle.put("4C", 4);
		hmCrdVle.put("5C", 5);
		hmCrdVle.put("6C", 6);
		hmCrdVle.put("7C", 7);
		hmCrdVle.put("8C", 8);
		hmCrdVle.put("9C", 9);
		hmCrdVle.put("10C", 10);
		hmCrdVle.put("JC", 11);
		hmCrdVle.put("QC", 12);
		hmCrdVle.put("KC", 13);
		
		//suitType: Picas
		hmCrdVle.put("AP", 1);
		hmCrdVle.put("2P", 2);
		hmCrdVle.put("3P", 3);
		hmCrdVle.put("4P", 4);
		hmCrdVle.put("5P", 5);
		hmCrdVle.put("6P", 6);
		hmCrdVle.put("7P", 7);
		hmCrdVle.put("8P", 8);
		hmCrdVle.put("9P", 9);
		hmCrdVle.put("10P", 10);
		hmCrdVle.put("JP", 11);
		hmCrdVle.put("QP", 12);
		hmCrdVle.put("KP", 13);
		
		//suitType: Diamantes
		hmCrdVle.put("AD", 1);
		hmCrdVle.put("2D", 2);
		hmCrdVle.put("3D", 3);
		hmCrdVle.put("4D", 4);
		hmCrdVle.put("5D", 5);
		hmCrdVle.put("6D", 6);
		hmCrdVle.put("7D", 7);
		hmCrdVle.put("8D", 8);
		hmCrdVle.put("9D", 9);
		hmCrdVle.put("10D", 10);
		hmCrdVle.put("JD", 11);
		hmCrdVle.put("QD", 12);
		hmCrdVle.put("KD", 13);
		
		//suitType: TREBOLES
		hmCrdVle.put("AT", 1);
		hmCrdVle.put("2T", 2);
		hmCrdVle.put("3T", 3);
		hmCrdVle.put("4T", 4);
		hmCrdVle.put("5T", 5);
		hmCrdVle.put("6T", 6);
		hmCrdVle.put("7T", 7);
		hmCrdVle.put("8T", 8);
		hmCrdVle.put("9T", 9);
		hmCrdVle.put("10T", 10);
		hmCrdVle.put("JT", 11);
		hmCrdVle.put("QT", 12);
		hmCrdVle.put("KT", 13);
		
		//*******************
		//Obtiene la carta dada un valor entero
		//********************
		//suitType: Corazones
		hmVleCrd.put( 1,"AC");
		hmVleCrd.put( 2,"2C");
		hmVleCrd.put( 3,"3C");
		hmVleCrd.put( 4,"4C");
		hmVleCrd.put( 5,"5C");
		hmVleCrd.put( 6,"6C");
		hmVleCrd.put( 7,"7C");
		hmVleCrd.put( 8,"8C");
		hmVleCrd.put( 9,"9C");
		hmVleCrd.put( 10,"10C");
		hmVleCrd.put(11,"JC");
		hmVleCrd.put(12,"QC");
		hmVleCrd.put(13,"KC");
		
		//suitType: Picas
		hmVleCrd.put( 1,"AP");
		hmVleCrd.put( 2,"2P");
		hmVleCrd.put( 3,"3P");
		hmVleCrd.put( 4,"4P");
		hmVleCrd.put( 5,"5P");
		hmVleCrd.put( 6,"6P");
		hmVleCrd.put( 7,"7P");
		hmVleCrd.put( 8,"8P");
		hmVleCrd.put( 9,"9P");
		hmVleCrd.put( 10,"10P");
		hmVleCrd.put( 11,"JP");
		hmVleCrd.put( 12,"QP");
		hmVleCrd.put( 13,"KP");
		
		//suitType: Diamantes
		hmVleCrd.put( 1,"AD");
		hmVleCrd.put( 2,"2D");
		hmVleCrd.put( 3,"3D");
		hmVleCrd.put( 4,"4D");
		hmVleCrd.put( 5,"5D");
		hmVleCrd.put( 6,"6D");
		hmVleCrd.put( 7,"7D");
		hmVleCrd.put( 8,"8D");
		hmVleCrd.put( 9,"9D");
		hmVleCrd.put( 10,"10D");
		hmVleCrd.put( 11,"JD");
		hmVleCrd.put( 12,"QD");
		hmVleCrd.put( 13,"KD");

		//suitType: TREBOLES
		hmVleCrd.put( 1,"AT");
		hmVleCrd.put( 2,"2T");
		hmVleCrd.put( 3,"3T");
		hmVleCrd.put( 4,"4T");
		hmVleCrd.put( 5,"5T");
		hmVleCrd.put( 6,"6T");
		hmVleCrd.put( 7,"7T");
		hmVleCrd.put( 8,"8T");
		hmVleCrd.put( 9,"9T");
		hmVleCrd.put( 10,"10T");
		hmVleCrd.put( 11,"JT");
		hmVleCrd.put( 12,"QT");
		hmVleCrd.put( 13,"KT");
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
