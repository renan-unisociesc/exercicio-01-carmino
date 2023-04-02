/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Renan
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 1;
        int somaPares =0;
        int produtoImpares = 1;
        Scanner entrada = new Scanner (System.in);
        while (valor > 0) {
        System.out.println("digite um valor inteiro positivo: ");
        valor = entrada.nextInt();
            if (valor > 0) {
                if ((valor % 2) ==0 ){
                somaPares = somaPares + valor;
                } else {
                produtoImpares = produtoImpares * valor;
                }
            }
        }
    System.out.println("A soma dos numeros pares e " + somaPares);
    System.out.println("O produto dos numeros impares e " + produtoImpares);    
    }
    
}
