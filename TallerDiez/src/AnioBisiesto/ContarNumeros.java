package AnioBisiesto;

import java.io.IOException;
import java.util.Scanner;

public class ContarNumeros {

	public static void main(String[] args) throws IOException {	
		try (Scanner sc = new Scanner(System.in)) {
			int n, cifras;
	        char car;
	        do{
	            System.out.print("Introduce un número entero: ");
	            n = sc.nextInt();
	            cifras= 0;   
	            while(n!=0){             
	                    n = n/10;         
	                   cifras++;
	            }
	            System.out.println("El número tiene " + cifras+ " cifras");
	            System.out.print("Continuar? ");
	            car = (char)System.in.read();
	        }while(car!='n' && car != 'N');
		}   
	    }
	
	
	}


