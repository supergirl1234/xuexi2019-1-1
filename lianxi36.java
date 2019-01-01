public class lianxi36{
	
	
	public static void main(String[] args){
		//字符串转换为int类型
		String str1="123";
		int int1=Integer.parseInt(str1);//默认转换为10进制
		int int2=Integer.parseInt(str1,16);//表示转换为16进制i
		System.out.println(int1);
		System.out.println(int2);
		
		//字符串转换为double类型
		String str2="123.34";
		double double2=Double.parseDouble(str2);
		System.out.println(double2);
		
		//字符串转换为boolean类型
		//str true 的字符串即可，并且是忽略大小写，返回true，否则false
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("false"));
		System.out.println(Boolean.parseBoolean("abc"));
		System.out.println(Boolean.parseBoolean("True"));
		System.out.println(Boolean.parseBoolean("FALSE"));
		System.out.println(Boolean.parseBoolean("ABC"));
		
		System.out.println("-----------------------");
		String str = String.valueOf(100);
		System.out.println(str);
		String str3 = String.valueOf(100.34) ;
		System.out.println(str3);
		String str4 = String.valueOf(true) ;
		System.out.println(str4);
		
		
		int b=0b0110;//二进制表示方式
		System.out.println(b);
	}
}