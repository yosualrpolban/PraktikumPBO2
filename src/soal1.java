import java.util.*;

public class soal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		
		for(int i=0; i<T;i++) {
			try {
				long x=input.nextLong();


	                System.out.println(x+" can be fitted in:");


	                if(x>=-128 && x<=127)System.out.println("* byte");


	                if(x>=-32768 && x<=32767)System.out.println("* short");


	                if(x>=-2147483648 && x<= 2147483647)System.out.println("* int");


	                if(x>=-9223372036854775808L && x<= 9223372036854775807L)System.out.println("* long");
			}catch (Exception e){
                System.out.println(input.next()+" can't be fitted anywhere.");
			}
		}
	}

}

/*Jadi hal yang saya dapat dari hasil pengerjaan soal ini, 
 *saya jadi mengetahui kapasitas dari beberapa tipe data */
