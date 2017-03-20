package com.wirelesssoft.play;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.wirelesssoft.evaluate.HandEvaluator;
import com.wirelesssoft.object.Deck;
import com.wirelesssoft.object.PokerCard;

public class Hand {

    private List<PokerCard> cardsGamer1; 
    private List<PokerCard> cardsGamer2;
    private List<PokerCard> cardsGamer3;
    private List<PokerCard> cardsGamer4;
    private List<PokerCard> cardsGamer5;
    private List<PokerCard> tableGame; 

    public Hand(Deck d)
    {
        cardsGamer1 = new ArrayList<PokerCard>(7);
        cardsGamer2 = new ArrayList<PokerCard>(7);
        cardsGamer3 = new ArrayList<PokerCard>(7);
        cardsGamer4 = new ArrayList<PokerCard>(7);
        cardsGamer5 = new ArrayList<PokerCard>(7);
        tableGame =  new ArrayList<PokerCard>(5);
        
        for (int x=0; x<2; x++)
        {
        	cardsGamer1.add(d.drawFromDeck());
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer2.add(d.drawFromDeck());
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer3.add(d.drawFromDeck());
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer4.add(d.drawFromDeck());
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer5.add(d.drawFromDeck());
        }
        for (int x=0; x<5; x++)
        {
        	tableGame.add(d.drawFromDeck());
        }
        
       
        cardsGamer1.addAll(tableGame);
        cardsGamer2.addAll(tableGame);
        cardsGamer3.addAll(tableGame);
        cardsGamer4.addAll(tableGame);
        cardsGamer5.addAll(tableGame);
        
        System.out.println("\ng1 : ");
		for (PokerCard pokerCard : cardsGamer1) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
		
		System.out.println("\ng2 : ");
		for (PokerCard pokerCard : cardsGamer2) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
		
		System.out.println("\ng3 : ");
		for (PokerCard pokerCard : cardsGamer3) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
		
		System.out.println("\ng4 : ");
		for (PokerCard pokerCard : cardsGamer4) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
		
		System.out.println("\ng5 : ");
		for (PokerCard pokerCard : cardsGamer5) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
		System.out.println("");
		
		HandEvaluator he1 = new HandEvaluator((ArrayList<PokerCard>) cardsGamer1);
        he1.display();
        
        HandEvaluator he2 = new HandEvaluator((ArrayList<PokerCard>) cardsGamer2);
        he2.display();
        
        HandEvaluator he3 = new HandEvaluator((ArrayList<PokerCard>) cardsGamer3);
        he3.display();
        
        HandEvaluator he4 = new HandEvaluator((ArrayList<PokerCard>) cardsGamer4);
        he4.display();
        
        HandEvaluator he5 = new HandEvaluator((ArrayList<PokerCard>) cardsGamer5);
        he5.display();
        
        /*
         * Test case
         */
        /*
        PokerCard c1 = new PokerCard((short)2,(short)0);
	    PokerCard c2 = new PokerCard((short)2,(short)12);
	    PokerCard c3 = new PokerCard((short)3,(short)2);
	    PokerCard c4 = new PokerCard((short)3,(short)5);
	    PokerCard c5 = new PokerCard((short)0,(short)0);
	    PokerCard c6 = new PokerCard((short)0,(short)7);
	    PokerCard c7 = new PokerCard((short)3,(short)7);
	    
	    List<PokerCard> testGame = new ArrayList<PokerCard>(7);
	    testGame.add(c1);
	    testGame.add(c2);
	    testGame.add(c3);
	    testGame.add(c4);
	    testGame.add(c5);
	    testGame.add(c6);
	    testGame.add(c7);
	    
        HandEvaluator test = new HandEvaluator((ArrayList<PokerCard>) testGame);
        test.display();
        */
        
        /*
         * Test case 2
         */
        
        PokerCard c1 = new PokerCard((short)0,(short)2);
	    PokerCard c2 = new PokerCard((short)1,(short)4);
	    PokerCard c3 = new PokerCard((short)2,(short)9);
	    PokerCard c4 = new PokerCard((short)0,(short)7);
	    PokerCard c5 = new PokerCard((short)2,(short)5);
	    PokerCard c6 = new PokerCard((short)0,(short)6);
	    PokerCard c7 = new PokerCard((short)1,(short)3);
	    
	    List<PokerCard> testGame = new ArrayList<PokerCard>(7);
	    testGame.add(c1);
	    testGame.add(c2);
	    testGame.add(c3);
	    testGame.add(c4);
	    testGame.add(c5);
	    testGame.add(c6);
	    testGame.add(c7);
	    
        HandEvaluator test = new HandEvaluator((ArrayList<PokerCard>) testGame);
        test.display();
        

        
        
    }
        
  //***********************************************************        
//  Hacer evaluacion para 5 jugadores
//  
//  son 5*2 = 10 cartas mas + 5 cartas que estan sobre la mesa: 15 cartas.
//  
//  Se deben mostrar las 15 cartas jugadas, para verificar que no se repitan
//  
//  y mostrar los 5 juegos>
//  
//  Sample:
//		cta1privada		cta2privada		cta3publica		cta4publica		cta5publica		cta6publica		cta7publica		Resultado
//Partida	1 (5Jugadores, solo hay se muestran dos jugadores porque los otros sesisstieron [ref:pokerist.com])	
//	j1:		7T				QD				QC				10P				3C				8C				9C				LOST	, 1par
//	j2:		QP				8P				QC				10P				3C				8C				9C				WIN		, 2pares
//Partida	2 (5Jugadores, solo muestra dos jugadores EL MIO Y EL QUE GANO LA PARTIDA [ref:pokerist.com])	
//	j1:		5T				7T				3D				8T				3P				5P				2C				LOST	, 2 PARES DE MENOR VALOR
//	j2:		QT				QD				3D				8T				3P				5P				2C				WIN		, 2 PARES
//Partida	3 (5Jugadores, solo muestra dos jugadores EL MIO Y EL QUE GANO LA PARTIDA [ref:pokerist.com])	
//	j1:		8C				AD				7T				KT				5P				2P				9D				LOST	, NADA
//	j2:		KC				9T				7T				KT				5P				2P				9D				WIN		, 2 PARES
//Partida	4 (5Jugadores, solo muestra MI JUEGO, LOS DEMAS DESISTIERON [ref:pokerist.com])	
//	j1:		3T				AP				QP				8D				2C				8T				6D				WIN		, 1 PAR Q TUBIERON TODOS, MI CARTA GANADORA FUE EL AS DE PICAS
//
//	T:Trebol
//	P:Picas
//	C:Corazon
//	D:Diamante
	
//***********************************************************	
	
//	Verificar la evaluaci[on de las jugadas...
	                      
//***********************************************************
        
     


 
}
