
import java.util.Scanner;

public class Main {
    public static int id =100000;
    public static void main(String[] args) {
        boolean isExist =false;
        Reader reader = new Reader();
        Book books = new Book();
        System.out.println("Please enter 1 if you want add : ");
        System.out.println("Please enter 2 if you want show that : ");

        while (!isExist) {

            System.out.println("Please enter the number do you want to search for: ");

            if (
                   new Scanner(System.in).nextLine().equals("1")


            ) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Name : ");
                String userName = scanner.nextLine();
                reader.name = userName;




                Scanner scanner1 = new Scanner(System.in);
                System.out.print("address :");
                String userName1 = scanner1.nextLine();
                reader.address = userName1;


                Scanner scanner3 = new Scanner(System.in);
                System.out.print("Phone Number : ");
                int userName3 = scanner3.nextInt();
                reader.phoneNumber = userName3;

                Scanner scanner4 = new Scanner(System.in);
                System.out.print("Type : ");
                String type = scanner4.nextLine();
                reader.type = type;


                 id++;
                System.out.println(id);

                ManageLibrary.insertReaderName(reader.type);
                System.out.println();

            }

             else if (new Scanner(System.in).nextLine().equals("2")) {

            }





             else  {   isExist =true;}
        }
        }}









