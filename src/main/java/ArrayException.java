
import java.util.Scanner;
public class ArrayException {

//Arithmetic Exception division by zero    
public String ArithmeticException(int a, int b) {
        try {
            int c = a / b;  
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            return "Can't divide a number by 0";
        }
        return null;
    }

//NegativeArraySizeException
    public String NegativeArraySizeException(int a) {
        int arrSize = a;
        try {
            int[] myArray = new int[arrSize];
        } catch (NegativeArraySizeException ex) {
            return "Can't create array of negative size";
        }
        return null;
    }


//NullPointerException
    public String NullPointerException(int b) {
     try {
            String a = null; //null value
            System.out.println(a.charAt(b));
        } catch (NullPointerException e) {
            return "NullPointerException..";
        }
        return null;

    }

//ArrayIndexOutOfBounds Exception
    public String ArrayIndexOutOfBound(int a) {

        int m[] = {40, 50, 60};

        try {
            System.out.println(m[a]);
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Wrong index number, please enter correct number. ";

        }
        return null;

    }


//StringIndexOutOfBounds Exception
    public String StringIndexOutOfBoundsException (int a) {
        String str = "hello";
        try
        {
            System.out.println(str.charAt(a));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            return "Wrong character index number, please enter correct number. ";
        }
        return null;
    }


}
