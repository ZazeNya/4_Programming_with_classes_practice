import java.util.Arrays;
public class Airlines {
    private Airline[] airline;

    private final static int LENGTH_OF_ARRAY = 5;

    public Airlines() {
        airline = new Airline[LENGTH_OF_ARRAY];
    }

    public Airline[] getAirline() {
        return airline;
    }

    public static int getLengthOfArray() {
        return LENGTH_OF_ARRAY;
    }

    public Airline[] addAirline(Airline flight1, Airline flight2, Airline flight3, Airline flight4, Airline flight5) {

        airline[0] = flight1;
        airline[1] = flight2;
        airline[2] = flight3;
        airline[3] = flight4;
        airline[4] = flight5;

        return airline;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(airline);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airlines other = (Airlines) obj;
        return Arrays.equals(airline, other.airline);
    }

    @Override
    public String toString() {
        return "Самолет [самолет: " + Arrays.toString(airline) + "]";
    }
}
