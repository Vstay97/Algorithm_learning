import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
public class Test_ {
    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();

        track.add(1);
        track.add(2);
        track.add(3);

        res.add(track);
        System.out.println("res: " + res);
        track.add(4);
        System.out.println("res: " + res);
    }
}



