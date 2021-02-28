import java.util.ArrayList;

public class UniqueWords
{
   /**
		counts the number of unique strings in a list
		@param list ArrayList of strings to be examined
		@return number of unique strings in the list
   */
   public static int countUnique(ArrayList<String> list)
   {
	  int count = 0;
	  //
	  
      for (int i = 0; i < list.size(); i++)
      {		 for (int j = 0; j < list.size(); j++)
		 {
			
		 }
      }
	  return count;
   }

   public static void main(String[] args)
   {
      ArrayList <String> words = new ArrayList<>();
      words.add("apple");
	  words.add("orange");
	  words.add("blackboard");
	  words.add("apple");
	  words.add("orange");
	  words.add("sun");
	  words.add("moon");
   
	  int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
      
      ArrayList<String> result = makeUnique(words);
      System.out.println("There are " + result.size() + " unique elements");
      
   }
   
   public static ArrayList<String> makeUnique(ArrayList<String> input){
	   ArrayList<String> uniqueWords = new ArrayList<String>();
	   for(int i =0;i< input.size(); i++) {
		   if(!(uniqueWords.contains(input.get(i)))) {
			   uniqueWords.add(input.get(i));
		   }
	   }
	   return uniqueWords;
   }
}
