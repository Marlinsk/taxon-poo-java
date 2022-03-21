package app.dados;

import app.entidades.Taxon;
import app.negocio.Registros;

public class Repteis implements Registros {

	@Override
	public void RegistroA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroC() {
		
		Taxon Camaleao_de_tres_chifres = new Taxon("Camaleão-de-três-chifres", "Chamaeleo jacksonii", "Chamaeleo", "Chamaeleonidae", "Squamata", "Sauropsida", "Chordata", "Animalia");
		Taxon Camaleao_pantera = new Taxon("Camaleão-pantera", "Furcifer pardalis", "Furcifer", "Chamaeleonidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon Crocodilo_americano = new Taxon("Crocodilo-americano", "Crocodylus acutus", "Crocodylus", "Crocodylidae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		Taxon Crocodilo_cubano = new Taxon("Crocodilo-cubano", "Crocodylus rhombifer", "Crocodylus", "Crocodylidae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		Taxon Crocodilo_de_agua_doce = new Taxon("Crocodilo-de-água-doce", "Crocodylus johnstoni", "Crocodylus", "Crocodylidae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		Taxon Crocodilo_de_agua_salgada = new Taxon("Crocodilo-de-água-salgada", "Crocodylus porosus", "Crocodylus", "Crocodylidae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		Taxon Crocodilo_do_deserto = new Taxon("Crocodilo do deserto", "Crocodylus suchus", "Crocodylus", "Crocodylidae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		Taxon Crocodilo_do_nilo = new Taxon("Crocodilo-do-nilo", "Crocodylus niloticus", "Crocodylus", "Crocodylidae", "Crocodylia", "Reptilia", "Chordata", "Animalia");		
		Taxon Crocodilo_do_orinoco = new Taxon("Crocodilo-do-orinoco", "Crocodylus intermedius", "Crocodylus", "Crocodylidae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Camaleao_de_tres_chifres, Camaleao_pantera, Crocodilo_americano, Crocodilo_cubano, Crocodilo_de_agua_doce, Crocodilo_de_agua_salgada, Crocodilo_do_deserto, Crocodilo_do_nilo, Crocodilo_do_orinoco };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra C: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroD() {
		
		Taxon Dragao_de_komodo = new Taxon("Dragão-de-komodo", "Varanus komodoensis", "Varanus", "Varanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Dragao_de_komodo };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra D: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroE() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroF() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroG() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroH() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroI() {
		
		Taxon Iguana_comum = new Taxon("Iguana-comum", "iguana Iguana", "Iguana", "Iguanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		Taxon Iguana_do_caribe = new Taxon("Iguana-do-caribe", "iguana delicatissima", "Iguana", "Iguanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		Taxon Iguana_marinha = new Taxon("Iguana-marinha", "Amblyrhynchus cristatus", "Amblyrhynchus", "Iguanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Iguana_comum, Iguana_do_caribe, Iguana_marinha };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra I: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroJ() {
		
		Taxon Jacare_de_papo_amarelo = new Taxon("Jacaré-de-papo-amarelo", "Caiman latirostris", "Caiman", "Alligatoridae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		Taxon Jacare_do_pantanal = new Taxon("Jacaré-do-pantanal", "Caiman yacare", "Caiman", "Alligatoridae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		Taxon Jacaretinga = new Taxon("Jacaretinga", "Caiman crocodilus", "Caiman", "Alligatoridae", "Crocodylia", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Jacare_de_papo_amarelo, Jacare_do_pantanal, Jacaretinga };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra J: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroK() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroL() {
		
		Taxon Lagartixa_da_areia = new Taxon("Lagartixa-da-areia", "Liolaemus occipitalis", "Liolaemus", "Liolaemidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon Lagarto_rabo_de_abacaxi = new Taxon("Lagarto-rabo-de-abacaxi", "Hoplocercus spinosus", "Hoplocercus", "Hoplocercidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Lagartixa_da_areia, Lagarto_rabo_de_abacaxi };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra L: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroM() {
		
		Taxon Mamba_negra = new Taxon("Mamba-negra", "Dendroaspis polylepis", "Dendroaspis", "Elapidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Mamba_negra };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra M: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroN() {
		
		Taxon Naja_egipcia = new Taxon("Naja-egípcia", "Naja haje", "Naja", "Elapidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		Taxon Naja_indiana = new Taxon("Naja indiana", "Naja naja", "Naja", "Elapidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Naja_egipcia, Naja_indiana };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra N: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroO() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroQ() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroS() {
		
		Taxon Sucuri_amarela = new Taxon("Sucuri-amarela", "Eunectes notaeus", "Eunectes", "Boidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		Taxon Sucuri_verde = new Taxon("Sucuri-verde", "Eunectes murinus", "Eunectes", "Boidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Sucuri_amarela, Sucuri_verde };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra S: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroT() {
		
		Taxon Tartaruga_aligator = new Taxon("Tartaruga-aligator", "Macrochelys temminckii", "Macrochelys", "Chelydridae", "Testudines", "Sauropsida", "Chordata", "Animalia");
		
		Taxon Tartaruga_de_couro = new Taxon("Tartaruga-de-couro", "Dermochelys coriacea", "Dermochelys", "Dermochelyidae", "Testudines", "Reptilia", "Chordata", "Animalia");
		
		Taxon Tartaruga_mordedora = new Taxon("Tartaruga-mordedora", "Chelydra serpentina", "Chelydra", "Chelydridae", "Testudines", "Sauropsida", "Chordata", "Animalia");
		
		Taxon Tartaruga_gigante_de_arnold = new Taxon("Tartaruga-gigante-de-arnold", "Aldabrachelys gigantea arnoldi", "Aldabrachelys", "Testudinidae", "Testudines", "Reptilia", "Chordata", "Animalia");
		Taxon Tartaruga_gigante_de_aldabra = new Taxon("Tartaruga-gigante-de-aldabra", "Aldabrachelys gigantea", "Aldabrachelys", "Testudinidae", "Testudines", "Reptilia", "Chordata", "Animalia");
		
		Taxon Tartaruga_verde = new Taxon("Tartaruga-verde", "Chelonia mydas", "Chelonia", "Cheloniidae", "Testudines", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Tartaruga_aligator, Tartaruga_de_couro, Tartaruga_gigante_de_aldabra, Tartaruga_gigante_de_arnold, Tartaruga_mordedora, Tartaruga_verde };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra T: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
	}

	@Override
	public void RegistroU() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RegistroV() {
		
		Taxon Varano_do_deserto = new Taxon("Varano-do-deserto", "Varanus griseus", "Varanus", "Varanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		Taxon Varano_gigante = new Taxon("Varano-gigante", "Varanus giganteus", "Varanus", "Varanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		Taxon Varano_malaio = new Taxon("Varano-malaio", "Varanus salvator", "Varanus", "Varanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		Taxon Varano_terrestre_africano = new Taxon("Varano-terrestre-africano", "Varanus exanthematicus", "Varanus", "Varanidae", "Squamata", "Reptilia", "Chordata", "Animalia");
		
		Taxon[] mammalia = { Varano_do_deserto, Varano_gigante, Varano_malaio, Varano_terrestre_africano };
		
		System.out.println("Registros de nomes de mamíferos que começam com a letra V: " + "\n");
		
		for (Taxon t: mammalia) {
			System.out.println(t);
		}
		
		System.out.println("\n");
		
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
		// TODO Auto-generated method stub
		
	}

}
