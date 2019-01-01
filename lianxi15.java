public class lianxi15{
	public static void main(String[] args){
		Outer outer=new Outer();
		System.out.println(outer.getName());
		
		System.out.println(outer.getAge());
		//对于非静态内部类，内部类的创建依赖外部类的实例对象，在没有外部类实例之前是无法创建内部类的
		//外部类.内部类 内部类对象 = new 外部类().内部类();
		//非静态内部类要在其它地方使用的时候，创建对象的方式
		//InnerA成员内部类，非静态内部类
		//InnerA对象内部，引用了一个外部类对象的引用
		Outer.InnerA innerA=new Outer().new InnerA();
		System.out.println(innerA.name());
		System.out.println(innerA.getNum());
		
		System.out.println("----------------");
		
		//静态内部类创建不依赖外部类对象
		//外部类.内部类 内部类对象 = new 外部类.内部类();
		Outer.InnerC innerC=new Outer.InnerC();
		System.out.println(innerC.getNum());
		
		outer.display(13);
		
	}
}

class A{
	
	
	private String name="A属性";
	public String getName(){
		
		return this.name;
	} 
}
class B{
	
	
	private int  age=20;
	public int getAge(){
		
		return this.age;
	} 
}
class Outer {
	private int num=20;
	//成员内部类
	class InnerA extends A {
		public String name() {
			//return this.getName();//继承了父类的所有
			return super.getName();
		}
		public int getNum(){
			
			System.out.println("原始值"+Outer.this.num);//访问外部类的属性
			Outer.this.num=22;
			return Outer.this.num;
		}
	}
	class InnerB extends B {
		public int age() {
			return this.getAge();
		}
	}
	
	//静态内部类
	 static class InnerC{
		
		public int  getNum(){
			//return num;//error,因为静态内部类不可以使用任何外围类的非static成员变量和方法，而内部类则都可以
			return 33;
		}
		
	}
	//外部类访问内部类的方法或属性，通过创建内部类的实例化对象或者必须持有内部类的实例化对象的引用
	public String getName(){
		
		return new InnerA().name();
	}
	public int getAge(){
		
		return new InnerB().age();
	}
	
	
	//方法内部类
	//JDK8  public void display(final int test)
	//在方法内部类中，无论参数、还是变量，都是final类型的，不可修改。
	//无论这时你是否给变量添加final修饰符，编译器会自动添加
	public void display(int test){
		class Inner {
			private void fun() {
				num++;
				System.out.println(num);
				System.out.println(test);
				
			}
		}
		new Inner().fun();
		//test=22;//此处会报错，因为test是final类型的，不可修改
	}	
}
