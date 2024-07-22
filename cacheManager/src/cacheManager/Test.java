package cacheManager;

public class Test {

	public static void main(String[] args) {
		
		CacheManager cache1 = CacheManager.getInstance();
		cache1.put("key1", "value1");
		
		CacheManager cache2 = CacheManager.getInstance();
		Object value = cache2.get("key1");
		System.out.println(value);

        // Checking if both cache1 and cache2 are the same instance
        if (cache1 == cache2) {
            System.out.println("CacheManager is a singleton!");
        } else {
            System.out.println("CacheManager is not a singleton!");
        }

	}

}
