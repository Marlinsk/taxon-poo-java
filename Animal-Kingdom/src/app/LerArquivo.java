package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import app.entidades.Taxon;

public class LerArquivo {
	
	public static void LerArquivoArtropodes(List<Taxon> artropodes) throws Exception{
        try{
            String path = "C://Users/Marlinsk/git/animal-kingdown-poo-java/Animal-Kingdom/files/Artrópodes.csv";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linha = "";
            while((linha = br.readLine()) != null){
                String[] dados = linha.split(",");
                artropodes.add(new Taxon(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6], dados[7]));
            }
        }
        catch(FileNotFoundException e){
            throw e;
        }
    }
	
	public static void LerArquivoAvesCSV(List<Taxon> aves) throws Exception{
        try{
            String path = "C:/Users/Marlinsk/git/animal-kingdown-poo-java/Animal-Kingdom/files/Aves.csv";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linha = "";
            while((linha = br.readLine()) != null){
                String[] dado = linha.split(",");
                aves.add(new Taxon(dado[0], dado[1], dado[2], dado[3], dado[4], dado[5], dado[6], dado[7]));
            }
        }
        catch(FileNotFoundException e){
            throw e;
        }
    }
	
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
	
	public static void LerArquivoRepteisCSV(List<Taxon> repteis) throws Exception{
        try{
            String path = "C:/Users/Marlinsk/git/animal-kingdown-poo-java/Animal-Kingdom/files/Répteis.csv";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linha = "";
            while((linha = br.readLine()) != null){
                String[] dados = linha.split(",");
                repteis.add(new Taxon(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6], dados[7]));
            }
        }
        catch(FileNotFoundException e){
            throw e;
        }
    }
}
