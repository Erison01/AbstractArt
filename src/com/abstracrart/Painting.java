package com.abstracrart;

public class Painting extends Art{

    String paintType;

    public Painting(String title, String author, String description, String paintType) {
        super(title, author, description);
        this.paintType = paintType;
    }

    @Override
    public void viewArt() {
        System.out.println("Title of Paint: " + title);
        System.out.println("Author of Paint: " + author);
        System.out.println("Description of Paint: " + description);
        System.out.println("PaintType of Paint: " + paintType);
        System.out.println();

    }
}
