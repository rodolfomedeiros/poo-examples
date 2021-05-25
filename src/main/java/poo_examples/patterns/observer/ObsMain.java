package poo_examples.patterns.observer;

public class ObsMain {
	public static void main(String[] args) {
		var weather = new Weather();
	    weather.addObserver(new Orcs());
	    weather.addObserver(new Hobbits());
	    
	    //code
	    weather.timePasses();
	    weather.timePasses();
	    weather.timePasses();
	    weather.timePasses();
	}
}
