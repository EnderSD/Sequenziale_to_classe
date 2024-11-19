/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241119_4id_marrale_minuscoloapp;
import java.util.Scanner;

/**
 *
 * Marrale Lorenzo
 * Classe che si occupa di tutte le operazioni necessarie per trasformare una parola da maiuscolo a minuscolo
 * 
 * 
 */

   

public class Minuscolo {
    
    
    //dichiarazioni variabili di tipo privato
    //variabile tanti per impostare la grandezza dell'array
    private final  int TANTI = 30;
    //dichiarazione variabile di tipo string
    private String parola;
    //creazione array 
    private final  char[] minuscolo = new char[TANTI];
    
    
    public void input_utente(){
        
        
        Scanner in = new Scanner(System.in);    
        System.out.println("\nInserisci una parola : ");
        parola = in.next();
        
    }
    
    
    
    public void trasformazione_string_to_array(){
        
        for(int x = 0; x < parola.length(); x++){
            
       
             minuscolo[x] = parola.charAt(x);
             
        }       
    }
    
    public void trasformazione_in_minuscolo(){
        
        //trasforma la parola in minuscolo
        for(int x = 0; x < parola.length(); x++){
            
            //in minuscolo
             minuscolo[x] = Character.toLowerCase(minuscolo[x]);
             
        }
     
        
    }
    
    
    public void visualizzazione_parola_minuscolo_array(){
        
        System.out.print("\nLa parola in minuscolo (array) : " );
         
        //visualizza la parola carattere per carattere
        for(int x = 0; x < minuscolo.length; x++){
            
            System.out.print(minuscolo[x]);
            
        }
    
    }
    
    public void visualizzazione_parola_minuscolo_oggetto(){
        
        String parolaMinu = new String(minuscolo);
        System.out.print("\nLa parola in minuscolo (oggetto): ");
        System.out.print(parolaMinu);
        
    }
    
    
    }

