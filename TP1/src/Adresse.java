public class Adresse
{
	private String rue;
	private String rue2;
	private String codePostal;
	private String ville;
	
	public Adresse (String uneRue, String uneRue2, String unCodePostal, String uneVille)
	{
		rue = uneRue;
		rue2 = uneRue2;
		codePostal = unCodePostal;
		ville = uneVille;	
	}
	
	
	public String toString() {
		return "Adresse [ rue = " + rue + ", rue2 = " + rue2 + ", codePostal = "
				+ codePostal + ", ville = " + ville + "]";
	}


	public void AfficheToiAd()
	{
		System.out.println(toString()) ;
	}
	
	/*
	public String AfficheAd()
	{
		return rue+" "+rue2+" "+codePostal+" "+ville ;
	}
	*/
}


