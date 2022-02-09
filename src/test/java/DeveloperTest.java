import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Esgrid Sikahall", "JN1234C", 20.00);
    }

    @Test
    public void canGetDeveloperName(){
        assertEquals("Esgrid Sikahall", developer.getName());
    }

    @Test
    public void canSetDeveloperName(){
        developer.setName("John");
        assertEquals("John", developer.getName());
    }

    @Test
    public void doesNotSetDeveloperNameIfNull(){
        developer.setName(null);
        assertEquals("Esgrid Sikahall", developer.getName());
    }

    @Test
    public void canGetDeveloperNI(){
        assertEquals("JN1234C", developer.getNI());
    }

    @Test
    public void canGetDeveloperSalary(){
        assertEquals(20.00, developer.getSalary(), 0.00);
    }

    @Test
    public void canRaiseDeveloperSalary(){
        developer.raiseSalary(10.00);
        assertEquals(30.00, developer.getSalary(), 0.00);
    }

    @Test
    public void canPayDeveloperBonus(){
        Double bonus = developer.payBonus();
        developer.raiseSalary(bonus);
        assertEquals(20.20, developer.getSalary(), 0.00);
    }
}
