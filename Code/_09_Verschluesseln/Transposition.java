package _09_Verschluesseln;

public class Transposition {
    public static void main(String[] args){
        String input = "paulpanzeristsuperlustig";
        int length = 5;
        String encrypted, decrypted;
        encrypted = encrypt(input, length);
        System.out.println(encrypted);
        decrypted = decrypt(encrypted, length);
        System.out.println(decrypted);
    }

    private static String encrypt(String text, int length){
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= length; i++)
            for (int j = i - 1; j < text.length(); j += length)
                builder.append(text.charAt(j));
        return builder.toString();
    }

    private static String decrypt(String text, int length){
        char[] arr = new char[text.length()];
        for (int i = 1, x = 0; i <= length; i++) {
            for (int j = i - 1; j < text.length(); j += length) {
                arr[j] = text.charAt(x);
                x++;
            }
        }
        return new String(arr);
    }
}
