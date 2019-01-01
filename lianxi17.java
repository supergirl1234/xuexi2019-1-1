public class lianxi17{
	
	//类方法
	public static void printArray(Person[] person){
		for(int i=0;i<person.length;i++){
			System.out.println(person[i]);
		}
		
	} 
	public static void main(String[] args){
	   // Person person=new Person(1,"唐僧");
		//System.out.println(person);//person.toString();
		
		
		//String s="helloworld";//引用类型
		//System.out.println(s);//调用的是s.toString();//来自于继承
		
		//基本数据类型 8
		//引用数据类型 -- 通过类来创建对象
		
		//动态初始化
		Person[] person=new Person[3];//对象数组，String 也是对象数组
		person[0]=new Person(1,"Jack");
		person[1]=new Person(2,"Tom","Tom@gmail.com");
		person[2]=new Person(3,"Alice","Alice@gmail.com","1234567");
		lianxi17.printArray(person);
		
		
		//静态初始化
		Person[] person2=new Person[]{
			new Person(4,"Tony")
			
		};
		lianxi17.printArray(person2);
		
		
	}
}

class Person{
	private int id;
	private String name;
	private String email;
	private String phone;
	
	public Person(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public Person(int id,String name,String email){
		
		this(id,name);
		this.email=email;
	}
	
	public Person(int id,String name,String email,String phone){
		
		this(id,name,email);
		this.phone=phone;
	}
	public int getId(){
		
		return this.id;
	}
	public String getName(){
		
		return this.name;
	}
	public String getEmail(){
		
		return this.email;
	}
	public String getPhone(){
		
		return this.phone;
	}
	public void setId(int id){
		this.id=id;
		
	}
	public void setName(String name){
		this.name=name;
		
	}
	public void setPhone(String phone){
		this.phone=phone;
		
	}
	public void setEmail(String email){
		this.email=email;
		
	}
	
	//可以自己写一个toString()方法
	public String toString(){
		
		return "编号："+this.id+"姓名："+this.name+"邮箱："+this.email+"电话："+this.phone;
	}
	
	
}