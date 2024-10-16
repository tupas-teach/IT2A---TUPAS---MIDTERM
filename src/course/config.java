
package course;

import java.util.Scanner;


public class Course {

    public static void main(String[] args) {
        String resp;
      
        do {
            ccourse test = new course();
            Scanner sc = new Scanner(System.in);
            
            System.out.println("1. ADD");
            System.out.println("2. VIEW");
            System.out.println("3. UPDATE");
            System.out.println("4. DELETE");
            System.out.println("5. EXIT");
        
            System.out.print("Enter Action: ");
            int action = sc.nextInt();
            
        switch(action){
            case 1:
                test.addRecord();
            break;
            case 2:
                test.viewRecord();
            break;                
            case 3:
                test.viewRecord();
                test.updateRecord();
            break;           
            case 4:
                test.viewRecord();
                test.deleteRecord();
                test.viewRecord();
            break;
        }
            System.out.print("Do you want to Continue?");
            resp = sc.next();
            
        } while (true);
       
    }
    
    public void addRecord(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        
        System.out.print("Enter COURSE_ID: ");
        String sid = sc.next();
        System.out.print("COURSE_NAME: ");
        String  course_name = sc.next();
        System.out.print("Course_code: ");
        String description = sc.next();
        System.out.print ("credits: ");
        String date = sc.next();
        System.out.print("semester: ");
        String grade = sc.next();
        System.out.println("year:");
        String year = sc.nextLine();
        
        String sql = "INSERT INTO dave (COURSE_ID, COURSE_NAME, COURSE_CODE, CREDITS, SEMESTER, YEAR) VALUES (?, ?, ?, ?, ?)";


        conf.addRecord(sql, sid, title, description, date, grade);
    }
    
    public void viewRecord(){
        String qry = "SELECT * FROM Project";
        String[] hdrs = {"Student_ID", "Project Title", "Project Description", "Submission Date", "Grade"};
        String[] clmns = {"Student_ID", "Project_title", "Project_description", "Submission_Date", "Grade"};
        
        config conf = new config();
        
        conf.viewRecords(qry, hdrs, clmns);
    }
    
     public void updateRecord(){
         Scanner sc = new Scanner(System.in);
        
        System.out.print("COURSE_ID: ");
        String sid = sc.next();
        System.out.print("COURSE_NAME: ");
        String course_name = sc.next();
        System.out.print("COURSE_CODE: ");
        String course_code = sc.next();
        System.out.print ("CREDITs: ");
        String dcreditse = sc.next();
        System.out.print("semester: ");
        String semester = sc.next();
         System.out.println("year");
         String year = sc.nextLine();

        
        String qry = " UPDATE Project SET course_ID = ?, course_code = ?, credit= ? , semester = ?, year = ?";

        config conf = new config();
        conf.updateRecord(qry, sid, course_code, credit, semester, year);
    }
     
     public void deleteRecord(){
        Scanner sc = new Scanner (System.in);
        System.out.print("course_ ID to delete: ");
        int id = sc.nextInt();
        
        String qry = "DELETE FROM Project WHERE course_ID = ?";
        
        config conf = new config();
        conf.deleteRecord(qry, id);
                
    }




    
}
