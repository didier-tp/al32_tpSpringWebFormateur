package fr.afcepf.al32.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped //ou @RequestScope
public class ClientComptesMBean {
	
	private Long numClient; //à saisir
	
	//private List<Compte> listeComptes;
	
	public String login() {
		String suite=null;
		
	    suite="comptes"; // pour naviguer vers comptes.jsf (.xhtml ou .jsp)
		return suite; 
	}

	public Long getNumClient() {
		return numClient;
	}

	public void setNumClient(Long numClient) {
		this.numClient = numClient;
	}
	
	

}
