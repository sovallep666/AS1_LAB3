package com.ChristmasTrees;

import java.util.*;

public class SlatsDecorator extends ChristmasTree {

    int controlSlats = 0;
    
    public SlatsDecorator(Tree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABET");
        this.addSlats(super.place);     
        
        super.place.place("PARSNIP");
        this.addSlats(super.place);
        
        super.place.place("PINE");
        this.addSlats(super.place);
        
        super.place.place("HOLLY");
        this.addSlats(super.place);
        
        super.place.place("BALSAM");
        this.addSlats(super.place);
    }
    
    public void addSlats(Tree tree) {
        if(tree instanceof PinabetTree && controlSlats == 0){
            System.out.println("Decorando PINABETO con LISTONES");
        }
        
        if(tree instanceof ParsnipTree && controlSlats == 0){
            System.out.println("Decorando CHIRIVISCO con LISTONES");
        }
        
        if(tree instanceof PineTree && controlSlats == 0){
            System.out.println("Decorando PINO con LISTONES");
        }
        
        if(tree instanceof HollyTree && controlSlats == 0){
            System.out.println("Decorando ACEBO con LISTONES");
        }
        
        if(tree instanceof BalsamTree && controlSlats == 0){
            System.out.println("Decorando BÁLSAMO con LISTONES");
        }
        controlSlats++;
    }

}