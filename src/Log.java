
//	A log has a claim and is done through a media.
//   The media saves the claim to the log.
public class Log {
	String isValidClaim;
	Media media;
	public Log(){
		this.isValidClaim = " ";
		this.media = new Media();
	}
	
	public void saveToLog(){
		isValidClaim = "Claim To Property is Valid";
		media.saveToFile();
	}
	
	public Media getMedia() {
		return media;
	}
}
