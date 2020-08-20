package com.vogella.eclipse.ide.first;
import java.util.Scanner;
public class FifthAssignment {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in); 
			int i, j;
			 System.out.println("Enter the Input : ");
			 int num = scan.nextInt();
			  
			 for (i = 0; i < num; i++) { 
			     for (j = 0; j < i + 1; j++) 
			          System.out.print("*"); 
			     System.out.println(); 
			    } 
			  
			 for (i = 1; i < num; i++) { 
			     for (j = i; j < num; j++) 
			    	 System.out.print("*"); 
			    System.out.println();
			 }
		}

	}

