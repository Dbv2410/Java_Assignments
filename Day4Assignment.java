package com.vogella.eclipse.ide.first;
import java.util.Scanner;
public class Day4Assignment {
        public static void main(String args[]) {
        	int count=0;
        	
        	System.out.println("Enter the integer number");
        	Scanner num =new Scanner(System.in);
        	int number=num.nextInt();
        	System.out.println("The number is" + number);
        	int even_count=0;
        	int odd_count=0;
        	while(number != 0)
            {
                number /= 10;
                 
                if(number %2==0) 
                	even_count++;
                       else 
                	odd_count++;
                }
        	System.out.println("Number of digits that are even: " + even_count);
        	System.out.println("Number of digits that are odd: " + odd_count);
        	   
        }
}
