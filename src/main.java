import java.util.ArrayList;


public class main {

	public static void main(String[] args) {
		
		ArrayList<Party> parties = new ArrayList<Party>();

		Party eaGames = new Party("EA");
		eaGames.addClaim("Battlefield 3");
		Party bethesda = new Party("Bethesda");
		bethesda.addClaim("Skyrim");
		bethesda.addClaim("Fallout 4");
		Party lucasArts = new Party("LucasArts");
		lucasArts.addClaim("Dark Forces");
		lucasArts.addClaim("Jedi Outcast");
		
		parties.add(eaGames);
		parties.add(bethesda);
		parties.add(lucasArts);
		
		ArrayList<videoGame> games = new ArrayList<videoGame>();
		
		videoGame fallout4 = new videoGame("Fallout 4", "Bethesda");
		videoGame skyrim = new videoGame("Skyrim", "Bethesda");
		videoGame battlefield3 = new videoGame("Battlefield 3", "EA");
		videoGame darkforces = new videoGame("Dark Forces", "LucasArts");
		videoGame outcast = new videoGame("Jedi Outcast", "LucasArts");
		
		games.add(darkforces);
		games.add(outcast);
		games.add(fallout4);
		games.add(battlefield3);
		games.add(skyrim);
				
		System.out.println("Verifying integrity of publisher claims...");
		
		for (int i = 0; i < games.size(); i++){
			String title = games.get(i).name;
			String party = games.get(i).publishingParty;
			
			System.out.println(title + ", " + party);
			
			for (int k = 0; k < parties.size(); k++){
				if (parties.get(k).name.equalsIgnoreCase(party)){
					boolean isValid = parties.get(k).checkClaim(title);
					System.out.println(isValid + "\n" + "----");
				}
			}
		}
		
		//display only LucasArts games
		System.out.println("Show only LucasArts games");
		String userSearchInput = "lucasarts";
		for (int i = 0; i < games.size(); i++){
			if (games.get(i).publishingParty.equalsIgnoreCase(userSearchInput)){
				for (int k = 0; k < parties.size(); k++){
					if (parties.get(k).name.equalsIgnoreCase(userSearchInput)){
						boolean checkValidity = parties.get(k).verifyIntegrity();
						if (checkValidity == true){
							System.out.println(games.get(i).name + ", " + games.get(i).publishingParty);
						}
					}
				}
			}
		}
	}

}
