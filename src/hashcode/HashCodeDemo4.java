package hashcode;

import java.util.Objects;

public class HashCodeDemo4 {

	public static void main(String[] args) {
		Mobile mb=new Mobile(1500,"Nokia","Blue");
		Mobile mb2=new Mobile(1200,"Motorola","White");
		Mobile mb3=new Mobile(1500,"Nokia","Blue");
		Mobile mb4=new Mobile(1200, "Iphone", "White");
		
		System.out.println(mb.hashCode());  //1404928347      after overriding hashCode()--->36786995
		System.out.println(mb3.hashCode()); //1562557367      after overriding hashCode()--->36786995
		System.out.println(mb4.hashCode());
		System.out.println(mb.equals(mb3)); //FALSE          TRUE(after overriding equals()-->true)
		System.out.println(mb.equals(mb4));
	}
//overridden hashCode()+equals()
}

 class Mobile{
	int price;
	String name;
	String color;
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}
	
	
	
	
	
	

	
	
	@Override
	public int hashCode() {
		return Objects.hash(color, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name) && price == other.price;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [price=" + price + ", name=" + name + ", color=" + color + "]";
	}
	
	
	
}
