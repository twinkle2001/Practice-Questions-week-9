package PQW9;

public class q2 {

	public static void main(String[] args) {
		
		String s=new String("INDIA IS GREAT");
		String str=new String("IN");
		
        
        char [] c1 = s.toCharArray();
        char [] c2 = str.toCharArray();
       
        
            for(int j=0;j<c2.length;j++) {
                for(int i=0;i<c1.length;i++) {

                if(c1[i] == c2[j]) {
                    c1[i]=0 ;
                }    
            }
        }

        System.out.println("AFTER REMOVING:");

        for(int i=0;i<c1.length;i++) {
            System.out.print(c1[i]); 
	}
	}
}
