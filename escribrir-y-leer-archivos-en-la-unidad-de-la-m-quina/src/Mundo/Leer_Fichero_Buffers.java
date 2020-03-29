package Mundo;

/**
 *
 * @author DELL
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Clase para Leer un archivo de texto, todo un Buffer, su clase main se llama Accesso_Fichero_Buffers
public class Leer_Fichero_Buffers {

public void Leer()throws FileNotFoundException, IOException
{
    try
    {
    FileReader entrada = new FileReader("D:/Pruebas/jorge.txt");
    BufferedReader miBuffer = new BufferedReader(entrada);
    
    String Linea ="";
    
    while(Linea != null)
    {
    Linea = miBuffer.readLine();    
    if(Linea != null)
            System.out.println(Linea);
    }
        System.out.println();
    }catch(IOException e)
    {
        System.out.println("No se ha encontrado el archivo");
    }
    
}

}
