import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\nWelcome to CleanCorp pay system!");
        String[] itemArray = { "Add an employee", "Give employee pay", "Add a subcontractor", "Pay subcontractor bill",
                "List pays by employee", "List bill by subcontractor", "List all expenses", "Exit" };
        {
            System.out.println("\nSelect an option:");
            System.out.println("\n1- " + itemArray[0]);
            System.out.println("2- " + itemArray[1]);
            System.out.println("3- " + itemArray[2]);
            System.out.println("4- " + itemArray[3]);
            System.out.println("5- " + itemArray[4]);
            System.out.println("6- " + itemArray[5]);
            System.out.println("7- " + itemArray[6]);
            System.out.println("8- " + itemArray[7]);
        }

        s = new Scanner(System.in);
        int i = s.nextInt();

        switch (i) {
            case 1:
                System.out.println("Is it a regular employee?");
                System.out.println("y - Regular Employee");
                System.out.println("n - Sales Employee");

                int choice = getUserChoice();

                switch (choice) {
                    case 1:
                        RegularEmployee regularEmployee = new RegularEmployee(0, null, null, null, null, null, 0);
                        regularEmployee.displayDetails();
                        break;
                    case 2:
                        System.out.print("Enter sales commission rate: ");
                        Scanner scanner;
                        String commission = scanner.nextLine();
                        SalesEmployee salesEmployee = new SalesEmployee(choice, null, null, null, null, null, choice,
                                choice);
                        salesEmployee.displayDetails();
                        break;
                    default:
                        System.out.println("Error! Please select a valid option:");
                }

                // get all information about employee

                // pass collected information to addEmployee

                // save the data to a list

                // google: how to collect data from a user in command line using getter and
                // setter

            case 2:
                addPay();
                break;

            case 3:
                addBill();
                break;

            case 4:
                addSubcontractor();
                break;

            case 5:
                listEmployeePays();
                break;

            case 6:
                listSubcontractorBills();
                break;

            case 7:
                listExpenses();
                break;

            case 8:
                System.out.println("Goodbye!");
                break;

            default:
                System.out.println("Error! Please select a valid option:");
                break;
        }

    }

    private static int getUserChoice() {
        return 0;
    }

    private static void listExpenses() {
    }

    private static void listSubcontractorBills() {
    }

    private static void listEmployeePays() {
    }

    private static void addSubcontractor() {
    }

    private static void addBill() {
    }

    private static void addPay() {
    }

}
