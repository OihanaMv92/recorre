package es.Studium.Recorre;

public class Recorre
{

	public static void main(String[] args)
	{
		String cadena = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		for (int i = 0; i<cadena.length();i++)
		{
			System.out.printl(cadena.charAt(i));
		}

	}

}

/* Programa Recorre
 * VARIABLES
 * CADENA cadena = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ"
 * ENTERO i
 * INICIO
 * PARA i = 0 HASTA i <lONGITUD (cadena) HACER
 * 	ESCRIBIR POSICION (cadena,i)
 * FIN PARA
 *FIN */
