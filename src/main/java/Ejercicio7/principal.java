package Ejercicio7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class principal {

	public static void main(String[] args) {
		// Declaramos la clase:
		App7 ap7 = new App7();
		ap7.atributo1 = 7;
		ap7.atributo2 = "HOLA";
		ap7.atributo3 = 'n';

		// creamos las inputs stream para escribir en el fichero:
		FileInputStream fi = null;
		FileOutputStream fo = null;
		ObjectInputStream in = null;
		ObjectOutputStream out = null;

		try {

			fo = new FileOutputStream("C:/Universidad/DSA/dsa-projects/ejjava/ejercicio7.txt");
			out = new ObjectOutputStream(fo);

			// para LEER -> out.readObject
			// para ESCRIBIR -> out.writeObject
			// Object ob = new Object();
			// out.writeObject(ob);
			// out.writeObject(ob);
			
			// guardamos el objeto en el fichero:
			out.writeObject(ap7);
			out.close();
			System.out.println("Objeto App7 con string, int, char");
				

		} catch (IOException e) {
			System.out.println("Fallo al escribir objeto del fichero");
			System.out.println(e.getMessage());
		} 

	
		
		//para leer del fichero creamos un objeto donde guardaremos lo que hemos leido:
		//declaramos un nuevo objeto de App7
		App7 o7 = new App7();
		
		try
		{
			fi = new FileInputStream("C:/Universidad/DSA/dsa-projects/ejjava/ejercicio7.txt");
			in = new ObjectInputStream(fi);
			o7 = (App7) in.readObject();
			in.close();
			System.out.println("Objeto leido del archivo");
		}
		catch(Exception e)
		{
			System.out.println("Fallo al leer objeto del fichero");
			System.out.println(e.getMessage());
		}
		
		finally{
			//hacemos print de los datos recogidos:
			System.out.println("atributo1: " + o7.atributo1 + ", atributo2: " + o7.atributo2 + ", atributo3: " + o7.atributo3);
			
		}

	}
}
