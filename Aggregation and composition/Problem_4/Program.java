package study;
import java.io.*;
import static study.DataBase.*;
/* Задача 4
    Счета. Клиент может иметь несколько счетов в банке.
    Учитывать возможность блокировки/разблокировки счета.
    Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
    Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
    */
public class Program {
    private static int readNumberAccount(BufferedReader reader) throws IOException {
        int numAcc = 0;
        while (true) {
            System.out.print("Введите номер счёта: #");
            numAcc = Integer.parseInt(reader.readLine());
            break;
        }
        return numAcc;
    }
    private static int readAmountMoney(BufferedReader reader) throws IOException {
        System.out.print("Введите сумму денег для снятия со счета: ");
        int amountMoney = Integer.parseInt(reader.readLine());
        return amountMoney;
    }
    private static void printFoundAccount(Account account) {
        if (account != null) {
            System.out.println(account.toString());
        }
    }
    private static void withdrawMoneyAccount(Account account, int amountMoney) {
        if (account != null) {
            account.withdraw(amountMoney);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Client client = new Client(1007, "Алексеев Алексей Алексеевич", accounts);
        int numAcc = readNumberAccount(reader);
        int amountMoney = readAmountMoney(reader);
        Account foundAccount = searchAccountByNumber(numAcc, client);
        printFoundAccount(foundAccount);
        withdrawMoneyAccount(foundAccount, amountMoney);
        System.out.println();
        System.out.println("Счета клиента '" + client.getName() + "' отсортированы по возрастанию номера:");
        sortAccountsByNumber(client);
        printAccount(client);
        System.out.println();
        System.out.println("Счета клиента '" + client.getName() + "' отсортированы по возрастанию баланса:");
        sortAccountsByBalance(client);
        printAccount(client);
        System.out.println();
        System.out.println("Сумма на счетах: " + sumMoney(client) + " у.е.");
        System.out.println("Сумма на счетах c положительным балансом: " + sumMoneyPositive(client) + " у.е.");
        System.out.println("Сумма на счетах с отрицательным балансом: " + sumMoneyNegative(client) + " у.е.");
        System.out.println(client.toString());
        }
}
