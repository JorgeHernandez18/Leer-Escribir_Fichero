/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;
import java.io.*;
/**
 *
 * @author DELL
 */
public class LeerFicheroBuffers {
    
    public void Leer() throws FileNotFoundException, IOException
    {
        try{
        FileReader fr = new FileReader("D:/Pruebas/dudas.txt");
        BufferedReader br = new BufferedReader(fr);
        
        String linea="";
        
        while(linea!=null)
        {
            linea=br.readLine();
            
            if(linea!=null)
                System.out.println(linea);
        }
        System.out.println();
    }catch(IOException e){
    System.err.print(e);
    }
}
    
}