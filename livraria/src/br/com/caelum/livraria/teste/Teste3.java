package br.com.caelum.livraria.teste;

import java.io.IOException;

import br.com.caelum.livraria.modelo.ValidaPedido;

public class Teste3 {
	public static void main(String[] args) throws IOException {

		ValidaPedido pedido = new ValidaPedido("RECARGA NOVEMBRO2017.txt");

		pedido.validaArquivoPedido();

	}
}
