import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup() {
        director = new Director("Rory", "JJ665544A", 120000, "Operations", 2000000);
    }

    @Test
    public void canGetName() {
        assertEquals("Rory", director.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals("JJ665544A", director.getNInumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(120000, director.getSalary());
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Operations", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(2000000, director.getBudget());
    }

    @Test
    public void raiseCannotBeNegative() {
        director.raiseSalary(-100);
        assertEquals(120000, director.getSalary());
    }

    @Test
    public void cannotChangeNameToNull() {
        director.setName(null);
        assertEquals("Rory", director.getName());
    }

    @Test
    public void directorGetsDoubleBonus() {
        assertEquals(2400, director.payBonus(), 0.1);
    }

}
