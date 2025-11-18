import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements  IGestion<Employe> , IRechercheAvancee<Employe> {
    List<Employe> employeList = new ArrayList();

    
    @Override
    public void ajouterEmploye(Employe e) {
        employeList.add(e);
    }
    @Override
    public boolean rechercherEmploye(String nom){
        return employeList.contains(nom);
    }
    @Override
    public boolean rechercherEmploye(Employe e){
        return employeList.contains(e);
    }
    @Override
    public void supprimerEmploye(Employe e) {
        employeList.remove(e);
    }
    @Override
    public void displayEmploye() {
        System.out.println("Liste des employees" +  employeList);
    }
    @Override
    public void trierEmployeParId() {
        Collections.sort(employeList);
    }
    @Override
    public void trierEmployeParNomDepartementEtGrade(){
        Collections.sort(employeList, new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                int x = o1.getNom().compareTo(o2.getNom());
                if(x!=0){
                    return x;
                }
                return Integer.compare(o1.getGrade(), o2.getGrade());
            }

        });
    }
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> employeList1 = new ArrayList<>();
        for(Employe e : employeList){
            if(e.getNomDepartement().equals(nomDepartement)){
                employeList1.add(e);
            }
        }
        return employeList1;
    }
}
