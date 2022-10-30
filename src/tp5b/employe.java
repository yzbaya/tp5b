package tp5b;

public class employe extends salaire {
  private double Hsupp;
  private double PHsupp;

   employe(int Mat ,String nom, double rec,double PHsupp,double Hsupp){
	   super(Mat,nom,rec);
	   this.Hsupp=Hsupp;
	   this.PHsupp=PHsupp;
   }
   @Override
   void affiche() {
	   super.affiche();
	   System.out.printf("PHsupp = "+this.PHsupp ,"Hsup = "+this.Hsupp );
   }
   
   void salaire() {
	   super.affiche();
   }
}
