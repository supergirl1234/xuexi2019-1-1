public class lianxi9{


    public static void main(String[] args){
		//Outer outer=new Outer();
		//System.out.println(outer.getName());
		//System.out.println(outer.getAge());
		//在外部类的外部创建内部类对象
		Outer.InnerA innera1=new Outer().new InnerA();
	    System.out.println(innera1.name());
		//静态内部类的创建
		Outer.InnerC innerC=new Outer.InnerC();
		System.out.println(innerC.getNum());
		Outer outer=new Outer();
		outer.display(10);
	}
}
class A{
	
	private String name="A属性";
	public String getName(){
		
		return this.name;
	}
}
class B extends A{
	
	
	private int age=20;
	public int getAge(){
		
		return this.age;
	}
}
class Outer{
	private int num=20;
	class InnerA extends A{
		
		
		public String name(){
			
			return super.getName();
		}
		
		public int getNum(){
		
			System.out.println("原始值："+Outer.this.num);
			Outer.this.num=22;
			System.out.println("改变值："+Outer.this.num);
			return Outer.this.num;
	   }
	}
	
	class InnerB extends B{
		public int age(){
			
			
			return super.getAge();
		}
		
	}
	//静态内部类,不能访问外部类的非静态属性和方法
	public static class InnerC{
		
		public int getNum(){
			//return num;//是错误的
			return 33;
		}
	}
	public String getName(){
		
		//在外部类的内部创建内部类对象
		return new InnerA().name();
	}
	public int getAge(){
		
		return new InnerB().age();
	}
	
	//方法内部类，形参必须是final，这时不管你是否给形参添加final
	//修饰符，编译器会自动添加
	//该句也就相当于public void display(final int test)
	public void display(int test){
		
		int a=40;
		class Inner{
			
			public void fun(){
				
				num++;
				System.out.println(test);
				System.out.println(num);
				System.out.println(a);
			}
		}
		//方法内部类的调用
		new Inner().fun();
		
		
	}
		
	
	
	
	
}