import org.junit.jupiter.api.Test;
import tgm.list.Role;
import tgm.list.User;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    @Test
    void testen(){
        User u = new User("Test", "Test", Role.ADMIN, null);
        for(int i = 0; i < Integer.MAX_VALUE; i++){
            assertNotEquals(i + "", "");
        }
    }
}
