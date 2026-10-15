package sen;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Menu {
    


    public Menu() {

    }
    
   boolean verify(String up, String x) {

        if (up.equals(x) ) {
	return true;
        }
	
        return false;
    }
    
  
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
         Management pin = new Management();        
         Menu menu = new Menu();       
         

        String up = " ";
        String x = pin.getPassword();



        System.out.print("Enter password : ");
        up = in.nextLine();


        while(menu.verify(up, x) == false ) {
            
            System.out.print("Wrong password ! Please try again : ");
            up = in.nextLine();
           
        }

        
        Table t = new Table();


        
        int selection = 0;
        
        System.out.println("Choose one of the five actions below. Press the corresponding number for each function to choose it:");
        
        
        System.out.print("\n1) Create Table \n2) Edit Table \n3) Print Table\n4) Delete Table\n5) Exit\n ");
        

        
        int f = 0;
        
        do {
            
            f = 0;
            try {
                System.out.print("\n--> ");
                selection = in.nextInt();  
            } catch (InputMismatchException e) {
                System.out.println("Entered value is not an int");
                f = 1;
            }
             in.nextLine(); // clears the buffer
            } while( f  == 1 );
       
        while ( selection <1 || selection >5 ) {
            System.out.print("\nInput doesn't match with the corresponding numbers. Please enter a number that is between 1 and 5: ");
            selection = in.nextInt();  
        }
        
      while(selection != 6) {
          
          if(selection == 1) {
              t.CreateTable();
          }
          
          else if (selection == 2) {
              t.EditTable();
          }
          
          else if (selection == 3 ) {
              t.Print();
          }
          
          else if (selection == 4 ) {
              t.DeleteTable();
          }
          
          else if (selection == 5 ) {
              System.out.println("\nExiting SEN...");
              System.exit(0);
          }
        
                  
        do {
            
            f = 0;
            try {
                System.out.print("\n--> ");
                selection = in.nextInt();  
            } catch (InputMismatchException e) {
                System.out.println("Entered value is not an int");
                f = 1;
            }
             in.nextLine(); // clears the buffer
            } while( f  == 1 );
       
        while ( selection <1 || selection >5 ) {
            System.out.print("\nInput doesn't match with the corresponding numbers. Please enter a number that is between 1 and 5: ");
            selection = in.nextInt();  
        }

        
        
        
      }
       
       
    }
    
    
}



