
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks s=new StudentMarks();

    @Test
    public void equa()
    {
        String str=s.compare(20);
        assertEquals("true",str);
    }
    @Test
    public void Great()
    {
        String str=s.compare(101);
        assertEquals("Input should not be greater than 100",str);
    }
    @Test
    public void Less()
    {
        String str=s.compare(-5);
        assertEquals("Input should not be less than 0",str);
    }

}