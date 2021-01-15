package PQW9;
import java.util.TreeMap;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(1000, "M");
        m.put(900, "CM");
        m.put(500, "D");
        m.put(400, "CD");
        m.put(100, "C");
        m.put(90, "XC");
        m.put(50, "L");
        m.put(40, "XL");
        m.put(10, "X");
        m.put(9, "IX");
        m.put(5, "V");
        m.put(4, "IV");
        m.put(1, "I");
        Scanner sc=new Scanner(System.in);
       
       System.out.println("ENTER A NO.:");
       int n=sc.nextInt();
     System.out.println( toRoman(n, m));
	}
	public final static String toRoman(int num,TreeMap map) {
        int l =  (int) map.floorKey(num);
        if ( num == l ) {
            return  (String) map.get(num);
        }
        return map.get(l) + toRoman(num-l,map);
}
}