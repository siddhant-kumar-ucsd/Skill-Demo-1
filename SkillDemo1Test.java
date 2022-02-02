import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemo1Test{
    @Test
    public void multiply(){
        assertEquals(5, SkillDemo1.multiply(2, 2));
    }

}