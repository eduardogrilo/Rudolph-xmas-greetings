public class BobsXmasGreetings {
    public static String reverseVowels(String greeting) {
        char[] vowelsArray = {};
        int countNumVowels=0;
        for (int i = greeting.length()-1; i>=0; i++) {
            char greetingChar = greeting.charAt(i);//Converts every single String character (greeting) into a char
            
            if (greetingChar == 'a' || greetingChar == 'e' || greetingChar == 'i' || greetingChar == 'o' || greetingChar == 'u'|| greetingChar == 'A' || greetingChar == 'E' || greetingChar == 'I' || greetingChar == 'O' || greetingChar == 'U'){
                vowelsArray[countNumVowels] = greetingChar;
                countNumVowels++;
            }



        }
        return "nothing here";
    }

    public static void main(String[] args) {
        String test1 = "Eusoumaluco";
        System.out.println(reverseVowels(test1));
    
    }
}
