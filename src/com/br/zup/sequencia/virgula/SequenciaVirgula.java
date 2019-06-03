package com.br.zup.sequencia.virgula;

import java.util.Scanner;

public class SequenciaVirgula {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
	System.out.println("Digite o primeiro numero da sequencia: ");	
	int primeiroNumero = scanner.nextInt();
	System.out.println("Digite o ultimo numero da sequencia: ");
	int ultimoNumero = scanner.nextInt();
	
	 for(int i = primeiroNumero;i <= ultimoNumero; i++) {
		 if (i == ultimoNumero) {
			System.out.println(i);
		} else {
			System.out.print( i + "," );
		}
	 }
	}
}
