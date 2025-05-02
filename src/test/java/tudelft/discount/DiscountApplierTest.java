package tudelft.discount;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

//se implemento la clase para el test de acorde a los parametros de la clase principal
public class DiscountApplierTest {
    @Test
    public void applyDiscount() {
        ProductDao dao = mock(ProductDao.class);

        Product homeProduct = new Product("Producto Hogar", 100.0, "HOME");
        Product businessProduct = new Product("Producto Negocio", 200.0, "BUSINESS");
        List<Product> products = Arrays.asList(homeProduct, businessProduct);

        when(dao.getAll()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(dao);
        applier.applyDiscount();

        assertEquals(90.0, homeProduct.getPrice(), 0.001);
        assertEquals(220.0, businessProduct.getPrice(), 0.001);
    }
}