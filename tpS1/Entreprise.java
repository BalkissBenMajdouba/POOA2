package tpS1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Entreprise {
    private String nomEntreprise;
    private HashMap<Integer, Departement> Liste_Deps;

    public Entreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
        Liste_Deps = new HashMap<>();
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public HashMap<Integer, Departement> getListe_Deps() {
        return Liste_Deps;
    }

    public void setListe_Deps(HashMap<Integer, Departement> liste_Deps) {
        Liste_Deps = liste_Deps;
    }

    public void ajoutDep(Departement d) {
        Liste_Deps.put(d.getIdDep(), d);
    }

    public void retirerDep(Departement d) {
        Liste_Deps.remove(d.getIdDep());
    }

    public void afficheE() {
        for (Departement d : Liste_Deps.values()) {
            d.afficheDep();
        }
    }

    public void UpdateDep(Employe E, int idDep) {
        Departement oldD = null;
        for (Departement dep : Liste_Deps.values()) {
            if (dep.getLEmployes().contains(E)) {
                oldD = dep;
            }
        }
        if (oldD == null) {
            System.out.println("Employe non trouve");
        } else {
            oldD.retirerEmploye(E);
            Departement newD = Liste_Deps.get(idDep);
            if (newD == null) {
                System.out.println(idDep + " dep Pas trouve");
            } else {
                newD.ajoutEmp(E);
            }
        }
    }
  
    public boolean existeD(Departement d)
    {
		 return Liste_Deps.containsValue(d);
    
    }
    public void DepMinCapacity()
    {
    	 Departement minD = null;
    	 int minC= Integer.MAX_VALUE;
    	 for (Departement dep : Liste_Deps.values()) {
    	        int nbEmployees = dep.getLEmployes().size();
    	        if (nbEmployees<minC) {
    	        	minC=nbEmployees;
    	        	minD = dep;
    	        }
    	    }
    	  if (minD != null) {
    	  System.out.println("Le département avec min employe " + minD.getIdDep());
          System.out.println("Nombre emp : " + minC);
       
    	  }
    }
}
