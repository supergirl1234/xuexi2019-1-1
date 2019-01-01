public class lianxi18{

   public static void main(String[] args){
	   Student student=new Student("Jack","男","1","bite");
	   System.out.println(student);
   }
} 


//学生、学号、学校
//java单继承

class Student extends Person{
	
	private String num;
    private String school;
	
	/*public Student(String name,String gender){
		
		super(name,gender);
	}*/
	public Student(String name,String gender,String num,String school){
		
		//直接赋值--》前提：能够访问到父类的属性
		//通过构造方法--》父类提供构造方法/带参数
		//通过setter方法--》能够访问到父类的seter方法
		
		//子类对象在进行实例化前一定会首先实例化父类对象。默认调用父类的构造方法后再调用子类构造方法进行子类对象初始化
		
		super(name,gender);
		this.num=num;
		this.school=school;
		System.out.println("这是Student子类的构造方法");
	}
	public String getNum(){
		
		return this.num;
	}
	public String getSchool(){
		
		return this.school;
	}
	public String toString(){
		
		//return "姓名："+this.getName()+" 姓别："+this.getGender()+" 学号："+this.getNum()+" 学校："+this.getSchool();
		return super.toString()+" 学号："+this.getNum()+" 学校："+this.getSchool();
	}
}


//面向对象的一个特性：封装    ，尽量对其不要修改，而是扩展，开闭原则
class Person{
	
	private String name;
    private String gender;
	
	public Person(String name,String gender){
		
		this.name=name;
		this.gender=gender;
		System.out.println("这是Person父类的构造方法");
	}
	
	public String getGender(){
		
		return this.gender;
	}
	public String getName(){
		
		return this.name;
	}
	
	//可以自己写一个toString()方法
	public String toString(){
		
		return "姓名："+this.name+" 姓别："+this.gender;
	}
	
	
}