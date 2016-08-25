package robin.lu.oop.polymorphism.myServlet;

public class HttpServlet {
	public void service(){
		System.out.println("HttpServlet.service()");
		doGet();
	}
	
	public void doGet(){
		System.out.println("HttpServlet.doGet()");
	}
	
	public void doPost(){
		System.out.println("HttpServlet.doPost()");
	}
}
