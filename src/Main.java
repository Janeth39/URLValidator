import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        //set up instance variables
        String myURL = "";
        Scanner urlScan;
        Scanner keyboard = new Scanner (System.in);

        //get input from user
        System.out.println("Enter URL to dissect: ");
        myURL = keyboard.nextLine();

        //test scanner
//        System.out.println("You entered " + myURL);
        urlScan = new Scanner (myURL);

        //loop through the URL pieces
        while ( urlScan.hasNext())
        {
         urlScan.useDelimiter ("cat");
         System.out.print("\t" + urlScan.next());

        }

    }//end main class

}//end main method
