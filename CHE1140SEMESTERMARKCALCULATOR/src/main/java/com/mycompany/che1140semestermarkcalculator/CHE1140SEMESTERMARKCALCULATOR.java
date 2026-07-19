/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.che1140semestermarkcalculator;

/**
 *
 * @author user3
 */

import java.util.Scanner;
    
public class CHE1140SEMESTERMARKCALCULATOR {
    public static void main(String[] args) {
        
        Scanner user_input = new Scanner (System.in);
       
        //Who is the user and are they doing CHE1140?
        
        String first_name;
        System.out.print("Enter your first name: ");
        first_name = user_input.nextLine();
        
        String Surname;
        System.out.print("Enter your Surname: ");
        Surname = user_input.nextLine();
        
        String Full_name = Surname+" "+first_name; 
        
        // I DIDN,T KNOW HOW TO DO THIS PART OF STRING AND BOOLEAN
        
        String Yn;
        System.out.print("\n"+Full_name+" are you doing CHE1140 (Yes/No): ");
        Yn = user_input.nextLine();
        
        boolean isDoingSubject;
        
        if(Yn.equalsIgnoreCase("yes")){
            isDoingSubject = true;
        }
        else{
            isDoingSubject= false;
        }
        
        if(isDoingSubject){
            
           //QUIZS MARKS
        double quizs_mark1;
        System.out.print("\nEnter your first quizs marks: ");
        quizs_mark1= user_input.nextDouble();
        
        double quizs_mark2;
        System.out.print("Enter your 2nd quizs marks: ");
        quizs_mark2= user_input.nextDouble();
        
        double quizs_mark3;
        System.out.print("Enter your 3rd quiz marks: ");
        quizs_mark3= user_input.nextDouble();
        
        double quizs_mark4;
        System.out.print("Enter your 4th quiz marks: ");
        quizs_mark4= user_input.nextDouble();
        
        double Sum_Qmarks;
        Sum_Qmarks = quizs_mark1 + quizs_mark2 + quizs_mark3 + quizs_mark4;
        System.out.print("\nYou got: "+Sum_Qmarks+ " out of 400 for your quizs \n");
        
        char P ='%';
        double Quizs_P;
        Quizs_P = (Sum_Qmarks/4)*0.2;
      
        
        System.out.println("This means: "+Quizs_P+P+" is added to your Semester Mark from 0" );
        
        // PRACTICAL MARKS
        
        double pm1;
        System.out.print("\nEnter your 1st Practical Mark: ");
        pm1 = user_input.nextDouble();
        
        double pm2;
        System.out.print("Enter your 2nd Practical Mark: ");
        pm2 = user_input.nextDouble();
        
        double pm3;
        System.out.print("Enter your 3rd Practical Mark: ");
        pm3 = user_input.nextDouble();
        
        double pm4;
        System.out.print("Enter your 4th Practical Mark: ");
        pm4 = user_input.nextDouble();
        
        double Sum_pm;
        Sum_pm = pm1 + pm2 + pm3 + pm4;
        System.out.print("\nYou got: "+Sum_pm+ " out of 400 for your Practicals");
        
       
        double Pr;
        Pr = (Sum_pm/4)*0.4;
      
        
        System.out.print("\nThis means: "+Pr+P+" is added to your Semester Mark from: "+Quizs_P+P+" \n" );
        
              
        // Quiz+Practical Semester Mark
        
        double qupr;
        qupr = (Quizs_P + Pr);
        
        System.out.print("\nThis means you are setting on "+qupr+P+" for the semester without the test.\n");
        
        //Tests Marks
        
        double TM1;
        System.out.print("\nEnter your 1st test mark: ");
        TM1 = user_input.nextDouble();
        
        double TM2;
        System.out.print("Enter your 2nd test mark: ");
        TM2 = user_input.nextDouble();
        
        double TM;
        TM = ((TM1+TM2)/2)*0.4;
        
       
        System.out.print("\nThis means: "+TM+P+" is added to your Semester Mark from: "+qupr+P );
        
        // SEMESTER MARK
        double Sem;
        Sem = (qupr+TM);
            System.out.println("");
            
        double Semi;
        Semi = (qupr+TM)*0.6;
        
       
        System.out.println("\nSo with that your semester mark is: "+Sem+P);
            System.out.println("\nSo with that your semester mark without the exam is: "+Semi+P);
        
        if(Sem>=40 && Sem<= 74){
            System.out.println("\n"+Full_name+" can write the CHE1140 exams");
        
        }
        else if(Sem>74){
            System.out.println("");
            System.out.println(Full_name+" got a distinction and can write the CHE1140 exams.\n Good Job");
        }
       
        else{
            System.out.println("\n"+Full_name+" can't write the CHE1140 exam");
        
        }
         
           
        }
        
        else{
            System.out.println("\nGood bye "+Full_name);
        }
                   
              
               
           user_input.close(); 
        
        
         }
}
