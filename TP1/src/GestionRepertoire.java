import java.util.ArrayList;

public class GestionRepertoire
{

	public static void main(String[] args) 
	{
		
		Adresse adresse1 = new Adresse("10", "rue du moulin", "91560", "Saclas");
		Adresse adresse2 = new Adresse("6", "rue du Raffy", "91000", "Looseville");
		Adresse adresse3 = new Adresse("9", "rue du Bricquir", "58560", "petiteVille");
		
		Personne personne1 = new Personne("Trotet", "Kevin", adresse1, "0102030405");
		Personne personne2 = new Personne("Raffy", "Benjamin", adresse2, "0602030405");
		Personne personne3 = new Personne("Bricquir", "Quentin", adresse3, "0702030405");
		
		/*System.out.println(personne1);
		System.out.println(personne2);
		System.out.println(personne3);*/
		
		Repertoire Perso = new Repertoire();
		
		Perso.ajoutPersonne(personne1);
		Perso.ajoutPersonne(personne2);
		Perso.ajoutPersonne(personne3);
		
		
		System.out.println(Perso.RechercheN("Trotet"));
		System.out.println(Perso.RechercheN("Raffy"));
		
		System.out.println(Perso.RechercheNP("Raffy", "Quentin"));
		System.out.println(Perso.RechercheNP("Bricquir" ,"Quentin"));
			
	}

}
