package ppt4;

public class compactDisk extends Product{
	private String albumTitle;
	private String artist;

	public compactDisk(int productID, String description, String maker, int price, String albumTitle, String artist) {
		super(productID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void showInfo() {
		System.out.println("앨범제목>> "+albumTitle);
		System.out.println("아티스트>> "+artist);
	}
}
