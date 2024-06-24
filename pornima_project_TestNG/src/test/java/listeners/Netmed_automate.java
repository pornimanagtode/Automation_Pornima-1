package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test@Listeners(Netmed_listener.class)
public class Netmed_automate extends Netmed_listener  {
  @Test
  public void f() {
  }
}
