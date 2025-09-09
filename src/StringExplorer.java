import java.util.Scanner;

public class StringExplorer
{
	public static void main(String[] args)
	 {
    //   // Count down with a "T minus 5"\
    //   // 1) delcatation 2) condition 3) incriment
    //   for (int k = 5; k >= 0; k--)
    //     System.out.println ("T minus" + k );
    // //
      
    //   // Declare and instantiate a Scanner
    //  //canner s = new Scanner (System.in);

    
    //   // infinite loop 
    //   while(true){


    //       // take an input
    //         System.out.print("Meaning of life.");
    //         String answer = s.nextLine();

    //       // repeat input + message
    //         System.out.println("lol u thought" + answer + "was right");
    //       // implement "equals" to stop with the word "stop"
    //         if (answer.equals("42")) break;
    //         if (answer == "42") break;
      //}
        
      
      /*
      ---------------------------
          SAMPLE STUFF
      ---------------------------
      */
  		String sample = "The quick brown fox jumped over the lazy dog.";
  
      // Print the sample and add a blank line after
      System.out.println("OUR SAMPLE:");
      System.out.println(Sample+ "\n");
  		
      //  Demonstrate the length method.
  		int l = sample.length();
  		System.out.println ("sample.length() = " + l);
  
  		//  Demonstrate the indexOf method.
  		int position = sample.indexOf ("quick");
  		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
      //  Demonstrate the toLowerCase method.
		  String lowerCase = sample.toLowerCase();
		  System.out.println ("sample.toLowerCase() = " + lowerCase);
		  System.out.println ("After toLowerCase(), sample = " + sample);
				
		  //  toUpperCase
            System.out.println(sample.toUpperCase());

      // lastIndexOf
        System.out.println("Last h: " + sample.lastIndexOf("h"));

      // substring
      System.out.println("SUBSTRING PRACTICE");
      System.out.println(sample.substring(0,sample.length()-10));
      
      // equals
      String str1 = "Decode"
      String str2 = "Decode"
      System.out.println("Decode == Decode?:" + str1.equals(str2));
	}
}
