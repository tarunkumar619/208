package Hashing;


public class hashTableOperations {
	public static void test01(HashTable ht) {
		System.out.println("*** Inserting ***");
		int[] keysToInsert = {18, 28, 38, 16, 48, 26};//, 36, 6, 24, 55, 75, 10, 100, 45};
		for (int key : keysToInsert) {
			ht.insert(key);
		}

		System.out.println("\n*** Searching ***");
		int[] keysToSearch = {88, keysToInsert[5], keysToInsert[0], 90};
		for (int key : keysToSearch) {
			if (ht.search(key)) {
				System.out.println(key + " found.");
			} else {
				System.out.println(key + " NOT found.");
			}
		}
	}

	public static void main(String[] args) {
		HashTable ht = new HashTableLP();
		//HashTable ht = new HashTableUsingChaining();

		test01(ht);
	}

}
