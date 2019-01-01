public class lianxi28{

     public static void main(String[] args){
	 
		 Coffee coffee=new Coffee();
		 coffee.makeDrink();
		 
		 System.out.println("-----------");
		 
		 Tea tea=new Tea();
		 tea.makeDrink();
		 
		  System.out.println("-----------");
		  
		 Juice juice=new Juice();
		 juice.makeDrink();
		 
		  System.out.println("-----------");
		 
		 Coffee coffee2=new Coffee(false);//这样子就不加辅料了
		 coffee2.makeDrink();
	 }
	 

}


abstract class Drink{
	//制作饮品的工艺流程
	//模板设计模式 makeDrink模板
	
	//流程发生改变，只需要在父类的模板方法中修改
	public final void makeDrink(){
		this.boilWater();
		this.waterInputCup();
		this.addMajorIngredient();
		//this.addMinorIngredient();
		if(this.isAddMinorIngredient()){
			this.addMinorIngredient();
			
		}
		
	}
	
	public boolean isAddMinorIngredient(){
		
		return true;
	}
	public final void boilWater(){
		
		System.out.println("1.烧水");
	}
	
	public final void waterInputCup(){
		
		System.out.println("2.将水倒入杯子");
		
	}
	
	public abstract void addMajorIngredient();
	public abstract void addMinorIngredient();
}
class Coffee extends Drink{
	
	public boolean minorIngredient=true;
	
	public Coffee(){
		
		
	}
	
	public Coffee(boolean minorIngredient){
		
		this.minorIngredient=minorIngredient;
	}
	
	//主料
	public void addMajorIngredient(){
		
		System.out.println("3.将咖啡倒入水中");
		
	}
	//辅料
	public void addMinorIngredient(){
		
		System.out.println("4.加糖或牛奶");
		
	}
	//覆写父类的方法
	public boolean isAddMinorIngredient(){
		
		return this.minorIngredient;
	}
}

class Tea extends Drink{
	
	public void addMajorIngredient(){
		
		System.out.println("3.将茶倒入水中");
		
	}
	public void addMinorIngredient(){
		
		System.out.println("4.加柠檬");
		
	}
}

class Juice extends Drink{
	
	
	public void addMajorIngredient(){
		
		System.out.println("3.将芒果汁倒入水中");
		
	}
	
	//即使没用到也要继承抽象方法
	//子类继承抽象类，必须实现父类的抽象方法(所有的)
	public void addMinorIngredient(){
			
		
	}
	
}



//模板设计模式的基类（超类，父类）


abstract class TemplateClass{
	
	
	
	//模板方法
	//返回值-根据实际情况决定
	//final修饰，public
	
	public final void templateMethod(){
		this.methodOptional1();
		this.methodOptional2();
		if(this.isSupportMethodOptional3){
			this.methodOptional3();
		}
		this.methodOptional4();
		

	}
	
	//普通方法
	public void methodOptional1(){
		
		//此处有代码
		this.hook();
		
	}
	//抽象方法
	public abstract void methodOptional2();
		
	//不希望子类覆写
	public final void methodOptional3(){
		//此处有代码
		
	}
	
	public abstract void methodOptional4();
	
	//改变流程的方法，子类可以覆写
	public boolean isSupportMethodOptional3(){
		
		return true;
		
	}
	//钩子方法，什么事都不干，子类来决定要不要添加一些逻辑
	public void hook(){
		
		//空方法体
	}
}


























