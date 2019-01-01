public class lianxi23{
	public static void  main(String[] args){
		//子类对象 向上转型
		Person person=new Student();
		System.out.println(person.getPersonInfo());
		//System.out.println(person.getStudentInfo());//error,因为Person类里没有这个方法
		person.print();//调用的是子类的print()方法，print()方法被子类覆写了
		
		//父类对象，向下转型
		//Student student=new Person();//编译通不过
		
		/*Student student=(Student)new Person();//编译通过了，但运行时没法运行，运行时报错
		System.out.println(student.getPersonInfo());
		System.out.println(student.getStudentInfo());*/
		
		//Student student=person;//编译不通过
		Student student=(Student)person;
		
		//对象 instanceof 类名
		System.out.println(person instanceof Student);
		System.out.println(student instanceof Student);
		
		
		
		Person person2=new Person();
		if(person2 instanceof Student){
			Student student2=(Student)person2;
		}else{
			
			System.out.println("Person对象不能转换为Student对象");
		}
		
		Person person3=new Student();
		if(person3 instanceof Student){
			System.out.println("Person对象能转换为Student对象");
			Student student3=(Student)person3;
		}else{
			
			System.out.println("Person对象不能转换为Student对象");
		}
		
		
		
		/*int a=10;
		byte b=a;*/  //编译不了，要强转
		
		/*int a=10;
		byte b=(byte)a;*/
		
		
	}

}
class Person{
	
	public void print(){
		System.out.println("1.[Person]类的print方法");
	}

	public void hello(){
		System.out.println("Person类的hello方法");
	}
	public String getPersonInfo(){
		
		return "Person Info";
	}
	
}
class Student extends Person{
	
	
	
	//覆写了子类的print()方法
	public void print(){
		
		
		System.out.println("2.[Student]类的print方法");
	}
	public String getStudentInfo(){
		
		return "Student Info";
	}
	
	
}

