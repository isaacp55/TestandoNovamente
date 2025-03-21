package parteone;

import java.util.Scanner;

public class codando {
	
	public static void main(String[] args) {
	System.out.println("save family");
	Scanner scn = new Scanner (System.in);
	int produto, resultado;
	
	System.out.println("Digite um número para a tabuada: ");
      produto = scn.nextInt();
	
	for(int i = 0; i <= 10; i++ ) {
		resultado = produto * i;
		System.out.println(produto + " X " + i + " = " + resultado);
	}
	
	
	}
}
