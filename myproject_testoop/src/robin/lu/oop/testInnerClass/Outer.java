package robin.lu.oop.testInnerClass;

public class Outer {
	public static void main(String[] args) {
		Face f = new Face();
		Face.Nose n = f.new Nose();
		n.breath();
		
		Face.Ear e=new Face.Ear();
		e.listen();
		
	}
}

class Face {
	int type;
	String sharp="??????";
	static String color ="????";

	class Nose {
		String type;

		void breath() {
			System.out.println(sharp);
			System.out.println(Face.this.type);
			System.out.println("??????");
		}
	}
	
	static class Ear{
		void listen(){
			System.out.println(color);
			System.out.println("??????");
		}
	}
}