package app;

import app.entidades.Taxon;

public class Main {

	public static void main(String[] args) { 
		
		Taxon AraraCaninde = new Taxon("Arara-canindé", "Ara ararauna", "Ara", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		Taxon AraraAzulGrande = new Taxon("Arara-azul-grande", "Anodorhynchus hyacinthinus", "Anodorhynchus", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		Taxon AraraVermelha = new Taxon("Arara-vermelha", "Ara chloropterus", "Ara", "Psittacidae", "Psittaciformes", "Aves", "Chordata", "Animalia");
		
		Taxon BaleiaAzul = new Taxon("Baleia-azul", "Balaenoptera musculus", "Balaenoptera", "Balaenopteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		Taxon BaleiaJubarte = new Taxon("Baleia-jubarte", "Megaptera novaeangliae", "Megaptera", "Balaenopteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		
		Taxon Cachalote = new Taxon("Cachalote", "Physeter macrocephalus", "Physeter", "Physeteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		
		Taxon Elefante_da_savana = new Taxon("Elefante-da-savana", "Loxodonta africana", "Loxodonta", "Elephantidae", "Proboscidea", "Mammalia", "Chordata", "Animalia");
		
		Taxon Guaxinim = new Taxon("Guaxinim", "Procyon lotor", "Procyon", "Procyonidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon Leopardo = new Taxon("Leopardo", "Panthera pardus", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Leopardo_das_neves = new Taxon("Leopardo-das-neves", "Panthera uncia", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Leao_do_atlas = new Taxon("Leão-do-atlas", "Panthera leo leo", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon UrsoPardo = new Taxon("Urso-pardo", "Ursus arctos", "Ursus", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		System.out.println(AraraCaninde);
		System.out.println(AraraAzulGrande);
		System.out.println(AraraVermelha);
		System.out.println(BaleiaAzul);
		System.out.println(BaleiaJubarte);
		System.out.println(Cachalote);
		System.out.println(Elefante_da_savana);
		System.out.println(Guaxinim);
		System.out.println(Leopardo);
		System.out.println(Leopardo_das_neves);
		System.out.println(Leao_do_atlas);
		System.out.println(UrsoPardo);
		
	}
}
