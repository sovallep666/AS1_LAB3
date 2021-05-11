package com.ChristmasTrees;

import java.util.*;

public class HollyTree implements Tree {

    int fabricateHolly = 0;
    
    public HollyTree() {
    }

    public void place(String typeTree) {
        if(fabricateHolly == 0){
            System.out.println("Fabricando árbol de tipo ACEBO");
            fabricateHolly++;
        }
    }

}