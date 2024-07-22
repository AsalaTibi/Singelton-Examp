package cacheManager;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {
     private static CacheManager instance;
     private Map<String,Object> cache;
     
     private CacheManager() {
    	 cache = new HashMap<>();
     }
     
     public static CacheManager getInstance() { 
    	 if(instance == null) {
    		 synchronized(CacheManager.class) {
    			 if(instance == null) {
    				 instance = new CacheManager();
    			 }
    		 }
    	 }
    	 return instance;
     }
     
     public void put(String key,Object value) {
    	 cache.put(key, value);
     }
     
     public Object get(String key) {
    	 return cache.get(key);
     }
}
