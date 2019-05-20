public class ConsecutiveElements {
    public String consecutiveNumbers(String s){
        String s1="consecutive";
        String s2="non consecutive";
        String[] a=s.split(",");
        int [] arr = new int [a.length];
        for(int i=0; i<a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        boolean result1=true;
        result1=checkConsecutive(arr);
        if(result1==true) {
            return s1;
        }
        else return s2;
    }
    public String negativeConsecutiveNumbers(String s){
        String s1="consecutive";
        String s2="non consecutive";
        String[] a=s.split(",");
        int [] arr = new int [a.length];
        for(int i=0; i<a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        boolean result1=true;
        result1=checkConsecutiveNegative(arr);
        if(result1==true) {
            return s1;
        }
        else return s2;
    }
    public static boolean checkConsecutive(int arr[]){

        boolean result=true;
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            if(((arr[i+1]-arr[i])!=1) &&((arr[i]-arr[i+1])!=1)){
                return false;
            }
        }
        return true;

    }
    public String reverseConsecutiveNumbers(String s){
        String s1="consecutive";
        String s2="non consecutive";
        String[] a=s.split(",");
        int [] arr = new int [a.length];
        int [] arr2 = new int [a.length];
        int j=arr.length;
        for(int i=0; i<a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        for(int i=0; i<a.length;i++) {
            arr2[j-1] = arr[i];
            j--;
        }

        boolean result1;
        result1=checkConsecutive(arr2);
        if(result1==true) {
            return s1;
        }
        else{
            return s2;
        }
    }
    public static boolean checkConsecutiveNegative(int arr[]){

        boolean result=true;
        int size=arr.length;
        for(int i=0;i<size-1;i++){
            if(((arr[i+1]-arr[i])!=-1) &&((arr[i]-arr[i+1])!=-1)){
                return false;
            }
        }
        return true;

    }

}
