import org.junit.*;
import static org.junit.Assert.*;

public class LeetspeakTest {

  @Test
  public void leetspeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    Leetspeak newLeetspeak = new Leetspeak();
    assertEquals("happy", newLeetspeak.isLeetspeak("happy"));
  }
  @Test
  public void leetspeak_replacesEveryEInAStringWithA3_wordChanges() {
    Leetspeak newLeetspeak = new Leetspeak();
    assertEquals("3l3phant", newLeetspeak.isLeetspeak("Elephant"));
  }
  @Test
  public void leetspeak_replacesEveryOInAStringWithA0_wordChanges() {
    Leetspeak newLeetspeak = new Leetspeak();
    assertEquals("b00 b00", newLeetspeak.isLeetspeak("boo boo"));
  }
  @Test
  public void leetspeak_replacesEveryIInAStringWithA1_wordChanges() {
    Leetspeak newLeetspeak = new Leetspeak();
    assertEquals("1 lik3 1k3", newLeetspeak.isLeetspeak("I like Ike"));
  }
}
