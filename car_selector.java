/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        System.out.println("Do you want to select a car? Say 'yes' or 'no'");
        //to take input from the user
        Scanner scan = new Scanner(System.in);
        String reply1 = scan.next();
        if(reply1.equals("yes")){
            System.out.println("what is your favourate colour between red/yellow/whiite/black");
            String reply2 = scan.next();
            if(reply2.equals("red")){
                System.out.println("we have it in stock. would you like to try, 'yes' or 'no' ");
                String reply3 = scan.next();
                if(reply3.equals("yes")){
                    System.out.println("lets check the car");
                }
                else{
                    System.out.println("No worries we will check the car");
                }
                
            }
            else if(reply2.equals("yellow")){
                System.out.println("we can order it");
            }
            else if(reply2.equals("white")){
                System.out.println("we can order it ");
            }
            else{
                System.out.println("we dont have it in stock");
            }
        }
        else{
            System.out.println("No worries have a great day!!!");
        }
    }
} 
