import java.util.ArrayList;
import java.util.Scanner;

public class EnsembleChaine {

	
ArrayList< String > liste;
public EnsembleChaine(){
liste = new ArrayList<String>() ;
}
//Ajoute chaque chaine de tab, si elle n’existe pas déjà, à l’ensemble
public boolean ajouter(String[] tab) {
	for (string i:tab) {
		if (!(liste.contains (i)))
		liste.add(i);
	
return false ;
}
//Test si l’ensemble e est équivalent à l’ensemble courant
public boolean equals(EnsembleChaine e) {
return false ;
}
//Renvoie l’union de l’ensemble e et l’ensemble courant
public EnsembleChaine union(EnsembleChaine e){
return null ;
}
//Renvoie l’intersection de l’ensemble e et l’ensemble courant
public EnsembleChaine intersection(EnsembleChaine e){
return null ;
}
//Renvoie l’union disjointe de l’ensemble e et l’ensemble courant
public EnsembleChaine unionDisjointe(EnsembleChaine e){
return null ;
}
}
