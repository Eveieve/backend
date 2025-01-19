package day08_0117.Revise;

public class StringBufferEx {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("welcome");
        sb.append("welcome");
        sb.append("welcome");
        sb.append("welcome");
        sb.append("welcome");
        sb.append("welcome");
        System.out.println(sb);
        String result = sb.toString();
        System.out.println(result);

        String str = "abcdefg";
        StringBuffer sb2 = new StringBuffer(str);
        System.out.println("initial state: " + sb2);

        //String toString = sb2.toString(); // cast Buffer to String

        System.out.println("extract substring till the end: " + sb2.substring(2));
        System.out.println("extract substring between indices: " + sb2.substring(2,4)); // index 4 excluded
        System.out.println("insert substring: " + sb2.insert(7, "hij")); // insert string, starting from the end index
        System.out.println("delete substring: " + sb2.delete(3,6)); //
        System.out.println("append substring: "+ sb2.append("hhhhh"));
        System.out.println("length of string: " + sb2.length());
        System.out.println("reverse string: " + sb2.reverse());

        sb2.toString();

        // Using StringBuilder
        String str3 = "hello" + "world";
        String str4 = new StringBuilder("hello").append("world").toString(); // chianing -메모리 절약 가능. 그럼 얘는 메모리에 어떻게 만들어지지?
        System.out.println(str3);
        System.out.println(str4);
        /// //////////////
        StringBuilder sb4 = new StringBuilder();
        for(int i =0; i<10000; i++){
            sb4.append(i);
        }
        final String number = sb4.toString(); // Q. final 은 왜 쓰느냐?
        System.out.println(number);


    }
}
