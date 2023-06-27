import java.util.Arrays;
public class Customers {
    private Customer[] customers;

    private final static int LENGTH_OF_ARRAY = 5;

    public Customers() {
        customers = new Customer[LENGTH_OF_ARRAY];
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public static int getLengthOfArray() {
        return LENGTH_OF_ARRAY;
    }

    public Customer[] addCustomers(Customer c1, Customer c2, Customer c3, Customer c4,Customer c5) {
        customers[0] = c1;
        customers[1] = c2;
        customers[2] = c3;
        customers[3] = c4;
        customers[4] = c5;
        return customers;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(customers);
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
        Customers other = (Customers) obj;
        return Arrays.equals(customers, other.customers);
    }

    @Override
    public String toString() {
        return "Customers [customers=" + Arrays.toString(customers) + "]";
    }
}
