package designpatterns;

import java.util.ArrayList;
import java.util.List;

public class SubjImpl implements Subject {

	List<Observe> observeList = new ArrayList<>();
	@Override
	public void attach(Observe observe) {
		observeList.add(observe);
	}
	
	@Override
	public void detach(Observe observe) {
		observeList.remove(observe);
	}
	
	@Override
	public void notify(String message) {
		for (Observe observe : observeList) {
			observe.update(message);
		}
	}
}
