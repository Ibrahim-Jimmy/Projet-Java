
public class MatiereEtudiant {
	
	private Etudiant etud;
	private Matiere mat;
	
	public MatiereEtudiant() {}
	
	

	public MatiereEtudiant(Etudiant etudiant, Matiere matiere) {
		
		this.etud = etud;
		this.mat = mat;
	}

	

	public Etudiant getEtud() {
		return etud;
	}

	public void setEtud(Etudiant etud) {
		this.etud = etud;
	}

	public Matiere getMat() {
		return mat;
	}

	public void setMat(Matiere mat) {
		this.mat = mat;
	}
	
	

}
