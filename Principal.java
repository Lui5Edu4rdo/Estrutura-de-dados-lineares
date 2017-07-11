
package quicksort;

import java.util.Arrays;

/**
 *
 * @author Luiz Eduardo
 */
public class Principal {
    public static void main(String[] args) {
       
       int []v = {6,3,4,5,2,7,1,9,8,0};
       quicksort(v , 0 , v.length-1);
       System.out.println(Arrays.toString(v));
        
    }
    
     private static void quicksort(int[] v, int esq, int dir) {
        if(esq < dir){
            //Acha o pivo e separa menores pra esquerda e maiores pra direita
            int j = separar(v , esq , dir);
            //Recursivamente ordenando da esquerda a j-1
            quicksort(v , esq , j-1);
            //Recursivamente ordenando de j+1 a direita
            quicksort(v , j+1 , dir);
        }
    }

    private static int separar(int[] v, int esq, int dir) {
        int i = esq , j = dir;
        while(i < j){
            //Vai de I a direita procurando um elemento maior que o pivo
            while(i < dir && v[i] <= v[esq])i++;
            //Vai de J a esquerda procurando um elemento maior que o pivo
            while(j > esq && v[j] >= v[esq])j--;
            //Quando se cruzam ocorre a trocar para ordenação dos elementos
            if(i < j){
                trocar(v , i ,j);
                i++;
                j--;
            }
        }
        trocar(v , esq , j);
        return j;
    }

    private static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
