package net.meng.topic;
import java.math.BigDecimal;
/**
 * Author: Meng Lu <lumeng.dev@gmail.com>
 * Date: 2017-6-18T17:27-0700
 *
 * @comment
 * https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
 */
public class JavaTypeRangeExperiment {
    public static int intMin = Integer.MIN_VALUE;
    public static int intMax = Integer.MAX_VALUE;
    public static short shortMin = Short.MIN_VALUE;
    public static short shortMax = Short.MAX_VALUE;
    public static long longMin = Long.MIN_VALUE;
    public static long longMax = Long.MAX_VALUE;
    public static float floatMin = Float.MIN_VALUE;
    public static float floatMax = Float.MAX_VALUE;
    public static double doubleMin = Double.MIN_VALUE;
    public static double doubleMax = Double.MAX_VALUE;

    public static void main(String[] args) {

        final Object[][] result = new String[6][];
        result[0] = new String[]{"type", "min", "max"};
        result[1] = new String[]{"int", Integer.toString(intMin), Integer.toString(intMax)};
        result[2] = new String[]{"short", Short.toString(shortMin), Short.toString(shortMax)};
        result[3] = new String[]{"long", Long.toString(longMin), Long.toString(longMax)};
        result[4] = new String[]{"float", Float.toString(floatMin), Float.toString(floatMax)};
        result[5] = new String[]{"double", Double.toString(doubleMin), Double.toString(doubleMax)};

        for (final Object[] row : result) {
            System.out.format("%10s%25s%25s%n", row);
        }

        System.out.println("All digits:");

        System.out.println("float:");
        System.out.println(new BigDecimal(floatMin).toPlainString());
        System.out.println();
        System.out.println(new BigDecimal(floatMax).toPlainString());
        System.out.println();

        System.out.println("double:");
        System.out.println(new BigDecimal(doubleMin).toPlainString());
        System.out.println();
        System.out.println(new BigDecimal(doubleMax).toPlainString());
        System.out.println();
    }
}
