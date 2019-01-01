public class lianxi7{
    private int codeline ;
    
    private String codeFileName;
    
    private int salary  ;
	//静态块
	static{
		
		System.out.println("lianxi7静态块");
	}
    //构造块
	{
		
		System.out.println("lianxi7的构造块，非静态块");
		codeline=10;
		salary=codeline*2;
	}
    //构造方法
	public lianxi7(){
		
		System.out.println("lianxi7的构造方法");
	}
	public lianxi7(int codeline,int salary){
		this.codeline=codeline;
		this.salary=salary;
		System.out.println("lianxi7的构造方法");
	}
	public static  void norCodeBlock(){
		{
			
			int x=10;
			System.out.println(x);
		}
		int x=100;
		System.out.println(x);
		
	}
    
    public static void main(String[] args){
		//lianxi7 per=new lianxi7();
		lianxi7 per2=new lianxi7(12,60000);
		System.out.println(per2.codeline);
		new lianxi7i();
		norCodeBlock();
		per2.norCodeBlock();
		
		
        
		
	}
}