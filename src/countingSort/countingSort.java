/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package countingSort;

/**
 *
 * @author Mikey
 */
public class countingSort {
    
    
    public void countingSort(int[] datos, int n){
       int[] salida = new int [n+1];
       
       int max = datos[0];
       for(int i=1; i<n; i++){
           if(datos[i]>max){
               max=datos[i];
           }
       }
       int[] contar = new int[max+1];
       for(int i=0; i<max; i++){
           contar[i]=0;
       }
       
       for(int i=0; i<n; i++){
           contar[datos[i]]++;
       }
       
       for(int i=1; i<=max; i++){
           contar[i] += contar[i-1];
       }
       
       for(int i=n-1; i>=0; i--){
           salida[contar[datos[i]]-1] = datos[i];
           contar[datos[i]]--;
       }
       
       for(int i=0; i<n; i++){
           datos[i] = salida[i];
       }
    System.out.println("El arreglo Ordenado con Radix es: ");
    mostrarArreglo(datos);
    }
    
    public void mostrarArreglo(int[]datos){
        int k;
        for(k=0; k<datos.length;k++){
            System.out.print("[" + datos[k] + "]");
        }
        System.out.println();
    }
}
