package pattern.composite;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CategoryClientTest {

    @Test
    void category() {
        ProductCategory womanCategory = new Category(1234, "Woman", 0);
        ProductCategory manCategory = new Category(5678, "Man", 0);

        ProductCategory clothesCategoryW = new Category(2345, "Clothes", 0);
        ProductCategory bagCategoryW = new Category(3456, "Bag", 0);
        ProductCategory shoesCategoryW = new Category(9876, "Shoes", 0);
        womanCategory.addProductCategory(clothesCategoryW);
        womanCategory.addProductCategory(bagCategoryW);
        womanCategory.addProductCategory(shoesCategoryW);

        ProductCategory clothesCategoryM = new Category(23450, "Clothes", 0);
        ProductCategory bagCategoryM = new Category(34560, "Bag", 0);
        ProductCategory shoesCategoryM = new Category(98760, "Shoes", 0);
        manCategory.addProductCategory(clothesCategoryM);
        manCategory.addProductCategory(bagCategoryM);
        manCategory.addProductCategory(shoesCategoryM);

        ProductCategory shoes1 = new Product(121, "Nike", 100000);
        ProductCategory shoes2 = new Product(122, "ADIDAS", 200000);
        ProductCategory shoes3 = new Product(123, "GUCCI", 300000);
        shoesCategoryW.addProductCategory(shoes1);
        shoesCategoryW.addProductCategory(shoes2);
        shoesCategoryW.addProductCategory(shoes3);

        ProductCategory shoes4 = new Product(124, "BALENCIA", 400000);
        ProductCategory shoes5 = new Product(125, "PRADA", 500000);
        ProductCategory shoes6 = new Product(126, "BALLY", 600000);
        shoesCategoryM.addProductCategory(shoes4);
        shoesCategoryM.addProductCategory(shoes5);
        shoesCategoryM.addProductCategory(shoes6);


        ProductCategory bag1 = new Product(121, "HERMES", 500000);
        ProductCategory bag2 = new Product(122, "LOUISVUITTON", 500000);
        ProductCategory bag3 = new Product(123, "GUCCI", 500000);
        bagCategoryW.addProductCategory(bag1);
        bagCategoryW.addProductCategory(bag2);
        bagCategoryW.addProductCategory(bag3);

        ProductCategory bag4 = new Product(124, "BALENCIA", 500000);
        ProductCategory bag5 = new Product(125, "PRADA", 500000);
        ProductCategory bag6 = new Product(126, "MULBERRY", 500000);
        bagCategoryM.addProductCategory(bag4);
        bagCategoryM.addProductCategory(bag5);
        bagCategoryM.addProductCategory(bag6);

        assertThat(womanCategory.getCount()).isEqualTo(6);
        assertThat(womanCategory.getPrice()).isEqualTo(2100000);
        assertThat(manCategory.getCount()).isEqualTo(6);
        assertThat(manCategory.getPrice()).isEqualTo(3000000);

    }

}
