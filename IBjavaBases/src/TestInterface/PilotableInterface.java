package TestInterface;

public interface PilotableInterface {
	public int cv=0;
	default void testPuissance() {
		System.out.println("test puissance avant décollage");
	}
	int getPuissance(int nbCv);
}
