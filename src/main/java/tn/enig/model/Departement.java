package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;

	public Departement() {
	super();
	}

	public Departement(Integer id, String titre) {
	super();
	this.id = id;
	this.titre = titre;
	}

	public Integer getId() {
	return id;
	}

	public void setId(int id) {
	this.id = id;
	}

	public String getTitre() {
	return titre;
	}

	public void setTitre(String titre) {
	this.titre = titre;
	}
	}

