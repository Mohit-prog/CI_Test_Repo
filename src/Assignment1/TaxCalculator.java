package Assignment1;

import java.util.*;
public class TaxCalculator{

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      
      //List to store each set of Item (having name,type,price & quantity)
      List<Item> items=new ArrayList<>();
      
      
      do{
          //Creating object of Type Item to store user Input
          Item item=new Item();
          
          System.out.println("Enter Item Name");
           item.name=sc.nextLine();
         
          
          
          /*
           * taking valid input for Item Type
           * Type must be raw, manufactured or imported only
           * */
          while(true) {
             
          System.out.println("Enter Item Type");
          item.type=sc.next();
             
          if(item.type.equals("raw")||item.type.equals("manufactured")||item.type.equals("imported")||
                  item.type.equals("Raw")||item.type.equals("Manufactured")||item.type.equals("Imported"))
          
             break;
          
          else
              {
              System.out.println("Type must be raw,manufactured or imported !!");
              continue;
              }
             
          }
          
       /*
        * taking valid input for Item price
        * */  
          while(true) {
           
          System.out.println("Enter Item Price");
          try {
            item.price=sc.nextFloat();
            if(item.price<=0)
            {
                System.out.println("Price must be greater than 0");
                continue;
            }
            
            break;
          }
          catch(Exception e) {
              System.out.println("Invalid data , Try again!");
              sc.next();
          }
         
          
             }
          
          /*
           * taking valid input for Item quantity
           * */  
         while(true) {
           
          System.out.println("Enter Item Quantity");
          try {
            item.quantity=sc.nextInt();
            if(item.quantity<=0)
            {
                System.out.println("Quantity must be greater than 0");
                continue;
            }
            break;
          }
          catch(Exception e) {
              System.out.println("Invalid data , Try again!");
              sc.next();
          }
         
          
             }
        
          
          //Adding Item to the List
          items.add(item);
          
          System.out.println("Do you want to enter details of any other item (y/n) :");
          
         // keep taking Input till user responds by n 
          boolean takeMoreInputs=true;
          
        while(true)  {  
            
            char response=sc.next().charAt(0);
            
            if(response=='n'||response=='N') {
                takeMoreInputs=false;
                break;
            }
            else if(response=='y'||response=='Y') {
                 break;
            }
            //If user enters response other than y or n
            else {
                System.out.println("Invalid Input ,Try Again !!");
            }
     
        }
        
        
        //Decides whether to take more input or not
        if(!takeMoreInputs)
            break;
        sc.nextLine();
      }
      while(true);
      
      
      sc.close();
      
      
        System.out.println("Here are your Results :-");
        
       System.out.printf("%-20s%-20s%-20s%6s\n","Item Name","Item price","Sales Tax","Final price");
      
      //Prints price ,tax,final price for each Item in List
      for(int i=0;i<items.size();i++) {
          
         //Fetch an item from List
          Item item=items.get(i);
          
          //Tax for single item
          float tax=TaxCalculatorUtil.calculateTax(item.type,item.price);
          
          
          float finalPrice=(item.price+tax)*item.quantity;
          
          //If Name is large 
          if(item.name.length()>13)
              item.name=item.name.substring(0,11)+"...";
          
          System.out.printf("%-20s%-20.2f%-20.2f%6.2f\n", item.name,item.price,tax,finalPrice);
          
          
      }
      
      
      
    }
  
}
