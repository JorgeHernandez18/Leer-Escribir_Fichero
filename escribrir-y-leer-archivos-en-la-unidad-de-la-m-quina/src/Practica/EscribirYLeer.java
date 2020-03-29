/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class EscribirYLeer {

    ArrayList<String> arr = new ArrayList<String>();
    
    public void Escribiendo() {

        String palabra = JOptionPane.showInputDialog("ingrese palabra");
        arr.add(palabra);
        try {

            FileWriter escribir = new FileWriter("D:/Pruebas/nuevo.txt");

//            for (int i = 0; i < frase.length(); i++) {
//                escribir.write(frase.charAt(i));
//            }
            for (String p : arr) {
                escribir.write(p);
            }

            escribir.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }

    public void leer() throws FileNotFoundException, IOException {

        try {
            FileReader entrada = new FileReader("D:/Pruebas/nuevo.txt");

            int c = 0;
            String palabra = "";
            while (c != -1) {
                c = entrada.read();
                char letra = (char) c;
                palabra += letra;
            }
            arr.add(palabra);
            
            for (String p : arr) {
                System.out.println(p);
            }

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
    
    public void eliminar()
    {
        arr.removeAll(arr);
    }
    
    public static void main(String[] args) throws IOException {

        EscribirYLeer escribir = new EscribirYLeer();
//     escribir.eliminar();
//        escribir.leer();
          escribir.Escribiendo();
        escribir.leer();

    }

}
