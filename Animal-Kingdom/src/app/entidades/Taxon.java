package app.entidades;

public class Taxon {
	
	private String nome;
	private String especie;
	private String genero;
	private String familia;
	private String ordem;
	private String classe;
	private String filo;
	private String reino;

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

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}
	
	public Taxon(String nome, String especie, String genero, String familia, String ordem, String classe, String filo, String reino) {
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

	@Override
	public String toString() {
		return nome + " [" + "especie: " + especie + ", genero: " + genero + ", familia: " + familia
				+ ", ordem: " + ordem + ", classe: " + classe + ", filo: " + filo + ", reino: " + reino + "]";
	}
}
