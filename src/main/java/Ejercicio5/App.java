package Ejercicio5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import Ejercicio5.Escribirfichero;

public class App {
	
	public static int numBytes;
	public static void main (String arg[])
	{
		FileInputStream imagen = null;
		
		try 
		{
			imagen = new FileInputStream("C:/Universidad/DSA/dsa-projects/ejjava/imagen.jpg");			
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				numBytes = imagen.available();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Número de bytes:  " + numBytes);

            Escribirfichero ef = new Escribirfichero();
			ef.numc=numBytes;
            ef.nomf="imagen.jpg";
            ef.guardar();
		}
		
		
	}

}
