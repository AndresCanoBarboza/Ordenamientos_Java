/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrescanob_proyecto1;

import java.util.Arrays;


public class Ordenamientos {

    int arreglo[];
    int copy1[];
    int copy2[];
    int copy3[];
    

    
    //set y get
    
    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int[] getCopy1() {
        return copy1;
    }

    public void setCopy1(int[] copy1) {
        this.copy1 = copy1;
    }

    public int[] getCopy2() {
        return copy2;
    }

    public void setCopy2(int[] copy2) {
        this.copy2 = copy2;
    }

    public int[] getCopy3() {
        return copy3;
    }

    public void setCopy3(int[] copy3) {
        this.copy3 = copy3;
    }
    
   
    //Método Burbuja
    
    public int[] Burbuja (int arreglo[]) {
    for (int i=0; i < 998; i++) {    
        for(int j=0; j < 998; j++) {
            if (arreglo[j] > arreglo[j+1]) {
                int aux = arreglo[j];
                arreglo[j] = arreglo[j+1];
                arreglo[j+1] = aux;
            }
        
        }
        copy1 = Arrays.copyOf(arreglo, arreglo.length);
    }      
    return copy1;
    
    
    }
    
    //Método Shellsort 
    
    public int[] Shellsort (int[] arreglo) {
        for (int i = 0; i <998 ; i++) {
            int pos = i;
            int aux = arreglo[i];
            
            while((pos>0) && (arreglo[pos-1] > aux)) {
                arreglo[pos] = arreglo [pos-1];
                pos--;
            }
        }
        copy2 = Arrays.copyOf(arreglo, arreglo.length);
    
        return copy2;
    }
    
    //Método quicksort por recursividad
    
    public int[] Quicksort (int[] arreglo, int izq, int der) { 
    int i = izq;
    int j = der;
    int pivote = arreglo[(i + j) / 2];
    do {
        while (arreglo[i] < pivote) {
            i++;
        }
        while (arreglo[j] > pivote) {
            j--;
        }
        if (i <= j) {
            int aux = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = aux;
            i++;
            j--;
        }
        } while (i <= j);
        if (izq < j) {
            Quicksort(arreglo, izq, j);
        }
        if (i < der) {
            Quicksort(arreglo, i, der);
        }
        copy3 = Arrays.copyOf(arreglo, arreglo.length);
        return copy3;
    
    
    }    
    
    
    
        
}   //fin de clase
            
            
    
    
    
        
