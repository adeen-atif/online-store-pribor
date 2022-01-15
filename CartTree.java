package Project;
import java.util.*;
class node {
    Product p;
    node left, right; //according to price

    node(Product p) {
        this.p = p;
    }
}
public class CartTree {
    node root;
    WishList wishlist = new WishList();
    AdminCode stock = new AdminCode(31);

    public void insertItem(int serialNum) { //serial number
        if (!stock.productAvailability(serialNum)) {
            System.out.println("The serial number you entered does not exist in our stock");
            return;
        }
        Product np = stock.searchProduct(serialNum);
        if (np.stock <= 0) {
            System.out.println("Product " + np.name + " is out of stock so added to wishlist");
            wishlist.insertToWishlist(np);
            return;
        }
        node n = new node(np);
        if (root == null) {
            root = n;
            stock.productDec(serialNum);
            return;
        }
        node temp = root;
        node prev = null;
        while (temp != null) {
            prev = temp;
            if (np.price < temp.p.price) {
                temp = temp.left;
            }
            else {
                temp = temp.right;
            }
        }
        if (prev.p.price >= np.price)
            prev.left = n;
        else
            prev.right = n;
        stock.productDec(serialNum);

    }

    public node[] find(int serialNum) { //used for Delete methods
        if (!stock.productAvailability(serialNum)) {
            System.out.println("The serial number you entered does not exist in our stock");
            return null;
        }
        Product pn = stock.searchProduct(serialNum);
        node[] arr = new node [2];
        if (root.p.price == pn.price) {
            arr[0] = null;
            arr[1] = root;
            return arr;

        }
        else {
            node prev = null;
            node temp = root;
            while (temp != null && temp.p.price != pn.price) {
                prev = temp;
                if (temp.p.price > pn.price)
                    temp = temp.left;
                else
                    temp = temp.right;
            }
            if (temp == null) {
                System.out.println("The node with the entered serial number was not found in the stock");
                return null;
            }
            arr[0] = prev;
            arr[1] = temp;
            return arr;
        }
    }


    public node min(node temp) { //Used for delete methods
        node prev = null;
        while (temp != null) {
            prev = temp;
            temp = temp.left;
        }
        return prev;
    }


    public void deleteNochild(node t, node p) {
        if (t == root) {
            root = null;
        }
        if (t.p.price < p.p.price) {
            p.left = null;
        }
        else
            p.right = null;
    }

    public void deleteOnechild(node t, node p) {
        if (root == t) { //if the node we have to remove is root
            if (root.left == null) {
                root = root.right;
                return;
            }
            else if (root.right == null) {
                root = root.left;
                return;
            }
        }

        if (t.p.price < p.p.price) {
            if (t.left == null)
                p.left = t.right;
            else if (t.right == null)
                p.left = t.left;
        }

        else if (t.p.price >= p.p.price) {
            if (t.left == null)
                p.right = t.right;
            else if (t.right == null)
                p.right = t.left;
        }
    }

    public void deleteTwochild(node t, node p) {
        if (t == root) {
            node minNode = min(root.right);
            deleteItem(minNode.p.serNum);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;
            return;
        }
        else {
            node minNode = min(t.right);
            deleteItem(minNode.p.serNum);
            minNode.left = t.left;
            minNode.right = t.right;
            t = minNode;
            if (t.p.price < p.p.price)
                p.left = minNode;
            else
                p.right = minNode;
        }
    }

    public void deleteItem(int serialNum) {

        node[] ref= find(serialNum); //find node to delete that return node t and its parent p references
        node p = ref[0]; //the node before the node we've to delete (the parent of the node we have to delete)
        node t = ref[1]; //the node we have to delete
        if (t.left == null && t.right == null) { //if(node t has no child) { // call deleteNochild(t,p)
            deleteNochild(t,p);
            stock.productInc(serialNum);
            return;
        }

        if ((t.left == null && t.right != null) || (t.left != null && t.right == null)) { //if(node t has one child) { // call deleteOnechild(t,p)
            deleteOnechild(t,p);
            stock.productInc(serialNum);
            return;
        }

        else {
            deleteTwochild(t, p);
            stock.productInc(serialNum);
        }
    }

    public void LNR(node n)
    {
        if (n == null) return;
        else {
            LNR(n.left);
            System.out.print(n.p + " | ");
            LNR(n.right);
        }
    }

    public void viewCart() {
        LNR(root);
    }

    public void checkOut() {
        billCalculator(root);
        System.out.print("Your cart: [");
        viewCart();
        System.out.println("]");
        if (wishlist.head != null) {
            System.out.print("Your wishlist: [");
            wishlist.printWishlist();
            System.out.println("]");
        }
        System.out.println("Your bill is: " + bill);
    }

    public Product searchItem(int sNo) { //serial number
        return stock.searchProduct(sNo);
    }

    public void priceRangePrint(node r, int k1, int k2){
        if (r == null)
            return;

        if (r.p.price > k1) {
            priceRangePrint(r.left, k1, k2);
        }

        if (r.p.price > k1 && r.p.price < k2) {
            System.out.print(r.p + " | ");
        }

        if (r.p.price < k2)
            priceRangePrint(r.right, k1, k2);
    }

    public void printRange(int lower, int upper) {
        priceRangePrint(root, lower, upper);
    }

