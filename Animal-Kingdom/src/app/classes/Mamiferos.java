package app.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import app.entidades.Taxon;

public class Mamiferos {
	
	public static void LerArquivoMamiferosCSV(List<Taxon> mamiferos) throws Exception{
        try{
            String path = "C:/Users/Marlinsk/git/animal-kingdown-poo-java/Animal-Kingdom/files/Mamíferos.csv";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linha = "";
            while((linha = br.readLine()) != null){
                String[] dados = linha.split(",");
                mamiferos.add(new Taxon(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6], dados[7]));
            }
        }
        catch(FileNotFoundException e){
            throw e;
        }
    }
}
