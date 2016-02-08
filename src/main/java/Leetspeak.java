public class Leetspeak {
  public static void main(String[] args) {}
  public String isLeetspeak(String phrase) {
    String leetspeak = phrase.replace("e", "3");
    leetspeak = leetspeak.replace("E", "3");
    return leetspeak;
  }
}
