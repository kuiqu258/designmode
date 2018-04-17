package observer;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(o.getClass().getName() + ":" + arg);
	}

}
