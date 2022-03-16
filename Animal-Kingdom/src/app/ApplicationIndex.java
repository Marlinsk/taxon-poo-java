package app;

import app.src.taxonomy.entity.Animal;

public class ApplicationIndex {

	public static void main(String[] args) { 
		
		// Animal(String name, specie, String genus, String family, String order, String classx, String phylum, String kingdom, String[] add)
		
		String[] add01 = {"Infraclasse: Placentalia", "Superordem: Xenarthra"};
		
		Animal animal01 = new Animal("Tatu-bola", "Tolypeutes tricinctus", "Tolypeutes", "Clamiforídeos", "	Cingulata", "Mammalia", "Chordata", "Animalia", add01);
		
		System.out.println(animal01);
	}
}
