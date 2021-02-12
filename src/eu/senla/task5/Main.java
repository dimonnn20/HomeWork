package eu.senla.task5;

import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Cubic;
import eu.senla.task5.containers.Cylinder;
import eu.senla.task5.containers.Konus;

public class Main {

    public static void main (String [] args) {
        Container BigType1 = new Cubic(true, 90, 1000);
        Container BigType2 = new Cylinder(true, 60, 2000);
        Container BigType3 = new Konus(true, 30, 1000);
        Container BigType4 = new Cubic(true, 70, 2000);
        Container BigType5 = new Cylinder(true, 20, 1000);
        Container LittleType1 = new Cubic(false, 80, 2000);
        Container LittleType2 = new Konus(false, 20, 1000);
        Container LittleType3 = new Cylinder(false, 50, 2000);
        Container LittleType4 = new Cubic(false, 80, 2000);
        Container LittleType5 = new Cubic(false, 60, 1000);
        Container LittleType6 = new Konus(false, 15, 2000);
        Container LittleType7 = new Cylinder(false, 25, 1000);
        Container LittleType8 = new Cubic (false, 70, 2000);

        Container [] Bt1 = {BigType1, BigType2};
        Container [] Bt2 = {BigType3, BigType4};
        Container [] Bt3 = {BigType4, BigType5};
        Container [] Bt4 = {BigType1, BigType5};
        Container [] Bt5 = {BigType2, BigType3};

        Container [] Lt1 = {LittleType1, LittleType2, LittleType3, LittleType4};
        Container [] Lt2 = {LittleType5, LittleType6, LittleType7, LittleType8};
        Container [] Lt3 = {LittleType1, LittleType5, LittleType2, LittleType6};
        Container [] Lt4 = {LittleType3, LittleType7, LittleType4, LittleType8};

        Deck shipDeckBig1 = new Deck(true, Bt1);
        Deck shipDeckBig2 = new Deck(true, Bt2);
        Deck shipDeckBig3 = new Deck(true, Bt3);
        Deck shipDeckBig4 = new Deck(true, Bt4);
        Deck shipDeckBig5 = new Deck(true, Bt5);

        Deck shipDeckLittle1 = new Deck(false, Lt1);
        Deck shipDeckLittle2 = new Deck(false, Lt2);
        Deck shipDeckLittle3 = new Deck(false, Lt3);
        Deck shipDeckLittle4 = new Deck(false, Lt4);

        Deck [] deckArray1 = {shipDeckBig1,shipDeckBig2};
        Deck [] deckArray2 = {shipDeckBig3,shipDeckLittle1};
        Deck [] deckArray3 = {shipDeckBig4};
        Deck [] deckArray4 = {shipDeckLittle1};
        Deck [] deckArray5 = {shipDeckLittle2,shipDeckLittle3};
        Deck [] deckArray6 = {shipDeckBig5,shipDeckLittle4};
        Deck [] deckArray7 = {shipDeckLittle4};
        Deck [] deckArray8 = {shipDeckBig4, shipDeckBig1};
        Deck [] deckArray9 = {shipDeckLittle1,shipDeckLittle3};
        Deck [] deckArray10 = {shipDeckBig5};

        Ship ship1 = new Ship("Ship 1",deckArray1);
        Ship ship2 = new Ship("Ship 2",deckArray2);
        Ship ship3 = new Ship("Ship 3",deckArray3);
        Ship ship4 = new Ship("Ship 4",deckArray4);
        Ship ship5 = new Ship("Ship 5",deckArray5);
        Ship ship6 = new Ship("Ship 6",deckArray6);
        Ship ship7 = new Ship("Ship 7",deckArray7);
        Ship ship8 = new Ship("Ship 8",deckArray8);
        Ship ship9 = new Ship("Ship 9",deckArray9);
        Ship ship10 = new Ship("Ship 10",deckArray10);


        Port port = new Port(10);
        port.add(ship1);
        port.add(ship2);
        port.add(ship3);
        port.add(ship4);
        port.add(ship5);
        port.add(ship6);
        port.add(ship7);
        port.add(ship8);
        port.add(ship9);
        port.add(ship10);
        System.out.println("Amount of water in port is : " + port.getPortResultWeight());
        port.remove();
        System.out.println("Amount of water in port is : " + port.getPortResultWeight());
    }


    }
