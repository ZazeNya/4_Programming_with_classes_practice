public class Logic {
    public void customersInAlphabeticalOrder(Customer[] customers) {
        boolean flag = true;
        Customer temp;

        while (flag) {
            for (int i = 0; i < customers.length - 1; i++) {
                flag = false;
                int comparator;
                comparator = customers[i].getName().compareTo(customers[i + 1].getName());
                if (comparator > 0) {
                    temp = customers[i];
                    customers[i] = customers[i + 1];
                    customers[i + 1] = temp;
                    flag = true;
                }
            }

        }
    }


    public void sortByCreditCardNumber(Customer[] customers) {
        boolean flag = true;
        Customer temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < customers.length - 1; i++) {
                if (customers[i].getCreditCardNumber() > customers[i + 1].getCreditCardNumber()) {
                    temp = customers[i];
                    customers[i] = customers[i + 1];
                    customers[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
