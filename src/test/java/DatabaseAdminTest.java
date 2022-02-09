import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Roosa Paivansalo", "JN5678C", 30.00);
    }

    @Test
    public void canGetDatabaseAdminName(){
        assertEquals("Roosa Paivansalo", databaseAdmin.getName());
    }

    @Test
    public void canSetDatabaseAdminName(){
        databaseAdmin.setName("John");
        assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void doesNotSetDatabaseAdminNameIfNull(){
        databaseAdmin.setName(null);
        assertEquals("Roosa Paivansalo", databaseAdmin.getName());
    }

    @Test
    public void canGetDatabaseAdminNI(){
        assertEquals("JN5678C", databaseAdmin.getNI());
    }

    @Test
    public void canGetDatabaseAdminSalary(){
        assertEquals(30.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canRaiseDatabaseAdminSalary(){
        databaseAdmin.raiseSalary(15.00);
        assertEquals(45.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canPayDatabaseAdminBonus(){
        Double bonus = databaseAdmin.payBonus();
        databaseAdmin.raiseSalary(bonus);
        assertEquals(30.30, databaseAdmin.getSalary(), 0.00);
    }
}
