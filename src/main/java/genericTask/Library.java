package genericTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library<Generic> {
    private Generic book;
    private Generic newspaper;
    private Generic video;
    Scanner scanner=new Scanner(System.in);
    public Library(Generic book, Generic newspaper, Generic video) {

        this.book = book;
        this.newspaper = newspaper;
        this.video = video;
    }

    public Generic getBook() {
        return book;
    }

    public void setBook(Generic book) {
        this.book = book;
    }

    public Generic getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(Generic newspaper) {
        this.newspaper = newspaper;
    }

    public Generic getVideo() {
        return video;
    }

    public void setVideo(Generic video) {
        this.video = video;
    }
    public List<Generic> books=new ArrayList<>();

}
