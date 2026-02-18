import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FrasesArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "frases.txt";

        List<String> frases = new ArrayList<>();
        frases.add("Ejercicio 25");
        frases.add("Programacion");
        frases.add("BufferedReader BufferedWriter");
        frases.add("Segundo trimestre");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {

            for (String frase : frases) {
                writer.write(frase);
                writer.newLine(); // Salto de línea
            }

            System.out.println("Frases escritas correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }

        System.out.println("Contenido del archivo:");

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {

            String linea;

            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}

