package Practise;

import java.util.Scanner;

public class Practise2 {
	public static void main(String []args) {	//BUBBLESORT DESCENDING ORDER
	    int num, i, j, temp;
	    Scanner input = new Scanner(System.in);
	 
	    System.out.println("Enter the number of integers to sort:");
	    num = input.nextInt();		//5
	 
	    int array[] = new int[num];
	 
	    System.out.println("Enter " + num + " integers: ");
	    														//10, 5, 6 , 7, 11
	    for (i = 0; i < num; i++) 
	      array[i] = input.nextInt();
	 
	    for (i = 0; i < ( num - 1 ); i++) {
	      for (j = 0; j < num - i - 1; j++) {
	        if (array[j] < array[j+1]) 
	        {
	          temp = array[j];
	          array[j] = array[j+1];
	          array[j+1] = temp;
	        }
	      }
	    }
	 
	    System.out.println("Sorted list of integers:");
	 
	    for (i = 0; i < num; i++) 
	      System.out.println(array[i]);
	  } 
	}
