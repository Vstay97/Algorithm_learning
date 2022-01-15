import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int n = 4;
        int sum =0;
        int day =1;
        int week =1;

        for (int i=0;i<n;++i){
            sum += day+week-1;
            ++day;
            if(day == 8){
                day = 1;
                ++week;
            }
        }

        System.out.println(sum);
    }
}
