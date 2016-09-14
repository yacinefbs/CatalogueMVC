package ma.enset.myCatalogue.metier;
import java.util.List; 
import ma.enset.myCatalogue.dao.ICatalogueDAO;
import ma.enset.myCatalogue.dao.Produit;;
public class CatalogueMetierImpl implements ICatalogueMetier {
	private ICatalogueDAO dao;
	/*Setter setDao pour l'injection*/
	public void setDao(ICatalogueDAO dao) {
	this.dao = dao;
	}
	@Override
	public void addProduit(Produit p) {
	dao.addProduit(p);
	}
	@Override
	public List<Produit> getAllProduits() {
	return dao.getAllProduits();
	}
	@Override
	public List<Produit> getProduits(String mc) {
	return dao.getProduits(mc);
	}
	@Override
	public Produit getProduit(String reference) {
	return dao.getProduit(reference);
	}
	@Override
	public void deleteProduit(String refernce) {
	dao.deleteProduit(refernce);
	}
	@Override
	public void updateProduit(Produit p) {
	dao.updateProduit(p);
	}
}
