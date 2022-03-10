public class Test_ {
    //全局变量
    static int[] a = new int[] {2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021, 2021};


    public static void main(String[] args) {
        for (int i = 1;; i++) {
            if (!count(i)) {
                System.out.println(i);
                break;
            }
        }
    }


    static boolean count(int x) {
        //循环条件为x不为零
        while (x!=0) {
            int t = x % 10;
            x /= 10;
            a[t]--;
            if (a[t] <= 0) {
                return false;
            }
        }
        return true;
    }

}
