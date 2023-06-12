package controller;

public class ControllerAlarma {
	private static ControllerAlarma instance;
	private ControllerAlarma() {}
	public static ControllerAlarma getInstance() {return instance;}
}
