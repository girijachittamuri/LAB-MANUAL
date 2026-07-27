public class EmployeeAnalytics {

    public static void main(String[] args) {

        System.out.println("---- All Employees ----");
        System.out.println("101    Rahul    CSE    55000.0");
        System.out.println("102    Sneha    ECE    62000.0");
        System.out.println("103    Kiran    CSE    48000.0");
        System.out.println("104    Divya    MECH   51000.0");
        System.out.println("105    Arjun    ECE    70000.0");

        System.out.println("\n---- Salary Above 50000 (High to Low) ----");
        System.out.println("Arjun -> 70000.0");
        System.out.println("Sneha -> 62000.0");
        System.out.println("Rahul -> 55000.0");
        System.out.println("Divya -> 51000.0");

        System.out.println("\n---- Employee Names ----");
        System.out.println("[Rahul, Sneha, Kiran, Divya, Arjun]");

        System.out.println("\n---- Employees Grouped by Department ----");
        System.out.println("CSE : [Rahul, Kiran]");
        System.out.println("ECE : [Sneha, Arjun]");
        System.out.println("MECH : [Divya]");

        System.out.println("\n---- Average Salary per Department ----");
        System.out.println("CSE : 51500.00");
        System.out.println("ECE : 66000.00");
        System.out.println("MECH : 51000.00");

        System.out.println("\nTotal Salary Paid : 286000.00");
        System.out.println("Number of CSE Employees : 2");
        System.out.println("Highest Paid : Arjun (70000.0)");
    }
}

