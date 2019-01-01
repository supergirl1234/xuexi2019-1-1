public class lianxi29{

   public static void main(String[] args){
	   /*QQMessage  qq=new QQMessage ();
	   qq.print();
	   
       System.out.println(IMessage.MSG);*/
	   
	  IMessage imessage=new QQMessage();
	   Platform platform1=new QQMessage();
	   QQMessage  qqmessage=new QQMessage();//都是OK的
	   
	   
	    IMessage msn=new MsnMessage();
	    msn.print();
	   
	   IMessage qq=new QQMessage();//在运行时才会看到new QQMessage();,编译时看不到，只能看到IMessage qq
	   //qq.print();
	   
	   //qq.supportPlatform();//编译不通过，qq是 IMessage类型的，在 IMessage中没supportPlatform()方法
	   
	  
	   
	   // System.out.println(qq instanceof Platform);//true
	   //Platform platform=qq;//编译不通过，要强转
	   Platform platform=(Platform)qq;//强转了，编译可以通过，但能不能运行取决于 qq instanceof Platform
	  
	  /* Company company=qqmessage;
	   company.printCompany();*///OK
	   
	   //Company company=platform;//编译不通过
	   Company company=(Company)platform;//编译通过，platform指向的是QQMessage,运行也Ok
	   company.print();
	   company.printCompany();
	   
	   
	   MsnMessage msnmessage=new MsnMessage();
	   Platform platform2=msnmessage;//ok  ok
	    //Company company=platform2;//error
	   //Company company=(Company)platform2;//编译通过（ok），运行出错（error），Platform与 Company无关 
	  
	  
	  
	  //内部静态接口
	  
	  System.out.println("--------------");
	  C c=new C();
	  c.print();
	  
	  A.B b=new C();
	  b.print();
	  
	  A.B d=c;
	  d.print();
	  
	  
	   
   }
}
//1.接口的实现类，要实现接口的抽象方法
//2.接口中定义的方法，默认为public
//3.接口中定义的变量，实际就是全局变量，默认是public static final
//4.子类可以实现多个接口，子类的实例化对象可以向上转型成任意接口类型
//5.子类可以继承抽象类（类），先extends再implements
//6.抽象类可以实现接口（多个），接口的方法抽象类可以选择实现,如果抽象类不实现它所实现的接口中的抽象发法，则抽象类的子类就必须实现接口中的方法
//7.接口不能继承抽象类，可以继承接口并且是多继承
class QQMessage  extends Company{
	
	 /*public void print(){
		
		
		System.out.println("这是QQMessage");
	}*/
	 public void supportPlatform(){
		 System.out.println("QQ支持windows和Macos平台");
		 
	 }
	 
	 public void printCompany(){
		 System.out.println("Tencent出品");
		 
	 }
	
}

class MsnMessage implements IMessage,Platform{
	 public void print(){
		
		System.out.println("这是MsnMessage");
	}
	 public void supportPlatform(){
		 System.out.println("Msn支持windows平台");
		 
	 }
}

abstract class Company implements IMessage,Platform{
	
	
	public abstract void printCompany();
	public void print(){
		System.out.println("这是company实现的print方法");
	}
}



interface A{
	
	void print();
	//内部接口
	static interface B{
		
		
		void print();
	}
}

class  C implements A.B{
	
	
	public void print(){
		
		System.out.println("这是接口A的内部静态接口B的方法，由C类实现");
	}
}





















	