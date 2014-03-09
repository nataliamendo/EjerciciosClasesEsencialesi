package Ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AbrirF_5 {
	
	static int tamaño5;
	static String nombre5 = "registro_5";
	
	public static void main(String[] args)
	{
		BufferedReader br5 = null;
		try 
		{
			FileReader fr_5= new FileReader ("C:/Universidad/DSA/dsa-projects/ejjava/registro_5.txt");
			br5 = new BufferedReader(fr_5);
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
				
				linea = br5.readLine();
				 String[] datos = new String[200];
				 
				 datos = linea.split(",");
				 System.out.println(datos[0]);
				 tamaño5 = Integer.parseInt(datos[0]);
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	
	}

}
