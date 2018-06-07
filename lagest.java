 public class LargestOfThreeNumbers
{
   public static void main(String args[])
   {
      int x=10, y=20, z=30;
     
 
     
      if ( x > y && x > z )
         System.out.println("First number is largest.");
      else if ( y > x && y > z )
         System.out.println("Second number is largest.");
      else if ( z > x && z > y )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}