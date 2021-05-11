package com.ChristmasTrees;

import java.util.*;

public class SnowDecorator extends ChristmasTree {

    int controlSnow = 0;
    
    public SnowDecorator(Tree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABET");
        this.addSnow(super.place);     
        
        super.place.place("PARSNIP");
        this.addSnow(super.place);
        
        super.place.place("PINE");
        this.addSnow(super.place);
        
        super.place.place("HOLLY");
        this.addSnow(super.place);
        
        super.place.place("BALSAM");
        this.addSnow(super.place);
    }

    public void addSnow(Tree tree) {
        if(tree instanceof PinabetTree && controlSnow == 0){
            System.out.println("Decorando PINABETO con NIEVE");
        }
        
        if(tree instanceof ParsnipTree && controlSnow == 0){
            System.out.println("Decorando CHIRIVISCO con NIEVE");
        }
        
        if(tree instanceof PineTree && controlSnow == 0){
            System.out.println("Decorando PINO con NIEVE");
        }
        
        if(tree instanceof HollyTree && controlSnow == 0){
            System.out.println("Decorando ACEBO con NIEVE");
        }
        
        if(tree instanceof BalsamTree && controlSnow == 0){
            System.out.println("Decorando BÁLSAMO con NIEVE");
        }
        controlSnow++;
    }

}