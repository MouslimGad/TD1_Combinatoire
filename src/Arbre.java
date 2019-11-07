import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Arbre {


    Noeud root;
    Instance instance;
    List<Noeud> noeudList = new ArrayList();


    public Arbre(Instance instance, Noeud root) {
        this.instance = instance;
        this.root = root;
    }

    private Noeud addRecursive(Noeud current, Instance instance, Boolean chosen) {

        //instance.lesObjets.retireObjet(current.valeurTranque);
/*        current.left = new Noeud(instance.minorer(),instance.majorer(),current.valeurTranque);
        current.right = new Noeud(instance.minorer(),instance.majorer(),current.valeurTranque);*/


        Instance i1 = instance;
        Instance i2 = instance;

        i1.lesObjets.retireObjet(current.valeurTranque);
        i1.lesObjets.ajouteFirst(current.valeurTranque);

        i2.lesObjets.retireObjet(current.valeurTranque);
        i1.afficheInstance();

        if(i1.minorer()>i2.minorer() && i1.majorer()>i2.majorer()){
            current.left = new Noeud(i1.minorer(),i1.majorer(),current.valeurTranque);
        }
        else {
            current.right = new Noeud(i1.minorer(),i1.majorer(),current.valeurTranque);
        }

        noeudList.add(current);
        noeudList.add(current.left);
        noeudList.add(current.right);


        /*if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
        */
        return current;
    }



    public void add(Instance instance) {
        addRecursive(root,instance,true);
    }

    @Override
    public String toString() {
        return "Arbre{" +
                "min=" + root.getMinorant() + " max=" + root.getMajorant()+ " Objet tranque. Poids: "+ instance.objetTranque.getPoids()+" Utilite: "+ instance.objetTranque.getUtil()+ "num:" + instance.objetTranque.getNum()+
                 "List:"+noeudList+'}';
    }


}
