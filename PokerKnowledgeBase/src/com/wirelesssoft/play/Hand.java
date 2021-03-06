package com.wirelesssoft.play;

import com.wirelesssoft.object.Deck;
import com.wirelesssoft.object.PokerCard;

public class Hand {

    private PokerCard[] cards;
    private int[] value;

    public Hand(Deck d)
    {
        value = new int[6];
        cards = new PokerCard[5];
        for (int x=0; x<5; x++)
        {
            cards[x] = d.drawFromDeck();
        }
        
        for (PokerCard pokerCard : cards) {
			System.out.println(pokerCard.toString() );
		}

//***********************************************************        
        Hacer evaluacion para 5 jugadores
        
        son 5*2 = 10 cartas mas + 5 cartas que estan sobre la mesa: 15 cartas.
        
        Se deben mostrar las 15 cartas jugadas, para verificar que no se repitan
        
        y mostrar los 5 juegos>
        
        Sample:
			cta1privada		cta2privada		cta3publica		cta4publica		cta5publica		cta6publica		cta7publica		Resultado
Partida	1 (5Jugadores, solo hay se muestran dos jugadores porque los otros sesisstieron [ref:pokerist.com])	
		j1:		7T				QD				QC				10P				3C				8C				9C				LOST	, 1par
		j2:		QP				8P				QC				10P				3C				8C				9C				WIN		, 2pares
Partida	2 (5Jugadores, solo muestra dos jugadores EL MIO Y EL QUE GANO LA PARTIDA [ref:pokerist.com])	
		j1:		5T				7T				3D				8T				3P				5P				2C				LOST	, 2 PARES DE MENOR VALOR
		j2:		QT				QD				3D				8T				3P				5P				2C				WIN		, 2 PARES
Partida	3 (5Jugadores, solo muestra dos jugadores EL MIO Y EL QUE GANO LA PARTIDA [ref:pokerist.com])	
		j1:		8C				AD				7T				KT				5P				2P				9D				LOST	, NADA
		j2:		KC				9T				7T				KT				5P				2P				9D				WIN		, 2 PARES
Partida	4 (5Jugadores, solo muestra MI JUEGO, LOS DEMAS DESISTIERON [ref:pokerist.com])	
		j1:		3T				AP				QP				8D				2C				8T				6D				WIN		, 1 PAR Q TUBIERON TODOS, MI CARTA GANADORA FUE EL AS DE PICAS

		T:Trebol
		P:Picas
		C:Corazon
		D:Diamante
		
//***********************************************************	
		
		Verificar la evaluaci[on de las jugadas...
		                      
//***********************************************************

        int[] ranks = new int[14];
        //miscellaneous cards that are not otherwise significant
        int[] orderedRanks = new int[5];
        boolean flush=true, straight=false;
        int sameCards=1,sameCards2=1;
        int largeGroupRank=0,smallGroupRank=0;
        int index=0;
        int topStraightValue=0;

        for (int x=0; x<=13; x++)
        {
            ranks[x]=0;
        }
        for (int x=0; x<=4; x++)
        {
            ranks[ cards[x].getRank() ]++;
        }
        for (int x=0; x<4; x++) {
            if ( cards[x].getSuit() != cards[x+1].getSuit() )
                flush=false;
        }

        for (int x=13; x>=1; x--)
        {
                 if (ranks[x] > sameCards)
                 {
                     if (sameCards != 1)
                     //if sameCards was not the default value
                     {
                         sameCards2 = sameCards;
                         smallGroupRank = largeGroupRank;
                     }

                     sameCards = ranks[x];
                     largeGroupRank = x;

                 } else if (ranks[x] > sameCards2)
                 {
                     sameCards2 = ranks[x];
                     smallGroupRank = x;
                 }
        }

        if (ranks[1]==1) //if ace, run this before because ace is highest card
        {
            orderedRanks[index]=14;
            index++;
        }

        for (int x=13; x>=2; x--)
        {
            if (ranks[x]==1)
            {
                orderedRanks[index]=x; //if ace
                index++;
            }
        }
        
        for (int x=1; x<=9; x++)
        //can't have straight with lowest value of more than 10
        {
            if (ranks[x]==1 && ranks[x+1]==1 && ranks[x+2]==1 && 
                ranks[x+3]==1 && ranks[x+4]==1)
            {
                straight=true;
                topStraightValue=x+4; //4 above bottom value
                break;
            }
        }

        if (ranks[10]==1 && ranks[11]==1 && ranks[12]==1 && 
            ranks[13]==1 && ranks[1]==1) //ace high
        {
            straight=true;
            topStraightValue=14; //higher than king
        }
        
        if (ranks[10]==1 && ranks[11]==1 && ranks[12]==1 && 
                ranks[13]==1 && ranks[1]==1) //ace high
            {
                straight=true;
                topStraightValue=14; //higher than king
            }

       for (int x=0; x<=5; x++)
            {
                value[x]=0;
            }
       

       //start hand evaluation
         if ( sameCards==1 ) {    //if we have no pair...
             value[0]=1;          //this is the lowest type of hand, so it gets the lowest value
             value[1]=orderedRanks[0];  //the first determining factor is the highest card,
             value[2]=orderedRanks[1];  //then the next highest card,
             value[3]=orderedRanks[2];  //and so on
             value[4]=orderedRanks[3];
             value[5]=orderedRanks[4];
         }

         if (sameCards==2 && sameCards2==1) //if 1 pair
         {
             value[0]=2;                //pair ranked higher than high card
             value[1]=largeGroupRank;   //rank of pair
             value[2]=orderedRanks[0];  //next highest cards.
             value[3]=orderedRanks[1];
             value[4]=orderedRanks[2];
         }

         if (sameCards==2 && sameCards2==2) //two pair
         {
             value[0]=3;
             //rank of greater pair
             value[1]= largeGroupRank>smallGroupRank ? largeGroupRank : smallGroupRank;
             //rank of smaller pair
             value[2]= largeGroupRank<smallGroupRank ? largeGroupRank : smallGroupRank;
             value[3]=orderedRanks[0];  //extra card
         }

         if (sameCards==3 && sameCards2!=2)
         //three of a kind (not full house)
         {
             value[0]=4;
             value[1]= largeGroupRank;
             value[2]=orderedRanks[0];
             value[3]=orderedRanks[1];
         }

         if (straight)
         {
             value[0]=5;
             value[1]=5;
             //if we have two straights, 
             //the one with the highest top cards wins
         }

         if (flush)   
         {
             value[0]=6;
             value[1]=orderedRanks[0]; //tie determined by ranks of cards
             value[2]=orderedRanks[1];
             value[3]=orderedRanks[2];
             value[4]=orderedRanks[3];
             value[5]=orderedRanks[4];
         }

         if (sameCards==3 && sameCards2==2)  //full house
         {
             value[0]=7;
             value[1]=largeGroupRank;
             value[2]=smallGroupRank;
         }

         if (sameCards==4)  //four of a kind
         {
             value[0]=8;
             value[1]=largeGroupRank;
             value[2]=orderedRanks[0];
         }

         if (straight && flush)  //straight flush
         {
             value[0]=9;
             value[1]=9;
         }
        
        
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

    void displayAll()
    {
        for (int x=0; x<5; x++)
            System.out.println(cards[x]);
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
