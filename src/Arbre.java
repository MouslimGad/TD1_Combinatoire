public class Arbre {


    Noeud root;


    private Noeud addRecursive(Noeud current, double minorant, double majorant) {
        if (current == null) {
            return new Noeud(minorant, majorant, false);
        }



        return current;
    }



    public void add(double minorant, double majorant) {
        root = addRecursive(root,minorant,majorant);
    }
}
