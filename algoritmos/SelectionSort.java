/**
 *
 * @author Pedro
 */
import java.io.*;
public class SelectionSort {
    
    public static void main(String[] args) throws IOException {
        
        int vet[] = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < vet.length; i++) {
            System.out.print("Introduza o elemento na posicao " + (i+1) + ": ");
            vet[i] = Integer.parseInt(br.readLine());
        }
        selectionSort(vet);
        for(int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }
    
    public static int[] selectionSort(int[] array) {
    
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }
}