package app.src.entidades;

import app.src.taxon.Classes;
import app.src.taxon.Filos;
import app.src.taxon.Reinos;

public class SerVivo {
	
	private String nome;
	private String especie;
	private String genero;
	private String familia;
	private String ordem;
	private Classes classe;
	private Filos filo;
	private Reinos reino;
	
	public SerVivo(String nome, String especie, String genero, String familia, String ordem, Classes classe, Filos filo, Reinos reino) {
		super();
		this.nome = nome;
		this.especie = especie;
		this.genero = genero;
		this.familia = familia;
		this.ordem = ordem;
		this.classe = classe;
		this.filo = filo;
		this.reino = reino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public Classes getClasse() {
		return classe;
	}

	public void setClasse(Classes classe) {
		this.classe = classe;
	}

	public Filos getFilo() {
		return filo;
	}

	public void setFilo(Filos filo) {
		this.filo = filo;
	}

	public Reinos getReino() {
		return reino;
	}

	public void setReino(Reinos reino) {
		this.reino = reino;
	}
}
