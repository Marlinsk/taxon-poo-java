package app.src.tax.entity;

import java.util.Arrays;

public class Animal {
	
	private String name;
	private String specie;
	private String genus;
	private String family;
	private String order;
	private String classx;
	private String phylum;
	private String kingdom;
	private String[] add;
	
	public Animal(String name, String specie, String genus, String family, String order, String classx, String phylum, String kingdom, String[] add) {
		super();
		this.name = name;
		this.specie = specie;
		this.genus = genus;
		this.family = family;
		this.order = order;
		this.classx = classx;
		this.phylum = phylum;
		this.kingdom = kingdom;
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecie() {
		return specie;
	}

	public void setSpecie(String specie) {
		this.specie = specie;
	}

	public String getGenus() {
		return genus;
	}

	public void setGenus(String genus) {
		this.genus = genus;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getClassx() {
		return classx;
	}

	public void setClassx(String classx) {
		this.classx = classx;
	}

	public String getPhylum() {
		return phylum;
	}

	public void setPhylum(String phylum) {
		this.phylum = phylum;
	}

	public String getKingdom() {
		return kingdom;
	}

	public void setKingdom(String kingdom) {
		this.kingdom = kingdom;
	}

	public String[] getAdd() {
		return add;
	}

	public void setAdd(String[] add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return  
				"Classificação Taxonomica do animal" + "\n"
				+ "Nome: " + name + "\n" 
				+ "Espécie: " + specie + "\n" 
				+ "Gênero: " + genus + "\n" 
				+ "Família: " + family + "\n" 
				+ "Ordem:" + order + "\n" 
				+ "Classe: " + classx + "\n" 
				+ "Filo: " + phylum + "\n" 
				+ "Reino: " + kingdom + "\n" 
				+ "Informações adicionais: " + Arrays.toString(add) + "\n" 
				+ "---------------------------------" + "\n"
				;
	}
	
}
