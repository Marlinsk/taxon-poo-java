package app.src.tax.entity;

public enum Filo {
	
	Acanthocephala("Acanthocephala"),
	Acoelomorpha("Acoelomorpha"),
	Annelida("Annelida"),
	Arthropoda("Arthropoda"),
	Brachiopoda("Brachiopoda"),
	Bryozoa("Bryozoa"),
	Chaetognatha("Chaetognatha"),
	Chordata("Chordata"),
	Cnidaria("Cnidaria"),
	Ctenophora("Ctenophora"),
	Cycliophora("Cycliophora"),
	Echinodermata("Echinodermata"),
	Echiura("Echiura"),
	Entoprocta("Entoprocta"),
	Gastrotricha("Gastrotricha"),
	Gnathostomulida("Gnathostomulida"),
	Hemichordata("Hemichordata"),
	Kinorhyncha("Kinorhyncha"),
	Loricifera("Loricifera"),
	Micrognathozoa("Micrognathozoa"),
	Mollusca("Mollusca"),
	Myxozoa("Myxozoa"),
	Nematoda("Nematoda"),
	Nematomorpha("Nematomorpha"),
	Nemertea("Nemertea"),
	Onychophora("Onychophora"),
	Orthonectida("Orthonectida"),
	Phoronida("Phoronida"),
	Placozoa("Placozoa"),
	Platyhelminthes("Platyhelminthes"),
	Porifera("Porifera"),
	Priapulida("Priapulida"),
	Rhombozoa("Rhombozoa"),
	Rotifera("Rotifera"),
	Sipuncula("Sipuncula"),
	Tardigrada("Tardigrada"),
	Xenoturbellida("Xenoturbellida");
	
	private String nome;
	
	Filo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
