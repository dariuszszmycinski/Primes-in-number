import java.util.TreeMap;

public class PrimeDecomp {

    public static String factors(int n) {
        TreeMap <Integer, Integer> decomps = new TreeMap<>();
        while (n!=1){
            for (int i = 2; i <= n; i++) {
                if (n % i==0){
                    if (decomps.get(i)==null) decomps.put(i, 1);
                    else decomps.put(i, decomps.get(i)+1);
                    n = n/i;
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Integer key : decomps.keySet()) {
            sb.append("(").append(key);
            if ((decomps.get(key)>1)) sb.append("**").append(decomps.get(key));
            sb.append(")");
        }
        return sb.toString();
    }
}
