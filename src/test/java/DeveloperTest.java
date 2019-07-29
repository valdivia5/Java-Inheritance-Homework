import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer dev;

    @Before
    public void setup() {
        dev = new Developer("Chris", "GG554433D", 30000);
    }

    @Test
    public void canGetName() {
        assertEquals("Chris", dev.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("GG554433D", dev.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, dev.getSalary());
    }

}
