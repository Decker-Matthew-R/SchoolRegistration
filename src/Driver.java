//Import required dependancies
import java.util.*;

public class Driver {

    public void mainMenu(){

        //Declare Array of All Students
        Student[] students =new Student[50];

        //Declare Variables

        int studentIndex = 0;

        //create scanner object
        Scanner sc = new Scanner(System.in);


        //Create Menu
        boolean flag = false;
        do{
            int selection;
            do {
                System.out.println(" ");
                System.out.println("Welcome to StudentAdmin");
                System.out.println(" ");
                System.out.println("""
                        Please Select Options:
                        1. Create Students
                        2. Add/Drop Classes
                        """);
                System.out.print("Selection: ");
                selection = sc.nextInt();
                sc.nextLine();

                //if statement to validate response
                if (selection < 1 || selection > 5) {
                    System.out.println(" ");
                    System.out.println("Invalid Response Option");

                }
            }
            while(selection < 1 || selection > 5);

            //Switch statement to route menu options
            switch(selection){
                case 1 -> {


                    System.out.println(" ");
                }
                case 2 -> System.out.println("2");
            }

        }
        while(flag);
    }

    public void addStudent(){

        //scanner object
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("Add Student");
            System.out.println(" ");

            //Student input options
            System.out.print("Enter Student First Name:");
            String fname = sc.nextLine();
            System.out.print("Enter Student First Name:");
            String lname = sc.nextLine();
            System.out.println("Enter Student Year(1-4): ");
            int year = sc.nextInt();

            //Add student via constructor
            Student student = new Student(fname, lname,)                 /////////////////LEFT OFF HERE


        }
        while(repition);




        System.out.println(" ");
    }
}
