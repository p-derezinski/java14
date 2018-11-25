package pl.sdacademy.java14poz.wlasneprogramy;

import java.util.ArrayList;
import java.util.List;

public class AlbumChristmas {

    private List<Song> listOfChristmasSongs;

    public AlbumChristmas() {
        this.listOfChristmasSongs = new ArrayList<Song>();
        Song song1 = new Song("Silent Night", "Mahalia Jackson");
        Song song2 = new Song("Christmas in New Orleans", "Louis Armstrong");
        Song song3 = new Song("Let it Snow!", "Dean Martin");
        Song song4 = new Song("White Christmas", "Bing Crosby");
        Song song5 = new Song("Little Drummer Boy", "Rosemary Clooney");
        Song song6 = new Song("Adeste Fideles", "Bing Crosby");
        Song song7 = new Song("Santa Claus is Comin' to Town", "Frank Sinatra");
        Song song8 = new Song("O Little Town of Bethlehem", "Mahalia Jackson");
        Song song9 = new Song("Rudolph the Red Nosed Reindeer", "Dean Martin");
        Song song10 = new Song("Joy to the World", "Mario Lanza");
        this.listOfChristmasSongs.add(song1);
        this.listOfChristmasSongs.add(song2);
        this.listOfChristmasSongs.add(song3);
        this.listOfChristmasSongs.add(song4);
        this.listOfChristmasSongs.add(song5);
        this.listOfChristmasSongs.add(song6);
        this.listOfChristmasSongs.add(song7);
        this.listOfChristmasSongs.add(song8);
        this.listOfChristmasSongs.add(song9);
        this.listOfChristmasSongs.add(song10);
    }

    public void playSong() {
        int losowa = (int) (Math.random() * this.listOfChristmasSongs.size());
        Song song = this.listOfChristmasSongs.get(losowa);
        System.out.println(" \u23F5  \u266A\u266B  Playing " + song);
    }
}
