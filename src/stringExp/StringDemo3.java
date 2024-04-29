package stringExp;

public class StringDemo3 {

	public static void main(String[] args) {
		String str="Sagin";
		String str2="Rajani";
		String str6=new String("Rajani");
		//Some basic operations
		String str3=str+str2;//concatenate two strings together
		
		System.out.println(str3); 
		System.out.println("-------------");
		String str4="Good"+4+6+7;
		System.out.println(str4); // Good467
		String str5=4+6+7+"Good"+4+6+7;
		System.out.println(str5); //17Good467
		System.out.println("-------------");
		System.out.println(str2==str6);//False  <-- compared on address basis
		System.out.println(str2.equals(str6));  //True <-- compared on data basis 
		
		
	}

}
