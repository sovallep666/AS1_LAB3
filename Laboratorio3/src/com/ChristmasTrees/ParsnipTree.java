package com.ChristmasTrees;

import java.util.*;

public class ParsnipTree implements Tree {

    int fabricateParsnip = 0;
    
    public ParsnipTree() {
    }

    public void place(String typeTree) {
        if(fabricateParsnip == 0){
            System.out.println("Fabricando árbol de tipo CHIRIVISCO");
            fabricateParsnip++;
        }
    }

}