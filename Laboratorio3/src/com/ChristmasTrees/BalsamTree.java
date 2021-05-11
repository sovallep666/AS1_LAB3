package com.ChristmasTrees;

import java.util.*;

public class BalsamTree implements Tree {

    int fabricateBalsam = 0;
    
    public BalsamTree() {
    }

    public void place(String typeTree) {
        if(fabricateBalsam == 0){
            System.out.println("Fabricando árbol de tipo BÁLSAMO");
            fabricateBalsam++;
        }
    }

}