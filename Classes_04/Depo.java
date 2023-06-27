import java.util.Arrays;
public class Depo {

    private Train[] trains;

    private final static int LENGTH_OF_ARRAY = 5;

    public Depo() {
        trains = new Train[LENGTH_OF_ARRAY];
    }

    public Train[] getTrains() {
        return trains;
    }

    public static int getLengthOfArray() {
        return LENGTH_OF_ARRAY;
    }

    public Train[] addTrains(Train t1, Train t2, Train t3, Train t4, Train t5) {
        trains[0] = t1;
        trains[1] = t2;
        trains[2] = t3;
        trains[3] = t4;
        trains[4] = t5;
        return trains;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(trains);
        return result;
    }

    @Override
    public boolean equals (Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Depo))
            return false;
        Depo other = (Depo)obj;
        if (!Arrays.equals(trains, other.trains))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[поезда = " + trains + "]";
    }
}
