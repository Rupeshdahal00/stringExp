package stringExp;

public class StringDemo2 {

    public static void main(String[] args) {
        String str="Sagin";  //intern Pool/String literal pool
        String str2=new String("Sagin");  //heap memory


        String str3="Sagin";
        String str4=new String("Sagin");//Heap Memory

        System.out.println(str==str2);//False
        System.out.println(str==str3);//true
        System.out.println(str2==str4);//False
        System.out.println(str==str4);//False

        System.out.println("---------------");

        //concatenate two string together
        System.out.println(str+str2);//SaginSagin
        System.out.println("GoodMorning"+" Bye");
        System.out.println(str+" Hi");//Sagin Hi

    }

}
