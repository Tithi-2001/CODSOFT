import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SMS {
   public static void main(String[] args){
        Student_Management_System sys =new Student_Management_System() ;
        System.out.println("----------------Student Management System-------------");
       
    
    while(true){
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        
            switch(choice){
            case 1: sys.add_New_Student();
                    break;
            case 2: sys.edit_Student_data();
                    break;
            case 3: sys.remove_Student();
                    break;
            case 4: sys.search_Student();
                    break;
            case 5: sys.display_All_Student();
                    break;
            case 6: System.exit(0);
            }


}
   } 
}
class Student {
    String name;
    int rollNo;
    String course;
    String grade;
    String address;
    
    Student(){}

    public Student(String name,int rollNo,String course,String grade,String address){
    this.name=name;
    this.rollNo=rollNo;
    this.course=course;
    this.grade=grade;
    this.address=address;
}

    public void setName(String newName){
        this.name=newName;
    }
    public String  getName(){
          return name;
    }
    public void setRoll(int newRoll){
        this.rollNo=newRoll;
    }
    public int getRoll(){
        return rollNo;
    }
    public void setCourse(String newCourse){
        this.course=newCourse;
    }
    public String getCourse(){
        return course;
    }
    public void setGrade(String newGrade){
        this.grade=newGrade;
    }
    public String getGrade(){
        return grade;
    } 
    public void setAddress(String newAddress){
        this.address=newAddress;
    }
    public String getAddress(){
        return address;
    }
}

class Student_Management_System {
    
        ArrayList<Student> list;
        
       Student_Management_System(){
        list=new ArrayList<Student>();
       }
    
    public void add_New_Student(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
            
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
                    
        System.out.print("Enter Course: ");
        String course = sc.next();

        System.out.print("Enter Grade: ");
        String grade = sc.next();

        System.out.print("Enter Address: ");
        String Address= sc.next();       

        Student sys=new Student(name, rollNo, course, grade, Address);   
        list.add(sys);
            
        System.out.println("Student is added succesfully");
          
    }
    public void edit_Student_data(){
        System.out.println("Enter Student Roll:");
        Scanner sc=new Scanner(System.in);
        int roll= sc.nextInt();
        
        boolean found = false;
        
        for (Student sys : list) {
            if (sys.rollNo==roll) {
                found = true;
                
                System.out.println("What do you want to update?");
                System.out.println("1. Roll");
                System.out.println("2. Course");
                System.out.println("3. Grade");
                System.out.println("4. Name");
                System.out.println("5. Address");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // Consume the newline left in the buffer
                
                switch (choice) {
                    case 1:
                        System.out.print("New Roll: ");
                        int newRoll = sc.nextInt();
                        sys.setRoll(newRoll);
                        break;
                    case 2:
                        System.out.print("New Course: ");
                        String newCourse = sc.nextLine();
                        sys.setCourse(newCourse);
                        break;
                    case 3:
                        System.out.print("New Grade: ");
                        String newGrade = sc.nextLine();
                        sys.setGrade(newGrade);
                        break;
                    case 4:
                        System.out.print("New Name: ");
                        String newName = sc.nextLine();
                        sys.setName(newName);
                        break;
                    case 5:
                        System.out.print("New Address: ");
                        String newAddress = sc.nextLine();
                        sys.setAddress(newAddress);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }
            break;
        }
         if (!found) {
        System.out.println("Student not found.");
            }
    }

    }
    public void remove_Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Roll:");
        int Roll = sc.nextInt();
    
        boolean removed = false;
    
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
        Student sys = iterator.next();
        if (sys.rollNo==Roll) {
            iterator.remove();
            removed = true;
            break;
        }
    }
    
        if (removed) {
            System.out.println("Student is removed successfully.");
    }   else {
            System.out.println("Student is not present.");
    }     
    }
    
    public void search_Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Roll:");
        int roll=sc.nextInt();
        Student sys=null;
        for(Student stud:list){
            if(stud.getRoll()==roll){
                sys=stud;
                break;
            }
        }
        if(list.contains(sys)){
            System.out.println("Student id present in class.");
            System.out.println("----------------------------");
            System.out.println("Name: " + sys.getName());
            System.out.println("Roll No: " + sys.getRoll());
            System.out.println("Course " + sys.getCourse());
            System.out.println("Grade " + sys.getGrade());
            System.out.println("Address " + sys.getAddress());
        }
        else{
            System.out.println("Student is not present in class.");
        }   
    }

    public void display_All_Student(){
         for (Student sys : list) {
                        System.out.println("Name: " + sys.getName());
                        System.out.println("Roll No: " + sys.getRoll());
                        System.out.println("Course " + sys.getCourse());
                        System.out.println("Grade " + sys.getGrade());
                        System.out.println("Address " + sys.getAddress());

                        System.out.println("-------------------");
    }
    }
    public void exit(){
        System.exit(0);
    }

}


