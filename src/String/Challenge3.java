package String;

public class Challenge3 {

    public static void main(String[] args) {
        String test = "abcdcaf";
        String test1 = "aaabbddsdsd";
        System.out.println(firstNonRepeatingCharacter(test)); // 1;
        System.out.println(firstNonRepeatingCharacter(test1));

    }

    public static int firstNonRepeatingCharacter(String s) {
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    flag = true;
                    break;
                }
            }
            if (!flag) return i;
            flag = false;
        }
        return -1;
    }

}
