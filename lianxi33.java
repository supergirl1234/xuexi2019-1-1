//设计模式
public class lianxi33{
	
	
    public static void code1(){
		//普通方式
		/*Client client=new Client();
		
		//我买的计算机，需要在客户端明确指定，
		//一旦代码发生改变，客户端代码也要发生变化，这就叫耦合
		//尽量让代码高内聚，低耦合
		Computer macbookcomputer=new MacbookComputer();
		client.buy(macbookcomputer);
		client.buy(new SurfaceComputer());*/
		
		
		
		
		/*Client client=new Client();
		//客户端不需要知道计算机接口的具体实现类，指定类型名称(编号)
		client.buy(SimpleComputerFactory.getInstance("mac"));
		//client.buy(SimpleComputerFactory.getInstance("mi"));//null*/
		
		
		
		//交互式
		  //1.通过参数
		 /* Client client=new Client();
		   if(args.length>0){
			   String type=args[0];
			  Computer computer=SimpleComputerFactory.getInstance(type);
			   if(computer==null){
				   
				   System.out.println("输入的1类型"+type+"不支持");
			   }else{
				   
				   client.buy(computer);
			   }
		   }else{
			   System.out.println("请输入计算机类型：mac,surface,alineware");
			   
		   }*/
		  
		  //2.通过读取客户端用户输入数据（控制台）
		  Client client=new Client();
		  while(true){
			  
			  System.out.println("请输入计算机类型：mac,surface,alineware,输入q退出");
			  java.util.Scanner scanner=new java.util.Scanner(System.in);
			  String value=scanner.nextLine();
			  if(value.equals("q")){
				  break;
				  
			  }
			  Computer computer=SimpleComputerFactory.getInstance(value);
			   if(computer==null){
					   
					   System.out.println("输入的1类型"+value+"不支持");
				}else{
					   
					  client.buy(computer);
				}
		  }
	}
	
	
	public static void code2(){
		
		 Client client=new Client();
		 ComputerFactory computerFactory=new MacbookComputerFactory();
		 Computer computer=computerFactory.createComputer();
		 client.buy(computer);
	}
	
	
	
	public static void main(String[] args){
		Client client=new Client();
		ProductFactory  productFactory=new AppleProductFactory();
		//Computer computer=productFactory.createComputer();
		//OperateSystem operateSystem=productFactory.createSystem();
		Product product=productFactory.createProduct();
		//computer.printComputer();
		//operateSystem.printSystem();
		//Product product=new Product(operateSystem,computer);
		product.printProductInfo();
	}
	
}


class Client{
	  public void buy(Computer computer){
		  
		  computer.printComputer();
	  }
}

class Product{
	
	private OperateSystem operatesystem;
	private Computer computer;
	public Product(OperateSystem operatesystem,Computer computer){
		
		this.operatesystem=operatesystem;
		this.computer=computer;
	}
	public void printProductInfo(){
		
		this.computer.printComputer();
		this.operatesystem.printSystem();
	}
	
}

interface Computer{
	
	
	void printComputer();
}

interface OperateSystem{
	
	void printSystem();
}
//简单工厂
class SimpleComputerFactory{
	
	public static Computer getInstance(String type){
		 Computer computer=null;
		switch(type){
			case "mac":
			     //return new MacbookComputer();
				 
				 computer=new MacbookComputer();
				 break;
		    case "surface":
			     computer=new SurfaceComputer();
				 break;
			case "alienware":
			    computer=new AlienwareComputer();
				 break;
		    default:
				 System.out.println("计算机工厂不能创建指定类型："+type+"的计算机");
			     
		}
		return  computer; 
	}
}


//工厂方法
interface  ComputerFactory{
	
	Computer createComputer();
	
}


//抽象工厂方法
interface ProductFactory{
	//工厂创建计算机
	Computer createComputer();
	//工厂创建操作系统
	OperateSystem  createSystem();
	
	Product createProduct();
}




class MacbookComputer implements Computer{
	
	 public void printComputer(){
		System.out.println("这是一台 MacbookComputer");
	 }
	
}

class MacbookComputerFactory implements ComputerFactory{
	
	 public Computer createComputer(){
		return new MacbookComputer();
	 }
	
}

class MacOs implements OperateSystem{
	
	public void printSystem(){
		System.out.println("这是MacOs操作系统");
		
	}
}

class  AppleProductFactory implements ProductFactory{
	public Computer createComputer(){
		return new MacbookComputer();
	 }
	 public OperateSystem createSystem(){
		 
		 return new MacOs();
	 }
	 public Product createProduct(){
		 
		 return new Product(this.createSystem(),this.createComputer());
	 }
	  
}





class SurfaceComputer implements Computer{
	 public void printComputer(){
		System.out.println("这是一台SurfaceComputer");
	 }
}

class SurfaceComputerFactory implements ComputerFactory{
	 public Computer createComputer(){
		return new SurfaceComputer();
	 }
}
class Windows8 implements OperateSystem{
	
	public void printSystem(){
		System.out.println("这是Windows8操作系统");
		
	}
}
class  MspProductFactory implements ProductFactory{
	public Computer createComputer(){
		return new SurfaceComputer();
	}
	 public OperateSystem createSystem(){
		 
		 return new Windows8();
	 }
	 public Product createProduct(){
		 
		 return new Product(this.createSystem(),this.createComputer());
	 }
	  
}

class AlienwareComputer implements Computer{
	 public void printComputer(){
		System.out.println("这是一台AlienwareComputer");
	 }
}