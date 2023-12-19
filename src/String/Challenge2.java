package String;

public class Challenge2 {
    public static void main(String[] args) {
        // Pangram
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));

    }
    public static String pangrams(String s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        s = s.toLowerCase();
        for (int i = 0; i < alphabet.length(); i++){
            if (!s.contains(Character.toString(alphabet.charAt(i)))) {
                return "not pangram";
            }
        }
        return "pangram";
    }
}
