package TestInterface;

public class Avion implements PilotableInterface, ReparableInterface{
	public int getPuissance() {
		return 100;
	}
	public int getPuissance(int nbCv) {
		return nbCv*100;
	}
}
