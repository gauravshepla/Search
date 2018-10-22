/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.Scanner;

/**
 *
 * @author 1794331
 */
public class Search {

   
    public static void main(String[] args) {
        int[] array={2,4,18,16,20};
        int inputAge,location=0,positionFound=-1;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("FIND AGE IN ARRAY");
        System.out.println("");
        System.out.println("Which age to search?");
        inputAge=keyboard.nextInt();
        for(int i=0;i<5;i++)
    {
        if(array[i]==inputAge)
        {
            location=i;
            positionFound=1;
        }
    }
        if(positionFound==1)
        {
         System.out.println("Number is found at "+(location+1));
        }
        else
        {
          System.out.println("Element not found");
        }
    }
    
}
