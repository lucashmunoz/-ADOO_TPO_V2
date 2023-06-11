package controller;

public class ControllerFichaTecnica {
	private static ControllerFichaTecnica instance;
	private ControllerFichaTecnica() {}
	public static ControllerFichaTecnica getInstance() 
	{ 
		return instance;
	}
}
