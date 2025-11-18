import java.util.Objects;

public class Employe implements Comparable<Employe> {
    int id , grade;
    String nom , prenom , nomDepartement;

    @Override
    public int compareTo(Employe employe) {
        return Integer.compare(this.id, employe.id);
    }
    public Employe(int id, int grade, String nom, String prenom, String nomDepartement) {
        this.id = id;
        this.grade = grade;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
    }

    public Employe() {
    }


    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", grade=" + grade +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employe employe)) return false;
        return getId() == employe.getId() && getGrade() == employe.getGrade() && Objects.equals(getNom(), employe.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getGrade(), getNom());
    }
}
