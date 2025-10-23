import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Scanner sc = new Scanner(System.in);
    System.out.println("Give me a word, yo");
    String word = sc.nextLine();

    int maxCount = 0;
    String maxLetter = "";
    for (int i = 0; i < word.length(); i++)
    {
        String target = word.substring(i, i + 1);
        int count = 0;
        for (int j = 0; j < word.length(); j++)
        {
          String currentLetter = word.substring(j, j + 1);
          if (currentLetter.equals(target))
          {
            count++;
          }
        }
        System.out.println("The letter " + target + " appears " + count + " times");
    }   

    if (count > maxCount)
    {
      maxCount = count;
      maxLetter = target;
    }
    System.out.println("The letter " + maxLetter + " appears the most time at " + maxCount + " times.");
  }
}
