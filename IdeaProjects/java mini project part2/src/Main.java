//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employe e1 = new Employe(1,5,"hammadi","lousif","korfi");
        Employe e2 = new Employe(2,3,"samir","gris métalisé","mzewdi");
        Employe e3 = new Employe(3,9,"cheb tirara","ben deda","tiktoker");

        SocieteArrayList l1 = new SocieteArrayList();
        l1.ajouterEmploye(e2);
        l1.ajouterEmploye(e3);
        l1.ajouterEmploye(e1);
        l1.displayEmploye();;
        l1.trierEmployeParId();
        l1.displayEmploye();
        l1.trierEmployeParNomDepartementEtGrade();
        l1.displayEmploye();
        System.out.println(l1.rechercherParDepartement("korfi"));
        }
    }
