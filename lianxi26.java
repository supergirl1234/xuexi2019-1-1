//抽象类
public class lianxi26{

	public static void main(String[] args){
	    Person person=new Student("张三");
		//抽象类的实例化对象可以通过其子类实例化（多态）
		System.out.println(person.getPersonInfo());
		
		 Person person2=new Teacher("张三");
		 System.out.println(person2.getPersonInfo());
		 
		  Person person3=Person.getPersonObject();//
		  System.out.println(person3.getPersonInfo());
		  
		  
		 String Info=new Person("王五"){
			
			public String getPersonInfo(){
				
				return "医生姓名"+getName();
			}
		}.getPersonInfo();
		 System.out.println(Info);
		 
	
	
	
	    //抽象内部类
		C c=new C();
		//C.D d=c.new D();//Ok
		A.B d=c.new D();//OK
		
		
		F f=new F();
		A.E E=new F();
		
	
	
	}
}
//抽象类
//抽象类无法实例化对象（即便类中没有抽象方法）
//抽象类中允许不定义任何的抽象方法，但是此时抽象类依然无法直接创建实例化对象
//抽象类一定不能使用final声明
abstract class Person{
	
	private String name;
	
	public Person(String name){
		this.name=name;
		
	}
	public String getName(){
		
		
		return this.name;
	}
	//抽象方法
	public abstract String getPersonInfo();
	
	public static Person getPersonObject(){
		
		//方法内部类（局部内部类）
		
		class Worker extends Person{
			public Worker(String name){
		        super(name);//如果抽象类没有无参构造方法，那么子类必须通过super明确指出使用父类哪个构造方法
		
	        }
			public  String getPersonInfo(){
				
				return "工人姓名"+getName();
			}
			
		}
		   return new Worker("王五");
		
		
		//匿名内部类-->必须继承一个父类或者实现一个接口
		/*return new Person("王五"){
			
			public String getPersonInfo(){
				
				return "工人姓名"+getName();
			}
		};*/
		
	}
		
}
//1.子类继承抽象类，必须实现父类的抽象方法(所有的)
//2.子类继承抽象类，如果没有覆写父类的抽象方法，则必须使用abstract修饰子类
//3.抽象方法不能使用private修饰
class Student extends Person{
	
	public Student(String name){
		super(name);
		
	}
	public  String getPersonInfo(){
		
		return "学生姓名"+this.getName();
	}
	
}
class Teacher extends Person{
	
	public Teacher(String name){
		super(name);
		
	}
	public String getPersonInfo(){
		
		return "老师姓名"+this.getName();
	}
	
}










abstract class A{
	
	abstract class B{
		
		
	}
	//静态内部类
	static abstract class E{
		
		
	}
	
}
class C extends A{
	
	
	class D extends B{
		
		
	}
}

//静态抽象继承子类
class F extends A.E{
	
	
}



















