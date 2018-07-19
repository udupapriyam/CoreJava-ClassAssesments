package firstproject;

public class Band {
	private String bandName;
	private String[] singers;
	private String[] guitarists;
	private String drummer;
	private String keyBoardPlayer;
	
	public void setBandDetails(String bandName, String[] singers, String[] guitarists, String drummer, String keyBoardPlayer) {
		this.bandName=bandName;
		this.singers=singers;
		this.guitarists=guitarists;
		this.drummer=drummer;
		this.keyBoardPlayer=keyBoardPlayer;
	}
	
	public void printBandDetails() {
		System.out.println(bandName);
		for(int i=0; i<singers.length; i++) {
			System.out.print(singers[i]+" ");
		}
		System.out.println();
		for(int i=0; i<singers.length; i++) {
			System.out.print(guitarists[i]+" ");
		}
		System.out.println();
		System.out.println(drummer);
		System.out.println(keyBoardPlayer);
		System.out.println();
	}
	
	public int countNoArtists() {
		int count=2+singers.length+guitarists.length;
		return count;
	}
}
