package String;

public class Challenge1 {
    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("xyz", 2)); // a -> c  c -> e
        System.out.println(caesarCypherEncryptor("abc", 57)); // // "fgh"
    }

    public static char makeFit(char ch, int key) {
        int firstMove = (int) ch + key;
        if (firstMove > 122) firstMove -= 26;
        return (char) firstMove;
    }

    public static String caesarCypherEncryptor(String str, int key) {
        String returnStr = "";
        for (int i = 0; i < str.length(); i++) {
            returnStr += makeFit(str.charAt(i),key % 26);
        }
        return returnStr;
    }
}
