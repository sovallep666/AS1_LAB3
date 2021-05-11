package com.ChristmasTrees;

import java.util.*;

public class StarDecorator extends ChristmasTree {

    int controlStar = 0;
    
    public StarDecorator(Tree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABET");
        this.addStar(super.place);     
        
        super.place.place("PARSNIP");
        this.addStar(super.place);
        
        super.place.place("PINE");
        this.addStar(super.place);
        
        super.place.place("HOLLY");
        this.addStar(super.place);
        
        super.place.place("BALSAM");
        this.addStar(super.place);
    }

    public void addStar(Tree tree) {
        if(tree instanceof PinabetTree && controlStar == 0){
            System.out.println("Decorando PINABETO con ESTRELLA");
        }
        
        if(tree instanceof ParsnipTree && controlStar == 0){
            System.out.println("Decorando CHIRIVISCO con ESTRELLA");
        }
        
        if(tree instanceof PineTree && controlStar == 0){
            System.out.println("Decorando PINO con ESTRELLA");
        }
        
        if(tree instanceof HollyTree && controlStar == 0){
            System.out.println("Decorando ACEBO con ESTRELLA");
        }
        
        if(tree instanceof BalsamTree && controlStar == 0){
            System.out.println("Decorando BÁLSAMO con ESTRELLA");
        }
        controlStar++;
    }

}