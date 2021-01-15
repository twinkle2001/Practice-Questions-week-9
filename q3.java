package PQW9;
import java.util.TreeMap;
import java.util.Scanner;
public class q3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        Scanner sc=new Scanner(System.in);
       
       System.out.println("ENTER A NO.:");
       int n=sc.nextInt();
     System.out.println( toRoman(n, map));
	}
	public final static String toRoman(int number,TreeMap map) {
        int l =  (int) map.floorKey(number);
        if ( number == l ) {
            return  (String) map.get(number);
        }
        return map.get(l) + toRoman(number-l,map);
}
}