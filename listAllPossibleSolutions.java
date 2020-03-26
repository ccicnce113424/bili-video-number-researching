import java.util.ArrayList;

public class listAllPossibleSolutions {
    public static final long xor = 177451812;
    public static final String table = "fZodR9XQDSUm21yCkr6zBqiveYah8bt4xsWpHnJE7jL5VG3guMTKNPAwcF";
    public static final int[] used = { 11, 10, 3, 8, 4, 6 };

    public static void main(String[] args) {
        ArrayList<Integer> notUsed0 = new ArrayList<>();
        ArrayList<Integer> used0 = new ArrayList<>();
        for (int i = 2; i < 12; i++) {
            notUsed0.add((Integer) i);
        }
        for (int i : used) {
            used0.add((Integer) i);
            notUsed0.remove(notUsed0.indexOf(i));
        }
        list(notUsed0, used0);
    }

    public static void list(ArrayList<Integer> notUsed, ArrayList<Integer> used) {
        if (used.size() == 10) {
            calc(used);
        } else {
            for (int i : notUsed) {
                ArrayList<Integer> notUsed0 = new ArrayList<>(notUsed);
                ArrayList<Integer> used0 = new ArrayList<>(used);
                notUsed0.remove(notUsed0.indexOf(i));
                used0.add((Integer) i);
                list(notUsed0, used0);
            }
        }
    }

    public static void calc(ArrayList<Integer> s) {
        long av = 455017605;
        av ^= xor;
        String bv = "BV1Q541167Qg";
        long r = 0;
        for (int i = 0; i < s.size(); i++) {
            r += ((long) table.indexOf(bv.charAt(s.get(i)))) * ((long) Math.pow(58, i));
        }
        long add = r - av;
        out(s, add);
    }

    public static void out(ArrayList<Integer> list, long add) {
        System.out.println("s=" + list + ",add=" + add);
    }
}