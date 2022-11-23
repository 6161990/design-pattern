package pattern.composite;

import java.util.ArrayList;

public class Category extends ProductCategory{

    ArrayList<ProductCategory> list;

    public Category(int id, String name, int price) {
        super(id, name, price);
        list = new ArrayList<>();
    }

    @Override
    public void addProductCategory(ProductCategory productCategory) {
        list.add(productCategory);
    }

    @Override
    public void removeProductCategory(ProductCategory productCategory) {
        list.removeIf(i->i.getId() == productCategory.getId());
    }

    @Override
    public int getCount() {
        return list.stream().reduce(0, (count, productCategory) -> count + productCategory.getCount(), Integer::sum);
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
        return list.stream().reduce(0, (price, productCategory) -> price + productCategory.getPrice(), Integer::sum);
    }
}
