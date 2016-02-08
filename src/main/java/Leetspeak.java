public class Leetspeak {
  public static void main(String[] args) {}
  public String isLeetspeak(String phrase) {
    String leetspeak = phrase.replace("e", "3");
    leetspeak = leetspeak.replace("E", "3");
    leetspeak = leetspeak.replace("o", "0");
    leetspeak = leetspeak.replace("O", "0");
    leetspeak = leetspeak.replace("I", "1");
    return leetspeak;
  }
}
