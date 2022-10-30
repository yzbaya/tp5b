package tp5b;

public class salaire {
	
   protected  int Matricule;
   protected  String nom;
   protected  double recrutement;
   
   salaire(int mat, String nom, double matr){
	   this.Matricule=mat;
	   this.nom=nom;
	   this.recrutement=matr;
   }
public int getMatricule() {
	return Matricule;
}


public void setMatricule(int Matricule) {
	this.Matricule = Matricule;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public double getRecrutement() {
	return recrutement;
}


    public void setRecrutement(double recrutement) {
	   this.recrutement = recrutement;
   }

      void affiche () {
	   System.out.println(Matricule+"/"+nom+"/"+ recrutement);
      }
      
       salaire() {
    	  if (recrutement<2005) {
    		  System.out.println("la salire est 400");
    	  }
    	  else {
    		  System.out.println("la salire est 280");
    	  }
      }

}


