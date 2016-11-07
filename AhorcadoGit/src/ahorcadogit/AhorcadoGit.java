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
    
    //funcion que realiza los intentos del jugador
    public static void partida(String vpalabra[],String verror[],String vacierto[],String palabra){
        //comienzo ahorcado
            System.out.println("******************* AHORCADO *******************");
        String letra;
        
        int contador=7;
       //bucle
        while ((contador>0)&&(ganarPartida(vacierto,vpalabra)==false)){
        //for (int i=0;i<verror.length;i++){
        //muestra el dibujo para que sepa por donde va    
            mostrarDibujo(contador);
            System.out.println("VIDAS: "+ contador);
        //mostrar vector acierto
            mostrarAcierto(palabra, vacierto);
        
        
        //pregunta letra al jugador  
        System.out.println("");
        System.out.println("");
        System.out.println("Escribe una única letra: ");
        letra=leer.next();
           
       //muestra vector verror las letras erroneas que vas introduciendo
        muestraError(verror);
                System.out.println("");
                System.out.println(""); 
        //comprueba si letra esta en la matriz palabra para acertar o fallar
            if (buscarLetra(vpalabra, vacierto, verror, letra)==false){
            //recorro verror guardando letra erronea
                
               // verror[i]=letra;
                contador--;
            } 
            
         //}
        }
        
        if (ganarPartida(vacierto,vpalabra)==true){
        System.out.println("La palabra es: ");
        mostrarPalabra(palabra, vpalabra);
        
        System.out.println(" ");
        System.out.println("¡HAS GANADO!");
        } else{
        System.out.println("   _ _ _       ");
                System.out.println("  |/    |      ");
                System.out.println("  |     0      ");
                System.out.println("  |   /ºº/     ");
                System.out.println("  |     |      ");
                System.out.println("  |    / /     ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                System.out.println("  HAS PERDIDO  ");
        }
    }
    
   
    
   public static void iniciarErrores(String verror[]){
        for (int i=0;i<verror.length;i++){
                 if (verror[i]==null){
                     verror[i]=" - ";
                 }
        }
   }
    
   public static boolean ganarPartida(String vacierto[], String vpalabra[]){
       boolean ganado = true;
       
       for (int i=0;i<vacierto.length;i++){
           if (!(vacierto[i].equalsIgnoreCase(vpalabra[i]))){
               
               ganado = false;
           } 
       }
       
       
       return ganado;
   }
    
   public static boolean buscarLetra(String vpalabra[], String vacierto[],String verror[], String letra){
       boolean encontrado = false;
       
       for (int i=0;i<vpalabra.length;i++){
           if(letra.equalsIgnoreCase(vpalabra[i])){
               vacierto[i]=letra;
               encontrado = true;    
           }
       }
       return encontrado;
   }
    
   public static void muestraError (String verror[]) {
       System.out.println("");
       System.out.println("");
       System.out.println("Letras erroneas introducidas: ");
    
       for (int i=0;i<verror.length;i++){
           if (verror[i]!=null){
           System.out.print(verror[i]+" --> ");
           }
//if(verror[i]==null){
           //    huecolibre=i;
               
          // } 
       }
      // System.out.println("estamos introduciendo la letra "+letra+" en el vector error en la posicion "+huecolibre);
   } 
   
    
    public static void iniciarAciertos(String vacierto[],String palabra){
        
        //ponemos donde pone null del vector
        // guiones para darle al jugador
        // la pista de cuantas letras son
        for (int i=0;i<palabra.length();i++){
            if (vacierto[i]==null){
                vacierto[i]=" - ";
            }
            //comprobar que se rellena la matriz con -
            //System.out.println(vacierto[i]);
        }
        
    }
    
    public static void separaPalabra(String vpalabra[],String palabra){
    
        for (int i=0; i<palabra.length();i++){
        vpalabra[i]=palabra.substring(i,i+1);
        }
    
    }
    
    public static void mostrarAcierto(String palabra,String vacierto[]){
        
        
        for (int i=0;i<vacierto.length;i++){
            System.out.print(vacierto[i]+" "); 
            
        }
    }
    
    public static void mostrarPalabra(String palabra,String vpalabra[]){
        
        
        for (int i=0;i<palabra.length();i++){
            System.out.print(vpalabra[i]+" "); 
            
        }
        
    }
    public static void mostrarDibujo(int contador){
      
        switch(contador){
           
           
            /*case 0:
                System.out.println("   _ _ _       ");
                System.out.println("  |/    |      ");
                System.out.println("  |     0      ");
                System.out.println("  |   /ºº/     ");
                System.out.println("  |     |      ");
                System.out.println("  |    / /     ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                System.out.println("  HAS PERDIDO  ");
                break;*/
            case 1:
                System.out.println("   _ _ _       ");
                System.out.println("  |/    |      ");
                System.out.println("  |     0      ");
                System.out.println("  |   /ºº/     ");
                System.out.println("  |     |      ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                break;
            case 2:
                System.out.println("   _ _ _       ");
                System.out.println("  |/    |      ");
                System.out.println("  |     0      ");
                System.out.println("  |   /ºº/     ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                break;
            case 3:
                System.out.println("   _ _ _       ");
                System.out.println("  |/    |      ");
                System.out.println("  |     0      ");
                System.out.println("  |   /  /     ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                break;
            case 4:
                System.out.println("   _ _ _       ");
                System.out.println("  |/    |      ");
                System.out.println("  |     0      ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                break;
            case 5:
                System.out.println("   _ _ _       ");
                System.out.println("  |/    |      ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                        break;
            case 6:
                System.out.println("   _ _ _       ");
                System.out.println("  |/           ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                break;
            case 7:
                System.out.println("               ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("  |            ");
                System.out.println("---------------");
                System.out.println("---------------");
                break;
            case 8:
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("               ");
                System.out.println("---------------");
                System.out.println("---------------");
                break;
                
       }
    }
    
    public static void main(String[] args) {
         String palabra="sobaco";
        // declarar vectores para la palabra escogida
       // para la palabra con sus aciertos
       // y para las letras erroneas
       
        String vpalabra []= new String [palabra.length()];
        String vacierto []= new String [palabra.length()];
        String verror []= new String [7];
        
        
       //iniciarErrores(verror);
       separaPalabra(vpalabra, palabra);
       iniciarAciertos(vacierto, palabra);
       partida(vpalabra, verror, vacierto, palabra);
       
      
    }
    
}
