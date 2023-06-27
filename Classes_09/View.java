public class View {
    public void printAuthor(Book[] librery) {
        for (Book b : librery) {

            if ( ((b.getAuthor().equals("Cay Horstmann")))) {
                System.out.println(b);
            }
        }

        System.out.println(
                "_____________________________"
        );
    }

    public void printPublishing(Book[] librery) {
        for (Book b : librery) {

            if ( ((b.getYearOfPublishing() > 2015))) {
                System.out.println(b);
            }
        }

        System.out.println(
                "_____________________________"
        );
    }
}
