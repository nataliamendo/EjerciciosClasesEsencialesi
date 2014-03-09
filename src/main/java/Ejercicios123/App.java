package Ejercicios123;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



/**
 * Hello world!
 *
 */


//la clase debe llamarse igual que el archivo App.java
public class App{
	
	public static int[] vector;
	

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try
        {
        	leer_fichero();
        }
        catch(Exception e)
        {
        	System.err.println("No se pudo acceder al método");
        }
    }
	
	//para leer del fichero .txt
	public static void leer_fichero() throws BigNumberException
	{ //para poder llamar al método desde otra función: PUBLIC STATIC VOID metodo(){}
		
		BufferedReader br = null;
		File fichero = null;
		FileReader fr = null;
		//Exception BigNumberException = new Exception ("El número es superior a 1000");
		int MAX=10;
		try
		{
			fichero = new File("C:/Universidad/DSA/dsa-projects/ejjava/numeros.txt");
			fr = new FileReader(fichero);
		    br = new BufferedReader(fr);
		   
		    String linea = br.readLine();
		    //MAX=Integer.parseInt(linea);
		    System.out.println("Número de líneas: " + MAX);
		    vector = new int[MAX];
		    int i=0;
		   
			while(i<MAX) 
				//NOTA: al añadir una sentencia en el while: linea=br.realLine(), 
					// este lee una línea del fichero, realiza la sentencia como si estuviera fuera
					// del while en c# o c.
			{
				
				 vector[i]=Integer.parseInt(linea);
				 System.out.println("Linea " + i + " leida: " + vector[i]);
				 //linea=br.readLine(); -> no se pone porque al indicarlo en el while, ya lee la siguiente línea
				 
				i++;
				linea = br.readLine();
			}
				
		}
		
		catch(FileNotFoundException e) //Exception para el caso de que no encuentre el fichero
		{
			System.err.println("FileNotFoundException: " + e.getMessage());
		}
		catch(IOException e)
		{
			System.err.println("Caught IOException: " + e.getMessage());
		}
		
		
		finally{ 
			//cerramos el fichero
            try
            {
            	fr.close();
            	System.out.println("El fichero se ha cerrado");
            }
            catch(IOException ioe)
            {
            	System.err.println("Caught IOException: " + ioe.getMessage());
            }
            
            System.out.println("Estos son los número enteros:");
            int j=0;
            while(j<vector.length)
            {
				if(vector[j]<=1000)
				{
					System.out.println(vector[j]);
					j++;
				}
				else
				{
					throw new BigNumberException();
				}
		
            }
            
        }
		 
    }
}