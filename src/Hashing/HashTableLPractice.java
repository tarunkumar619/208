package Hashing;

public class HashTableLPractice  implements HashTable {
     private  int size;
     private double loadfactor;
     private int keycount;
     private Integer[] buckets;
     
     
     public HashTableLPractice() {
    	 loadfactor=0.7;
    	 size =5;
    	 keycount=0;  	 
    	 buckets = new Integer[size];
     }
	
     // hashFunction
     private int modN(int key) {
    	    return key % size;
    	}
	
    private void resizebucket() {
    	size = size * 2;
    	Integer[] oldbucket = buckets;
    	buckets = new Integer[size];
    	keycount= 0;
    	
    	
    	for(Integer key : oldbucket) {
    		if(key != null) {
    			insert(key);
    		}
    	}
 
    }
     
	@Override
	public void insert(int key) {
	
		if(keycount >=(size * loadfactor)) {
			resizebucket();
		}
		
		int bucketId = modN(key);
		
		if(buckets[bucketId]==null) {
			buckets[bucketId] = key;
			++keycount;
			System.out.println("Storing key " + key + " in bucket #" + bucketId );		
			return;
		}
		
		
		int i = (bucketId+1) % size;
		
		int count = 1;
		
		while(count < size) {
			if(buckets[i]==null) {
				buckets[i]=key;
		     	++keycount;
		    	System.out.println("Storing key " + key + " in bucket #" + bucketId );	
			    return;
			}
			
			
		    ++count;
		    i=(i+1)%size;			
		}
		
		 resizebucket();
			
	}

	@Override
	public boolean search(int key) {
	  int bucketId = modN(key);
	  
	  if(buckets[bucketId]  != null) {
	  if(buckets[bucketId]==key) {
		  return true;
	  } 
	  }
	  
	  
	  int count=1;
	  int i = (bucketId+1)%size;
	  
	    while(count<size) {
		  
	    	  if(buckets[i]  == null) {
	    			  return false;
	    		  }
	    	  
	    	  if(buckets[i]==key) {
	    		  return true;  
	    	  }
		    i = (i +1)%size;
		    ++count;
	  }
	  
		  
		return false;
	}
	
	
	public static void main(String[] args) {
		
		HashTableLPractice obj = new HashTableLPractice();
		   obj.insert(1);
		   obj.insert(2);
		   obj.insert(3);
		   obj.insert(1);
		   
	}

}
