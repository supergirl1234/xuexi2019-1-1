//接口
//能用接口先用接口，接口的优先级高

//interface与class等级
interface IMessage{
	
	//相当于public static final String MSG="java is best";//常量 IMessage.MSG
	
	String MSG="java is best";
	
	abstract void print();//默认为public
	
}
