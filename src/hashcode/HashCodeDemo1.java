package hashcode;

public class HashCodeDemo1 {

	public static void main(String[] args) {
		String str="Rajani";
		System.out.println(str.hashCode()); //-1854540799
	
		String str2=new String("Rajani");
		System.out.println(str2.hashCode());//-1854540799
		System.out.println(str.equals(str2)); //True
		
		System.out.println("------------------");
		
		String str3="Sabin";
		System.out.println(str3.hashCode()); //79639513
		String str4="Sabin";
		System.out.println(str4.hashCode()); //79639513
		System.out.println(str3.equals(str4)); //True
	
		String str5="Ram";
		System.out.println(str5.hashCode()); //-1854540799
	
		String str6=new String("Ram");
		System.out.println(str6.hashCode());//-1854540799
		System.out.println(str.equals(str6)); //True
	
	}

}
