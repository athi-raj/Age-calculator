
import java.io.*; 
  
class GFG { 
    static void findAge(int current_date, int current_month, 
                    int current_year, int birth_date, 
                    int birth_month, int birth_year) 
    { 
        int month[] = { 31, 28, 31, 30, 31, 30, 31,  
                             31, 30, 31, 30, 31 }; 
  
      
        if (birth_date > current_date) { 
            current_month = current_month - 1; 
            current_date = current_date + month[birth_month - 1]; 
        } 
  
       
        if (birth_month > current_month) { 
            current_year = current_year - 1; 
            current_month = current_month + 12; 
        } 
  
        // calculate date, month, year 
        int calculated_date = current_date - birth_date; 
        int calculated_month = current_month - birth_month; 
        int calculated_year = current_year - birth_year; 
  
        // print the present age 
        System.out.println("Present Age"); 
        System.out.println("Years: " + calculated_year +  
              " Months: " + calculated_month + " Days: " +  
              calculated_date); 
    } 
    public static void main(String[] args) 
    { 
        // present date 
        int current_date = 7; 
        int current_month = 12; 
        int current_year = 2017; 
  
        // birth dd// mm// yyyy 
        int birth_date = 16; 
        int birth_month = 12; 
        int birth_year = 2009; 
  
        // function call to print age 
        findAge(current_date, current_month, current_year, 
              birth_date, birth_month, birth_year); 
    } 
} 
