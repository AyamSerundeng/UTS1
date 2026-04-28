/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package babelnaik;
/**
 *
 * @author HYPE AMD
 */
public class BabelNaik {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {200, 50, 10, 4, 300, 1};
        int i, j, swap;

        System.out.print("Bilangan Belum Terurutnya : ");
        for (int a = 0; a < A.length; a++) {
            System.out.print(A[a] + " ");
        }
        System.out.println();

        // Proses bubble sort ascending
        for (i = 0; i < (A.length - 1); i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j] > A[j + 1]) {   // kiri lebih besar → tukar
                    swap = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = swap;
                }
            }
        }

        System.out.print("\nBilangan Terurutnya (Ascending) : ");
        for (i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}