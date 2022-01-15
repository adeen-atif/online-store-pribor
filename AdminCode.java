package Project;
public class AdminCode { //Stock control
    HashTable Stock; //the product list in the form of hash table;

    public AdminCode(int size) {
        Stock = new HashTable(size);
        insertProduct("Bean", "Cuero", "Wallets", "Blue", 1001, 800, 8, "very beany");
        insertProduct("Myrle", "Cuero", "Wallets", "Green", 1002, 800, 8, "very leafy");
        insertProduct("Haiti", "Cuero", "Wallets", "Blue", 1003, 800, 8, "very musty");
        insertProduct("Aubergine", "Cuero", "Wallets", "Red", 1004, 800, 8, "very reddy");
        insertProduct("Wattle", "Kazo", "Wallets", "Yellow", 1005, 750, 2, "very musty");
        insertProduct("Midnight Blue", "Kazo", "Wallets", "Blue", 1006, 750, 2, "very bluey");
        insertProduct("Olive Green", "Kazo", "Wallets", "Green", 1007, 750, 2, "very greeny");
        insertProduct("Bronco", "Kazo", "Wallets", "Grey", 1008, 750, 2, "very bronky");
        insertProduct("Flint", "Kazo", "Wallets", "Dark Grey", 1009, 750, 2, "very leady");
        insertProduct("Zeus", "Kazo", "Wallets", "Blue", 1010, 750, 2, "very bluey");
        insertProduct("Bruno", "Guzel", "Wallets", "Black", 1011, 850, 6, "very lolly");
        insertProduct("Camel", "Guzel", "Wallets", "Brown", 1012, 850, 6, "very camely");
        insertProduct("Cherry Wood", "Guzel", "Wallets", "Dark Brown", 1013, 850, 6, "very browny");
        insertProduct("Cardinal", "Guzel", "Wallets", "Red", 1014, 850, 6, "very reddy");

        insertProduct("RED", "Kap", "Caps", "Red", 1015, 900, 5, "very cool");
        insertProduct("BLACK", "Kap", "Caps", "Black", 1016, 900, 5, "very shash");
        insertProduct("GREY", "Kap", "Caps", "Grey", 1017, 900, 5, "very lead");
        insertProduct("BROWN", "Kap", "Caps", "Brown", 1018, 900, 5, "very browny");

        insertProduct("Random", "Random Stickers", "Stickers", "Multi", 1019, 200, 7, "very cool");
        insertProduct("Movies", "Custom Stickers", "Stickers", "Multi", 1020, 250, 7, "very cool");
        insertProduct("Anime", "Custom Stickers", "Stickers", "Multi", 1021, 250, 7, "very cool");
        insertProduct("Memes", "Custom Stickers", "Stickers", "Multi", 1022, 250, 7, "very cool");
        insertProduct("Cartoons", "Custom Stickers", "Stickers", "Multi", 1023, 250, 7, "very cool");
    }

    public void insertProduct(String pName, String pVariant, String pCategory,  String pColor, int sNo, int pPrice, int pStock, String pDescription) {
        Product p = new Product(pName, pVariant, pCategory, pColor, sNo, pPrice, pStock, pDescription);
        Stock.insert(p);

    }


    public void priceUpdate(int serialNo, int newPrice) {
        if (productAvailability(serialNo))
            Stock.search(serialNo).price = newPrice;
        else
            System.out.println("The serial number entered to have its price updated is not present in stock");
    }

    public void productInc(int serialNo) { //do +1 in product quantity
        if (productAvailability(serialNo))
            Stock.search(serialNo).stock++;
        else
            System.out.println("The serial number entered to be incremented is not present in stock");
    }

    public void productDec(int serialNo) { //do -1 in product quantity
        if (productAvailability(serialNo))
            Stock.search(serialNo).stock--;
        else
            System.out.println("The serial number entered to be decremented is not present in stock");
    }

    public Product searchProduct(int serialNo) { //Searches and prints all product details based on the serial number
        return Stock.search(serialNo);
    }

    public boolean productAvailability(int serialNo) {
        if (searchProduct(serialNo) != null)
            return true;
        else return false;
    }

    public void printAvailableProductList() { //print the available stock with quantity greater than 0 in stock
        for (int i = 0; i < Stock.StockTable.length; i++) {
            if (Stock.StockTable[i] != null && Stock.StockTable[i].stock > 0 )
                System.out.print(Stock.StockTable[i] + " | ");
        }
        System.out.println();
    }

    public void printProductList() { //print the entire stock regardless of its availability
        for (int i = 0; i < Stock.StockTable.length; i++) {
            if (Stock.StockTable[i] != null) {
                System.out.println(Stock.StockTable[i] + " | ");
                System.out.print("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println();


            }
            
        }
        System.out.println();
    }
}
	
