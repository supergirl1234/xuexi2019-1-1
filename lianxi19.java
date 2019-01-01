public class lianxi19{

	public static void main(String[] args){
	    new son();

	}
}
class Grandfather{
	public Grandfather(){
		System.out.println("爷爷");
	}

}
class father extends Grandfather{
	public father(){
		System.out.println("爸爸");
	}
}
class son extends father{
	public son(){
		System.out.println("儿子");
	}
}