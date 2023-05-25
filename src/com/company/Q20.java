package com.company;

public class Q20 {
    public static void main(String[] args) {

    }
}

class VideoTape{
    protected String title;
    protected int length;
    protected boolean available;

    public VideoTape(String title, int length, boolean available) {
        this.title = title;
        this.length = length;
        this.available = available;
    }

    public void show(){
        System.out.println("Title :" + title);
        System.out.println("Length : " + length);
        System.out.println("Available : " + available);
    }
}

class Movie extends VideoTape{
    private String director;
    private int rating;

    public Movie(String title, int length, boolean available, String director, int rating) {
        super(title, length, available);
        this.director = director;
        this.rating = rating;
    }

    public void show(){
        System.out.println("Title :" + title);
        System.out.println("Length : " + length);
        System.out.println("Available : " + available);
        System.out.println("Director : " + director);
        System.out.println("Rating : " + rating);
    }
}

class MusicVideo extends VideoTape{
    private String artist;
    private String category;

    public MusicVideo(String title, int length, boolean available, String artist, String category) {
        super(title, length, available);
        this.artist = artist;
        this.category = category;
    }

    public void show(){
        System.out.println("Title :" + title);
        System.out.println("Length : " + length);
        System.out.println("Available : " + available);
        System.out.println("Artist : " + artist);
        System.out.println("Category : " + category);
    }
}

