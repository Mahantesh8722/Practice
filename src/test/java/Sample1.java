import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class Sample1 {

	@Test()
		public void CreateSimple() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		}
}