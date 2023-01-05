/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_13102022;

/**
 *
 * @author Nila Enjeli
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
public class Input_3_Angka {
      public static void main( String[] args ){ 
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        int Angka1 = 0;
        int Angka2 = 0;
        int Angka3 = 0;
        int t;

        System.out.print("Angka :");

        try{
            Angka1=  Integer.parseInt(dataIn.readLine());
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
        System.out.print("Angka2 :");

        try{ 
            Angka2 =  Integer.parseInt(dataIn.readLine());
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
        System.out.print(" Angka3 :");

        try{
            Angka3 =  Integer.parseInt(dataIn.readLine());
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
        System.out.println(Angka1+" "+ Angka2 +" "+ Angka3 +" "); 

        t = (Angka1>Angka2)?Angka1:(Angka2>Angka3)?Angka2:(Angka3>Angka1)?Angka3:Angka2;

        System.out.println("\n Angka Tertinggi = " +t); 

 }
}

