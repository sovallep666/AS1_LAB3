package com.ChristmasTrees;

import java.util.*;

public abstract class ChristmasTree extends ChristmasTreeFacade {

    protected Tree place;
    
    public ChristmasTree(Tree place) {
        this.place = place;
    }

    public void place() {
        this.place.place("PINABET");
        this.place.place("PARSNIP");
        this.place.place("PINE");
        this.place.place("HOLLY");
        this.place.place("BALSAM");
    }

}