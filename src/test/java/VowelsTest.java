import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    Vowels p = new Vowels();


    @Test

    public void vowelsRemove() {
        String[] str1 = {"India","Pakistan","Melbourne","Australia"};
        String[] result = p.removingVowels(str1);
        String[] Expected={"Ind","Pkstn","Mlbrn","Astrl"};
        assertArrayEquals(Expected, result);
    }

    @Test

    public void vowelsRemove2() {
        String str2 = "e";
        String result = p.removingVowels(str2);
        assertEquals("", result);


    }


    @Test

    public void vowelsRemove3() {
        String str3 = "eaou";
        String result = p.removingVowels(str3);
        assertEquals("", result);


    }


    @Test
    public void places3() {
        String str4 = null;
        String result = p.removeNullValues(str4);
        assertEquals("Input String cannot be null", result);


    }


    @Test
    public void places4() {
        String s = "1";
        String result = p.removeNumericValues(s);
        assertEquals("Input String should contain only characters", result);


    }



}
