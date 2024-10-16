
package course;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class course {
//Connection Method to SQLITE
public static Connection connectDB() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC"); // Load the SQLite JDBC driver
            con = DriverManager.getConnection("jdbc:sqlite:dave.db"); // Establish connection
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
        }
        return con;
    }
    private static void addcourse_id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void viewcourse_name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void updatecourse_code() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deletesemester() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addcourse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    String course_name;
int course_id;
int course_code;
double credits_;
int semester;
int year;


    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Select an option:");
            System.out.println("1. add:");
            System.out.println("2. view:");
            System.out.println("3. update:");
            System.out.println("delet:");
            System.out.println("E nter your choice:");
            choice = s.nextInt();
            
        switch (choice){
            
            case 1:
                addcourse();
                System.out.println("course:");
                break;
            case 2:
                viewcourse_name();
                System.out.println("course_name:");
                        break;
            case 3:
                updatecourse_code();
                System.out.println("course_code");
                break;
            case 4:
                deletesemester();
                System.out.println("semester:");
                break;
            case 5:
                System.out.println("Exiting  the course:");
                break;
            default:
                System.out.println("Invalid and error the system!");
                
        }
        
       
        
        
        
        
        System.out.println("course_name:");
        
        String course_name = s.nextLine();
        System.out.println("Enter coursse_id :");
         int course_id = s.nextInt();
         System.out.println("Credits:");
         double credits = s.nextDouble();
         System.out.println("Semester:");
         int semester = s.nextInt();
         System.out.println("Year:");
         int year = s.nextInt();
         System.out.println("\nDo you want to continue? (y/n): ");
        int cont = s.nextInt();
         
        }
        
        
        
