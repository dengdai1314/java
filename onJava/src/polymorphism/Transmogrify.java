/**
 * 
 */
package polymorphism;

/**
 * @author �޻��
 * @file:Transmogrify.java
 * @createtime:2019��10��30��
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
		// TODO �Զ����ɵķ������
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
