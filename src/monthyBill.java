import java.util.Scanner;
/**
 *
 * @author vc2000
 */
public class monthyBill {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        //asking user's plan option
        System.out.println("Choose an option for your streaming service.");
        System.out.println("For Basic option, enter the number 1");
        System.out.println("For Premium option, enter the number 2");
        int option = keyboard.nextInt();
        
        
        //asking data from user 
        System.out.println("Last month, how many gigbytes of data did you use?");
        double data = keyboard.nextDouble();
        
        //be preparing for switch statement
        
        double Streaming = 15; /* basic streaming price*/
        
        switch (option){
            
            // basic plan
            case 1:
                //streaming
                System.out.printf("The basic streaming monthly fee is $ %.0f.",Streaming);
                
                System.out.printf("%n");
                //internet
                double dataPrice = basic.internetprice(data);
                System.out.printf("Your monthly fee for internet service will be $%.0f.", dataPrice);
                
                System.out.printf("%n");
                //total 
                double Btotal = Streaming + dataPrice;
                System.out.printf("Your total monthly fees will be $%.2f.",Btotal );
                
            break;
            
            // Premium plan
            case 2:
                //streaming
                Streaming += 15;
                System.out.printf("The premium streaming monthly fee is $ %.0f.",Streaming);
                
                System.out.printf("%n");
                //internet
                double PdataPrice = premium.internetprice(data);
                System.out.printf("Your monthly fee for internet service will be $%.0f.", PdataPrice);
                
                System.out.printf("%n");
                //total
                double Ptotal = Streaming + PdataPrice;
                System.out.printf("Your total monthly fees will be $%.2f.",Ptotal );
                
            break;
            
            default:
              System.out.println("Invalid streaming service option enter");
    }
  
    }
}

    // premium internet
class premium{
    public static double internetprice(double data){

                double dataprice = 27;
 
                if (data <50){
            return dataprice;
            
        } else if (data <101){
            return dataprice += 10;
            
        } else {
            return dataprice += 30;
        } 
    }
} 
        // basic internet        
class basic{
    public static double internetprice(double data){

                double dataprice = 32;
 
                if (data <50){
            return dataprice;
            
        } else if (data <101){
            return dataprice += 10;
            
        } else {
            return dataprice += 30;
        } 
    }
} 