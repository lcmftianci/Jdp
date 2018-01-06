package observerPattern;

import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<WeObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<WeObserver>();
	}
	
	public void registerObserver(WeObserver osv) {
		// TODO Auto-generated method stub
		observers.add(osv);
	}

	public void removeObserver(WeObserver osv) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(osv);
		if(i > 0){
			observers.remove(i);
		}
	}

	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i = 0; i < observers.size(); ++i){
			WeObserver observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
