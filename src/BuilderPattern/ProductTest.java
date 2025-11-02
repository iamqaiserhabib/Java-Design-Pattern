package BuilderPattern;

public class ProductTest {

	public static void main(String[] args) {
		
		Product product1 = new Product.ProductBuilder("Apple Macbook Pro", 12000).build();
		System.out.println(product1);
		
		Product product2 = new Product.ProductBuilder("Vivo", 569000)
		                  .setCategory("Electronics")
		                  .setDescription("This is a nice mobile to use")
		                  .setDiscount(10)
		                  .setFreeShipping(false)
		                  .setStock(50)
		                  .build();
		System.out.println(product2);
		product2.setDiscount(20);
		System.out.println(product2);
		
		Product product3 = new Product.ProductBuilder("Shirt", 569000)
                .setCategory("Fashion")
                .setDiscount(10)
                .setFreeShipping(false)
                .setStock(50)
                .build();
		System.out.println(product3);
		product3.setDescription("XXL Black T Shirt");
		System.out.println(product3);

   }
}
