package com.greatlearning.skyscraper;

import java.util.Scanner;
import java.util.Stack;


public class skyscraper
{
  static Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args)
    {
        Stack<Integer> bucket = new Stack<Integer>(); 
        int n,size,value=0;
        
        System.out.println("\nEnter the total no of floors in the building");
        
        n=sc.nextInt();
        int[] arr = new int[n+1];
        size=n;

        if(n>0)
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the floor size given on day : "+i);
            
            value=sc.nextInt();
            if(value<=n)
            {
            	arr[i]=value;
            }
            else
            {
                System.out.println("The total floor size should be less than or equal to building size ("+n+")");
            }
        }
        else
        {
            System.out.println("Please enter a floor size above zero value!!!");
        }
        System.out.println("\n------------------------\n");
        
        for(int i=1;i<=n;i++)
        {
            System.out.println("\n Day: "+i);
            if(arr[i]==size)
            {
                System.out.print(arr[i]+" "); 
                size--;
                
                while(!bucket.empty())
                {
                	if(bucket.peek()==size)
                  {
                	  System.out.print(" "+bucket.pop()+" ");
                	  size--;
                  }
                 else
                 {
                	 break;
                 }
               }
            }
            else
            {
                bucket.push(arr[i]);
            }
        }
        sc.close();
    }
}