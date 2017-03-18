package com.wirelesssoft.play;

import com.wirelesssoft.object.Deck;
import com.wirelesssoft.object.PokerCard;

public class Hand {

    private PokerCard[] cardsGamer1;
    private PokerCard[] cardsGamer2;
    private PokerCard[] cardsGamer3;
    private PokerCard[] cardsGamer4;
    private PokerCard[] cardsGamer5;
    private PokerCard[] tableGame;
    private int[] value;

    public Hand(Deck d)
    {
        value = new int[6];
        cardsGamer1 = new PokerCard[2];
        cardsGamer2 = new PokerCard[2];
        cardsGamer3 = new PokerCard[2];
        cardsGamer4 = new PokerCard[2];
        cardsGamer5 = new PokerCard[2];
        tableGame = new PokerCard[5];
        
        for (int x=0; x<2; x++)
        {
        	cardsGamer1[x] = d.drawFromDeck();
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer2[x] = d.drawFromDeck();
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer3[x] = d.drawFromDeck();
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer4[x] = d.drawFromDeck();
        }
        for (int x=0; x<2; x++)
        {
        	cardsGamer5[x] = d.drawFromDeck();
        }
        for (int x=0; x<5; x++)
        {
        	tableGame[x] = d.drawFromDeck();
        }
        
        System.out.print("g1 : [" + cardsGamer1[0] + "] [" +  cardsGamer1[1] + "]" );
        for (PokerCard pokerCard : tableGame) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
        System.out.println("");
        System.out.print("g2 : [" + cardsGamer2[0] + "] [" +  cardsGamer2[1] + "]" );
        for (PokerCard pokerCard : tableGame) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
        System.out.println("");
        System.out.print("g3 : [" + cardsGamer3[0] + "] [" +  cardsGamer3[1] + "]" );
        for (PokerCard pokerCard : tableGame) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
        System.out.println("");
        System.out.print("g4 : [" + cardsGamer4[0] + "] [" +  cardsGamer4[1] + "]" );
        for (PokerCard pokerCard : tableGame) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
        System.out.println("");
        System.out.print("g5 : [" + cardsGamer5[0] + "] [" +  cardsGamer5[1] + "]" );
        for (PokerCard pokerCard : tableGame) {
			System.out.print(" [" + pokerCard.toString() + "]" );
		}
        System.out.println("");
        
        
        /*
        for (PokerCard pokerCard : cardsGamer1) {
			System.out.println("g1" + pokerCard.toString() );
		}
        for (PokerCard pokerCard : cardsGamer2) {
			System.out.println("g2" + pokerCard.toString() );
		}
        for (PokerCard pokerCard : cardsGamer3) {
			System.out.println("g3" + pokerCard.toString() );
		}
        for (PokerCard pokerCard : cardsGamer4) {
			System.out.println("g4" + pokerCard.toString() );
		}
        for (PokerCard pokerCard : cardsGamer5) {
			System.out.println("g5" + pokerCard.toString() );
		}
		*/

//***********************************************************        
//        Hacer evaluacion para 5 jugadores
//        
//        son 5*2 = 10 cartas mas + 5 cartas que estan sobre la mesa: 15 cartas.
//        
//        Se deben mostrar las 15 cartas jugadas, para verificar que no se repitan
//        
//        y mostrar los 5 juegos>
//        
//        Sample:
//			cta1privada		cta2privada		cta3publica		cta4publica		cta5publica		cta6publica		cta7publica		Resultado
//Partida	1 (5Jugadores, solo hay se muestran dos jugadores porque los otros sesisstieron [ref:pokerist.com])	
//		j1:		7T				QD				QC				10P				3C				8C				9C				LOST	, 1par
//		j2:		QP				8P				QC				10P				3C				8C				9C				WIN		, 2pares
//Partida	2 (5Jugadores, solo muestra dos jugadores EL MIO Y EL QUE GANO LA PARTIDA [ref:pokerist.com])	
//		j1:		5T				7T				3D				8T				3P				5P				2C				LOST	, 2 PARES DE MENOR VALOR
//		j2:		QT				QD				3D				8T				3P				5P				2C				WIN		, 2 PARES
//Partida	3 (5Jugadores, solo muestra dos jugadores EL MIO Y EL QUE GANO LA PARTIDA [ref:pokerist.com])	
//		j1:		8C				AD				7T				KT				5P				2P				9D				LOST	, NADA
//		j2:		KC				9T				7T				KT				5P				2P				9D				WIN		, 2 PARES
//Partida	4 (5Jugadores, solo muestra MI JUEGO, LOS DEMAS DESISTIERON [ref:pokerist.com])	
//		j1:		3T				AP				QP				8D				2C				8T				6D				WIN		, 1 PAR Q TUBIERON TODOS, MI CARTA GANADORA FUE EL AS DE PICAS
//
//		T:Trebol
//		P:Picas
//		C:Corazon
//		D:Diamante
		
//***********************************************************	
		
//		Verificar la evaluaci[on de las jugadas...
		                      
//***********************************************************
        
        
    }
        
        
     


        
    void display()
    {
        String s;
        switch( value[0] )
        {

            case 1:
                s="high card";
                break;
            case 2:
                s="pair of " + PokerCard.rankAsString(value[1]) + "\'s";
                break;
            case 3:
                s="two pair " + PokerCard.rankAsString(value[1]) + " " + 
                		PokerCard.rankAsString(value[2]);
                break;
            case 4:
                s="three of a kind " + PokerCard.rankAsString(value[1]) + "\'s";
                break;
            case 5:
                s=PokerCard.rankAsString(value[1]) + " high straight";
                break;
            case 6:
                s="flush";
                break;
            case 7:
                s="full house " + PokerCard.rankAsString(value[1]) + " over " + 
                		PokerCard.rankAsString(value[2]);
                break;
            case 8:
                s="four of a kind " + PokerCard.rankAsString(value[1]);
                break;
            case 9:
                s="straight flush " + PokerCard.rankAsString(value[1]) + " high";
                break;
            default:
                s="error in Hand.display: value[0] contains invalid value";
        }
        s = "                " + s;
        System.out.println(s);
    }

   

    int compareTo(Hand that)
    {
        for (int x=0; x<6; x++)
        {
            if (this.value[x]>that.value[x])
                return 1;
            else if (this.value[x]<that.value[x])
                return -1;
        }
        return 0; //if hands are equal
    }

}
