public class lianxi21{
	public static void main(String[] args) {
		new Student().print();
		new Person().print();
		
		//注意你当前使用的对象是通过哪个类new的
		Person person=new Student();
		person.print();
		
		
		Student p1=new Student();
		System.out.println(p1.getName());
}
}
class Person{
	public String name="Tom";

	public void print(){
		System.out.println("1.[Person]类的print方法");
	}
	//父类方法
	private void hello(){
		System.out.println("Person类的hello方法");
	}
	public void hehe(){
		System.out.println("Student类的hehe方法");
	}
	
}
class Student extends Person{
	private String name="Jack";
	public String getName(){
		
		//return this.name;
		return super.name;//访问父类的属性
	}
	
	//覆写了子类的print()方法
	//public >protected>[default]>private
	public void print(){
		
		//this是先查找本类，如果本类没有就调用父类
		this.hehe();
		//super.print();//访问父类的方法
		System.out.println("2.[Student]类的print方法");
	}
	//子类方法，与父类的hello方法无关，因为Person类中的hello方法是private的，子类看不到
	public void hello(){
		System.out.println("Student类的hello方法");
	}
}

