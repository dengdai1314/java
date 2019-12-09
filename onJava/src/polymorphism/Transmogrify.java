/**
 * 
 */
package polymorphism;

/**
 * @author 罗火金
 * @file:Transmogrify.java
 * @createtime:2019年10月30日
 * @description:
 */
class Actor{
	public void act() {}
}

class HappyActor extends Actor{
	public void act(){
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor{
	@Override
	public void act() {
		// TODO 自动生成的方法存根
		System.out.println("SadActor");
	}
}

class Stage{
	 private Actor actor = new HappyActor();

	    public void change() {
	        actor = new SadActor();
	    }

	    public void performPlay() {
	        actor.act();
	    }
}
public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
	
}
