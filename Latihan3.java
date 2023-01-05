/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NilaEnjeli_13102022;

/**
 *
 * @author Nila Enjeni
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 
public class Latihan3 {

    public static void main( String[] args ){ 
        BufferedReader dataIn = new BufferedReader(new 
        InputStreamReader( System.in) ); 
        String word1 = "";
        String word2 = "";
        String word3 = "";

        System.out.print("Enter Word1 :");

        try{ 
            word1 = dataIn.readLine();
        }
        catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
            System.out.print("Enter Word2 :");
        try{ 
            word2 = dataIn.readLine();
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        } 
        System.out.print("Enter Word3 :");
        try{ 
            word3 = dataIn.readLine();
        }catch( IOException e ){ 
            System.out.println("Error!"); 
        }
        System.out.println(word1+" "+ word2 +" "+word3+" "); 

 }
}

