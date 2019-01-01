
import java.util.*;
public class lianxi37{
	
	public static void swap(int args1,char[] ch){
		args1=10;
		char[] chars=ch;
		chars[0]='A';
		
	}
	
	public static void main(String[] args){
		int a=20;
		char[] ch=new char[]{'a','b'};
		swap(a,ch);
		System.out.println(a);
		System.out.println(Arrays.toString(ch));
		
		//java语言中参数传递：值传递（栈空间的内容）
		//基本数据类型-》存放在 栈空间
		//引用数据类型：栈空间  存放的是 引用的对象所在的堆空间的地址
	   //               堆空间  存放的是   数据
	}
}