import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Rory", "JG503010E", 50000, "Senior Management");
    }

    @Test
    public void canGetName() {
        assertEquals("Rory", manager.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JG503010E", manager.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, manager.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Senior Management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000);
        assertEquals(60000, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, manager.payBonus(), 0.1);
    }
}
