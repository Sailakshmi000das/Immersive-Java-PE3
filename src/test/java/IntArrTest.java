import org.junit.Test;

import static org.junit.Assert.*;

public class IntArrTest {




    IntArr p=new IntArr();
    int[] as={2,21,32};

    @Test
    public void evenTest()
    {

        String[] s=p.even(as);
        String[] a={"even","odd","even"};

        assertArrayEquals(a,s);

    }

    @Test
    public void primeTest()
    {
        int[] pr={4,17,19};
        int[] s=p.prime(pr);
        int[] c={4};
        assertArrayEquals(c,s);
    }
    @Test
    public void reverseTest()
    {
        int[] s=p.reverse(as);
        int[] a={32,21,2};
        assertArrayEquals(a,s);
    }

}