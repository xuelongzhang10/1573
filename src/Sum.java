public class Sum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i += 2;
        }
        System.out.println("1-100之内的奇数和是" + sum);
    }
}

class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum = sum + i;
        }
        System.out.println("1-100之内的偶数和是" + sum);
    }
}

class Divide {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i <= 1000) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
                count++;
                if (count % 3 == 0) {
                    System.out.println();
                }
            }
            i++;
        }
    }
}
//todo 第六期 96-100