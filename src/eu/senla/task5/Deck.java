package eu.senla.task5;

import eu.senla.task5.containers.Container;

public class Deck {
    private boolean big;
    private Container[] deckArray;
    private int conteinerCounter=0;
    private double totalWeight;

    public Deck (boolean big) {
        this.big = big;
        if (this.big) {
            deckArray = new Container[2];
        } else {
            deckArray = new Container[4];
        }
    }

        public Deck (boolean big, Container [] shipDeck){
            this.big = big;
            if (this.big) {
                if (shipDeck.length == 2) {
                    this.deckArray = shipDeck;
                    conteinerCounter = 0;

                    for (int i = 0; i < shipDeck.length; i++){
                        totalWeight += shipDeck[i].getWeight();
                    }
                    System.out.println("Big containers are added");
                } else {System.out.println("Wrong amount");}

                } else if (shipDeck.length == 4) {
                this.big = big;
                for (int i = 0; i < shipDeck.length; i++){
                    totalWeight += shipDeck[i].getWeight();
                }
                System.out.println("Little containers are added");
            } else {
                System.out.println("Wrong amount");
            }
        }

        public boolean add (Container cont) {
         if (this.big) {
             if (conteinerCounter < deckArray.length ) {
                 deckArray [conteinerCounter] = cont;
                 totalWeight +=cont.getWeight();
                 conteinerCounter++;
                 System.out.println("Big container added");
                 return true;
             } else {
                 System.out.println("Reached maximum");
                 return false;
             }
         } else if (conteinerCounter< deckArray.length){
             deckArray [conteinerCounter] = cont;
             totalWeight+= cont.getWeight();
             conteinerCounter++;
             System.out.println("Little container added");
             return true;
         }else {
             System.out.println("Reach maximum");
             return false;
         }
        }
        public boolean remove () {
        if (conteinerCounter > 0) {
            conteinerCounter--;
            totalWeight-=deckArray[conteinerCounter].getWeight();
            deckArray[conteinerCounter] = null;
            System.out.println("Container is removed");
            return true;
        } else {
            System.out.println("No containers to remove");
            return false;
        }
        }

        public double getTotalWeight () {
        return totalWeight;
        }
    }
