package tpS1;

public class Employe {
	private int cin;
	private String nom;
	private double salaire;
	private Departement departement;
	public Employe(int cin, String nom, double salaire, Departement departement) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.salaire = salaire;
		this.departement = departement;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	@Override
	public String toString() {
	    return "Employe [cin=" + cin + ", nom=" + nom + ", salaire=" + salaire + ", departement=" + departement.getIdDep() + "]";
	}


	
}
