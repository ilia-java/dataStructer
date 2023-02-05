package genericTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please select something you like:\n " + " 1. Books\n2. Newspaper\n3. video");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Books<Integer> titanic = new Books<>(65, 120, 43, "Titanic");
                System.out.println("Book name:" + titanic.getName());
                System.out.println("Likes:" + titanic.getPrice());
                System.out.println("Price:" + titanic.getLike());
                System.out.println("Dislikes:" + titanic.getDisLike());

                Books<String> harryPotter = new Books<>(56, "90$", 28, "harry potter");
                System.out.println("Book name :" + harryPotter.getName());
                System.out.println("Likes:" + harryPotter.getLike());
                System.out.println("Price:" + harryPotter.getPrice());
                System.out.println("Dislikes:" + harryPotter.getDisLike());
                System.out.println("Which book do you borrow?\nplease choice with inserting number");
                int insert = scanner.nextInt();
                switch (insert) {
                    case 1:
                        System.out.println("Ok,yuo can pay and borrowed");
                        break;
                    case 2:
                        System.out.println("We are so sorry,we cant lend this book to you");
                }
                break;
            case 2:
                Newspaper<Integer> TheNewYorkTimes = new Newspaper(12, 65, 7, "The New York Times");
                System.out.println("NewspaperName:" + TheNewYorkTimes.getName());
                System.out.println("Likes:" + TheNewYorkTimes.getLike());
                System.out.println("Price:" + TheNewYorkTimes.getPrice());
                System.out.println("Dislikes:" + TheNewYorkTimes.getDisLike());

                Newspaper<String> shargh = new Newspaper<>(4, "5000ريال", 2, "shargh");
                System.out.println("NewspaperName:" + shargh.getName());
                System.out.println("Likes:" + shargh.getLike());
                System.out.println("Price:" + shargh.getPrice());
                System.out.println("Dislikes:" + shargh.getDisLike());
                System.out.println("Which newspaper do you borrow?\nplease choice with inserting number");

                int insert2 = scanner.nextInt();
                switch (insert2) {
                    case 1:
                        System.out.println("We are so sorry,we cant lend this book to you");
                        break;
                    case 2:
                        System.out.println("Ok,yuo can pay and borrowed");
                        break;
                }
                break;
            case 3:
                Video<Boolean> titanicMovie = new Video<>(3000, "320$", 900, "titanicMovie");
                System.out.println("Movie name:" + titanicMovie.getName());
                System.out.println("Likes:" + titanicMovie.getLike());
                System.out.println("Price:" + titanicMovie.getPrice());
                System.out.println("Dislike:" + titanicMovie.getDisLike());

                Video<Float> harryPotterMovie = new Video<>(4300, "700$", 900, "harryPotterMovie");
                System.out.println("Movie name:" + harryPotterMovie.getName());
                System.out.println("Likes:" + harryPotterMovie.getLike());
                System.out.println("Price:" + harryPotterMovie.getPrice());
                System.out.println("Dislikes:" + harryPotterMovie.getDisLike());
                System.out.println("Which video do you borrow?\nplease choice with inserting number");

                int insert3 = scanner.nextInt();
                switch (insert3) {
                    case 1:
                        System.out.println("We are so sorry,we cant lend this book to you");
                        break;
                    case 2:
                        System.out.println("Ok,yuo can pay and borrowed");
                        break;
                }
        }
    }
}