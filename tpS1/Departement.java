package tpS1;

import java.util.HashSet;
import java.util.Set;

public class Departement {
	private int idDep;
	public int getIdDep() {
		return idDep;
	}
	Set<Employe> LEmployes;
	public Departement(int idDep, int cap) {
		super();
		this.idDep = idDep;
		LEmployes =new HashSet<Employe> (cap);
	}
	
	public Set<Employe> getLEmployes() {
		return LEmployes;
	}

	public void ajoutEmp (Employe e) {
		if(e.getCin()>10) {
			LEmployes.add(e);
			e.setDepartement(this);
		}
	}
	public void retirerEmploye(Employe e)
	{
		LEmployes.remove(e);
		e.setDepartement(this);
	}
	public void afficheDep() {
		for(Employe e : LEmployes) {
			System.out.println(e.toString());
		}
	}
	public Employe getEmpSalMax()
	{
		Employe eSmax=null;
		double salMax=0;
		
		for (Employe e : LEmployes) {
			if(e.getSalaire()>salMax) {
				salMax=e.getSalaire();
				eSmax= e;
			}
		}
		return eSmax;
		
	}
	
}
