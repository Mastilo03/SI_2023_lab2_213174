import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {
    @Test
    void testEveryBranch(){
        RuntimeException ex;
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("Gacov02","password*123","gacov@gmail.com"));
        allUsers.add(new User("User1","password#123","user@gmail.com"));

        assertFalse(SILab2.function(new User("Gacov02","password*123","gacov@gmail.com"),allUsers));
        ex= assertThrows(RuntimeException.class, () -> SILab2.function(null,allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        assertFalse(SILab2.function(new User(null,"pass","usergmail.com"),allUsers));
        assertFalse(SILab2.function(new User(null,"pa ss","usergmail.com"),allUsers));
        assertFalse(SILab2.function(new User(null,"password123","usergmail.com"),allUsers));
    }

    @Test
    void testMultipleCondition(){
    /*    1. TXX -> user==null
        2. FTX -> user !=null,password==null
        3. FFT -> user!=null,password!=null,email==null
        4. FFF -> user!=null,password!=null,email!=null*/
        RuntimeException ex;
        List<User> allUsers = new ArrayList<>();
        allUsers.add(new User("Gacov02","password*123","gacov@gmail.com"));
        allUsers.add(new User("User1","password#123","user@gmail.com"));

        ex= assertThrows(RuntimeException.class, () -> SILab2.function(null,allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex= assertThrows(RuntimeException.class, () -> SILab2.function(new User("username",null,"email"),allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex= assertThrows(RuntimeException.class, () -> SILab2.function(new User("username","password",null),allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

       assertFalse(SILab2.function(new User("username","password","email"),allUsers));
       
    }
}
