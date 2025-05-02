package tudelft.discount;
import java.util.List;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier (ProductDao dao) {
        this.dao = dao;
    }
//se edito para hacer el test
    public void applyDiscount() {
        List<Product> products = dao.getAll();
        for (Product p : products) {
            if (p.getCategory().equals("HOME")) {
                p.setPrice(p.getPrice() * 0.9);
            } else if (p.getCategory().equals("BUSINESS")) {
                p.setPrice(p.getPrice() * 1.1);
            }
        }
    }
}
