public class weryoo{
   
    public static void main(String[] args)
   {
      final double yardToFeet = 3;
      final double feetToInch = 12;
       double yards = 3.5;
      
      final double feet = yards * yardToFeet;
      
      final double inches = feet * feetToInch;
      
      System.out.println(yards + " yards are " + feet + " feet");
      System.out.println(yards + " yards are " + inches + " inches");
   }

}
