public class Logic {
    public void sortListOfAirlinesByDestination(Airline[] airline) {
        boolean flag = true;
        Airline temp;

        while (flag) {
            for (int i = 0; i < airline.length - 1; i++) {
                flag = false;
                int comparator;
                comparator = airline[i].getDestination().compareTo(airline[i + 1].getDestination());
                if (comparator > 0) {
                    temp = airline[i];
                    airline[i] = airline[i + 1];
                    airline[i + 1] = temp;
                    flag = true;
                }
            }

        }
    }


    public void sortListOfBooksByWeekday(Airline[] airline) {
        boolean flag = true;
        Airline temp;

        while (flag) {
            for (int i = 0; i < airline.length - 1; i++) {
                flag = false;
                int comparator;
                comparator = airline[i].getWeekDay().compareTo(airline[i + 1].getWeekDay());
                if (comparator > 0) {
                    temp = airline[i];
                    airline[i] = airline[i + 1];
                    airline[i + 1] = temp;
                    flag = true;
                }
            }

        }
    }

    public void sortListOfBooksByWeekdayAndTime(Airline[] airline) {
        boolean flag = true;
        Airline temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < airline.length - 1; i++) {
                int comparator;
                comparator = airline[i].getWeekDay().compareTo(airline[i + 1].getWeekDay());
                if (comparator == 0) {
                    if (airline[i].getDepartureTime().compareTo(airline[i + 1].getDepartureTime()) > 0) {
                        temp = airline[i];
                        airline[i] = airline[i + 1];
                        airline[i + 1] = temp;
                        flag = true;
                    }
                } else if (comparator > 0) {
                    temp = airline[i];
                    airline[i] = airline[i + 1];
                    airline[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
