package br.com.caelum.livraria.bean;

import java.util.ArrayList;

import br.com.caelum.livraria.modelo.ValidaPedido;

public class LogBean {
	
	private ArrayList<String> logPedido = new ValidaPedido().getLog();

	public ArrayList<String> getLogPedido() {
		return logPedido;
	}

	public void setLogPedido(ArrayList<String> logPedido) {
		this.logPedido = logPedido;
	}
	
}
