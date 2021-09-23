import java.util.*;

public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String string = "Hello world";    
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
				System.out.println("Inputkan Kata Pertama : ");    
				String A = input.nextLine();
				System.out.println("Inputkan Kata Kedua : ");   
				String B = input.nextLine();
				
				int count1 = 0;
				int count2 = 0;
		        int compare = A.compareTo(B);
		        
				for(int i = 0; i < A.length(); i++) {    
			        if(A.charAt(i) != ' ')    
			            count1++;    
			    }    
				for(int i = 0; i < B.length(); i++) {    
			        if(B.charAt(i) != ' ')    
			            count2++;    
			    }  
				System.out.println(Integer.sum(count1,count2)); 	
				
				if(compare>0) {
					System.out.println("Yes");
				}else if(compare == 0) {
					System.out.println("Equal");
				}else {
					System.out.println("No");
				}
				
				String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
		        String btemp = B.substring(0,1).toUpperCase()+B.substring(1);;
		        System.out.println(atemp+" "+btemp);
				
	}

}

/*Jadi hal yang saya dari hasil pengerjaan soal ini, 
 *saya jadi mengetahui cara untuk menghitung length dari sebuah string
 *mengetahui sedikit mengenai lexicographically
 *dan cara membuat huruf pertama pada sebuah kata nenjadi kapital */
