
package electronics.report;

import java.util.Scanner;


public class ElectronicsReport {

    private static String String;

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] cities =   {{"Cape Town", "Port Elizabeth", "Pretoria"},
                                {"PS5", "XBOX", "SWICH"},
        };
        
        
        for(int i =0; i< cities.length; i++){
        for(int j =0; j< cities[i].length; j++){
            System.out.print( cities[i][j] + " " );
        }
        
        
        System.out.print("Enter the number of PS5 gaming consoles in Cape Town: ");
          String = scanner.nextLine();
        
            
         System.out.print("Enter the number of PS5 gaming consoles in Port Elizabeth: ");
         String = scanner.nextLine();
        
        System.out.print("Enter the number of PS5 gaming consoles in Pretoria: ");
         String = scanner.nextLine();
        
        System.out.print("Enter the number of XBOX gaming consoles in Cape Town: ");
         String = scanner.nextLine();
        
        System.out.print("Enter the number of XBOX gaming consoles in Port Elizabeth: ");
         String = scanner.nextLine();
        
        
        System.out.print("Enter the number of XBOX gaming consoles in Pretoria: ");
         String = scanner.nextLine();
        
        
        System.out.print("Enter the number of SWITCH gaming consoles in Cape Town: ");
         String = scanner.nextLine();
        
        System.out.print("Enter the number of SWITCH gaming consoles in Port Elizabeth: ");
         String = scanner.nextLine();
        
        
        System.out.print("Enter the number of SWITCH gaming consoles in Pretoria: ");
             String = scanner.nextLine();
        
                
             
             
             
             scanner.close();
            System.out.println("=======================================");
            System.out.println("GAMING CONSOLE REPORT");
        
        

            System.out.println("======================================");
        
        
        
   
        
        
       
    }
        
}
    
}
