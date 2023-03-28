package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Ch02_2480 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        int result =0;
        int i = 0;
        while (tk.hasMoreTokens()) {
            list.add(i, Integer.parseInt(tk.nextToken()));
            i++;
        }

        Set<Integer> numSet = new HashSet<>(list);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer n : numSet) {
            map.put(n, Collections.frequency(list, n));
        }

        int max = map.keySet().stream()
                .max(Comparator.comparing(map::get))
                .orElse(null);

        if(map.containsValue(3)){
            result = 10000 + max * 1000;
        }else if(map.containsValue(2)) {
            result = 1000 + max * 100;
        }else{
            result = Collections.max(map.keySet()) * 100;
        }

        System.out.println(result);
    }
}
