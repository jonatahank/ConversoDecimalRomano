/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorromano;

import java.util.Scanner;

/**
 *
 * @author Jonata
 */
public class ConversorRomano {

    	static Scanner sc = new Scanner(System.in);
	static int numero;
	static int valor;
	static String romano;
	static String palavra;

    public static void main(String[] args) {
       	menu();
	}

	public static void menu() {
		System.out.println("Digite 1 para DecimalToRomano e 2 RomanoToDecimal");
		numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("Informe um numero entre 1 e 3999:");
			valor = sc.nextInt();
			DecimalToRomano dr = new DecimalToRomano();
			String r = dr.converter(valor);
			System.out.println(r);
			menu();
			break;
		case 2:
			System.out.println("informe um numero romano valido:");
			palavra = sc.next();
			RomanoToDecimal rd = new RomanoToDecimal();
			int d = rd.Decimal(palavra);
			System.out.println("O valor em decimal é: " + d);
			menu();
			break;
		default:
			System.out.println("opção invalida");
			menu();
		}

    }
    
}
