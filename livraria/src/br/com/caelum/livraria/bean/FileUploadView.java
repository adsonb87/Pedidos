package br.com.caelum.livraria.bean;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.UploadedFile;

import br.com.caelum.livraria.modelo.ValidaPedido;

@ManagedBean
@ViewScoped
public class FileUploadView {
	
	private UploadedFile file;

	
	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
		System.out.println(file.getFileName());
	}
	
	public void upload() throws IOException{
		new ValidaPedido(file.getFileName(), file.getInputstream()).validaArquivoPedido();
    }	
	
}
