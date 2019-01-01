public class lianxi16{
	public static void main(String[] args){
		Outer outer=new Outer();
		outer.display(12);
		
	}

}


//匿名内部类必须继承一个抽象类或者实现一个接口
 
interface MyInterface {
	void test();//隐含的为public
}
class Outer  {
	
	
	private int num=20;
	//匿名内部类其实就是一个没有名字的方法内部类
	//final int value
	/*public void display(int value){
		//匿名内部类,实现了一个接口
		MyInterface my=new MyInterface(){
			
			public void test(){
				//来自Outer的成员方法的参数value
				System.out.println("value="+value);
				System.out.println("num="+num);
			}
		};
		my.test();
	}*/
	
	
	//还可以用下面的方法
	public void display(int value){
		//匿名内部类,实现了一个接口
		//匿名类没办法创建更多的对象，只能有一个匿名对象
		new MyInterface(){
			
			public void test(){
				//来自Outer的成员方法的参数value
				System.out.println("value="+value);
				System.out.println("num="+num);
			}
		}.test();
		
		
		
	}
}