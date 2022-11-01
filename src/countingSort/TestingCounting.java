/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countingSort;

/**
 *
 * @author Mikey
 */
public class TestingCounting {
    public static void main(String[] args) {
        int[]arreglo = new int[10];
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i] = (int)(Math.random()*100);
        }
        
        countingSort cS = new countingSort();
        System.out.println("Programa que ejecuta el Algoritmo de CountingSort: ");
        cS.countingSort(arreglo, 0);
        cS.mostrarArreglo(arreglo);
        
    }
}
