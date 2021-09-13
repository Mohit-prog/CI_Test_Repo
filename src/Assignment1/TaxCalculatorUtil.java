package Assignment1;

public class TaxCalculatorUtil {
 
    
    //Function to calculate tax of single item using item type & single item cost
    
    static float calculateTax(String type,float cost) {
        
        float tax=0;
        
        //If Item is Raw
        if(type.equals("raw") || type.equals("Raw")) {
            
            tax=(float) ((12.5*cost)/100);
            
        }
        //If Item is Manufactured
        else if(type.equals("Manufactured") || type.equals("manufactured")) {
            
            float part=(float) ((12.5*cost)/100);
            
            tax=part +2*(cost+part)/100;
            
        }
        //If Item is Imported
        else {
            
            float importDuty=10*cost/100;
            
           float priceAfterImportDuty=cost+importDuty;
           
           if(priceAfterImportDuty<=100)
                  tax=priceAfterImportDuty+5;
           
           else if(priceAfterImportDuty>100 && priceAfterImportDuty<=200 )
               tax=priceAfterImportDuty+10;
           
           else
               tax=priceAfterImportDuty+(priceAfterImportDuty/20);
               
        }
        
        /*
         * final calculated Tax
         */
        return tax;
    }
}
