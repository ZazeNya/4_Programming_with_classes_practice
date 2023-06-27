public class View {
    public void printCustomer(Customer[] customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }

        System.out.println(
                "____________________________"
        );
    }

    public void printCustomerbyCreditCard(Customer[] customers) {
        for (Customer c : customers) {

            if (200000 < c.getCreditCardNumber() && c.getCreditCardNumber() < 300000) {
                System.out.println(c);
            }

        }

        System.out.println(
                "____________________________"
        );
    }
}
