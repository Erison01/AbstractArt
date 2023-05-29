package com.abstracrart;

import java.util.ArrayList;

import java.util.Collections;

public class Museum {
    public static void main(String[] args) {

        Painting p = new Painting("Paint","Jon","The Paint","Oil");
        Painting p1 = new Painting("Paint1","Ben","The Paint1","Watercolor");
        Painting p2 = new Painting("Paint2","Jane","The Paint2","Acrylic");

        Sculpture s = new Sculpture("Sculpture","Adam","The Sculpture","Bronze");
        Sculpture s1 = new Sculpture("Sculpture1","Sam","The Sculpture1","Porcelain");

        ArrayList<Art>museum = new ArrayList<>();

        museum.add(p);
        museum.add(p1);
        museum.add(p2);
        museum.add(s);
        museum.add(s1);


        Collections.shuffle(museum);

       for (Art art : museum){
            art.viewArt();
        }
    }
}
