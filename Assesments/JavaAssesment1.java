import java.util.Scanner;

class JavaAssesment1
{
        int i = 0, count = 0;
        
        public void getStrg()
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("\nEnter Any String :");
            String strg = sc.nextLine();
            
            System.out.println("\nNo.of Characters in Given String is \t\t: " + calculateCharacters(strg));
            System.out.println("\nNo.of Vowels in Given String is \t\t: " + calculateVowels(strg));
            System.out.println("\nNo.of Consonants in Given String is \t\t: " + calculateConsonants(strg));
            System.out.println("\nNo.of Special Characters in Given String is \t: " + calculateSpecialCharacters(strg));
            System.out.println("\nNo.of Words in Given String is \t\t\t: " + calculateWords(strg));
            System.out.println("\nNo.of Sentences in Given String is \t\t: " + calculateSentences(strg));
            
            sc.close();
        }
        
        
          public int calculateCharacters(String strg)
    {
        char[] sepChars = strg.toCharArray();
        count = 0;

        for ( i = 0; i < sepChars.length; i++ )
        {
            if ( ((((int) sepChars[i]) >= 65) && (((int) sepChars[i]) <= 90)) || ((((int) sepChars[i]) >= 97) && (((int) sepChars[i]) <= 122)) )
            {
                count++;
            }
        }
        
         return count;
    }

    public int calculateVowels(String strg)
    {
        char[] sepChars = strg.toCharArray();

        count = 0;

        for ( i = 0; i < sepChars.length; i++ )
        {
            if ( Character.toString(sepChars[i]).equalsIgnoreCase("A") || Character.toString(sepChars[i]).equalsIgnoreCase("E") || Character.toString(sepChars[i]).equalsIgnoreCase("I") || Character.toString(sepChars[i]).equalsIgnoreCase("O") || Character.toString(sepChars[i]).equalsIgnoreCase("U") )
            {
                count++;
            }
        }

        return count;
    }

    public int calculateConsonants(String strg)
    {
        return (calculateCharacters(strg) - calculateVowels(strg));
    }

    public int calculateSpecialCharacters(String strg)
    {
        char[] sepChars = strg.toCharArray();
        count = 0;

        for ( i = 0; i < sepChars.length; i++ )
        {
            if ( ((((int) sepChars[i]) >= 65) && (((int) sepChars[i]) <= 90)) || ((((int) sepChars[i]) >= 97) && (((int) sepChars[i]) <= 122)) )
            {
                continue;   
            }
            else if ( ((int) sepChars[i]) == 32 )
            {
                continue;  
            }
            else
            {
                count++;
            }
        }

        return count;
    }

    public int calculateWords(String strg)
    {
        String[] words = strg.split(" ");
        return (words.length);
    }

    public int calculateSentences(String strg)
    {
        String[] sentences = strg.split("\\.");
        return (sentences.length);
    }

    public static void main(String []args)
    {
        JavaAssesment1 sf = new JavaAssesment1();

        
        System.out.print("\n\t\tJavaAssesment1");
        
        
        sf.getStrg();
    }
}
        
