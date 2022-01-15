package Project;
class wnode { //Doubly Linked List
    wnode prev, next;
    Product p;

    public wnode(Product p) {
        this.p = p;

    }
}

public class WishList {
    wnode head;
    public void insertToWishlist(Product w) {
        wnode n = new wnode(w);
        if (head == null) {
            head = n;
            return;
        }
        wnode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        n.prev = temp;
        temp.next = n;

    }

    public void printWishlist() {
        wnode temp = head;
        while (temp != null) {
            if (temp.p.stock <= 0) {
                System.out.print(temp.p.name + " " + temp.p.price);
                if (temp.next != null)
                    System.out.println(" | ");
            }
            temp = temp.next;
        }
    }

    /*
    public static void main(String[] args) {
        WishList obj = new WishList();

        obj.insertToWishlist(new Product("MB", "Lazo", "Wallets","Red", 2367, 750, 8, "so good"));
        obj.insertToWishlist(new Product("GB", "Razo", "Wallets","Blue", 9380, 950, 10, "so cute"));
        obj.printWishlist();
    }

     */





}

