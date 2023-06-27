import java.util.Date;
public class Train {
    private String destination;
    private int trainNumber;
    private String departureTime;

    public Train() {
        destination = null;
        trainNumber = 0;
        departureTime = null;
    }

    public Train (String place, int number, String time) {
        destination = place;
        trainNumber = number;
        departureTime = time;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + trainNumber;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Train))
            return false;
        Train other = (Train) obj;
        if (departureTime == null) {
            if (other.departureTime.equals(other.departureTime))
                return false;
        } else if (!departureTime.equals(other.departureTime))
            return false;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (trainNumber != other.trainNumber)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[пункт назначения = " + getDestination() + ", номер поезда = " + getTrainNumber()
                + ", время отправления = " + getDepartureTime() + "]";
    }


    public void sortByNumber(Train[] trains) {
        boolean flag = true;
        Train temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getTrainNumber() > trains[i + 1].getTrainNumber()) {
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    public static boolean findByNumber(Train[] trains, int number) {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getTrainNumber() == number) {
                return true;
            }
        }
        System.out.println("Поезда с таким номером не существует");
        System.out.println();
        return false;
    }

    public void sortByDestination(Train[] trains) {
        boolean flag = true;
        Train temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < trains.length - 1; i++) {
                int comparator;
                comparator = trains[i].getDestination().compareTo(trains[i + 1].getDestination());
                if (comparator == 0) {
                    if (trains[i].getDepartureTime().compareTo(trains[i + 1].getDepartureTime()) > 0) {
                        temp = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = temp;
                        flag = true;
                    }
                } else if (comparator > 0) {
                    temp = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
    public void printTrain(Train[] trains) {
        for (Train t : trains) {
            System.out.println(t);
        }
    }
    public void printByNumber(Train[] trains, int number) {
        for (Train t : trains) {
            if (t.getTrainNumber() == number) {
                System.out.println(t + " ");
                break;
            }
        }
    }

    public static void printTrainNumber(Train train) {
        System.out.println(train.getTrainNumber() + " ");
    }
}
