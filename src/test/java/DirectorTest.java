import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", "JN2468C", 100000.00, "CodeClan", 50.00);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("CodeClan", director.getDeptName());
    }

    @Test
    public void canGetDirectorName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void canGetDirectorNI(){
        assertEquals("JN2468C", director.getNI());
    }

    @Test
    public void canGetDirectorSalary(){
        assertEquals(100000.00, director.getSalary(), 0.00);
    }

    @Test
    public void canRaiseDirectorSalary(){
        director.raiseSalary(10000.00);
        assertEquals(110000.00, director.getSalary(), 0.00);
    }

    @Test
    public void canPayDirectorBonus(){
        Double bonus = director.payBonus();
        director.raiseSalary(bonus);
        assertEquals(101000.00, director.getSalary(), 0.00);
    }
}
