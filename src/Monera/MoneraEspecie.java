package Monera;

import Monera.MoneraGenero;

import java.util.Scanner;

public class MoneraEspecie extends MoneraGenero {
	private String especie;
	private String alimentacao;
	private String organismo;
	private Scanner sc = new Scanner(System.in);

	public MoneraEspecie(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia, String genero, String especie, String alimentacao, String organismo) {
		super(nomeSerVivo, reino, filo, classe, ordem, familia, genero);
		this.especie = especie;
		this.alimentacao = alimentacao;
		this.organismo = organismo;
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

	public void atualizar(){
		System.out.println("Iniciando a edição:");
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

		System.out.println("Atualizado com sucesso!");
	}


	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}

	public String getOrganismo() {
		return organismo;
	}

	public void setOrganismo(String organismo) {
		this.organismo = organismo;
	}

	@Override
	public String toString() {
		return String.format("Reino: %s, Filo: %s, Classe: %s, Ordem: %s," +
						" Família: %s, Gênero: %s, Espécie: %s, Alimentação: %s," +
						"Organismo: %s", getReino(), getFilo(), getClasse(),
						getOrdem(), getFamilia(), getGenero(), especie, alimentacao,
						organismo);
	}
}
