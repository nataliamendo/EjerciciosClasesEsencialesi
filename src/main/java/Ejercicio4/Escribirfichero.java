package Ejercicio4;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Escribirfichero {
	
	
	
	public static void main(String nf, int n_c)
    {
		
        FileWriter fr = null;
        BufferedWriter bw = null;
        
       int numc = n_c;
    	String nomf = nf;
    	
        System.out.println("Entramos en la clase Escribirfichero");
        try
        {
            fr= new FileWriter("C:/Universidad/DSA/dsa-projects/ejjava/registro_4.txt",true);
            bw = new BufferedWriter(fr);
            
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            
            String nc = Integer.toString(numc);
            
            System.out.println(nc);
            
            bw.write(numc + ", el fichero es: " + nomf + "fecha" + date + "\n");
            
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
