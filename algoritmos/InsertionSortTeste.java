/**
 *
 * @author Pedro
 */
import java.io.*;
public class InsertionSortTeste {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vet[] = new int[10];
        
         for(int i = 0; i < vet.length; i++) {
            System.out.print("Introduza o elemento na posicao " + (i+1) + ": ");
            vet[i] = Integer.parseInt(br.readLine());
        }
        doInsertionSort(vet);
        for(int i = 0; i < vet.length; i++) {
            System.out.println(vet[i] + " ");
        }
    }
    
   public static void doInsertionSort(int[] x) {
        
       int temp;
       
       for (int i = 1; i < x.length; i++) {
            for (int j = i; j > 0; j--) {
                if (x[j] < x[j-1]){
                    temp = x[j];
                    x[j] = x[j-1];
                    x[j-1] = temp;
                }
            }
        }
    }  
}
