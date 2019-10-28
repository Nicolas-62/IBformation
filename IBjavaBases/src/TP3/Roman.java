package TP3;

public class Roman extends Oeuvre{
	
	protected String format;
	public static int nbRoman=0;
	
	public Roman(String titre, String auteur, String format) {
		super(titre, auteur);
		this.genre = "roman";
		this.format = format;
		nbRoman++;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	@Override
	public String toString() {
		return super.toString()+String.format("format :\t\t %s", this.format);
	}
	
}
