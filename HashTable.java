package Project;

public class HashTable 
{
	Product[] StockTable;

    public HashTable(int s) {
        int size = s + (s / 3);
        int newSize = getPrime(size);
        StockTable = new Product[newSize];
    }


    public int Hash(int key) {
        return key % this.StockTable.length;
    }

    public int Rehash(int key, int i) {
        return (key + i) % (StockTable.length);
    }

    public void insert(Product key){ // keep maintain 1/3 empty cells
        int CollisionLimit = 0;

        int Input = Hash(key.serNum);

        if (StockTable[Input] == null)
        {
            StockTable[Input] = key;

        }

        else
        {
            int i = 1;

            while (StockTable[Input] != null && CollisionLimit < 15)
            {
                Input = Rehash(key.serNum, i);
                CollisionLimit++;
                i++;
            }
        }

        StockTable[Input] = key;
    }

    public Product search (int sNum) {
        int hashKey = this.Hash(sNum);
        if (this.StockTable[hashKey] != null && this.StockTable[hashKey].serNum == sNum) return this.StockTable[hashKey];
        else {
            int rehashKey = hashKey;
            int collisions = 0;
            while (this.StockTable[rehashKey] != null && this.StockTable[rehashKey].serNum != sNum) {
                rehashKey = this.Rehash(sNum, rehashKey);
                if (this.StockTable[rehashKey].serNum == sNum) return this.StockTable[rehashKey];

                if (collisions == this.StockTable.length) return null;

                collisions ++;
            }
        }
        return null;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < StockTable.length; i++) {
            str += "[" + i + "] " + StockTable[i] + "\n";
        }
        return str;
    }

    private int getPrime(int n) {
        while (true) {
            if (isPrime(n)) return n;
            n++;
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }



}
