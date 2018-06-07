         
 public class Leap
{
    public static void main(String[] args) 
    { boolean leap;
        int year = 2018;
         if (year % 400 == 0)
            leap= true;
     
        
        if (year % 100 == 0)
            leap=false;
     
        
        if (year % 4 == 0)
            leap= true;
        else
        leap=false;
        
     if(leap==true)
     System.out.print("Leap");
     else
     System.out.print(" Not Leap");
     
    }
}