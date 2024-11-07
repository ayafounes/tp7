public class Ustensile {
    protected int annee;

    public Ustensile(int annee) {
        this.annee = annee;
    }

    double calculeValeur() {
        int age = 2019 - annee;
        double res = 0;
        if (age < 50) {
            res = 0;
        } else {
            res = age;
        }
        return res;
    }
}

abstract class Assiette extends Ustensile {
    public Assiette(int annee) {
        super(annee);
    }

    abstract double calcule_surface(); 
}

class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }

    double calcule_surface() {
        return 3.14 * rayon * rayon;
    }
}

class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    double calcule_surface() {
        return cote * cote;
    }

    double calculeValeur() {
        return super.calculeValeur() * 5;
    }
}

class Cuillere extends Ustensile {
    private double longueur;

    public Cuillere(int annee, double longueur) {
        super(annee);
        this.longueur = longueur;
    }

   
}


