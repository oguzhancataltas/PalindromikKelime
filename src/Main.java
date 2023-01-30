public class Main {
    public static void main(String[] args) {
        String word = "kavak";
        boolean isTrue = true;

        word.trim();

        for (int i = 0; i < word.length(); i++) {
            if (!(word.charAt(i) == word.charAt(word.length()-i-1))){
                isTrue = false;
                break;
            }
        }
        if (isTrue){
            System.out.println(word + " kelimesi Palindromik Kelimedir.");
        }else {
            System.out.println(word + " kelimesi Palindromik kelime değildir!!!");
        }
    }
}
