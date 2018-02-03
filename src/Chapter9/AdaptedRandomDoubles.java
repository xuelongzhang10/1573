package Chapter9;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by zhangxuelong on 2018/2/3
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    public int read(CharBuffer cd) {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + "";
        cd.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble() + "");
        }
    }
}
