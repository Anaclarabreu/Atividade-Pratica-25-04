import java.util.Scanner;

public class AnaliseArrays {

    // a) totalPares
    public static int totalPares(int[] array) {
        int total = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                total++;
            }
        }
        return total;
    }

    // b) maiorValor
    public static int maiorValor(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    // c) totalIguais
    public static int totalIguais(int[] a1, int[] a2) {
        int total = 0;
        for (int i : a1) {
            for (int j : a2) {
                if (i == j) {
                    total++;
                    break; // Evita contar duplicados em a2
                }
            }
        }
        return total;
    }

    // Função principal para testar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays definidos estaticamente (pode trocar por entrada do usuário)
        int[] array1 = { 2, 3, 4, 5, 6, 8 };
        int[] array2 = { 1, 2, 6, 9, 4 };

        System.out.println("Array 1:");
        mostrarArray(array1);
        System.out.println("Array 2:");
        mostrarArray(array2);

        // Teste das funções
        System.out.println("\nTotal de pares em array1: " + totalPares(array1));
        System.out.println("Maior valor em array1: " + maiorValor(array1));
        System.out.println("Total de números iguais nos dois arrays: " + totalIguais(array1, array2));

        sc.close();
    }

    // Função auxiliar para exibir o conteúdo do array
    public static void mostrarArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
