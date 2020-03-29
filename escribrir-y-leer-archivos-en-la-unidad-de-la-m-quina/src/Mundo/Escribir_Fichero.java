/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 * Clase para escribir y guardar un archivo u objeto en la unidad de la máquina, su clase main se llama Escribiendo
 */

public class Escribir_Fichero {

    Leer_Fichero lf= new Leer_Fichero();
    
    public void Escribiendo() {
        
        String frase = "Es bobo";
                
        try {

            FileWriter escribir = new FileWriter("D:/Pruebas/nuevo.txt");
            
            for (int i = 0; i < frase.length(); i++) {
                escribir.write(frase.charAt(i));
                lf.arr.add(frase);
            }
            
            escribir.close();
        
        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
