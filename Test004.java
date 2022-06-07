import java.util.Arrays;

/**
 * @author David Wu
 * @version 1.0
 * @date 2022-05-10 14:24
 */
public class Test004 {
    public static void main(String[] args) {
        System.out.println("slow-fix branch 004");
        StringBuilder sb;
        sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(String.valueOf(i));
            sb.append("  ");
        }
        String resultStr = sb.toString().trim();
        System.out.println("result: " + resultStr);
        System.out.println("=======================");

        String[] strarray = resultStr.split("  ");
        System.out.println("resutl2: " + Arrays.toString(strarray));
        System.out.println("=======================");

        sb = new StringBuilder("I love");
        System.out.println("result:"+sb.toString());
        System.out.println("7th version");
        System.out.println("7.5th version");
        System.out.println("8th version");
    }
}
