package Monera;

import Monera.MoneraGenero;

import java.util.Scanner;

public class MoneraEspecie extends MoneraGenero {
	private String especie;
	private String alimentacao;
	private String organismo;
	private Scanner sc = new Scanner(System.in);

	public MoneraEspecie(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia,
						 String genero, String especie) {
		super(nomeSerVivo, reino, filo, classe, ordem, familia, genero);
		this.especie = especie;
	}

	public MoneraEspecie(){
		super();
	}

	public void cadastrar(){
		System.out.println("Filo:");
		setFilo(sc.next());
		System.out.println("Classe:");
		setClasse(sc.next());
		System.out.println("Ordem:");
		setOrdem(sc.next());
		System.out.println("Familia:");
		setFamilia(sc.next());
		System.out.println("Genero:");
		setGenero(sc.next());
		System.out.println("Especie:");
		this.especie = sc.next();
		System.out.println("É heterotrófico ou autotrófico:");
		this.alimentacao = sc.next();
		System.out.println("Qual é o tipo de organismo do(a) " + especie + ":");
		this.organismo = sc.next();
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
