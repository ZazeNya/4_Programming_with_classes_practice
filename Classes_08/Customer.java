import java.util.Objects;
public class Customer {
    private int id;
    private String name;
    private String address;
    private int creditCardNumber;
    private int bankAccountNumber;

    public Customer() {
    }

    public Customer (int id, String name, String address, int creditCardNumber, int bankAccountNumber ) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, bankAccountNumber, creditCardNumber, id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        return Objects.equals(address, other.address) && bankAccountNumber == other.bankAccountNumber
                && creditCardNumber == other.creditCardNumber && id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", creditCardNumber="
                + creditCardNumber + ", bankAccountNumber=" + bankAccountNumber + "]";
    }
}
