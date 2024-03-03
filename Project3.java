package project3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ronald Ramirez
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalRows = 0; // variable to hold value for number of rows
        int totalColumns = 0; // variable to hold number of columns
        String Commands; // varaible to hold user input 
        Random randomNumbers = new Random();// generates random numbers 
        System.out.println("Enter number of rows: ");
        Scanner keyboard = new Scanner(System.in);
        totalRows = keyboard.nextInt();

        System.out.println("Enter number of columns: ");
        totalColumns = keyboard.nextInt();

        //System.out.println(totalRows);
        //System.out.println(totalColumns);
        int[][] array = new int[totalRows][totalColumns];

        for (int[] array1 : array) {
            for (int j = 0; j < array1.length; j++) {
                array1[j] = randomNumbers.nextInt(10) + 1;
            }
        }
        //System.out.println("Array: " + Arrays.deepToString(array));

        // to print out 2d array
        System.out.printf("%-4s", "");
        for (int i = 0; i < array[0].length; i++) {
            System.out.printf("%-4s", i);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-4d", i);
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%-4d", array[i][j]);
            }
            System.out.println();
        }
        // prompt user to enter a command 
        System.out.println("Enter Command [R,C,G,Z,Q]");
        Scanner Command = new Scanner(System.in);
        Commands = Command.nextLine();
        Commands = Commands.toUpperCase();// Handles lower case user input
        int sum = 0; // variable holds the sum of rows 
        int digit = 0;
            //do{ Do while loop cause an infinite loop for Z command 
            switch (Commands) {
                case "R":
                    System.out.println("Enter row : ");
                    //grab the row and sum up the numbers 
                    digit = keyboard.nextInt();
                    for (int j = 0; j < array.length; j++) {
                        sum = sum + array[digit][j];
                    }
                    System.out.println("The total of the row is " + sum);
                    break;
                case "C":
                    System.out.println("Enter column : ");
                    //grab the column and sum up the numbers
                    digit = keyboard.nextInt();
                    for (int i = 0; i < array.length; i++) {
                        sum = sum + array[i][digit];
                    }
                    System.out.println("The total of the column is " + sum);
                    break;
                case "G":
                    int totalSum = 0;
                    int g = array.length;
                    int g2 = array[0].length;
                    for (int i = 0; i < g; i++) {
                        for (int j = 0; j < g2; j++) {
                            //display the total values of the grid
                            totalSum += array[i][j];
                        }
                    }
                    System.out.println("The grand total is : " + totalSum);
                    break;
                case "Z":
                    //regenerate all the elements in the grid
                    System.out.println("-- Zap --");
                    for (int[] array1 : array) {
                        for (int m = 0; m < array1.length; m++) {
                            array1[m] = randomNumbers.nextInt(10) + 1;
                        }
                    }

                    for (int k = 0; k < totalRows; k++) {
                        for (int m = 0; m < totalColumns; m++) {
                            System.out.printf(array[k][m] + " ");
                        }
                        System.out.println();
                    }

                    break;

                case "Q":
                    //Gracefully exit loop;
                    System.out.println("bye bye");
                    break;
            }
           // }while(Commands!="Q");  

    }

}
