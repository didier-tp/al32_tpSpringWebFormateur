package fr.afcepf.al32.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import fr.afcepf.al32.entity.Compte;
import fr.afcepf.al32.service.IServiceCompte;

@ManagedBean
@SessionScoped //ou @RequestScope
public class ClientComptesMBean {
	
	private Long numClient; //à saisir
	
	@ManagedProperty("#{serviceCompteImpl}") //#{nomComposantJsfOuSpring} //nomClasseJava avec minuscule au debut
	private IServiceCompte serviceCompte;//avec get?/set
	
	private List<Compte> listeComptes; //à afficher
	
	public String login() {
		String suite=null;
		listeComptes = serviceCompte.rechercherComptesDuClient(numClient);
	    suite="comptes"; // pour naviguer vers comptes.jsf (.xhtml ou .jsp)
		return suite; 
	}

	public Long getNumClient() {
		return numClient;
	}

	public void setNumClient(Long numClient) {
		this.numClient = numClient;
	}

	public IServiceCompte getServiceCompte() {
		return serviceCompte;
	}

	public void setServiceCompte(IServiceCompte serviceCompte) {
		this.serviceCompte = serviceCompte;
	}

	public List<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}
	
	

}
