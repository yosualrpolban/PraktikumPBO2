
public class ConvertDataType {

	static short methodOne(long l)
	 {
	 int i = (int) l;
	 return (short)i; 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 10.25;
		float f = (float) d; 
		byte b = (byte) methodOne((long) f); 
		System.out.println(b);
	}

}

/*Jadi hal yang saya dapat dari hasil pengerjaan soal ini, 
 *saya jadi mengetahui cara membuat nilai variable constant (tidak dapat diubah) */