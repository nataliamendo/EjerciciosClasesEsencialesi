package Ejercicio6;

public class comparar {
	
	public static int tam4;
	public static String nom4;
	public static int tam5;
	public static String nom5;
	
	public static void calculo()
	{
		if(tam4>tam5)
		{
			System.out.println("El fichero " + nom4+ " es mayor");
		}
		else if(tam4<tam5)
		{
			System.out.println("El fichero " + nom5+ " es mayor");
		}
		else if(tam4==tam5)
		{
			System.out.println("Tienen el mismo tamaño");
		}
	}
	
	static void dame_datos4(String n, int i)
	{
		nom4=n;
		tam4=i;
	}
	static void dame_datos5(String n, int i)
	{
		nom5=n;
		tam5=i;
	}

}
