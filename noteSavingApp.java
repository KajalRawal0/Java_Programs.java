import java.util.ArrayList;
import java.util.Scanner;


public class noteSavingApp {
    private static ArrayList<String> notes = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        boolean running = true;

        while(running){
            System.out.println("Note Saving App\n 1. Add notes\n 2. Show notes\n 3. Exit");

            System.out.print("Enter your choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                   addNotes();
                break;
                case 2:
                   showNotes();
                break;
                case 3:
                   running = false;
                   System.out.println("Existing the app...");
                break;
            
                default:
                System.out.println("Invalid choice. Enter correct digit from 1-3.");
                    break;
            }

        }
    }

    public static void addNotes(){
        System.out.print("Enter your note:");
        String note = sc.nextLine();
        notes.add(note);
        System.out.println("Note saved!");
    }

    public static void showNotes(){
        System.out.println("Saved notes!");
        for(int i=0; i<notes.size(); i++){
            System.out.println((i+1)+". "+notes.get(i));
        }
    } 

}
