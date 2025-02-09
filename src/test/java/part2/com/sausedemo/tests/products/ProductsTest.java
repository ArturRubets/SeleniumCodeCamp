package part2.com.sausedemo.tests.products;

import org.sausedemo.pages.ProductsPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import part2.com.sausedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user" ,"secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplayed(), "Products Header Is Not Displayed");
    }
}
