public class Main {
    public static void main(String[] args) {

    }

    public static void arithmeticException(){
        int a = 5/0;
    }

    public static void arrayIndexOutOfBoundsException(){
        int[] a = new int[5];
        a[10] = 50;
    }

    public static void stringIndexOutOfBoundsException(){
        String s = "Welcome to harmash.com";
        System.out.println(s.charAt(30));
    }

    public static void arrayStoreException(){
        Object x[] = new String[3];
        x[0] = new Integer(0);
    }

    public static void illegalFormatConversionException(){
        System.out.printf("value: %d", 5.5f);
    }

    public static void negativeArraySizeException(){
        int[] a = new int[-8];
    }

    public static void numberFormatException(){
        String s = "abcd";
        int number = Integer.parseInt(s);
    }

    public static void nullPointerException(){
        Object obj = null;
        obj.hashCode();
    }


}