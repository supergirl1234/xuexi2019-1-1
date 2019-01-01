//只要两个操作数中有一个是double类型的，另一个将会被转换成double类型，并且结果也是double类型，
//如果两个操作数中有一个是float类型的，另一个将会被转换为float类型，并且结果也是float类型，
//如果两个操作数中有一个是long类型的，另一个将会被转换成long类型，并且结果也是long类型，
//否则（操作数为：byte、short、int 、char），两个数都会被转换成int类型，并且结果也是int类型。但是final修饰的域类型不会发生变化.



public class lianxi25{ 
	public static void test(){
	    byte b1=1,b2=2,b3,b6,b8;
		final byte b4=4,b5=6,b7=9;
			b3=(byte)(b1+b2); /*语句1*/
			b6=b4+b5; /*语句2*/
			b8=(byte)(b1+b4); /*语句3*/
			//b7=(b2+b5); /*语句4*///该句是错误的
			System.out.println(b3+b6);
			
			/*final byte a1=10;
			byte a2=a1;*/  //这是OK的
		
			
		}
	public static void main(String[] args){
		
		test();
	}
}