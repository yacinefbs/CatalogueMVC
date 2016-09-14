package ma.enset.myCatalogue.dao;
import java.util.*;
import org.apache.log4j.Logger;
public class CatalogueDaoImpl implements ICatalogueDAO {
	private Map<String, Produit> produits=new HashMap<String, Produit>();
	Logger logger=Logger.getLogger(CatalogueDaoImpl.class);
	@Override
	public void addProduit(Produit p) {
	produits.put(p.getReference(), p);
	}
	@Override
	public List<Produit> getAllProduits() {
	Collection<Produit> prods=produits.values();
	return new ArrayList<Produit>(prods);
	}
	@Override
	public List<Produit> getProduits(String mc) {
	List<Produit> prods=new ArrayList<Produit>();
	for(Produit p:produits.values())
	if(p.getDesignation().indexOf(mc)>=0)
	prods.add(p);
	return prods;
	}
	@Override
	public Produit getProduit(String reference) {
	return produits.get(reference);
	}
	@Override
	public void deleteProduit(String refernce) {
	produits.remove(refernce);
	}
	@Override
	public void updateProduit(Produit p) {
	produits.put(p.getReference(),p);
	}
	public void init(){
	logger.info("Initialisation du catalogue");
	this.addProduit(new Produit("HP675","Ordinateur HP", 8000, 5));
	this.addProduit(new Produit("AEP65","Impriomante AE",760, 80));
	this.addProduit(new Produit("AT980","Smart Phone GT", 4500, 8));
	}
}
