public class Logic {
    public void sortListOfBooksByAuthor(Book[] librery) {
        boolean flag = true;
        Book temp;

        while (flag) {
            for (int i = 0; i < librery.length - 1; i++) {
                flag = false;
                int comparator;
                comparator = librery[i].getAuthor().compareTo(librery[i + 1].getAuthor());
                if (comparator > 0) {
                    temp = librery[i];
                    librery[i] = librery[i + 1];
                    librery[i + 1] = temp;
                    flag = true;
                }
            }

        }
    }


    public void sortListOfBooksByPublishing(Book[] librery) {
        boolean flag = true;
        Book temp;

        while (flag) {
            for (int i = 0; i < librery.length - 1; i++) {
                flag = false;
                int comparator;
                comparator = librery[i].getPublishing().compareTo(librery[i + 1].getPublishing());
                if (comparator > 0) {
                    temp = librery[i];
                    librery[i] = librery[i + 1];
                    librery[i + 1] = temp;
                    flag = true;
                }
            }

        }
    }

    public void sortListOfBooksPublishingByYear(Book[] librery) {
        boolean flag = true;
        Book temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < librery.length - 1; i++) {
                if (librery[i].getYearOfPublishing() > librery[i + 1].getYearOfPublishing()) {
                    temp = librery[i];
                    librery[i] = librery[i + 1];
                    librery[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
