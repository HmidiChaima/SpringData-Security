package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
	public class Materiel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private String type;
	private int Num;
	private int quantity;
	private boolean etat;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Departement dep;

	public Materiel() {
	super();
	}

	public Materiel(Integer id, String titre, String type, int num, int quantity, boolean etat, Departement dep) {
	super();
	this.id = id;
	this.titre = titre;
	this.type = type;
	Num = num;
	this.quantity = quantity;
	this.etat = etat;
	this.dep = dep;
	}

	public Materiel(String titre, String type, int num, int quantity, boolean etat, Departement dep) {
	super();
	this.titre = titre;
	this.type = type;
	Num = num;
	this.quantity = quantity;
	this.etat = etat;
	this.dep = dep;
	}

	public Integer getId() {
	return id;
	}

	public void setId(Integer id) {
	this.id = id;
	}

	public String getTitre() {
	return titre;
	}

	public void setTitre(String titre) {
	this.titre = titre;
	}

	public String getType() {
	return type;
	}

	public void setType(String type) {
	this.type = type;
	}

	public int getNum() {
	return Num;
	}

	public void setNum(int num) {
	Num = num;
	}

	public int getQuantity() {
	return quantity;
	}

	public void setQuantity(int quantity) {
	this.quantity = quantity;
	}

	public boolean isEtat() {
	return etat;
	}

	public void setEtat(boolean etat) {
	this.etat = etat;
	}

	public Departement getDep() {
	return dep;
	}

	public void setDep(Departement dep) {
	this.dep = dep;
	}

	@Override
	public String toString() {
	return "Materiel [id=" + id + ", titre=" + titre + ", type=" + type + ", Num=" + Num + ", quantity=" + quantity
	+ ", etat=" + etat + "]";
	}


	}



