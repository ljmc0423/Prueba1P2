/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ljmc2
 */
public class Matta_Lorenzo_P1P2 {
    public static void main(String[] args) {
        
        Scanner lea=new Scanner(System.in).useDelimiter("\n");
        Random azar=new Random();
        
        String[] palabras={"radar", "level", "world", "civic", "java", 
            "deified","python","rotor", "language", "madam", "refer", "stats", 
            "noon", "hello","moon", "wow", "racecar", "kayak", "apple", "deed"};
        
        System.out.println("Lista de Palabras:");
        for(int i=0;i<palabras.length;i++){
            System.out.println("["+i+"]: "+palabras[i]);
        }
        
        System.out.print("\nIngresar el tamano de los arreglos: ");
        int tamano=lea.nextInt();
        
        String[] arregloA=new String[tamano];
        String[] arregloB=new String[tamano];
        
        boolean[] Palindromos=new boolean[palabras.length];
        
        for(int i=0;i<palabras.length;i++){
            String palabra=palabras[i];
            boolean palindromo=true;
            int izq=0;
            int der=palabra.length()-1;
            while(izq<der){
                if (palabra.charAt(izq)!=palabra.charAt(der)){
                    palindromo=false;
                    break;
                }
                izq++;
                der--;
            }
            Palindromos[i]=palindromo;
        }
        
        int contador=0;
        while(contador<tamano){
            int indice=azar.nextInt(palabras.length);
            if(Palindromos[indice]){
                boolean yaEsta=false;
                for(int i=0;i<contador;i++){
                    if (arregloA[i]!=null&&arregloA[i].equals(palabras[indice])){
                        yaEsta=true;
                        break;
                    }
                }
                if(!yaEsta){
                    arregloA[contador]=palabras[indice];
                    contador++;
                }
            }
        }

        System.out.println("\nLista Palabras Palindroma arreglo A:");
        for(int i=0;i<arregloA.length;i++){
            if(arregloA[i]!=null){
                System.out.println("["+i+"]: "+arregloA[i]);
            }
        }
        
        contador=0;
        while(contador<tamano){
            int indice=azar.nextInt(palabras.length);
            if(Palindromos[indice]){
                boolean yaEsta=false;
                for(int j=0;j<contador;j++){
                    if(arregloB[j]!=null&&arregloB[j].equals(palabras[indice])){
                        yaEsta=true;
                        break;
                    }
                }
                if(!yaEsta){
                    arregloB[contador]=palabras[indice];
                    contador++;
                }
            }
        }

        System.out.println("\nLista Palabras Palindroma arreglo B:");
        for(int i=0;i<arregloB.length;i++){
            if(arregloB[i]!=null){
                System.out.println("["+i+"]: "+arregloB[i]);
            }
        }
        
        System.out.println("\nPalabras del Arreglo A no estan en el Arreglo B son:");
        for(int i=0;i<arregloA.length;i++){
            if(arregloA[i]!=null){
                boolean estaEnB=false;
                for(int i2=0;i2<arregloB.length;i2++){
                    if(arregloB[i2]!=null&&arregloA[i].equals(arregloB[i2])){
                        estaEnB=true;
                        break;
                    }
                }
                if (!estaEnB){
                    System.out.println("["+i+"]: "+arregloA[i]);
                }
            }
        }
        
    }
}
