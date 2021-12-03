public class BobsXmasGreetings {

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static String reverseVowels(String greeting) {
        int countNumVowels = 0;
        char[] vowelsArray = new char[greeting.length()];
        for (int i = greeting.length()-1; i>=0; i--) {
            char greetingChar1 = greeting.charAt(i); //Converts every single String character (greeting) into a single char
            
            if (isVowel(greetingChar1)) {
                vowelsArray[countNumVowels] = greetingChar1;
                countNumVowels++;
            }
        }
        
        int vowelsIndex = 0;
        char[] greetingCharArray = greeting.toCharArray();//Converts the string (greeting) to a new character array
        for (int i = 0; i < greeting.length(); i++) {
            char greetingChar2 = greeting.charAt(i);//Converts every single String character (greeting) into a single char
            
            if (isVowel(greetingChar2)){
                greetingCharArray[i] = vowelsArray[vowelsIndex];
                vowelsIndex++;
            }
        }
        return new String(greetingCharArray);
    }

    public static void main(String[] args) {
        String test1 = "Eu sou maluco";
        System.out.println(reverseVowels(test1));
        String test2 = "Aeiou";
        System.out.println(reverseVowels(test2));
    
    }
}
