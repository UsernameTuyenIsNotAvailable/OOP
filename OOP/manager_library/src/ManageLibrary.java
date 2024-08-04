import java.util.Scanner;

public class ManageLibrary {
    public static Book[] libraryBooks = new Book[10];
    public static Reader[]  readers = new Reader[4];
    public static ManageBorrowBook[] manageBorrowBooks;

    public static void main(String[] args) {




   }

public static void insertReaderName( String name) {


    readers[0]=new Reader();
    for (int i = 0; i < readers.length; i++) {
        readers[i] = new Reader();
           Reader temp = readers[i];
           readers[i] = readers[(i++)%readers.length];
           readers[(i++)%readers.length] = temp;
        if( readers[i]==null){
            System.out.println("thay null");
            readers[i] = new Reader();

            System.out.println( readers[i]);
            break;
            }

        else {
            System.out.println("chua thay null");
            System.out.println(readers[i]);



        }
    }

    }

            }




















