package com.ChristmasTrees;

import java.util.*;

public class ChristmasTreeFacade {

    public List<String> PinabetTypeTree;
    public List<String> ParsnipTypeTree;
    public List<String> PineTypeTree;
    public List<String> HollyTypeTree;
    public List<String> BalsamTypeTree;
    
    public ChristmasTreeFacade() {
        this.PinabetTypeTree = new ArrayList();
        this.ParsnipTypeTree = new ArrayList();
        this.PineTypeTree = new ArrayList();
        this.HollyTypeTree = new ArrayList();
        this.BalsamTypeTree = new ArrayList();
        
        this.PinabetTypeTree.add("PINABETO");
        this.ParsnipTypeTree.add("PARSNIP");
        this.PineTypeTree.add("PINE");
        this.HollyTypeTree.add("HOLLY");
        this.BalsamTypeTree.add("BALSAM");
    }

    public void placePinabet() {
        Tree pinabet = new PinabetTree();
        
        for(int i=0; i<this.PinabetTypeTree.size(); i++){
            pinabet.place(this.PinabetTypeTree.get(i));
        }
    }

    public void placeParsnip() {
        Tree parsnip = new ParsnipTree();
        
        for(int i=0; i<this.ParsnipTypeTree.size(); i++){
            parsnip.place(this.ParsnipTypeTree.get(i));
        }
    }

    public void PlacePine() {
        Tree pine = new PineTree();
        
        for(int i=0; i<this.PineTypeTree.size(); i++){
            pine.place(this.PineTypeTree.get(i));
        }
    }

    public void PlaceHolly() {
        Tree holly = new HollyTree();
        
        for(int i=0; i<this.HollyTypeTree.size(); i++){
            holly.place(this.HollyTypeTree.get(i));
        }
    }

    public void PlaceBalsam() {
        Tree balsam = new BalsamTree();
        
        for(int i=0; i<this.BalsamTypeTree.size(); i++){
            balsam.place(this.BalsamTypeTree.get(i));
        }
    }

}