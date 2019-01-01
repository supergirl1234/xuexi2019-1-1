//final关键字
//1、被final修饰的类不能被继承
//2、final能修饰 类、方法、属性、变量、参数
//3、被final修饰的方法不能被覆写
//4、final修饰的属性，要在构造方法中初始化 或直接初始化
//5、final修饰的属性、变量（引用）、参数，一旦被初始化，就不能赋值了
//6、final定义常量：static final <DataType> A_B
public class lianxi22{
	public static void  main(String[] args){
		
		A a=new A("Jack");//就不能修改了
		
	}

}
class A{
	private final int age=20;
	//一般定义常量这样写，加上static
	//private static final int age=20
	
	private final String name;//或者直接private final String name="Java";
	public A(String name){
		this.name=name;
		
	}
	

		
}
