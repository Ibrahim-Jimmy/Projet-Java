import java.util.Scanner;

public class MainProjet {

	

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****** Creation de l'Etudiant ************");
		
	 System.out.println("Veillez Saisir id de l etudiant");
	 int id= sc.nextInt();
	 System.out.println("Veillez Saisir le nom de l'etudiant");
	 String nom= sc.next();
	 System.out.println("Veillez Saisir le prenom de l'etudiant");
	 String prenom= sc.next();
	 System.out.println("Veillez Saisir l'adresse de l'etudiant");
	 String adresse= sc.next();
	 System.out.println("Veillez Saisir l'email de l'etudiant");
	 String email= sc.next();
	 
	 Etudiant etudiant= new Etudiant(id,nom,prenom,adresse,email);
	 
	 
	 System.out.println("****** Creation du Matiere ************");
	 
	 System.out.println("Veillez Saisir id du Matiere");
	 int idMatiere= sc.nextInt();
	 System.out.println("Veillez Saisir le nom du Matiere");
	 String nomMatiere= sc.next();
	 
	 Matiere matiere= new Matiere(idMatiere,nomMatiere);
	 
	 
	
	  
	 MatiereEtudiant ma = new MatiereEtudiant(etudiant,matiere);
	 
	 
	 
	 System.out.println("****** Creation du Note ************");
	 
	 
	 System.out.println("Veillez Saisir Note du CC");
	 float note1= sc.nextFloat();
	 System.out.println("Veillez Saisir Note du EF");
	 float note2= sc.nextFloat();
	 
	 Moyen(note1, note2);
	 
	 
	 
	 
		
	}
	
	public static void Moyen(float note1, float note2) {
		
		int somme=0;
		double moy = 0;
		
		somme= (int) (note1+note2);
		
		moy= somme/2;
		System.out.println("***********Validation************");
		if(moy>10) {
			
			System.out.println("Vous ete Admis");
			
		}else {
			System.out.println("Vous ete pas Admis");
		}
		
		
	}
	
	

}
