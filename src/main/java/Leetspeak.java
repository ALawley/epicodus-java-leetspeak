public class Leetspeak {
  public static void main(String[] args) {}
  public String isLeetspeak(String phrase) {
    String finalLeetspeak = "";
    String[] leetspeakArray = phrase.split(" ");
      for (String leetspeakWord : leetspeakArray ) {
        leetspeakWord = leetspeakWord.replace("e", "3");
        leetspeakWord = leetspeakWord.replace("E", "3");
        leetspeakWord = leetspeakWord.replace("o", "0");
        leetspeakWord = leetspeakWord.replace("O", "0");
        leetspeakWord = leetspeakWord.replace("I", "1");
        String wordWithoutFirstLetter = leetspeakWord.substring(1, leetspeakWord.length());
        wordWithoutFirstLetter = wordWithoutFirstLetter.replace("s", "z");
        wordWithoutFirstLetter = wordWithoutFirstLetter.replace("S", "Z");
        finalLeetspeak = finalLeetspeak + " " + leetspeakWord.charAt(0) + wordWithoutFirstLetter;
      }
    finalLeetspeak = finalLeetspeak.substring(1);
    return finalLeetspeak;
  }
}
