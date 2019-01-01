public class lianxi24{
	
	public static void showA(A a){
		System.out.println(a.getInfo());
		
		
	}
	public static void  main(String[] args){
		
		showA(new A());
		showA(new A1());//向上转型
		showA(new A2());
		showA(new A3());
		
	}

}
class A{
	
	String getInfo(){
		
		
		return "A";
	}
}
class A1 extends A{
	String getInfo(){
		
		
		return "A1";
	}
	
}
class A2 extends A{
	String getInfo(){
		
		
		return "A2";
	}
	
}
class A3 extends A{
	String getInfo(){
		
		
		return "A3";
	}
	
}