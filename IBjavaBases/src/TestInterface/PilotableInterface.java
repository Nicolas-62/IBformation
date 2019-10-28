package TestInterface;

public interface PilotableInterface {
	default void testPuissance() {
		System.out.println("test puissance avant décollage");
	}
	int getPuissance(int nbCv);

}
