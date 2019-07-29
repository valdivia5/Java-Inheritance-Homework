import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin admin;

    @Before
    public void setup() {
        admin = new DatabaseAdmin("Sarah", "GG332211D", 40000);
    }

    @Test
    public void canGetName() {
        assertEquals("Sarah", admin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("GG332211D", admin.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(40000, admin.getSalary());
    }


}
