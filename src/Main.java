import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your command");
        Scanner Input = new Scanner(System.in);
        String query = Input.nextLine();
        query=query.trim();
        if(query.isEmpty()==true) {
            System.out.println("Invalid input");
        }
        else {
            System.out.println("ok searching.........");
        }




        }
    }
