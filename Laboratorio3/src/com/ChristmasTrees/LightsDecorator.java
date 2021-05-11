package com.ChristmasTrees;

import java.util.*;

public class LightsDecorator extends ChristmasTree {

    int controlLights = 0;
    
    public LightsDecorator(Tree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABET");
        this.addLights(super.place);     
        
        super.place.place("PARSNIP");
        this.addLights(super.place);
        
        super.place.place("PINE");
        this.addLights(super.place);
        
        super.place.place("HOLLY");
        this.addLights(super.place);
        
        super.place.place("BALSAM");
        this.addLights(super.place);
    }

    public void addLights(Tree tree) {
        if(tree instanceof PinabetTree && controlLights == 0){
            System.out.println("Decorando PINABETO con LUCES");
        }
        
        if(tree instanceof ParsnipTree && controlLights == 0){
            System.out.println("Decorando CHIRIVISCO con LUCES");
        }
        
        if(tree instanceof PineTree && controlLights == 0){
            System.out.println("Decorando PINO con LUCES");
        }
        
        if(tree instanceof HollyTree && controlLights == 0){
            System.out.println("Decorando ACEBO con LUCES");
        }
        
        if(tree instanceof BalsamTree && controlLights == 0){
            System.out.println("Decorando BÁLSAMO con LUCES");
        }
        controlLights++;
    }

}