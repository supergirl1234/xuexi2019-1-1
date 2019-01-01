public  class lianxi32{
    public static void main(String[] args){
		
		Parking parking=new Parking(9,4);
		/*Car bus=new Bus();
		parking.park(bus);
		
		Car auto=new Auto();
		parking.park(auto);
		
		Car motor=new Motor();
		parking.park(motor);*/
		
		
		//改成对象数组,这样更简单，方便添加
		
		Car[] cars=new Car[]{
			new Bus(),new Auto(),new Motor()
			
		};
		for(int i=0;i<cars.length;i++){
			
			parking.park(cars[i]);
		}
	
	}
}


class Parking {
	private  int standardLength=3; 
	private  int standardWidth=2; 
	
	public Parking(){
		
		
	}
	
	public Parking(int length,int width){
		this.standardLength=length;
		this.standardWidth=width;
		
	}
	public void park(Car car){
		if(car.length()<=standardLength&&car.width()<=standardWidth){
			System.out.println("这个车可以停"+car);
			
		}else{
			System.out.println("这个车不可以停"+car);
			
		}
		
	}
}

interface Car{
	 int length();
	 int width();
	
}

class Bus implements Car{
	//优化之后的
	private static final int MAX_LENGTH=3;
	private static final int MAX_WIDTH=3;
	
	private int length=9;
	private int width=4;
	public Bus(){
		
		
	}
	public Bus(int length,int width){
		if(length>MAX_LENGTH||width>MAX_WIDTH){
			
			throw new IllegalArgumentException("参数不合法");
		}
		this.length=length;
		this.width=width;
	}
	public int  length(){
		
		return this.length;
	}
	public int width(){
		
		return this.width;
	}
	
	//覆写了Object类中toString();java所有类继承Object类
	public  String toString(){
		
		return "Bus widrh="+this.width()+" length="+this.length();
	}
	
}
class Auto implements Car{
	public int  length(){
		
		return 3;
	}
	public int width(){
		
		return 2;
	}
	public  String toString(){
		
		return "Auto widrh="+this.width()+" length="+this.length();
	}
	
}
class Motor implements Car{
	
	public int  length(){
		
		return 2;
	}
	public int width(){
		
		return 1;
	}
	public  String toString(){
		
		return "Moto widrh="+this.width()+" length="+this.length();
	}
	
}
