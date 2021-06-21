package ExercicioMap;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Map<String, Integer> votos = new HashMap<>();

        File file = new File("c:\\temp\\in.csv");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String[] organiza = sc.nextLine().split(",");
                String nome = organiza[0];
                int cont = Integer.parseInt(organiza[1]);
                if (votos.containsKey(nome)) {
                    int auxVotos = votos.get(nome);
                    votos.put(nome, cont + auxVotos);

                } else {
                    votos.put(nome, cont);
                }

            }
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));

            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

    }

}
