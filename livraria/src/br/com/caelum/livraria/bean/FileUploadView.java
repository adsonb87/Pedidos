package br.com.caelum.livraria.bean;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

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
		if(file.getFileName().endsWith(".txt")){
			this.file = file;
		}else{
			FacesContext context = FacesContext.getCurrentInstance();
	        
			context.addMessage(null, new FacesMessage("Error", "Tipo de arquivo incorreto"+file.getFileName()));
			System.out.println("Tipo de arquivo incorreto"+file.getFileName());			
		}
	}
	
	public void upload() throws IOException{
		new ValidaPedido(file.getFileName(), file.getInputstream()).validaArquivoPedido();
    }	
	
}
