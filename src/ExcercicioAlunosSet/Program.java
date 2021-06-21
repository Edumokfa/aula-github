package ExcercicioAlunosSet;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Set<Entrada> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de estudantes do curso A: ");
        int numeroA = sc.nextInt();
        for (int i = 0; i < numeroA; i++) {
            set.add(new Entrada(sc.nextInt()));
            sc.nextLine();
        }
        System.out.print("Digite o número de estudantes do curso B: ");
        int numeroB = sc.nextInt();
        for (int i = 0; i < numeroB; i++) {
            set.add(new Entrada(sc.nextInt()));
            sc.nextLine();
        }
        System.out.print("Digite o número de estudantes do curso C: ");
        int numeroC = sc.nextInt();
        for (int i = 0; i < numeroC; i++) {
            set.add(new Entrada(sc.nextInt()));
            sc.nextLine();
        }
        System.out.println("Numero de estudantes: " + set.size());
    }

}
