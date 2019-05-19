package project2;

public class OnlineSpel extends Spel {
	private String genre;
	private String url;
	
	public OnlineSpel(String naam, Uitgever uitgever) {
		super(naam, uitgever);
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Override
	public String toString() {
		return "Onlinespel" + super.toString() + ", genre=" + this.genre + ", url=" + this.url + "}";
	}
}
