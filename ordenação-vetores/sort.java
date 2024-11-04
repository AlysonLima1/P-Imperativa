import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        // Questão 1 
        int[] vetor = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        System.out.println("Vetor original: " + Arrays.toString(vetor));
        
        selectionSort(vetor);
        System.out.println("Vetor ordenado em ordem crescente: " + Arrays.toString(vetor));
        
        // Questão 2 - Insertion Sort em ordem crescente
        int[] vetor2 = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};
        System.out.println("\nQuestão 2 - Insertion Sort em ordem crescente");
        System.out.println("Vetor original: " + Arrays.toString(vetor2));
        insertionSort(vetor2);
        System.out.println("Vetor ordenado em ordem crescente: " + Arrays.toString(vetor2));
    }
    public static void selectionSort(int[] vetor2) {
        int x = vetor2.length;
        for (int i = 0; i < x - 1 ;i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < x; j++){
                if (vetor2[j]< vetor2[indiceMenor]){
                    indiceMenor = j;
                }
            }
            if (indiceMenor != i) {
                int temp = vetor2[i];
                vetor2[i] = vetor2[indiceMenor];
                vetor2[indiceMenor] = temp;
            }
        }
    }
     // Questão 2 - Insertion Sort em ordem crescente
     public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }
}