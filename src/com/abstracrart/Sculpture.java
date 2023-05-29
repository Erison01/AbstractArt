package com.abstracrart;

public class Sculpture extends Art{

    String material;

    public Sculpture(String title, String author, String description, String material) {
        super(title, author, description);
        this.material = material;
    }

    @Override
    public void viewArt() {
        System.out.println("Title of Paint: " + title);
        System.out.println("Author of Paint: " + author);
        System.out.println("Description of Paint: " + description);
        System.out.println("Material of Paint: " + material);
        System.out.println();
    }
}
