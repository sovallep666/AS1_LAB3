package com.ChristmasTrees;

import java.util.*;

public class PinabetTree implements Tree {

    int fabricatePinabet = 0;
    
    public PinabetTree() {
    }

    public void place(String typeTree) {
        if(fabricatePinabet == 0){
            System.out.println("Fabricando árbol de tipo PINABETO");
            fabricatePinabet++;
        }
    }

}