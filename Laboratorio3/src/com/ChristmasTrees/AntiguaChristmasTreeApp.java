package com.ChristmasTrees;

import java.util.*;

public class AntiguaChristmasTreeApp {

    public AntiguaChristmasTreeApp() {
    }

    public static void main(String[] args) {
        
        Tree pinabetTree = new PinabetTree();
        ChristmasTree pinabetBombsDecorator = new BombsDecorator(pinabetTree);
        ChristmasTree pinabetLightsDecorator = new LightsDecorator(pinabetTree);
        ChristmasTree pinabetSlatsDecorator = new SlatsDecorator(pinabetTree);
        ChristmasTree pinabetSnowDecorator = new SnowDecorator(pinabetTree);
        ChristmasTree pinabetStarDecorator = new StarDecorator(pinabetTree);
        pinabetBombsDecorator.place();
        pinabetLightsDecorator.place();
        pinabetSlatsDecorator.place();
        pinabetSnowDecorator.place();
        pinabetStarDecorator.place();
        System.out.println("\n");
        
        Tree parsnipTree = new ParsnipTree();
        ChristmasTree parsnipBombsDecorator = new BombsDecorator(parsnipTree);
        ChristmasTree parsnipLightsDecorator = new LightsDecorator(parsnipTree);
        ChristmasTree parsnipSlatsDecorator = new SlatsDecorator(parsnipTree);
        ChristmasTree parsnipSnowDecorator = new SnowDecorator(parsnipTree);
        ChristmasTree parsnipStarDecorator = new StarDecorator(parsnipTree);
        parsnipBombsDecorator.place();
        parsnipLightsDecorator.place();
        parsnipSlatsDecorator.place();
        parsnipSnowDecorator.place();
        parsnipStarDecorator.place();
        System.out.println("\n");
        
        Tree pineTree = new PineTree();
        ChristmasTree pineBombsDecorator = new BombsDecorator(pineTree);
        ChristmasTree pineLightsDecorator = new LightsDecorator(pineTree);
        ChristmasTree pineSlatsDecorator = new SlatsDecorator(pineTree);
        ChristmasTree pineSnowDecorator = new SnowDecorator(pineTree);
        ChristmasTree pineStarDecorator = new StarDecorator(pineTree);
        pineBombsDecorator.place();
        pineLightsDecorator.place();
        pineSlatsDecorator.place();
        pineSnowDecorator.place();
        pineStarDecorator.place();
        System.out.println("\n");
        
        Tree hollyTree = new HollyTree();
        ChristmasTree hollyBombsDecorator = new BombsDecorator(hollyTree);
        ChristmasTree hollyLightsDecorator = new LightsDecorator(hollyTree);
        ChristmasTree hollySlatsDecorator = new SlatsDecorator(hollyTree);
        ChristmasTree hollySnowDecorator = new SnowDecorator(hollyTree);
        ChristmasTree hollyStarDecorator = new StarDecorator(hollyTree);
        hollyBombsDecorator.place();
        hollyLightsDecorator.place();
        hollySlatsDecorator.place();
        hollySnowDecorator.place();
        hollyStarDecorator.place();
        System.out.println("\n");
        
        Tree balsamTree = new BalsamTree();
        ChristmasTree balsamBombsDecorator = new BombsDecorator(balsamTree);
        ChristmasTree balsamLightsDecorator = new LightsDecorator(balsamTree);
        ChristmasTree balsamSlatsDecorator = new SlatsDecorator(balsamTree);
        ChristmasTree balsamSnowDecorator = new SnowDecorator(balsamTree);
        ChristmasTree balsamStarDecorator = new StarDecorator(balsamTree);
        balsamBombsDecorator.place();
        balsamLightsDecorator.place();
        balsamSlatsDecorator.place();
        balsamSnowDecorator.place();
        balsamStarDecorator.place();
        System.out.println("\n");
        
    }

}