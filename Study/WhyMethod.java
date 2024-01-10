package Study;

public class WhyMethod {
    public static void printTwoTimesA() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(1);
        System.out.println(twoTimes("text","-"));
    }
    public static void main(String[] args) {
        printTwoTimesA();
    }
    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + delimiter + "\n"; // -
        out = out + text + "\n"; // -
                                // text
                                // text
        out = out + text + "\n"; //
        return out;

    }
}
