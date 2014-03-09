package Ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



//la clase debe llamarse igual que el archivo App.java
public class App6{
	static int tamaño4;
	static String nombre4 = "registro_4";
	static int tamaño5;
	static String nombre5 = "registro_5";
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       /* //llamamos a la primera clase:
        AbrirF_4 f4 = new AbrirF_4();
        AbrirF_5 f5 = new AbrirF_5();
        
        //ahora le pasamos a la clase comparar los valores
        comparar c = new comparar();
        c.dame_datos4(f4.nombre4, f4.tamaño4);
        c.dame_datos5(f5.nombre5, f5.tamaño5);*/
        
        AbrirF4();
        AbrirF5();
        comparar();
        
     
        
    }
	public static void AbrirF4()
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
	public static void AbrirF5()
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

	public static void comparar()
	{

		if(tamaño4>tamaño5)
		{
			System.out.println("El fichero " + nombre4+ " es mayor");
		}
		else if(tamaño4<tamaño5)
		{
			System.out.println("El fichero " + nombre5+ " es mayor");
		}
		else if(tamaño4==tamaño5)
		{
			System.out.println("Tienen el mismo tamaño");
		}
	}
	
}