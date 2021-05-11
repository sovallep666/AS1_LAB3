package com.ChristmasTrees;

import java.util.*;

public class PineTree implements Tree {

    int fabricatePino = 0;
    
    public PineTree() {
    }

    public void place(String typeTree) {
        if(fabricatePino == 0){
            System.out.println("Fabricando árbol de tipo PINO");
            fabricatePino++;
        }
    }

}