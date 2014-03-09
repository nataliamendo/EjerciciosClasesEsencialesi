package Ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AbrirF_4 {
	
	static int tamaño4;
	static String nombre4 = "registro_4";
	
	public static void main(String[] args)
	{
		BufferedReader br4 = null;
		try 
		{
			FileReader fr_4= new FileReader ("C:/Universidad/DSA/dsa-projects/ejjava/registro_4.txt");
			br4 = new BufferedReader(fr_4);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			//cogemos el tamaño del fichero y se guarda en una variable global:
			String linea;
			try {
				
				linea = br4.readLine();
				 String[] datos = new String[200];
				 
				 datos = linea.split(",");
				 System.out.println(datos[0]);
				 tamaño4 = Integer.parseInt(datos[0]);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	
	}

}
