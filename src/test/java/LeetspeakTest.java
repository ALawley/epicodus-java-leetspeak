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
}
