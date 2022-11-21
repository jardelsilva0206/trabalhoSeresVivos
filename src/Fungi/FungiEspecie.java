package Fungi;

import java.util.Scanner;

public class FungiEspecie extends FungiGenero {
	private String especie;
	private String tipoCelular;
	private String organismo;
	private Scanner sc = new Scanner(System.in);

	public FungiEspecie() {
		super();
	}

	public FungiEspecie(String nomeSerVivo, String reino, String filo, String classe, String ordem, String familia,
			String genero, String especie, String tipoCelular, String organismo) {
		super(nomeSerVivo, reino, filo, classe, ordem, familia, genero);
		this.especie = especie;
		this.tipoCelular = tipoCelular;
		this.organismo = organismo;
	}

	public void cadastrar() {
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
		System.out.println("É multicelular ou unicelular:");
		this.tipoCelular = sc.next();
		System.out.println("Qual é o tipo de organismo do(a) " + especie + ":");
		this.organismo = sc.next();
	}

	public void atualizar() {
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
		System.out.println("É multicelular ou unicelular:");
		this.tipoCelular = sc.next();
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

	public String getTipoCelular() {
		return tipoCelular;
	}

	public void setTipoCelular(String tipoCelular) {
		this.tipoCelular = tipoCelular;
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
						" Família: %s, Gênero: %s, Espécie: %s, Tipo celular: %s," +
						"Organismo: %s", getReino(), getFilo(),getClasse(),
						getOrdem(), getFamilia(), getGenero(), especie, tipoCelular,
						organismo);
	}

}
