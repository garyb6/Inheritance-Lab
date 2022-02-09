import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Hannah Green", "JN3456C", 10.00, "GitCommits");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("GitCommits", manager.getDeptName());
    }

    @Test
    public void canGetManagerName(){
        assertEquals("Hannah Green", manager.getName());
    }

    @Test
    public void canGetManagerNI(){
        assertEquals("JN3456C", manager.getNI());
    }

    @Test
    public void canGetManagerSalary(){
        assertEquals(10.00, manager.getSalary(), 0.00);
    }
    


}
