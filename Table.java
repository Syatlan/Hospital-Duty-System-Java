package sen;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;




public class Table extends Doctor {
    
    
        
    private ArrayList <Doctor> Monday;
    private ArrayList <Doctor> Tuesday;
    private ArrayList <Doctor> Wednesday;
    private ArrayList <Doctor> Thursday;
    private ArrayList <Doctor> Friday;
    private ArrayList <Doctor> Saturday;
    private ArrayList <Doctor> Sunday;
    
    Table() {
        Monday = new ArrayList<>();
        Tuesday = new ArrayList<>();
        Wednesday = new ArrayList<>();
        Thursday = new ArrayList<>();
        Friday = new ArrayList<>();
        Saturday = new ArrayList<>();
        Sunday = new ArrayList<>();
    }
    
    void CreateTable() {
        
        Scanner in = new Scanner(System.in);
        
        int i,n = 0;
        
        //for Monday
        
        System.out.print("\nHow many doctors will there be on Monday? Also please enter their information below:");
        n = in.nextInt();    
        
        for( i = 0; i < n; i++ ){
            Doctor d = new Doctor();
            d.readDoctor();
            Monday.add(d);
        }
        
        // for Tuesday
        
        System.out.print("\nHow many doctors will there be on Tuesday? Also please enter their information below:");
        n = in.nextInt();    
        
        for( i = 0; i < n; i++ ){
            Doctor d = new Doctor();
            d.readDoctor();
            Tuesday.add(d);
        }
        
        //for Wednesday
        
        System.out.print("\nHow many doctors will there be on Wednesday? Also please enter their information below:");
        n = in.nextInt();    
        
        for( i = 0; i < n; i++ ){
            Doctor d = new Doctor();
            d.readDoctor();
            Wednesday.add(d);
        }
       
        //for Thursday
        
        System.out.print("\nHow many doctors will there be on Thursday? Also please enter their information below:");
        n = in.nextInt();    
        
        for( i = 0; i < n; i++ ){
            Doctor d = new Doctor();
            d.readDoctor();
            Thursday.add(d);
        }
        
        //for Friday
        
        System.out.print("\nHow many doctors will there be on Friday? Also please enter their information below:");
        n = in.nextInt();    
        
        for( i = 0; i < n; i++ ){
            Doctor d = new Doctor();
            d.readDoctor();
            Friday.add(d);
        }
        
        //for Saturday
        
        System.out.print("\nHow many doctors will there be on Saturday? Also please enter their information below:");
        n = in.nextInt();    
        
        for( i = 0; i < n; i++ ){
            Doctor d = new Doctor();
            d.readDoctor();
            Saturday.add(d);
        }
        
        //for Sunday
        
        System.out.print("\nHow many doctors will there be on Sunday? Also please enter their information below:");
        n = in.nextInt();    
        
        for( i = 0; i < n; i++ ){
            Doctor d = new Doctor();
            d.readDoctor();
            Sunday.add(d);
        }
        
        
    }
    
    public void EditTable() {
        
        Scanner in = new Scanner(System.in);
        
        String dayToEdit = " ";
        long editNumber = 0;
        
        System.out.println("Which day do you want to edit ?");
        dayToEdit = in.nextLine();
        
        System.out.println("Please enter the doctor's phone number you want to edit : ");
        editNumber = in.nextLong();
        
        switch(dayToEdit) {
            
            case "Monday":
                for(Doctor i:Monday) {
                    if(i.getNumber() == editNumber){
                        i.readDoctor();
                    }
                }
               break;
               
            case "Tuesday":
                for(Doctor i:Tuesday) {
                    if(i.getNumber() == editNumber){
                        i.readDoctor();
                    }
                }
                break;
               
             case "Wednesday":
                for(Doctor i:Wednesday) {
                    if(i.getNumber() == editNumber){
                        i.readDoctor();
                    }
                }
                break;
                
             case "Thursday":
                for(Doctor i:Thursday) {
                        i.readDoctor();
                    if(i.getNumber() == editNumber){
                    }
                }
                break;
                
            case "Friday":
                for(Doctor i:Friday) {
                    if(i.getNumber() == editNumber){
                        i.readDoctor();
                        }
                    }
               break;
            
            case "Saturday":
                for(Doctor i:Saturday) {
                    if(i.getNumber() == editNumber){
                        i.readDoctor();
                    }
                }
                break;
            
            case "Sunday":
                for(Doctor i:Sunday) {
                    if(i.getNumber() == editNumber){i.readDoctor();
                        }
                    }
                break;
                
             default :
                 System.out.println("Wrong day please try again...");
                 break;
        }
        
    }
    
    public void Print() {
        
        System.out.println(toString());
        
        try {  
            FileWriter myWriter = new FileWriter("SEN.txt");
            myWriter.write(this.toString());
            myWriter.close();
            System.out.println("\nThe programme has successfully been exported to the file \'SEN.txt\'.");
       } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
        
        
    }
    
    public String toString()
    {
        
        String allDays = "\n Monday\n";
        for (Doctor i:Monday) 
            allDays = allDays + i.toString();
        
        allDays = allDays + "\n Tuesday:\n";
        for (Doctor i:Tuesday) 
            allDays = allDays + i.toString();
        
        allDays = allDays + "\n Wednesday:\n";
        for (Doctor i:Wednesday) 
            allDays = allDays + i.toString();
        
        allDays = allDays + "\n Thursday:\n";
        for (Doctor i:Thursday) 
            allDays = allDays + i.toString();
        
        allDays = allDays + "\n Friday:\n";
        for (Doctor i:Friday) 
            allDays = allDays + i.toString();
        
        allDays = allDays + "\n Saturday:\n";
        for (Doctor i:Saturday) 
            allDays = allDays + i.toString();
        
        allDays = allDays + "\n Sunday:\n";
        for (Doctor i:Sunday) 
            allDays = allDays + i.toString();
        
        return  "Current week's program: \n" + allDays;
        
    }
    
    void DeleteTable() {
    
        Scanner in = new Scanner(System.in);
        
                
        String del =  " ";
        
        
        System.out.print("\nAre you sure you want to delete all data ? ");

        del = in.nextLine();
        
        while( !del.equals("yes") && !del.equals("no")) {
            
            System.out.print("\nType \"yes\" if you want to delete all data or \"no\" if you want to return to the Menu: ");

            del = in.nextLine();
        
        }
        
        if(del .equals("yes")) {
       
            Monday.clear();
            Tuesday.clear();
            Wednesday.clear();
            Thursday.clear();
            Friday.clear();
            Saturday.clear();
            Sunday.clear();
        
            System.out.print("\nDeleting Table... ");
        }
        else if (del.equals("no")) {
            System.out.print("\nReturning to Menu... ");
        }
    
    }
    
    
}











