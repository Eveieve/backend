package day08_0117.Revise;

public class StringSplitEx {
    public static void main(String[] args) {

        String str = "input@github.com#hello";

        String sentence = "Java is very fun";

        String[] splits = str.split("[%-@#]", 3);
        System.out.println(splits[0]);
/// ///////////////
        int i = 0;
        for (String data : splits) {
            System.out.printf("%d index: %s%n", ++i, data);
        }
        for(int j =0; j<splits.length; j++)
            System.out.println(splits[j]);

        /// ////////////
        splits = sentence.split(" ");// splits is an array

        for (String word : splits)
            System.out.println(word);

        String data = "apple,banana,grape,orange";
        String[] fruits = data.split(",", 3); // splits into 3 parts

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String data2 = "apple|banana,grape orange";
        String[] fruits2 = data.split("[|, ]"); // Split by pipe, comma, or space

        for (String fruit : fruits2) {
            System.out.println(fruit);
        }

        // Extract text parts by splitting at digits:
        String mixed = "Hello123World456Java";
        String[] parts = mixed.split("\\d+"); // Split by one or more digits

        for (String part : parts) {
            System.out.println(part);
        }

        //1. Empty Strings in Output:

        //If delimiters appear consecutively, empty strings may appear in the result.
        String s = "a,,,b";
        String[] parts2 = s.split(",");
        //[a, "", "", b]

        // 2. The split() method uses regular expressions. Escape special characters if needed (e.g., \\. for a period).

        // 3. If the input string starts or ends with the delimiter, leading or trailing empty strings may be included.
        String s2 = ",a,b,";
        String[] parts3 = s.split(",");
        //["", a, b, ""]


    }


}
