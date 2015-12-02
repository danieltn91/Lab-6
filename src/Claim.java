// A claim needs to be valid/invalid and requires a target.
public class Claim {
	private String name;
	private String target
	private boolean isValidClaim;
	
	public Claim(String name){
	
		this.isValidClaim = false;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTarget() {
		return target;
	}
	
	public boolean isValidClaim() {
		return isValidClaim;
	}
	
	public void makeClaim(String target) {
		// make a claim to target
	}
}
