package robin.lu.oop.testInterface;

public interface IFlyable {
	int MAX_SPEED = 11000;
	double MIN_HEIGHT = 1;

	void fly();
}

interface IAttack {
	void attack();	
}

class Plane implements IFlyable {

	@Override
	public void fly() {
		System.out.println("飞机依靠发动机飞！");

	}

}

class Man implements IFlyable {

	@Override
	public void fly() {
		System.out.println("跳起来,飞！ ");

	}

}

class Stone implements IFlyable,IAttack {
	int weight;
	
	@Override
	public void fly() {
		System.out.println("被人扔出去，飞 ！");
	}

	@Override
	public void attack() {
		System.out.println("被人扔出去，攻击！");
		
	}

}