import java.util.ArrayList;

public class Noeud {

    private double minorant;
    private double majorant;
    private boolean choisi;
    private Noeud right;
    private Noeud left;


    public Noeud(double minorant, double majorant, boolean choisi) {
        this.minorant = minorant;
        this.majorant = majorant;
        this.choisi = choisi;
        this.right = null;
        this.left = null;
    }
}
