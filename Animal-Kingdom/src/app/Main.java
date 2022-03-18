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
		
		Taxon Leao_do_atlas = new Taxon("Leão-do-atlas", "Panthera leo leo", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Leopardo = new Taxon("Leopardo", "Panthera pardus", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Leopardo_das_neves = new Taxon("Leopardo-das-neves", "Panthera uncia", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon UrsoPardo = new Taxon("Urso-pardo", "Ursus arctos", "Ursus", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		
		Taxon[] aves = { AraraCaninde, AraraAzulGrande, AraraVermelha };
		Taxon[] mamiferos = { BaleiaAzul, BaleiaAzul, BaleiaJubarte, Cachalote, Elefante_da_savana, Guaxinim, Leao_do_atlas, Leopardo, Leopardo_das_neves, UrsoPardo };
		
		System.out.println("Registro de Aves:");
		
		for (Taxon t: aves) {
			System.out.println(t);
		}
		
		System.out.println("\n" + "------------------------------------------------" + "\n");
		
		System.out.println("Registro de Mamíferos:");
		
		for (Taxon t: mamiferos) {
			System.out.println(t);
		}
		
	}
}
