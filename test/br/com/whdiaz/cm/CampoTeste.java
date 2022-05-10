package br.com.whdiaz.cm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import modelo.Campo;

public class CampoTeste {

	private Campo campo = new Campo(3, 3);

	@Test
	void testeVizinhoRealEsquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}

	@Test
	void testeVizinhoRealDireita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}

	@Test
	void testeVizinhoRealEncima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}
	@Test
	void testeVizinhoRealEmbaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
	}
	@Test
	void testeVizinhoReal2() {
		Campo vizinho = new Campo(2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
		
	}

}
