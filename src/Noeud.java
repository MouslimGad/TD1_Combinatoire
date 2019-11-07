
public class Noeud {

    private double minorant;
    private double majorant;
    Objet valeurTranque;
     Noeud right;
     Noeud left;


    public Noeud(double minorant, double majorant,Objet valeurTranque) {
        this.minorant = minorant;
        this.majorant = majorant;
        this.valeurTranque = valeurTranque;
        this.right = null;
        this.left = null;
    }

    public double getMinorant() {
        return minorant;
    }

    public double getMajorant() {
        return majorant;
    }
}
