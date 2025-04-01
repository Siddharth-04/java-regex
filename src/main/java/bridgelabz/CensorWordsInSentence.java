package bridgelabz;

public class CensorWordsInSentence {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String output = text.replaceAll("stupid","*****").replaceAll("damn","****");
        System.out.println(output);
    }
}
//This is a **** bad example with some ***** words.