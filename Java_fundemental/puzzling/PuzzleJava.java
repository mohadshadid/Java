import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava{

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> random10 = new ArrayList<Integer>();
        Random rand = new Random();

        for(int i = 1; i<=10; i++){
            random10.add(rand.nextInt(20));
        }
        return random10;
    }
    
    // public String getRandomLetterWithArray(){
    //     Random rand= new Random();

    //     String alphabeString = "qwertyuioplkjhgfdazxcvbnm"
    //     String[] alphabet=new String[26];
    //     for(int i = 0; i <26; i++){
    //         alphabet[i]=String.valueOf(alphabeString.charAt(i));
    //     }
    //     return alphabet[rand.nextInt(26)];
    // }
    public String getRandomLetterWithArray() {
        Random rand = new Random();
        String alphabet = "qwertyuioplkjhgfdazxcvbnm";
        return String.valueOf(alphabet.charAt(rand.nextInt(26)));
    }
    


    public String getRandomLetter() {
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char randomChar = alphabet.charAt(rand.nextInt(26));
        return String.valueOf(randomChar);
    }
    


        

    public String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordset = new ArrayList<String>();
        for(int i = 0; i < length; i++){
            passwordset.add(generatePassword());
        }
        return passwordset;
    }
    
}