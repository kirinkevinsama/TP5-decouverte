import java.util.ArrayList;

public class Repertoire 
{
	private ArrayList <Personne> ListePersonnes;

	public Repertoire ()
	{
		ListePersonnes = new ArrayList<Personne>();
	}
	
	public void ajoutPersonne(Personne unePersonne)
	{
		ListePersonnes.add(unePersonne);
	}
	
	public String toString() 
	{
		String res = "";
		int i;
		for (i=0; i <ListePersonnes.size();i++)
		{
			res = res + ListePersonnes.get(i).toString() + "\n";
		}
		return res;
	}
	
	
	public  String RechercheN(String nom)
	{
		String res = "";
		int i;
		for (i=0; i <ListePersonnes.size();i++)
		{
			if (nom == ListePersonnes.get(i).getNom())
			{
				res = res + ListePersonnes.get(i).toString() + "\n";
			}
		}
		return res;
	}	
	
	public  Personne RechercheNP(String nom, String prenom)
	{
		for (Personne personne :  ListePersonnes) 
		{
			if (nom == personne.getNom() && prenom == personne.getPrenom())
			{
				return personne;
			}
		}
		return null;
	}
	
}
