package app.codex.dados;

import app.entidades.Taxon;
import app.negocio.Registros;

public class Mamiferos implements Registros {

	@Override
	public void RegistroA() {
		
		Taxon Alce = new Taxon("Alce", "Alces alces", "Alces", "Cervídeos", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Alce };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra A: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
	}

	@Override
	public void RegistroB() {
		
		Taxon BaleiaAzul = new Taxon("Baleia-azul", "Balaenoptera musculus", "Balaenoptera", "Balaenopteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		Taxon Baleia_boreal = new Taxon("Baleia-boreal", "Balaenoptera borealis", "Balaenoptera", "Balaenopteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		Taxon Baleia_cinzenta = new Taxon("Baleia-cinzenta", "Eschrichtius robustus", "Eschrichtius", "Eschrichtiidae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		Taxon Baleia_comum = new Taxon("Baleia-comum", "Balaenoptera physalus", "Balaenoptera", "Balaenopteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		Taxon Baleia_da_groenlandia = new Taxon("Baleia-da-groenlândia", "Balaena mysticetus", "Balaena", "	Balaenidae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		Taxon Baleia_de_minke = new Taxon("Baleia-de-minke", "Balaenoptera acutorostrata", "Balaenoptera", "Balaenopteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		Taxon BaleiaJubarte = new Taxon("Baleia-jubarte", "Megaptera novaeangliae", "Megaptera", "Balaenopteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		
		Taxon BisaoAmericano = new Taxon("Bisão-americano", "Bison bison", "Bison", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon BisaoEuropeu = new Taxon("Bisão-europeu", "Bison bonasus", "Bison", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon BufaloAfricano = new Taxon("Búfalo-africano", "Syncerus caffer", "Syncerus", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon BotoCinza = new Taxon("Boto-Cinza", "Sotalia guianensis", "Sotalia", "Delphinidae", "Cetartiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Boto_de_burmeister = new Taxon("Boto-de-burmeister", "Phocoena spinipinnis", "Phocoena", "Phocoenidae", "Cetacea", "Mammalia", "Chordata", "Animalia");
		Taxon Boto_cor_de_rosa = new Taxon("Boto-cor-de-rosa", "Inia geoffrensis", "Inia", "Iniidae", "Cetacea", "Mammalia", "Chordata", "Animalia");
		
		Taxon Bugio_de_mãos_ruivas_de_Spix = new Taxon("Bugio-de-mãos-ruivas-de-Spix", "Alouatta discolor", "Alouatta", "Atelidae", "Primates", "Mammalia", "Chordata", "Animalia");
		Taxon Bugio_do_pantanal = new Taxon("Bugio-do-pantanal", "Alouatta caraya", "Alouatta", "Atelidae", "Primates", "Mammalia", "Chordata", "Animalia");
		Taxon Bugio_vermelho_do_rio_Purus = new Taxon("Bugio-vermelho-do-rio-Purus", "Alouatta puruensis", "Alouatta", "Atelidae", "Primates", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { BaleiaAzul, Baleia_boreal, Baleia_cinzenta, Baleia_comum, Baleia_da_groenlandia, Baleia_de_minke, BaleiaJubarte, BisaoAmericano, BisaoEuropeu, BufaloAfricano, BotoCinza, Boto_de_burmeister, Boto_cor_de_rosa, Bugio_de_mãos_ruivas_de_Spix, Bugio_do_pantanal, Bugio_vermelho_do_rio_Purus };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra B: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroC() {
		
		Taxon Cabra_das_pedras = new Taxon("Cabra-das-pedras", "Oreotragus oreotragus", "Oreotragus", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Cabra_montesa = new Taxon("Cabra-montesa", "Capra pyrenaica", "Capra", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon Cachalote = new Taxon("Cachalote", "Physeter macrocephalus", "Physeter", "Physeteridae", "Cetáceos", "Mammalia", "Chordata", "Animalia");
		
		Taxon CameloBactriano = new Taxon("Camelo-bactriano", "Camelus bactrianus", "Camelus", "Camelidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon Canguru_vermelho = new Taxon("Canguru-vermelho", "Macropus rufus", "Macropus", "Macropodidae", "Diprotodontia", "Mammalia", "Chordata", "Animalia");
		Taxon Canguru_de_Bennett = new Taxon("Canguru-de-Bennett", "Macropus rufogriseus", "Macropus", "Macropodidae", "Diprotodontia", "Mammalia", "Chordata", "Animalia");
		Taxon Canguru_cinza_oriental = new Taxon("Canguru-cinza-oriental", "Macropus giganteus", "Macropus", "Macropodidae", "Diprotodontia", "Mammalia", "Chordata", "Animalia");
		
		Taxon Camundongo = new Taxon("Camundongo", "Mus musculus", "Mus", "Muridae", "Rodentia", "Mammalia", "Chordata", "Animalia");
		
		Taxon Carneiro_de_dall = new Taxon("Carneiro-de-dall", "Ovis dalli", "Ovis", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon CarneiroSelvagem = new Taxon("Carneiro-selvagem", "Ovis canadensis", "Ovis", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon CastorAmericano = new Taxon("Castor-americano", "Castor canadensis", "Castor", "Castoridae", "Rodentia", "Mammalia", "Chordata", "Animalia");
		Taxon Castor_da_eurasia = new Taxon("Castor-da-eurásia", "Castor fiber", "Castor", "Castoridae", "Rodentia", "Mammalia", "Chordata", "Animalia");
		
		Taxon Cervo_de_Eld = new Taxon("Cervo-de-Eld", "Panolia eldii", "Panolia", "Cervidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Cervo_de_topete = new Taxon("Cervo-de-topete", "Elaphodus cephalophus", "Elaphodus", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Cervo_do_pantanal = new Taxon("Cervo-do-pantanal", "Blastocerus dichotomus", "Blastocerus", "Cervidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Cervo_malhado_de_visayan = new Taxon("Cervo-malhado-de-visayan", "Rusa alfredi", "Rusa", "Cervidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Cervo_vermelho = new Taxon("Cervo-vermelho", "Cervus elaphus", "Cervus", "Cervidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon CoelhoAnao = new Taxon("Coelho-anão", "Brachylagus idahoensis", "Brachylagus", "Leporidae", "Lagomorpha", "Mammalia", "Chordata", "Animalia");
		Taxon Coelho = new Taxon("Coelho", "Oryctolagus", "Oryctolagus", "Leporidae", "Lagomorpha", "Mammalia", "Chordata", "Animalia");
		
		Taxon Coiote = new Taxon("Coiote", "Canis latrans", "Canis", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Coiote_do_nordeste = new Taxon("Coiote-do-nordeste", "Canis latrans tamnos", "Canis", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon CoioteOriental = new Taxon("Coiote-oriental", "Canis latrans var", "Canis", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon ChacalDourado = new Taxon("Chacal-dourado", "Canis aureus", "Canis", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon ChacalListrado = new Taxon("Chacal-listrado", "Lupulella adustus", "Lupulella", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon ChimpanzeComum = new Taxon("Chimpanzé-comum", "Pan troglodytes", "Pan", "Hominidae", "Primates", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Cabra_das_pedras, Cabra_montesa, Cachalote, CameloBactriano, Canguru_vermelho, Canguru_de_Bennett, Canguru_cinza_oriental, Camundongo, Carneiro_de_dall, CarneiroSelvagem, CastorAmericano, Castor_da_eurasia, Cervo_de_Eld, Cervo_de_topete, Cervo_do_pantanal, Cervo_malhado_de_visayan, Cervo_vermelho, CoelhoAnao, Coelho, Coiote, Coiote_do_nordeste, CoioteOriental, ChacalDourado, ChacalListrado, ChimpanzeComum };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra C: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
	}

	@Override
	public void RegistroD() {
		
		Taxon Dingo = new Taxon("Dingo", "Canis dingo", "Canis", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Dingo };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra D: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroE() {
		
		Taxon Elefante_da_savana = new Taxon("Elefante-da-savana", "Loxodonta africana", "Loxodonta", "Elephantidae", "Proboscidea", "Mammalia", "Chordata", "Animalia");
		Taxon Elefante_da_floresta = new Taxon("Elefante-da-floresta", "Loxodonta cyclotis", "Loxodonta", "Elephantidae", "Proboscidea", "Mammalia", "Chordata", "Animalia");
		
		Taxon EsquiloVermelho = new Taxon("Esquilo-vermelho", "Sciurus vulgaris", "Sciurus", "Sciuridae", "Rodentia", "Mammalia", "Chordata", "Animalia");
		Taxon EsquiloCinzento = new Taxon("Esquilo-cinzento", "Sciurus carolinensis", "Sciurus", "Sciuridae", "Rodentia", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Elefante_da_floresta, Elefante_da_savana, EsquiloCinzento, EsquiloVermelho };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra E: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroF() {
		
		Taxon Foca_anelada = new Taxon("Foca-anelada", "Pusa hispida", "Pusa", "Phocidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Foca_de_weddell = new Taxon("Foca-de-weddell", "Leptonychotes weddellii", "Leptonychotes", "Phocidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Foca_leopardo = new Taxon("Foca-leopardo", "Hydrurga leptonyx", "Hydrurga", "Phocidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Foca_anelada, Foca_de_weddell, Foca_leopardo };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra F: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroG() {
		
		Taxon Gamba_de_orelha_branca = new Taxon("Gambá-de-orelha-branca", "Didelphis albiventris", "Didelphis", "Didelfiídeos", "Didelphimorphia", "Mammalia", "Chordata", "Animalia");
		Taxon Gamba_de_orelha_preta = new Taxon("Gambá-de-orelha-preta", "Didelphis aurita", "Didelphis", "Didelfiídeos", "Didelphimorphia", "Mammalia", "Chordata", "Animalia");
		
		Taxon GambaListrado = new Taxon("Gambá-listrado", "Mephitis mephitis", "Mephitis", "Mefitídeos", "Omnívora", "Mammalia", "Chordata", "Animalia");
		
		Taxon GatoSelvagem = new Taxon("Gato-selvagem", "Felis silvestris", "Felis", "Felinae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon GazelaBranca = new Taxon("Gazela-branca", "Gazella leptoceros", "Gazella", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Gazela_da_montanha = new Taxon("Gazela-da-montanha", "Gazella gazella", "Gazella", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon GazelaIndiana = new Taxon("Gazela-indiana", "Gazella bennettii", "Gazella", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon Girafa = new Taxon("Girafa", "Giraffa", "Giraffa", "Giraffidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon Glis = new Taxon("Glis", "Glis glis", "Glis", "Gliridae", "Rodentia", "Mammalia", "Chordata", "Animalia");
		
		Taxon Gnu_de_cauda_preta = new Taxon("Gnu-de-cauda-preta", "Connochaetes taurinus", "Connochaetes", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon Gorila_das_montanhas = new Taxon("Gorila-das-montanhas", "Gorilla beringei beringei", "Gorilla", "Hominidae", "Primates", "Mammalia", "Chordata", "Animalia");
		
		Taxon Guaxinim = new Taxon("Guaxinim", "Procyon lotor", "Procyon", "Procyonidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon Golfinho_comum_de_bico_longo = new Taxon("Golfinho-comum-de-bico-longo", "Delphinus capensis", "Delphinus", "Delphinidae", "Cetacea", "Mammalia", "Chordata", "Animalia");
		Taxon Golfinho_comum_de_bico_curto = new Taxon("Golfinho-comum-de-bico-curto", "Delphinus delphis", "Delphinus", "Delphinidae", "Cetacea", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Gamba_de_orelha_branca, Gamba_de_orelha_preta, GambaListrado, GatoSelvagem, GazelaBranca, Gazela_da_montanha, GazelaIndiana, Girafa, Glis, Gnu_de_cauda_preta, Gorila_das_montanhas, Guaxinim, Golfinho_comum_de_bico_curto, Golfinho_comum_de_bico_longo };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra G: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroH() {
		
		Taxon HipopotamoComum = new Taxon("Hipopótamo-comum", "Hippopotamus amphibius", "Hippopotamus", "Hippopotamidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { HipopotamoComum };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra H: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroI() {
		
		Taxon Ibex_asiatico = new Taxon("Íbex-da-núbia", "Capra ibex sibirica", "Capra", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");	
		Taxon Ibex_dos_alpes = new Taxon("Íbex-dos-alpes", "Capra ibex", "Capra", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");	
		Taxon Ibex_da_nubia = new Taxon("Íbex-da-núbia", "Capra ibex nubiana", "Capra", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { Ibex_asiatico, Ibex_da_nubia, Ibex_dos_alpes };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra I: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroJ() {
		
		Taxon Jaguatirica = new Taxon("Jaguatirica", "Leopardus pardalis", "Leopardus", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon Javali = new Taxon("Javali", "Sus scrofa", "Sus", "Suidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Jaguatirica, Javali };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra J: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroK() {
		
		Taxon Koala = new Taxon("Koala", "Phascolarctos cinereus", "Phascolarctos", "Phascolarctidae", "Diprotodontia", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Koala };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra K: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
	}

	@Override
	public void RegistroL() {
		
		Taxon Leao = new Taxon("Leão", "Panthera leo", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Leao_do_atlas = new Taxon("Leão-do-atlas", "Panthera leo leo", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Leao_do_cabo = new Taxon("Leão-do-cabo", "panthera leo melanochaita", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon LebreEuropeia = new Taxon("Lebre-europeia", "Lepus europaeus", "Lepus", "Leporidae", "Lagomorpha", "Mammalia", "Chordata", "Animalia");
		Taxon Lebre_de_Granada = new Taxon("Lebre-de-Granada", "Lepus granatensis", "Lepus", "Leporidae", "Lagomorpha", "Mammalia", "Chordata", "Animalia");
		
		Taxon Leopardo = new Taxon("Leopardo", "Panthera pardus", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Leopardo_das_neves = new Taxon("Leopardo-das-neves", "Panthera uncia", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon Lince_do_canada = new Taxon("Lince-do-canadá", "Lynx canadensis", "Lynx", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon LinceEuroasiatico = new Taxon("Lince-euroasiático", "Lynx lynx", "Lynx", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon LinceIberico = new Taxon("Lince-ibérico", "Lynx pardinus", "Lynx", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon LincePardo = new Taxon("Lince-pardo", "Lynx rufus", "Lynx", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon LoboGuara = new Taxon("Lobo-guará", "Chrysocyon brachyurus", "Chrysocyon", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon LoboIberico = new Taxon("Lobo-ibérico", "Canis lupus signatus", "Canis", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon LoboCinzento = new Taxon("Lobo-cinzento", "Canis lupus", "Canis", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Leao, Leao_do_atlas, Leao_do_cabo, LebreEuropeia, Lebre_de_Granada, Leopardo, Leopardo_das_neves, Lince_do_canada, LinceEuroasiatico, LinceIberico, LincePardo, LoboCinzento, LoboGuara, LoboIberico };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra L: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroM() {
		
		Taxon MacacoDourado = new Taxon("Macaco-dourado", "Rhinopithecus roxellana", "Rhinopithecus", "Cercopithecidae", "Primates", "Mammalia", "Chordata", "Animalia");
		Taxon MacacoPrego = new Taxon("Macaco-prego", "Sapajus", "Sapajus", "Cebidae", "Primates", "Mammalia", "Chordata", "Animalia");
		Taxon Macaco_prego_amarelo = new Taxon("Macaco-prego-amarelo", "Sapajus libidinosus", "Sapajus", "Cebidae", "Primates", "Mammalia", "Chordata", "Animalia");
		
		Taxon Mico_leao_dourado = new Taxon("Mico-leão-dourado", "Leontopithecus rosalia", "Leontopithecus", "Cebidae", "Primates", "Mammalia", "Chordata", "Animalia");
		Taxon Mico_leao_de_cara_dourada = new Taxon("Mico-leão-de-cara-dourada", "Leontopithecus chrysomelas", "Leontopithecus", "Cebidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Markhor = new Taxon("Markhor", "Capra falconeri", "Capra", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { MacacoDourado, MacacoPrego, Macaco_prego_amarelo, Markhor, Mico_leao_dourado, Mico_leao_de_cara_dourada };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra M: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroN() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroO() {
				
		Taxon OncaPintada = new Taxon("Onça-pintada", "Panthera onca", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
				
		Taxon Orangotango_de_sumatra = new Taxon("Orangotango-de-sumatra", "Pongo abelii", "Pongo", "Hominidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		Taxon Orangotango_de_borneu = new Taxon("Orangotango-de-bornéu", "Pongo pygmaeus", "Pongo", "Hominidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		Taxon Orangotango_de_tapanuli = new Taxon("Orangotango-de-tapanuli", "Pongo tapanuliensis", "Pongo", "Hominidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Orca = new Taxon("Orca", "Orcinus orca", "Orcinus", "Delphinidae", "Cetacea", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Oribi = new Taxon("Oribi", "Ourebia ourebi", "Ourebia", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Ornitorrinco = new Taxon("Ornitorrinco", "Ornithorhynchus anatinus", "Ornithorhynchus", "Ornithorhynchidae", "Monotremata", "Mammalia", "Chordata", "Animalia");	
		
		Taxon OuricoCacheiro = new Taxon("Ouriço-cacheiro", "Erinaceus europaeus", "Erinaceus", "Erinaceidae", "Erinaceomorpha", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Ovelha = new Taxon("Ovelha", "Ovis aries", "Ovis", "Bovidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { OncaPintada, Orangotango_de_sumatra, Orangotango_de_borneu, Orangotango_de_tapanuli, Orca, Oribi, Ornitorrinco, OuricoCacheiro, Ovelha };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra O: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
	}

	@Override
	public void RegistroP() {
		
		Taxon PandaGigante = new Taxon("Panda-gigante", "Ailuropoda melanoleuca", "Ailuropoda", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon PandaVermelho = new Taxon("Panda-vermelho", "Ailurus fulgens", "Ailurus", "Ailuridae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { PandaGigante, PandaVermelho };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra P: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroQ() {
		
		Taxon Quati_de_cauda_anelada = new Taxon("Quati-de-cauda-anelada", "Nasua nasua", "Nasua", "Procionídeos", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { Quati_de_cauda_anelada };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra Q: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroR() {
		
		Taxon Raposa_afega = new Taxon("Raposa-afegã", "Vulpes cana", "Vulpes", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Raposa_ana = new Taxon("Raposa-anã", "Vulpes macrotis", "Vulpes", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Raposa_das_estepes = new Taxon("Raposa-das-estepes", "Vulpes corsac", "Vulpes", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Raposa_do_artico = new Taxon("Raposa-do-ártico", "Vulpes lagopus", "Vulpes", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Raposa_do_himalaia = new Taxon("Raposa-do-himalaia", "Vulpes ferrilata", "Vulpes", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon RaposaVeloz = new Taxon("Raposa-veloz", "Vulpes velox", "Vulpes", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon RaposaVermelha = new Taxon("Raposa-vermelha", "Vulpes vulpes", "Vulpes", "Canidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		
		Taxon RatoAlmiscarado = new Taxon("Rato-almiscarado", "Ondatra zibethicus", "Ondatra", "Cricetidae", "Rodentia", "Mammalia", "Chordata", "Animalia");	
		Taxon Rato_canguru_de_San_Quintin = new Taxon("Rato-canguru de San Quintin", "Dipodomys gravipes", "Dipodomys", "Heteromyidae", "Rodentia", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Rena = new Taxon("Rena", "Rangifer tarandus", "Rangifer", "Cervidae", "Artiodactyla", "Mammalia", "Chordata", "Animalia");	
		
		Taxon RatufaIndica = new Taxon("Ratufa indica", "Ratufa indica", "Ratufa", "Sciuridae", "Rodentia", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Rinoceronte_branco = new Taxon("Rinoceronte-branco", "Ceratotherium simum", "Ceratotherium", "Rhinocerotidae", "Perissodactyla", "Mammalia", "Chordata", "Animalia");	
		Taxon Rinoceronte_indiano = new Taxon("Rinoceronte-indiano", "Rhinocerus unicornis", "Rhinocerus", "Rhinocerotidae", "Perissodactyla", "Mammalia", "Chordata", "Animalia");	
		Taxon Rinoceronte_negro = new Taxon("Rinoceronte-negro", "Diceros bicornis", "Diceros", "Rhinocerotidae", "Perissodactyla", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { Raposa_afega, Raposa_ana, Raposa_das_estepes, Raposa_do_artico, Raposa_do_himalaia, RaposaVeloz, RaposaVermelha, RatoAlmiscarado, Rato_canguru_de_San_Quintin, Rena, RatufaIndica, Rinoceronte_branco, Rinoceronte_indiano, Rinoceronte_negro };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra R: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroS() {
		
		Taxon Sagui_da_serra_claro = new Taxon("Sagui-da-serra-claro", "Callithrix flaviceps", "Callithrix", "Callitrichidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		Taxon Sagui_de_tufo_branco = new Taxon("Sagui-de-tufo-branco", "Callithrix jacchus", "Callithrix", "Callitrichidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		Taxon Sagui_de_tufos_pretos = new Taxon("Sagui-de-tufos-pretos", "Callithrix penicillata", "Callithrix", "Callitrichidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		Taxon Sagui_de_wied = new Taxon("Sagui-de-wied", "Callithrix kuhlii", "Callithrix", "Callitrichidae", "Primates", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { Sagui_da_serra_claro, Sagui_de_tufo_branco, Sagui_de_tufos_pretos, Sagui_de_wied };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra S: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroT() {
		
		Taxon Tamandua_bandeira = new Taxon("Tamanduá-bandeira", "Myrmecophaga tridactyla", "Myrmecophaga", "Myrmecophagidae", "Pilosa", "Mammalia", "Chordata", "Animalia");	
		Taxon Tamandua_do_norte = new Taxon("Tamanduá-do-norte", "Tamandua mexicana", "Tamandua", "Myrmecophagidae", "Pilosa", "Mammalia", "Chordata", "Animalia");	
		Taxon Tamandua_mirim = new Taxon("Tamanduá-mirim", "Tamandua tetradactyla", "Tamandua", "Myrmecophagidae", "Pilosa", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Tamia_de_colarinho_cinza = new Taxon("Tâmia-de-colarinho-cinza", "Neotamias cinereicollis", "Neotamias", "Sciuridae", "Rodentia", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Tatu_bola_do_nordeste = new Taxon("Tatu-bola-do-nordeste", "Tolypeutes tricinctus", "Tolypeutes", "Clamiforídeos", "Cingulata", "Mammalia", "Chordata", "Animalia");	
		Taxon Tatu_canastra = new Taxon("Tatu-canastra", "Priodontes maximus", "Priodontes", "Clamiforídeos", "Cingulata", "Mammalia", "Chordata", "Animalia");	
		Taxon Tatu_galinha = new Taxon("Tatu-galinha", "Dasypus novemcinctus", "Dasypus", "Dasypodidae", "Cingulata", "Mammalia", "Chordata", "Animalia");	
		Taxon Tatu_mirim = new Taxon("Tatu-mirim", "Dasypus septemcinctus", "Dasypus", "Dasypodidae", "Cingulata", "Mammalia", "Chordata", "Animalia");	
		Taxon Tatupeba = new Taxon("Tatupeba", "Euphractus sexcinctus", "Euphractus", "Clamiforídeos", "Cingulata", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Texugo_americano = new Taxon("Texugo-americano", "Taxidea taxus", "Taxidea", "Mustelidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Texugo_euroasiatico = new Taxon("Texugo-euroasiático", "Meles meles", "Meles", "Mustelidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Tigre_de_bali = new Taxon("Tigre-de-bali", "Panthera tigris sondaica", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Tigre_de_bengala = new Taxon("Tigre-de-bengala", "Panthera tigris tigris", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Tigre_do_sul_da_china = new Taxon("Tigre-do-sul-da-china", "Panthera tigris amoyensis", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Tigre_do_caspio = new Taxon("Tigre-do-cáspio", "Panthera tigris virgata", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Tigre_malaio = new Taxon("Tigre-malaio", "Panthera tigris jacksoni", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Tigre_siberiano = new Taxon("Tigre-siberiano", "Panthera tigris altaica", "Panthera", "Felidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		
		Taxon Toupeira_nariz_de_estrela = new Taxon("Toupeira-nariz-de-estrela", "Condylura cristata", "Condylura", "Talpidae", "Soricomorpha", "Mammalia", "Chordata", "Animalia");	
		
		Taxon[] mammalia = { Tamandua_bandeira, Tamandua_do_norte, Tamandua_mirim, Tamia_de_colarinho_cinza, Tatu_bola_do_nordeste, Tatu_canastra, Tatu_galinha, Tatu_mirim, Tatupeba, Texugo_americano, Texugo_euroasiatico, Tigre_de_bali, Tigre_de_bengala, Tigre_do_sul_da_china, Tigre_do_caspio, Tigre_malaio, Tigre_siberiano, Toupeira_nariz_de_estrela };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra T: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroU() {
		
		Taxon Urso_de_Oculos = new Taxon("Urso-de-óculos", "Tremarctos ornatus", "Tremarctos", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");	
		Taxon Urso_europeu = new Taxon("Urso-europeu", "Ursus arctos arctos", "Ursus", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon UrsoNegro = new Taxon("Urso-negro", "Ursus americanus", "Ursus", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon UrsoPardo = new Taxon("Urso-pardo", "Ursus arctos", "Ursus", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		Taxon Urso_polar = new Taxon("Urso-polar", "Ursus maritimus", "Ursus", "Ursidae", "Carnivora", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Urso_de_Oculos, Urso_europeu, UrsoNegro, UrsoPardo, Urso_polar };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra U: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroV() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroW() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroX() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroY() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroZ() {
		
		Taxon Zebra_da_montanha = new Taxon("Zebra-da-montanha", "Equus zebra", "Equus", "Equidae", "Perissodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Zebra_da_planicie = new Taxon("Zebra-da-planície", "Equus quagga", "Equus", "Equidae", "Perissodactyla", "Mammalia", "Chordata", "Animalia");
		Taxon Zebra_de_grevy = new Taxon("Zebra-de-grevy", "Equus grevyi", "Equus", "Equidae", "Perissodactyla", "Mammalia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Zebra_da_montanha, Zebra_da_planicie, Zebra_de_grevy };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra Z: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
	}

}
