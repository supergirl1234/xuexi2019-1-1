public class lianxi13{
	
	private int codeline;
	private String codeFileName;
	private int salary;
	
	//在主类中定义的静态块，优先于主方法（main）执行
	
	//1. 静态块优先于构造块执行。
	//2. 无论产生多少实例化对象，静态块都只执行一次。
	//就算不创建对象，static静态块也会被执行，在类加载的时候调用一次
	//将类加载到虚拟机中
	static{
		
		System.out.println("静态块");
	}
	
	{//暗示，他的执行在lianxi13()构造方法之前
	 //构造块
	 
	// 构造块优先于构造方法执行，每产生一个新的对象就调用一次构造块,构造方法，构造块可以进行简
    //单的逻辑操作（在调用构造方法前）
		System.out.println("构造块，非静态块");
		codeline=10;
		//这里也可以进行初始化
		salary=codeline*2;
		
	}
	public lianxi13(){//构造方法
	    //在这里进行初始化
		System.out.println("lianxi13的构造方法");
		
	}
	
	
    /*public static void main(String[] args){
		//一般如果方法中代码过长，为避免变量重名，使用普通代码块。（使用较少，了解概念即可）。
		{//直接使用{}定义，普通方法块
		int x = 10 ;
		System.out.println("x = " +x);
		}
		int x = 100 ;//如果没有上面的{}代码块，此处会出错
		System.out.println("x = " +x);
	}*/
	
	public static void main(String[] args){
		
		lianxi13 p1=new lianxi13();
		lianxi13 p2=new lianxi13();
		new lianxi14();
	}
}