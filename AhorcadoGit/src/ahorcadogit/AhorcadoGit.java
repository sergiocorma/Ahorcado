/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcadogit;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AhorcadoGit {
    
    public static Scanner leer = new Scanner (System.in);
    
    public static void partida(String vpalabra[], String verror[], String vacierto[], String palabra){
        
        String letra;
        int aux= palabra.length();
        int contador=8;
        
        while (contador>=0){
            mostrarDibujo(contador);
        
        //mostrar vector acierto
                    for (int j=0;j<aux;j++){
                           System.out.print(vacierto[j]);     
                    }
        //pregunta letra al jugador            
        System.out.println("Escribe una única letra: ");
        letra=leer.next();
        
            if (letra.equalsIgnoreCase(vpalabra[contador])){
                    vacierto[contador]=letra;
                    
            } else {
                    contador--;
                    
                
                    }
            
        contador++;
        }
        if (contador==0){
            mostrarDibujo(contador);
            System.out.println("¡Has perdido!");
        
        }
        
        
    }
    
   
    
    
   
    
    public static void iniciarAciertos(String vacierto[], String palabra){
        int aux= palabra.length();
        //ponemos donde pone null del vector
        // guiones para darle al jugador
        // la pista de cuantas letras son
        for (int i=0;i<aux;i++){
            if (vacierto[i]==null){
                vacierto[i]=" _ ";
            }     
        }
    }
    
    public static void separaPalabra(String vpalabra[], String palabra){
    
        for (int i=0; i<palabra.length();i++){
        vpalabra[i]=palabra.substring(i,i+1);
        }
    
    }
    
    public static void mostrarDibujo(int contador){
      
        switch(contador){
            case 0:
        System.out.println("   _ _ _       ");
        System.out.println("  |/    |      ");
        System.out.println("  |     0      ");
        System.out.println("  |   /ºº/     ");
        System.out.println("  |     |      ");
        System.out.println("  |    / /     ");
        System.out.println("  |            ");
        System.out.println("---------------");
        System.out.println("---------------");
             break;
            
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                 
                break;
            case 8:
                System.out.println("---------------");
                System.out.println("---------------");
                break;
                
       }
    }
    
    public static void main(String[] args) {
         String palabra="kiwi";
        // declarar vectores para la palabra escogida
       // para la palabra con sus aciertos
       // y para las letras erroneas
       
        String vpalabra []= new String [palabra.length()];
        String vacierto []= new String [palabra.length()];
        String verror []= new String [8];
        
       separaPalabra(vpalabra, palabra);
       iniciarAciertos(vacierto, palabra);
       partida(vpalabra, vacierto, verror, palabra);
      
    }
    
}
