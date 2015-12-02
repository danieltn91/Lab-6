import java.util.ArrayList;

// Evidence is backed by several claims
//	The strength of these supporting claims are
//	dependent on the validity of the claims overall.
public class Evidence {
	private ArrayList<Claim> claims;
	
	public Evidence(){
		claims = new ArrayList<Claim>();
	}
	
	public void addGameLicense(Claim cl){
		claims.add(cl);
	}
	
	public ArrayList<Claim> getSupportingClaims() {
		return claims;
	}
}
