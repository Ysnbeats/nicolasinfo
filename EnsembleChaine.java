
import java.util.ArrayList;
import java.util.Scanner;

public class EnsembleChaine {

	ArrayList<String> liste;

	public EnsembleChaine() {
		liste = new ArrayList<String>();
	}

//Ajoute chaque chaine de tab, si elle n’existe pas déjà, à l’ensemble
	public boolean ajouter(String[] tab) {
		for (String i : tab) {
			if (!(liste.contains(i)))
				liste.add(i);
		}
		return false;
	}

//Test si l’ensemble e est équivalent à l’ensemble courant
	public boolean equals(EnsembleChaine e) {
		if (e == null)
			return false;
		if (e.liste.size() != liste.size())
			return false;
		for (int i = 0; i < liste.size(); i++) {
			if (!e.liste.contains(liste.get(i))) {
				return false;
			}
		}
		return false;
	}

//Renvoie l’union de l’ensemble e et l’ensemble courant
public EnsembleChaine union(EnsembleChaine e){
	EnsembleChaine a;
	if(e==null)
	e.liste=liste;
	if(e.liste!=liste)
		a = new EnsembleChaine();
		for(int i=0;i<liste.size();i++)
		{
		//	if (!e.liste.contains(String[] tab))
			{
				
			}
		}
	
return null ;
}

//Renvoie l’intersection de l’ensemble e et l’ensemble courant
	public EnsembleChaine intersection(EnsembleChaine e) {
		return null;
	}

//Renvoie l’union disjointe de l’ensemble e et l’ensemble courant
	public EnsembleChaine unionDisjointe(EnsembleChaine e) {
		return null;
	}
}
