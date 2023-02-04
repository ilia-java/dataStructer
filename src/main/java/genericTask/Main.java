package genericTask;

public class Main {
    public static void main(String[] args) {
        Library<String> contents =new Library<>("scary","action","interesting");
        System.out.println("Genres in library:");
        System.out.println(contents.getBook());
        System.out.println(contents.getNewspaper());
        System.out.println(contents.getVideo());
    }
}
