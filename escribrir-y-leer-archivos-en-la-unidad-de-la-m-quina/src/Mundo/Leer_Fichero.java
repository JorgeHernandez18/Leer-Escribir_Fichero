/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mundo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jorge
 * Clase para leer un archivo desde la unidad de la máquina, su clase main se llama Acceso_Fichero
 */
public class Leer_Fichero {
    
    ArrayList<String> arr = new ArrayList<String>();
    
    public void Leer() throws FileNotFoundException, IOException
    {
        
        try
        {
            FileReader entrada = new FileReader("D:/Pruebas/nuevo.txt");
            
            int c=0;
            String palabra="";
            while(c != -1)
            {
                c=entrada.read();
                char letra = (char) c;
                palabra+=letra;
            }
            arr.add(palabra);
            
            for(String p:arr)
                System.out.println(p);
            
        }catch(IOException e)
        {
            System.out.println("No se ha encontrado el archivo");
        }
    }
}
