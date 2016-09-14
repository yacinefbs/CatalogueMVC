package ma.enset.myCatalogue.metier;

import java.util.List;

import ma.enset.myCatalogue.dao.Produit;

public interface ICatalogueMetier {
	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduits(String mc);
	public Produit getProduit(String reference);
	public void deleteProduit(String refernce);
	public void updateProduit(Produit p);
}
