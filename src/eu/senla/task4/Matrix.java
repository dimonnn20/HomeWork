package eu.senla.task4;

import java.util.Arrays;

public class Matrix {
    double numberTemp;
    // создаем двумерный массив
    public String [] [] getArray (int i,int j) {
        String [] [] array = new String[i][j];
        for (String [] line : array) {
            for (int counter=0; counter < line.length; counter++) {
                if (counter % 3 == 0 ) {
                    line[counter] = getRandomNumbers ();
                } else {
                    line [counter] = getRandomLetters ();
                }
            }
        }
        return array;
    }

    public String getRandomNumbers () {
        String randomNumbers = "";
            randomNumbers  = randomNumbers + String.valueOf(((double) (Math.random()*10))).substring(0,6);
        return randomNumbers;
    }

    public String getRandomLetters () {
        String letters = "ASDFGHJKLZXCVBNMQWERTYUIOP";
        String randomLetters = "";
        for (int counter = 0; counter<6; counter++) {
            randomLetters = randomLetters + letters.charAt((int) (Math.random() * 26));
        }
        return randomLetters;
    }
    public static String[] getMainDiag (String [] [] array) {
        String [] mainDiag = new String [array.length];
        for (int i = 0; i < 10; i++) {
            mainDiag [i] = array [i][i];
           //System.out.println(mainDiag[i]);
        }
        return mainDiag;
    }
    public static String[] getAddDiag (String [] [] array) {
        String [] addDiag = new String [array.length];
        int j = 0;
        for (int i = array.length-1; i >= 0; i--) {
                addDiag[j] = array[j][i];
                //System.out.println(addDiag[j]);
                j++;
            }
        return addDiag;
    }

    public boolean compareDiag (String [] mainDiag,String [] addDiag) {
        return Arrays.equals(mainDiag,addDiag);
    }
    public String [] getTotalDiag (String [] mainDiag,String [] addDiag) {
        String [] totalDiag = new String [mainDiag.length+ addDiag.length];
        System.arraycopy(mainDiag,0,totalDiag,0,mainDiag.length);
        System.arraycopy(addDiag,0,totalDiag,mainDiag.length,addDiag.length);
        for (int i = 0; i< totalDiag.length;i++){
            System.out.println("Total diag "  + i +" = " + totalDiag[i]);
        }
        return totalDiag;
    }

    public StringBuilder getString (String [] totalDiag) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: totalDiag) {
            if (Character.isLetter(str.charAt(0))) {
                stringBuilder.append(str.substring(1,4));
                stringBuilder.append(",");
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder;
    }
    public StringBuilder getNumbers (String [] totalDiag) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String number: totalDiag) {
            if (Character.isDigit(number.charAt(0))) {
                numberTemp = Double.parseDouble(number);
                if (Character.getNumericValue(number.charAt(2)) >= 7) {
                    numberTemp = Math.round(numberTemp);
                } else {
                    numberTemp = Math.floor(numberTemp);
                }
                stringBuilder.append(numberTemp);
                stringBuilder.append("_");
            }
        }
        System.out.println(stringBuilder);
        return stringBuilder;
    }

}
