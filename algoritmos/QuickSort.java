/**
 *
 * @author Pedro
 */
import java.io.*;
public class QuickSort {
    
    public static void main(String[] args) throws IOException {
        
        int vet[] = new int[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i = 0; i < vet.length; i++) {
            System.out.print("Introduza o elemento na posicao " + (i+1) + ": ");
            vet[i] = Integer.parseInt(br.readLine());
        }
        quickSort(vet, 0, vet.length-1);
        for(int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }
    
    public static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
}

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
}
