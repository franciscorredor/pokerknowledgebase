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
		hmCrdVle.put("AC", 11);
		hmCrdVle.put("2C", 12);
		hmCrdVle.put("3C", 13);
		hmCrdVle.put("4C", 14);
		hmCrdVle.put("5C", 15);
		hmCrdVle.put("6C", 16);
		hmCrdVle.put("7C", 17);
		hmCrdVle.put("8C", 18);
		hmCrdVle.put("9C", 19);
		hmCrdVle.put("10C",110);
		hmCrdVle.put("JC", 111);
		hmCrdVle.put("QC", 112);
		hmCrdVle.put("KC", 113);
		
		//suitType: Picas
		hmCrdVle.put("AP", 21);
		hmCrdVle.put("2P", 22);
		hmCrdVle.put("3P", 23);
		hmCrdVle.put("4P", 24);
		hmCrdVle.put("5P", 25);
		hmCrdVle.put("6P", 26);
		hmCrdVle.put("7P", 27);
		hmCrdVle.put("8P", 28);
		hmCrdVle.put("9P", 29);
		hmCrdVle.put("10P",210);
		hmCrdVle.put("JP", 211);
		hmCrdVle.put("QP", 212);
		hmCrdVle.put("KP", 213);
		
		//suitType: Diamantes
		hmCrdVle.put("AD", 31);
		hmCrdVle.put("2D", 32);
		hmCrdVle.put("3D", 33);
		hmCrdVle.put("4D", 34);
		hmCrdVle.put("5D", 35);
		hmCrdVle.put("6D", 36);
		hmCrdVle.put("7D", 37);
		hmCrdVle.put("8D", 38);
		hmCrdVle.put("9D", 39);
		hmCrdVle.put("10D",310);
		hmCrdVle.put("JD", 311);
		hmCrdVle.put("QD", 312);
		hmCrdVle.put("KD", 313);
		
		//suitType: TREBOLES
		hmCrdVle.put("AT", 41);
		hmCrdVle.put("2T", 42);
		hmCrdVle.put("3T", 43);
		hmCrdVle.put("4T", 44);
		hmCrdVle.put("5T", 45);
		hmCrdVle.put("6T", 46);
		hmCrdVle.put("7T", 47);
		hmCrdVle.put("8T", 48);
		hmCrdVle.put("9T", 49);
		hmCrdVle.put("10T",410);
		hmCrdVle.put("JT", 411);
		hmCrdVle.put("QT", 412);
		hmCrdVle.put("KT", 413);
		
		//*******************
		//Obtiene la carta dada un valor entero
		//********************
		//suitType: Corazones
		hmVleCrd.put( 11,"AC");
		hmVleCrd.put( 12,"2C");
		hmVleCrd.put( 13,"3C");
		hmVleCrd.put( 14,"4C");
		hmVleCrd.put( 15,"5C");
		hmVleCrd.put( 16,"6C");
		hmVleCrd.put( 17,"7C");
		hmVleCrd.put( 18,"8C");
		hmVleCrd.put( 19,"9C");
		hmVleCrd.put( 110,"10C");
		hmVleCrd.put( 111,"JC");
		hmVleCrd.put( 112,"QC");
		hmVleCrd.put( 113,"KC");
		
		//suitType: Picas
		hmVleCrd.put( 21,"AP");
		hmVleCrd.put( 22,"2P");
		hmVleCrd.put( 23,"3P");
		hmVleCrd.put( 24,"4P");
		hmVleCrd.put( 25,"5P");
		hmVleCrd.put( 26,"6P");
		hmVleCrd.put( 27,"7P");
		hmVleCrd.put( 28,"8P");
		hmVleCrd.put( 29,"9P");
		hmVleCrd.put( 210,"10P");
		hmVleCrd.put( 211,"JP");
		hmVleCrd.put( 212,"QP");
		hmVleCrd.put( 213,"KP");
		
		//suitType: Diamantes
		hmVleCrd.put( 31,"AD");
		hmVleCrd.put( 32,"2D");
		hmVleCrd.put( 33,"3D");
		hmVleCrd.put( 34,"4D");
		hmVleCrd.put( 35,"5D");
		hmVleCrd.put( 36,"6D");
		hmVleCrd.put( 37,"7D");
		hmVleCrd.put( 38,"8D");
		hmVleCrd.put( 39,"9D");
		hmVleCrd.put( 310,"10D");
		hmVleCrd.put( 311,"JD");
		hmVleCrd.put( 312,"QD");
		hmVleCrd.put( 313,"KD");

		//suitType: TREBOLES
		hmVleCrd.put( 41,"AT");
		hmVleCrd.put( 42,"2T");
		hmVleCrd.put( 43,"3T");
		hmVleCrd.put( 44,"4T");
		hmVleCrd.put( 45,"5T");
		hmVleCrd.put( 46,"6T");
		hmVleCrd.put( 47,"7T");
		hmVleCrd.put( 48,"8T");
		hmVleCrd.put( 49,"9T");
		hmVleCrd.put( 410,"10T");
		hmVleCrd.put( 411,"JT");
		hmVleCrd.put( 412,"QT");
		hmVleCrd.put( 413,"KT");
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
