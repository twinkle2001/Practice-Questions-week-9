package PQW9;

public class q4 {

	public static void main(String[] args) {
		int no = 7; 
        pattern(no);

	}
	static void pattern(int no) 
    { 
       
        int s = no / 2, n = 1; 
  
        for (int i = 1; i <= no; i++) { 
  
            for (int j = 1; j <= s; j++) 
                System.out.print(" "); 
  
            int c = n / 2 + 1; 
            for (int k = 1; k <= n; k++) { 
                System.out.print(c); 
                if (k <= n/ 2) 
                    c--; 
                else
                    c++; 
            } 
  
            System.out.println(); 
            if (i <= no / 2) { 
  
               
                s = s - 1; 
                n= n+ 2; 
            } 
  
            else { 
  
                
                s = s + 1; 
                n= n- 2; 
            } 
        } 
    } 
}
