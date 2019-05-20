

import org.junit.Test;

import static org.junit.Assert.*;

public class StrArrayTest {


    StrArray a = new StrArray();

    @Test

    public void comparision() {
        String[] a1 = {"10", "20", "30"};
        String[] a2 = {"10", "20", "40"};
        String s = "not equal";
        assertEquals(s, a.compare(a1, a2));

    }

    @Test
    public void duplicates() {
        String[] a1 = {"10", "20", "10", "30"};
        String s = "duplicates found";
        assertEquals(s, a.duplicate(a1));
    }

    @Test
    public void appending() {
        String[] a1 = {"10", "20", "30"};
        String[] a2 = {"50", "20", "40"};
        String[] s = {"10", "20", "30", "50"};
        assertArrayEquals(s, a.append(a1, a2));
    }

    @Test
    public void prepending() {
        String[] a1 = {"10", "20", "30"};
        String[] a2 = {"50", "60", "70"};
        String[] s = {"60", "10", "20", "30"};
        assertArrayEquals(s, a.prepend(a1, a2));
    }

}
