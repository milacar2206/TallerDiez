package AnioBisiesto;

import java.util.Scanner;

public class AnioBisiesto {
	public static void main(String[] args) {

	long anio;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingresa un año: ");
    anio = sc.nextLong();
    
    boolean resultado = esBisiesto(anio);
    
    if (resultado) {
        System.out.println("Sí es bisiesto");
    } else {
        System.out.println("No es bisiesto");
    }
    
    for (anio = 1900; anio < 3000; anio++) {
       
        if (esBisiesto(anio)) {
            System.out.printf("%d,", anio);
        }
    }
}


public static boolean esBisiesto(long anio) {
  
    return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);

}

}