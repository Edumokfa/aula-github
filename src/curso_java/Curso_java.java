package curso_java;

import java.util.Scanner;

public class Curso_java {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um numero");
        int x = sc.nextInt();

        System.out.println(mat[0][0]);
    }

}
