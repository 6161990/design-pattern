package pattern.composite;

public class Product extends ProductCategory{

    public Product(int id, String name, int price) {
        super(id, name, price);
    }

    @Override
    public void addProductCategory(ProductCategory productCategory) {

    }

    @Override
    public void removeProductCategory(ProductCategory productCategory) {

    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
