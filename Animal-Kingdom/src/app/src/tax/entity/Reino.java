package app.src.tax.entity;

public enum Reino {
	
	Animalia("Animalia"), 
	Bacteria("Bacteria"),
	Chromista("Chromista"), 
	Fungi("Fungi"), 
	Plantae("Plantae"), 
	Protista("Protista");
	
	private String nome;
	
	Reino(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}
