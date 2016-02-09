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
  @Test
  public void leetspeak_replacesEverySInAStringWithAZ_wordChanges() {
    Leetspeak newLeetspeak = new Leetspeak();
    assertEquals("r0z3z ar3 r3d", newLeetspeak.isLeetspeak("roses are red"));
  }
  @Test
  public void leetspeak_doesNotReplaceSWhenFirstLetter_wordChanges() {
    Leetspeak newLeetspeak = new Leetspeak();
    assertEquals("Suzi3 Sunzhin3", newLeetspeak.isLeetspeak("Susie Sunshine"));
  }
  @Test
    public void leetspeak_makesCorrectReplacementsRegardlessOfCase_ignoresUppercase() {
      Leetspeak newLeetspeak = new Leetspeak();
      assertEquals( "1 scr3am y0u scr3am w3 all scr3am f0r razpb3rry ic3 cr3am!", newLeetspeak.isLeetspeak("I scream you scream we all scream for raspberry ice cream!"));
    }
}
