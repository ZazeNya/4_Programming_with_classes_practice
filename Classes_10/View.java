public class View {
    public void printByDestination(Airline[] airline) {
        for (Airline p : airline) {

            if ( ((p.getDestination().equals("Париж")))) {
                System.out.println(p);
            }
        }

        System.out.println(
                "_____________________________________________________________________________________________________________________________________________________________________________________"
        );
    }

    public void printByWeekday(Airline[] airline) {
        for (Airline p : airline) {

            if ( ((p.getWeekDay().equals("вторник")))) {
                System.out.println(p);
            }
        }

        System.out.println(
                "__________________________________"
        );
    }

    public void printByTime(Airline[] airline) {


        for (Airline p : airline) {

            if (p.getDepartureTime().compareTo("07:00") > 0) {
                System.out.println(p);
            }
        }

        System.out.println(
                "__________________________________"
        );
    }
}
