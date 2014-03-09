package Ejercicio5;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Escribirfichero {
	
	public static int numc;
	public static String nomf;
	
	public void guardar()
    {
        FileWriter fichero = null;
        BufferedWriter bw = null;
        
        System.out.println("Entramos en la clase Escribirfichero");
        try
        {
            fichero = new FileWriter("C:/Universidad/DSA/dsa-projects/ejjava/registro_5.txt",true);
            bw = new BufferedWriter (fichero);
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            String nc = Integer.toString(numc);
          
            bw.write(numc + ", el fichero es: " + nomf + " - fecha - " + date + " ");
            bw.newLine(); //Write permie otras funciones, entre ellas esta que cree una nueva
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        
        finally 
        {
          try {
			bw.close();
          }
          catch (IOException e) 
          {
			// TODO Auto-generated catch block
			e.printStackTrace();
          }
        }
    }

}
