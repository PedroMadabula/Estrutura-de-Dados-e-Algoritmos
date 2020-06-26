/**
 *
 * @author Pedro
 */
import java.io.*;
public class PesquisaSequencial {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vet[] = new int[10], valor;
        
        for(int i = 0; i < vet.length; i++) {
            System.out.print("Introduza o elemento na posicao " + (i+1) + ": ");
            vet[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Introduza o valor que deseja pesquisar no array: ");
        valor = Integer.parseInt(br.readLine());
        if (pesquisaSequencial(vet, valor) == -1)
            System.out.println("Valor nao encontrado ");
        else 
            System.out.println("Valor encontrado na posicao " + pesquisaSequencial(vet, valor));
    }
    
    public static int pesquisaSequencial(int arr[], int elementoAPesquisar) {
        
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == elementoAPesquisar)
            return i+1;
        }
        return -1;
    }
}