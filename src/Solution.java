import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        //ArrayList<String> newList = new ArrayList<>();

        while (scanner.hasNext()) {
            String temp = scanner.next();
            if (temp.equals("q")) {
               break;
            }
            list.add(temp);
        }

        String arg = scanner.next().toLowerCase();

        for (String s : list) {
            String temp = s.toLowerCase();
            if (temp.contains(arg)) {
                System.out.println(s);
            }
        }
    }
}
