package sen;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;


public class Doctor {
    
    String shift;
    String name;
    String sector;
    long number;
    
    public Doctor() {
        shift = " ";
        name = " ";
        sector = " ";
        number = 0;
    }
    
    void readDoctor() {
        
        Scanner in = new Scanner(System.in);
       
        boolean result = false;

        while(result == false) {

            System.out.print("\nEnter the doctor's name : ");
            name = in.nextLine();

        Pattern pattern = Pattern.compile("^[a-zA-Z ]*$");
        Matcher matcher = pattern.matcher(name); 


        if(matcher.find())
            result = true;
        else{
            result = false;
        }

        }
        
        System.out.print("Enter the sector that the doctor will work : ");
        sector = in.nextLine();    
        
        
        int f = 0;
        
        do {
            
            f = 0;
            try {
                System.out.print("Enter the doctor's phone number : ");
                number = in.nextLong();     
            } catch (InputMismatchException e) {
                System.out.println("Enter a value that is solely a number");
                f = 1;
            }
             in.nextLine(); // clears the buffer
            } while( f  == 1 );
        

        System.out.print("Enter the kind of shift the doctor will have (whole or half): ");
        shift = in.nextLine(); 
        
        shift = shift.toLowerCase();

        while( !shift.equals("whole") && !shift.equals("half")) {
            
            System.out.print("Wrong input please type whole or half : ");
            shift = in.nextLine();
            shift = shift.toLowerCase();
        
        }
       
    }
    
    long getNumber() {
        return number;
    }
    
    public String toString()
    {
        return  "Name: "+ name + " Sector: "+ sector + " Number: " + number + " Shift: " + shift +"\n";
    }
    
}


