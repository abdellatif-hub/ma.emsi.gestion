package ma.emsi.gestion;


public class ResultatEtudiant {

    private final Etudiant etudiant;
    private final boolean admis;

    public ResultatEtudiant(Etudiant etudiant, boolean admis) {
        this.etudiant = etudiant;
        this.admis = admis;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public boolean isAdmis() {
        return admis;
    }
}