    int bill = 0;
    public void billCalculator(node n) {
        if (n == null) return;
        else {
            billCalculator(n.left);
            bill += n.p.price;
            billCalculator(n.right);
        }
    }
    
    

    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("                                                     ***Welcome to PRIBOR online***                                                                            ");  
    	System.out.println(" "); 
    	System.out.println("     OUR PRODUCT RANGE : "); 
    	System.out.println(" "); 
        CartTree obj =new CartTree();
        obj.stock.printProductList();
        System.out.println(" "); 
        System.out.println("DO YOU WANT TO SHOP. TYPE YES TO PROCEED");
        String str= sc.nextLine(); 
        int sNo = 0;
        String func = "";
        
        while (!str.equals("no")) {
        	System.out.println("DO YOU WANT TO INSERT, DELETE, SEARCH AN ITEM FROOM/IN YOUR CART, OR PRINT YOUR ENTIRE CART?");
            System.out.println("PRESS i IF YOU WANT TO INSERT | PRESS d IF YOU WANT TO DELETE | PRESS s IF YOU WANT TO INSERT | PRESS p IF YOU WANT TO PRINT YOUR ENTIRE CART");
            
            func = sc.nextLine();
         
            if(func.equals("i")) {
            	System.out.println("ENTER THE SERIAL NO OF THE PRODUCT YOU WANT TO INSERT INTO YOUR CART");
            	sNo = sc.nextInt();
            }
            
            if(func.equals("d")) {
            	System.out.println("ENTER THE SERIAL NO OF THE PRODUCT YOU WANT TO DELETE FROM YOUR CART");
            	sNo = sc.nextInt();
            }
            if(func.equals("s")) {
            	System.out.println("ENTER THE SERIAL NO OF THE PRODUCT YOU WANT TO SEARCH FROM YOUR CART");
            	sNo = sc.nextInt();
            }
            	
           
            
            if(func.equals("p")) {
            	System.out.println("YOUR CART");
                
            }
            
            System.out.println("DO YOU WANT TO CONTINUE SHOPPING? [TYPE yes OR no]");
            str = sc.nextLine();
            
            if(func.equals("i"))
                obj.insertItem(sNo);
            
            if(func.equals("d"))
                obj.deleteItem(sNo);
            
            if(func.equals("s")) 
            	System.out.println(obj.searchItem(sNo));
            
            if(func.equals("p"))
            	obj.viewCart();
        }
        
        
        System.out.println("YOUR BILL");
        
        obj.checkOut();
        
        System.out.println("THANKS FOR VISITING PRIBOR");
        
    }
}
    /*
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("                                                     ***Welcome to PRIBOR online***                                                                            ");  
    	System.out.println(" "); 
    	System.out.println("     OUR PRODUCT RANGE : "); 
    	System.out.println(" "); 
        CartTree obj =new CartTree();
        obj.stock.printProductList();
        System.out.println(" "); 
        System.out.println("DO YOU WANT TO SHOP. TYPE YES TO PROCEED");
        String str= sc.nextLine(); 
        
        while (!str.equals("no")) {
        	System.out.println("DO YOU WANT TO INSERT, DELETE, SEARCH AN ITEM FROOM/IN YOUR CART, OR PRINT YOUR ENTIRE CART?");
            System.out.println("PRESS i IF YOU WANT TO INSERT | PRESS d IF YOU WANT TO DELETE | PRESS s IF YOU WANT TO INSERT | PRESS p IF YOU WANT TO PRINT YOUR ENTIRE CART");
            
            String func = sc.nextLine();
         
            if(func.equals("i")) {
            	System.out.println("ENTER THE SERIAL NO OF THE PRODUCT YOU WANT TO INSERT INTO YOUR CART");
            	int sNo = sc.nextInt();
                obj.insertItem(sNo);
            }
            
            if(func.equals("d")) {
            	System.out.println("ENTER THE SERIAL NO OF THE PRODUCT YOU WANT TO DELETE FROM YOUR CART");
            	int sNo = sc.nextInt();
                obj.deleteItem(sNo);
            }
            
            if(func.equals("s")) {
            	System.out.println("ENTER THE SERIAL NO OF THE PRODUCT YOU WANT TO SEARCH FROM YOUR CART");
            	int sNo = sc.nextInt();
            	System.out.println(obj.searchItem(sNo));
            }
            
            if(func.equals("p")) {
            	System.out.println("YOUR CART");
                obj.viewCart();
            }
            
            System.out.println("DO YOU WANT TO CONTINUE SHOPPING? [TYPE yes OR no]");
            str = sc.nextLine();
            	
        }
        
        
        System.out.println("YOUR BILL");
        
        obj.checkOut();
        
        System.out.println("THANKS FOR VISITING PRIBOR");
    }
    */


        
        
    	
    	
    	
    	
    	
    	
    	

    	
    	/*
        System.out.println("\n");
        System.out.println("TESTING Cart Tree CLASS FROM HERE");
        CartTree obj2 = new CartTree();
        obj2.insertItem(1001);
        obj2.viewCart();
        obj2.insertItem(1021);
        obj2.insertItem(1040);
        obj2.insertItem(1006);
        obj2.insertItem(1006);
        obj2.insertItem(1006);

        obj2.checkOut();
        */



