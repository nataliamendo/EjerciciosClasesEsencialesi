package Ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//la clase debe llamarse igual que el archivo App.java
public class App{
	
	public static int[] vector;
	

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        leer_fichero();
        
    }
	
	public static int num_caract(String l)
	{
		//a la función le pasamos la línea
		int num = 0;
		char array_caracters[] = l.toCharArray();
		int cont=0;
		
		//ahora comprobamos que no sean espacio vacíos
		while(cont<array_caracters.length)
		{
			if(array_caracters[cont]!=' '); 
			cont++;
		}
		num=cont;
		return num;
	}
	
	public static int sum =0;
	//para leer del fichero .txt
	public static void leer_fichero()
	{ //para poder llamar al método desde otra función: PUBLIC STATIC VOID metodo(){}
		
		BufferedReader br = null;
		File fichero = null;
		FileReader fr = null;
		//Exception BigNumberException = new Exception ("El número es superior a 1000");
		int MAX=100;
		try
		{
			fichero = new File("C:/Universidad/DSA/dsa-projects/ejjava/texto.txt");
			fr = new FileReader(fichero);
		    br = new BufferedReader(fr);
		   
		    String linea = br.readLine();
		    int i=0;
		    
			while((i<MAX)&&(linea!=null)) 
			{
				//le pasamos la línea para que calcule el número de caracter:
				int n=num_caract(linea);
				System.out.println("Número de caracteres en la línea" + i + ": " + n);
				sum = sum + n;
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
            
            System.out.println("Número total de caracteres:  " + sum);
            
            Escribirfichero ef = new Escribirfichero();
            ef.main("fichero",sum);
         }
		 
    }
}