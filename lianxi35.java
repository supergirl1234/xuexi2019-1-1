
//Object类
public class lianxi35{
	public static void fun(Object obj){
		System.out.println(obj);//obj.toString();
		
	}
	public static void  code1(){
		Person person=new Person();
		Student student=new Student();
		Person person1=student;//OK,ok
		Object obj1=person;//OK,ok
		Object obj2=student;//ok,ok
		fun(person);
		fun(student);
		fun(person1);
		fun(obj1);
		fun(obj2);
		
	}
	public static void  code2(){
		Person person1=new Person();
		person1.setName("jack");
		person1.setAge(18);
		
		Person person2=new Person();
		person2.setName("Tom");
		person2.setAge(19);
		
		Person person3=person1;
		
		Person person4=new Person();
		person4.setName("jack");
		person4.setAge(18);
		
		System.out.println(person1==person2);//false
		System.out.println(person1==person3);//true
		
		System.out.println(person1.equals(person2));//false
		System.out.println(person1.equals(person3));//true
		System.out.println(person1.equals(person4));//true*
		
	}
	public static void  code3(){
		//Object能够接受java所有类型的对象(类、接口、数组)
		Object obj1=new int[]{1,2,3,4};
		
		int[] data=(int[])obj1;//要强转，否则编译不通过
		//增强的for循环  foreach
		for(int  value:data){//value是数组里面的元素
			
			System.out.print(value+",");
		}
		
		//Object接受接口类型
		//向上转型
		Object obj2=new IMessage(){
			
			public void print(){
				System.out.println("java is best");
				
			}
		};
		
		//向下转型
		IMessage imessage=(IMessage) obj2;
		imessage.print();
		
		
		
		//Object obj3=10;//ok,ok  基本数据类型为何能够转型到引用数据类型  包装类型的内容
		//包装-->装箱
		Object obj3=new IntWrapper(10);
		//System.out.println(obj3);//10
		IntWrapper intWrapper=(IntWrapper)obj3;
		//打开包装--》拆箱
		int intValue=intWrapper.getValue();
		
		
		//String str1=10;//error
		//Person p=10;//error
		
		
	}
	
	public static void main(String[] args){
		Integer intObj=new Integer(10);//10->装箱->intObj
		int intValue=intObj.intValue();//intObj->拆箱->10
		System.out.println(intValue);
		
		//JDK自动 装箱，拆箱
		//1.包装类
		//2.自动装箱，拆箱
		Object obj3=10;
		int value=(int)obj3;
		
		
		Number number1=10;
		Object obj4=false;
		
		
		//自动装箱，拆箱
		Integer x=55;//new Integer(55)
		//可以直接利用包装类对象操作
		//x.intValue
		System.out.println(++x * 5);
		
	}	
		
}

//10->引用类型
class IntWrapper{
	
	public final int value;
	public IntWrapper(int value){
		this.value=value;
	}
    public int getValue(){
		return this.value;
	}
	public String toString(){
		
		return this.value+"";
	}
}

interface IMessage{
	
	void print();
}

class Person{
	
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
		
	}
	public void setAge(int age){
		this.age=age;
		
	}
	public String  getName(){
		return this.name;
		
	}
	public int  getAge(){
		return this.age;
		
	}
	
	public boolean equals(Object obj){
		
		if(obj==null){
			return false;
			
		}
		//this 和 obj是同一个对象(此时比的地址)
		if(this==obj){
			return true;
			
		}
		//this 和 obj不是同一个对象（此时比的内容）
		//name,age
		if(obj instanceof Person){
			
			Person that=(Person)obj;
			return this.getName().equals(that.getName())&& this.getAge()==that.getAge();
		}
		return false;
	}
		
		
	
	public String toString(){
		//大量拼接字符串--》StringBuffer（安全的），StringBuilder（不安全的）
		return "Name="+this.getName()+" Age="+this.getAge();
	}
}

class Student extends Person{
	
	
}