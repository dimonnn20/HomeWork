package eu.senla.task4;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix ();
        String [] [] array = matrix.getArray (10,10);

        for (int i = 0; i<10;i++){
            for (int j = 0; j<10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
            matrix.getMainDiag (array);
            matrix.getAddDiag (array);
        System.out.println("Main diagonal  = side diagonal = " + matrix.compareDiag(Matrix.getMainDiag(array),Matrix.getAddDiag(array)));

        String [] str = matrix.getTotalDiag(Matrix.getMainDiag(array),Matrix.getAddDiag(array));
        System.out.println("If letters - show from 2 to 4: ");
        matrix.getString(str);
        System.out.println("If digit show rounded digit (in bigger side if more than n,7 / in fewer side if less n,7): ");
        matrix.getNumbers(str);
        }

    }
