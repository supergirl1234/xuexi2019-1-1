public class lianxi8{
    private String msg="this is a 外部类";
	private  int num=20;
	//Inner属于内部类，外部类lianxi8
	class Inner{
	     private String msg="this is a 内部类";
		 public void print(){
			 
		      System.out.println("这个是从Inner内部类的方法中输出的："+this.msg);
			  //内部类可以访问外部类的属性，但外部类不能访问内部类的属性
			  //内部类调用外部类的属性：方法为：外部类的属性.this.属性名名
			  System.out.println("这个是从Inner内部类的方法中输出的："+lianxi8.this.msg);
			  System.out.println(num);
			  System.out.println(msg);
		 
		 }
	
	}
    public void fun(){
		//在外部类的内部创建内部类对象
		 Inner stu=new Inner();
		 stu.print();
		System.out.println(this.msg);
		
	}
	public static void main(String[] args){
	     //lianxi8 per=new lianxi8();
		 //per.fun();
		 //在外部类的外部创建内部类对象
		 lianxi8.Inner ser=new lianxi8().new Inner();
		 ser.print();
		 
	
	}

}