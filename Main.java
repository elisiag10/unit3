import java.util.Scanner;
public class Main {

  
 public static void  main(String[] args)
 {
  int guests = getGuest();
    displayBanner(); 
    displayprice(guests);

   return;
 }

 public static int  getGuest ()
 {
	Scanner myObj = new Scanner(System.in);  // Create a Scanner object
  System.out.println("Enter number of guests: ");	
 	int numberOfGuests= myObj.nextInt();  // Read user input
 // getRandomNumber();
  return(numberOfGuests);
 }
    
public static void displayBanner(){
    System.out.println("********Carly\'s makes the food that makes it a party.*******" + "\r\n");

    return;
  }
  public static void  displayprice(int guests){

    int price = 35 * guests; 
    int isLargeParty = 50;
    System.out.println("The final price $" + price );
    System.out.println("Large event: " +( guests > isLargeParty));
    return;
  }

  
}

