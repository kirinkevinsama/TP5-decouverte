public class Personne 
{
	private String nom;
	private String prenom;
	private Adresse adresse;
	private String telephone;
	
	public Personne (String unNom, String unPrenom, Adresse uneAdresse, String unTelephone)
	{
		nom = unNom;
		prenom = unPrenom;
		adresse = uneAdresse;
		telephone = unTelephone;	
	}
	
	public Personne (String unNom, String unPrenom)
	{
		nom = unNom;
		prenom = unPrenom;
		adresse = new Adresse("inconnue", "", "", "");	
	}
	
	public void AfficheToi()
	{
		System.out.println(toString()) ;
	}
	
	public String toString() 
	{
		return "Personne [ nom = " + nom + ", prenom = " + prenom + ", adresse = "
				+ adresse + ", telephone = " + telephone + "]";
	}
	
	/*
	public String Affiche()
	{
		return "Les coordonnées de "+nom+" "+prenom+" sont : "+adresse+" au numéro de telephone : "+telephone ;
	}
	*/
	
	public String getNom() 
	{
		return nom;
	}


	public String getPrenom()
	{
		return prenom;
	}

}


