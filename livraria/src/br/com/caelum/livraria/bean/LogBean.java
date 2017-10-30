package br.com.caelum.livraria.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.caelum.livraria.modelo.Log;

@ManagedBean
@ViewScoped
public class LogBean {
	
	private Log log = new Log();
	private List<Log> logPedido = new ArrayList<Log>();
	
	
	public Log getLog() {
		return log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public List<Log> getLogPedido() {
		return logPedido;
	}

	public void setLogPedido(ArrayList<Log> logPedido) {
		this.logPedido = logPedido;
	}
	
	public void adicionarLog(Log log){
		this.logPedido.add(log);
	}
	
}
