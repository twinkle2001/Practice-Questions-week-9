package PQW9;

public class q1 {
	
		public static boolean find3Numbers(int a[], int a_size, int s) 
		{ 

			
			for (int i = 0; i < a_size - 2; i++) { 

				
				for (int j = i + 1; j < a_size - 1; j++) { 

					
					for (int k = j + 1; k < a_size; k++) { 
						if (a[i] + a[j] + a[k] == s) { 
							System.out.print( a[i] + ", " + a[j] + ", " + a[k]); 
							return true; 
						} 
					} 
				} 
			} 

			
			return false; 
		} 

		
		public static void main(String[] args) 
		{ 
			 
			int a[] = {12, 3, 4, 1, 6, 9 }; 
			int s = 24; 
			int a_size = a.length; 

			find3Numbers(a, a_size, s); 
		} 
	} 

