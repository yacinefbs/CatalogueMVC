package ma.enset.myCatalogue.dao;

import java.util.List;

public interface ICatalogueDAO {
	public void addProduit(Produit p);
	public List<Produit> getAllProduits();
	public List<Produit> getProduits(String mc);
	public Produit getProduit(String reference);
	public void deleteProduit(String refernce);
	public void updateProduit(Produit p);
}
