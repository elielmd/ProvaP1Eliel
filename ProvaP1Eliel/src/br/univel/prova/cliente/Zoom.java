package br.univel.prova.cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import br.univel.prova.comum.Constantes;
import br.univel.prova.comum.Plact;

public class Zoom {

	public Zoom() throws Exception {
		Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1818);
		Plact servico = (Plact) registry.lookup(Plact.NOME);
		Integer retorno = servico.calcule(Constantes.RA_DEZENA);
		System.out.println(retorno);
	}

	public static void main(String[] args) throws Exception {
		new Zoom();
	}

}
