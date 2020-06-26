/**
 *
 * @author Pedro
 */

import java.io.*;
public class PesquisaBinaria {
    
    public static void main(String[] args) throws IOException {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vet[] = new int[10], valor;
        
        for(int i = 0; i < vet.length; i++) {
            System.out.print("Introduza o elemento na posicao " + (i+1) + ": ");
            vet[i] = Integer.parseInt(br.readLine());
        }
        bubbleSort(vet);
        System.out.println("Introduza o valor que deseja pesquisar no array: ");
        valor = Integer.parseInt(br.readLine());
        if (pesquisaBinaria(vet, valor) == -1)
            System.out.println("Valor nao encontrado!");
        else 
            System.out.println("Valor encontrado na posicao " + pesquisaBinaria(vet, valor));
    }
    
    public static int pesquisaBinaria(int arr[], int elementoAPesquisar) {
        
        int primeiroIndice = 0, ultimoIndice = arr.length - 1, indiceMedio;

        // Condicao de paragem
        while(primeiroIndice <= ultimoIndice) {
            indiceMedio = (primeiroIndice + ultimoIndice) / 2;
            // Se o elemento medio e' nosso objectivo retornar o seu indice
            if (arr[indiceMedio] == elementoAPesquisar) {
                return indiceMedio+1;
            }

            // Se o elemento medio e' menor
            // apontar o indice para o meio+1, levando a segunda metade em consideracao
            else if (arr[indiceMedio] < elementoAPesquisar)
                primeiroIndice = indiceMedio + 1;
            // se o elemento medio for maior
            // apontar o indice para o meio-1, levando a segunda metade em consideracao
            else 
                ultimoIndice = indiceMedio - 1;
        }
        return -1;
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
