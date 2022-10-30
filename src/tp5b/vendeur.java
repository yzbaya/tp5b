package tp5b;

public class vendeur extends salaire {
   private double vente;
   private double pourcentage;
   




public vendeur(int i, String string, int j, double d) {
	// TODO Auto-generated constructor stub
}

double getvente() {
	   return vente;
   }
   
   void setvente(double vente) {
	   this.vente=vente;
   }

public double getPourcentage() {
	return pourcentage;
}

public void setPourcentage(double pourcentage) {
	this.pourcentage = pourcentage;
	
}

  void affiche() {
	 super.affiche();
	 System.out.printf("vente = "+this.vente, "pourcentage = "+this.pourcentage);
 }


}
