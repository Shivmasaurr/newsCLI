import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your command");
        Scanner Input = new Scanner(System.in);
        String query = Input.nextLine();
        query=query.trim();
        Properties prop = new Properties();
        String apikey;
        try{
            FileInputStream fis = new FileInputStream("config.properties");
            prop.load(fis);
            apikey = prop.getProperty("API_KEY");
        }catch (IOException e) {
            System.out.println("Error loading config: " + e.getMessage());
            return;
        }
        if(query.isEmpty()==true) {
            System.out.println("Invalid input");
        }
        else {
            System.out.println("ok searching.........");
            Newsfetcher fetch= new Newsfetcher();
            try {
                fetch.fetchnews(query, apikey);
            } catch (Exception e) {
                System.out.println("Error fetching news: " + e.getMessage());
            }

        }





        }
    }
