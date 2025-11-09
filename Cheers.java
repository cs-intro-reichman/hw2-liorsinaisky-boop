
public class Cheers {
        public static void main(String[] args) {
	        String Word = args[0];
          String word = Word.toUpperCase();
          int reps = Integer.parseInt(args[1]);
          int place=0;
          String vowels = "AEFHILMNORSX";
          int i = 0;
          
          for (place=0; place<Word.length();place++){
            char c = word.charAt(place);
            if(vowels.indexOf(c) == -1){
              System.out.println("Give me a " + word.charAt(place) + ": " + word.charAt(place) + "!");
            }
            else{
                System.out.println("Give me an " + word.charAt(place) + ": " + word.charAt(place) + "!");
            }   
          }
          System.out.println("What does that spell?");
          for (int index=0;index<reps;index++){
            System.out.println(word + "!!!");
          }
        }
}
