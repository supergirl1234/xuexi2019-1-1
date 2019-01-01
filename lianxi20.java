public class lianxi20{
	public static void Exchange(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+" b="+b);
	}
	public static void change(char[] ch){
		ch[0]='a';
	
	}

	public static void main(String[] args){
		int a=5;
		int b=8;
		Exchange(a,b);
		System.out.println("a="+a+" b="+b);
		char[] ch=new char[]{'b','c'};
		change(ch);
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		
	
	}

}