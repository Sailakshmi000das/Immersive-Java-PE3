import java.util.*;


public class StudentMarks {

    public String compare(int a)
    {
        String result="";
        if ((a>=0) && (a<=100)) {
            result ="true";

        }
        if (a>100) {
            result="Input should not be greater than 100";
        } if(a<0)
    {
        result="Input should not be less than 0";
    }

        return result;
    }

}
