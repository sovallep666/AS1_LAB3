package com.ChristmasTrees;

import java.util.*;

public class BombsDecorator extends ChristmasTree {

    int controlBombs = 0;
    
    public BombsDecorator(Tree place) {
        super(place);
    }
    
    public void place(){
        super.place.place("PINABET");
        this.addBombs(super.place);     
        
        super.place.place("PARSNIP");
        this.addBombs(super.place);
        
        super.place.place("PINE");
        this.addBombs(super.place);
        
        super.place.place("HOLLY");
        this.addBombs(super.place);
        
        super.place.place("BALSAM");
        this.addBombs(super.place);
    }

    public void addBombs(Tree tree) {
        if(tree instanceof PinabetTree && controlBombs == 0){
            System.out.println("Decorando PINABETO con BOMBAS NAVIDEÑAS");
        }
        
        if(tree instanceof ParsnipTree && controlBombs == 0){
            System.out.println("Decorando CHIRIVISCO con BOMBAS NAVIDEÑAS");
        }
        
        if(tree instanceof PineTree && controlBombs == 0){
            System.out.println("Decorando PINO con BOMBAS NAVIDEÑAS");
        }
        
        if(tree instanceof HollyTree && controlBombs == 0){
            System.out.println("Decorando ACEBO con BOMBAS NAVIDEÑAS");
        }
        
        if(tree instanceof BalsamTree && controlBombs == 0){
            System.out.println("Decorando BÁLSAMO con BOMBAS NAVIDEÑAS");
        }
        controlBombs++;
    }

}