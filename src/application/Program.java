package application;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Aluno alun = new Aluno();
		
		System.out.println("Escreva o nome do aluno: ");
		alun.nome = sc.nextLine();
		System.out.println("Informe a nota do primeiro trimestre: ");
		alun.nota1 = sc.nextDouble();
		System.out.println("Informe a nota do primeiro trimestre: ");
		alun.nota2 = sc.nextDouble();
		System.out.println("Informe a nota do primeiro trimestre: ");
		alun.nota3 = sc.nextDouble();
		
		double notaTotal = alun.somaNota();
		
		
		String resultado = alun.validaAprovacao();
		//System.out.println(resultado);
		
		System.out.println(alun);

	}

}
