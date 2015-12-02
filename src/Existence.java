
//	When something is created, it comes into existence.
//	The exisistence automatically exists when constructed.
public class Existence {
	private String name;
	private boolean doesExist;
	
	public class Existnece(String n) {
		name = n;
		doesExist = true;
	}
	
	public boolean doesThisExist() {
		return doesExist;
	}
}
