/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsoles;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class GamingConsoles {

    public static void main(String[] args) {
       
         Scanner input = new Scanner(System.in);
         
         // Single-dimensional array
        String[] cities = {"Cape Town", "Pretoria", "Port Elizabeth"};
        
        // Two-dimensional array
        // Column 0 = PS5
        // Column 1 = XBOX
        // Column 2 = SWITCH
        int[][] gaming = new int[4][3];
        
        System.out.println("------ Number of Gaming ----- ");

        // Cape Town
        System.out.print("Enter number of PS5 for Cape Town: ");
        gaming[0][0] = input.nextInt();

        System.out.print("Enter number of XBOX for Cape Town: ");
        gaming[0][1] = input.nextInt();
        
         System.out.print("Enter number of SWITCH for Cape Town: ");
        gaming[0][2] = input.nextInt();

        // Port Elizabeth
        System.out.print("Enter number of PS5 Port Elizabeth: ");
        gaming[1][0]= input.nextInt();

        System.out.print("Enter number of XBOX for Port Elizabeth: ");
        gaming[1][1]=input.nextInt();
        
        System.out.print("Enter number of SWITCH for Port Elizabeth: ");
        gaming[1][2]=input.nextInt();
        
        
        // PRETORIA
        System.out.print("Enter number of PS5 for Pretoria: ");
        gaming[2][0]=input.nextInt();

        System.out.print("Enter number of XBOX for Pretoria: ");
        gaming[2][1]=input.nextInt();
        
         System.out.print("Enter number of SWITCH  Pretoria: ");
        gaming[2][2]= input.nextInt();
        
        System.out.println("--------------------------------");
        System.out.println(" Gaming console Report");
        System.out.println("--------------------------------");
        
        
        // Display the report
    
        for (int i = 0; i < cities.length; i++) {
         
            System.out.println(cities[i] + " "
                    +gaming[i][0] + " "
                    + gaming[i][1] + " " 
                    + gaming[i][2]);
            
        System.out.println("--------------------------------");
        System.out.println("GAMING TOTAL FOR EACH CITY ");
        System.out.println("--------------------------------");

        //Total for each city 
        for (int j= 0; j<=cities.length; i++) {
            int total= 0;
            
            int total = gaming[i][0] + gaming[i][1];
            
            System.out.println(cities[i] + " " + total);
        }
}
        }
        
        
        //City with most sales 

        int highest = 0;
        String cityWithMost = "";
        for (int i = 0; i < cities.length; i++) {
        int total = gaming[i][0] + gaming[i][2];

        if (total > highest) {
        highest = total;
        cityWithMost = cities[i];
        
        
     

    if (total > highest) {
        highest = total;
        cityWithMost = cities[i];
    }
}

System.out.println("--------------------------------");
System.out.println("CITY WITH THE MOST SALES OF GAMING: " + cityWithMost);
System.out.println("--------------------------------");
}
}


