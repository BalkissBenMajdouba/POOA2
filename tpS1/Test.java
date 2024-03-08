package tpS1;

public class Test {

	public static void main(String[] args) {
		 Departement d1 = new Departement(1, 15);
	     Departement d2 = new Departement(2, 10);
	     
	     Employe e1 = new Employe(135,"Balkiss", 2500,d1);
	     Employe e2 = new Employe(246,"Sami",1000,d1);
	     Employe e3 = new Employe(789,"Amine",800,d2);
	     
	     //AJOUT
	     d1.ajoutEmp(e1);
	     d1.ajoutEmp(e2);
	     d2.ajoutEmp(e3);
	     
	     //AFFICHAGE
	     d1.afficheDep();
	     System.out.println();
	     
	     /* SUPPRISSION
	     d1.retirerEmploye(e2);
	     d1.afficheDep();  */
	     
	     System.out.println(d1.getEmpSalMax());
	     System.out.println();
	     Entreprise ent = new Entreprise("Entreprisi ");
	     ent.ajoutDep(d2);
	     ent.afficheE();
	     
	     System.out.println(ent.existeD(d2));
	     
	     ent.DepMinCapacity();
	}

}
