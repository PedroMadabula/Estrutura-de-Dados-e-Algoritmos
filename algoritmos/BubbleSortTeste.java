/**
 *
 * @author Pedro
 */

import java.io.*;
public class BubbleSortTeste {
    
    public static void main(String[] args) throws IOException {
        
        int vet[] = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < vet.length; i++) {
            System.out.print("Introduza o elemento na posicao " + (i+1) + ": ");
            vet[i] = Integer.parseInt(br.readLine());
        }
        bubbleSort(vet);
        for(int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }
    
    public static void bubbleSort(int x[]) {
        
        int aux;
        
        for(int i = 1; i < x.length; i++) {
            for(int j = 0; j < x.length-1; j++) {
                if (x[j] > x[j+1]) {
                    aux = x[j];
                    x[j] = x[j+1];
                    x[j+1] = aux;
                }
            }
        }
    }
}
