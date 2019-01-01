 class Person{
	//类属性-》静态属性
	//static属性又称为类属性，保存在全局数据区的内存之中，所有对象都可以进行该数据区的访问
	static String country = "中国";
	String name;
	int age;
	public void getPersonInfo(){
		//System.out.println("姓名:"+this.name+",年龄："+this.age+"，国家："+this.Country);//同样可以执行
		//访问static属性（类属性）应使用类名称.属性名
		System.out.println("姓名:"+this.name+",年龄："+this.age+"，国家："+Person.country);//所有的非static方法允许访问static方法或属性
		Person.country="美国";
		//this.country="美国";//this也可以调用，但不建议这样写,因为static修饰的属性是类属性
	}
	public static void print(String message){
		
		//static方法不允许调用非static定义的属性或方法
		//所有的非static方法允许访问static方法或属性
		//System.out.println(this.name);//error
		//System.out.println(this.getPersonInfo());//error
		System.out.println(message);
	}
 }
 public class lianxi12{
	public static void main(String[] args) {
		
		//static属性（类属性）不受对象实例化控制，类名称.属性名
		System.out.println(lianxi11.country);//中国
		Person p1 = new Person();
		p1.name = "张三" ;
		p1.age = 10 ;
		Person p2 = new Person();
		p2.name = "李四" ;
		p2.age = 20 ;
		p1.getPersonInfo();
		p2.getPersonInfo();
		//print("hello");//静态方法，类方法;在lianxi11.java中可以编译通过，在该文件中编译不通过
		p1.print("java");//通过类名调用方法
		
		//如果不是静态方法，在main方法中就需要new一个对象，才能调用该方法
		//如果是静态方法，则在main方法中可以随便调用
	}
}