package br.com.caelum.livraria.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.livraria.modelo.ValidaPedido;
import javafx.scene.control.ComboBox;

@ManagedBean
@ViewScoped
public class LogBean {
	
	private ArrayList<String> logPedido = new ValidaPedido().getLog();

	public ArrayList<String> getLog() {
		return logPedido;
	}

	public void setLogPedido(ArrayList<String> logPedido) {
		this.logPedido = logPedido;
	}
	
}
