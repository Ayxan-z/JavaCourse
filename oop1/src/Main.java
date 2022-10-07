public class Main{
	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setName("name1");
		product1.setUnitPrice(12.3);
		product1.setDiscount(3);
		product1.setUnitsInStock(5);
		product1.setImageUrl("nfns.jpg");

		Product[] products = {product1};

		System.out.println(products[0].getDiscount());

		IndividualCustomer individualCustomer = new IndividualCustomer();

		individualCustomer.setId(1);
		individualCustomer.setPhone("48347882873");
		individualCustomer.setCustomerNumber("43295");
		individualCustomer.setFirstName("FirstName1");
		individualCustomer.setLastName("LastName1");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("487882873");
		corporateCustomer.setCustomerNumber("495");
		corporateCustomer.setCompanyName("CompanyName1");
		corporateCustomer.setTaxNumber("48993493289");

		System.out.println(corporateCustomer.getId());
	}
}
