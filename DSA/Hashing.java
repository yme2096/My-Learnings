import java.util.*;
public class Hashing {
    /* 
     // =======================
    // Custom HashMap
    // =======================
    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        HashMap() {
            N = 4;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;
        }

        // Hash Function
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        // Search in LinkedList
        private int SearchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key.equals(key)) {
                    return i;
                }
            }

            return -1;
        }

        // Rehash
        @SuppressWarnings("unchecked")
        private void rehash() {

            LinkedList<Node>[] oldBuckets = buckets;

            N = N * 2;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            n = 0;

            for (int i = 0; i < oldBuckets.length; i++) {

                LinkedList<Node> ll = oldBuckets[i];

                while (!ll.isEmpty()) {
                    Node node = ll.removeFirst();
                    put(node.key, node.value);
                }
            }
        }

        // Put
        public void put(K key, V value) {

            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        // Get
        public V get(K key) {

            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                return buckets[bi].get(di).value;
            }

            return null;
        }

        // Contains Key
        public boolean containsKey(K key) {

            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            return di != -1;
        }

        // Remove
        public V remove(K key) {

            int bi = hashFunction(key);
            int di = SearchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }

            return null;
        }

        // KeySet
        public ArrayList<K> keySet() {

            ArrayList<K> keys = new ArrayList<>();

            for (int i = 0; i < N; i++) {

                LinkedList<Node> ll = buckets[i];

                for (Node node : ll) {
                    keys.add(node.key);
                }
            }

            return keys;
        }

        // Size
        public int size() {
            return n;
        }

        // Is Empty
        public boolean isEmpty() {
            return n == 0;
        }
    }
        */

    //Majority element
    public static void majorityelement()
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int nums[]={1,3,2,5,1,3,1,5,1};
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            /* 
            if(hm.containsKey(num))
            {
                hm.put(num,hm.get(num)+1);
            }
            else{
                hm.put(num, 1);
            }
                */
                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
       Set<Integer> keySet=hm.keySet(); 
       for(Integer key:keySet)
       {
        if(hm.get(key)>nums.length/3)
        {
            System.out.println(key);
        }
       }

    }
    //valid anagrams
    public static boolean validanagrams()
    {
        String s1="race";
        String s2="acer";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int j=0;j<s2.length();j++)
        {
            char ch=s2.charAt(j);
            if(map.get(ch)!=null)
            {
                if(map.get(ch)==1)
                {
                    map.remove(ch);
                }
                else{
                    map.put(ch,map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
return map.isEmpty();
    }

    //count distinct elements
    public static void countdistinct()
    {
        int num[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<num.length;i++)
        {
            set.add(num[i]);
        }
        System.out.println(set.size());
    }

    //union and intersection
    public static void unionandintersection(){
    int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // Add all elements of arr1 into the set
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        int count = 0;

        System.out.print("Intersection elements: ");

        // Check arr2 elements
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                count++;

                // Remove to avoid duplicate counting
                set.remove(arr2[i]);
            }
        }

        System.out.println();
        System.out.println("Count = " + count);
    }

    //Find iternary for tickets

     public static String getStart(HashMap<String, String> tickets) {

        HashMap<String, String> revMap = new HashMap<>();

        // Reverse the original map
        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        // Find the starting city
        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }
    //largest subaaray length with sum =0
    public static void subarraysum()
    {
         int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};

        HashMap<Integer, Integer> map = new HashMap<>();
        // (prefixSum, firstIndex)

        int sum = 0;
        int maxLen = 0;

        for (int j = 0; j < arr.length; j++) {

            sum += arr[j];

            // If prefix sum becomes 0
            if (sum == 0) {
                maxLen = j + 1;
            }

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, j - map.get(sum));
            } else {
                // Store first occurrence only
                map.put(sum, j);
            }
        }

        System.out.println("Largest Subarray with Sum 0 = " + maxLen);
    
    }
    public static void main(String[] args) {
        /* 
       //create
       HashMap<String,Integer>hm=new HashMap<>();
       //insert
       hm.put("india", 123);
       hm.put("china", 189);
       hm.put("us",50);
       System.out.println(hm);
       */
       
       /* 

       //Get
      int population= hm.get("india");
      System.out.println(population);
      System.out.println(hm.get("indonesia"));

      //containsKey--O(1)
      System.out.println(hm.containsKey("india"));
      System.out.println(hm.containsKey("indonesia"));

      //Remove
      System.out.println(hm.remove("china"));
      System.out.println(hm.remove("indonesia"));
      System.out.println(hm);

      //size
      System.out.println(hm.size());

      //Is Empty
      System.out.println(hm.isEmpty());

      //clear
      hm.clear();
      System.out.println(hm.isEmpty());

      */
/* 
      //iterate
      //hm.entrySet()-->which will give the output as direct key value pairs
      Set<String> keys=hm.keySet();
      System.out.println(keys);

      for (String k:keys) 
        {
            System.out.println("key="+k+","+"value="+hm.get(k));
        
         }
        */
       /* 
          // ===============================
        // Custom HashMap Implementation
        // ===============================

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        System.out.println("Keys:");
        for (String key : hm.keySet()) {
            System.out.println(key + " -> " + hm.get(key));
        }

        System.out.println();

        System.out.println("India = " + hm.get("India"));

        hm.put("India", 120);

        System.out.println("Updated India = " + hm.get("India"));

        System.out.println("Contains China = " + hm.containsKey("China"));

        System.out.println("Removed India = " + hm.remove("India"));

        System.out.println("India = " + hm.get("India"));

        System.out.println("Size = " + hm.size());

        System.out.println("Is Empty = " + hm.isEmpty());
       */
    /* 
        //LinkedHashMap
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
         lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        // HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println("HashMap:");
        System.out.println(hm);

        System.out.println();

        System.out.println("LinkedHashMap:");
        System.out.println(lhm);
*/
/* 
        // TreeMap
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(tm);
        */

        //majority element
       //majorityelement();

       //anagrams
       //System.out.println(validanagrams());


    //    //HashSet
    //    HashSet<Integer> set=new HashSet<>();

    //    //add
    //    set.add(1);
    //    set.add(2);
    //    set.add(4);
    //    set.add(2);
    //    set.add(1);

    //    System.out.println(set);

    //    /*

    //    //set.contains(key);
    //    if(set.contains(1))
    //    {
    //     System.out.println("set contains 1");
    //    }
    //    if(set.contains(5))
    //    {
    //     System.out.println("set contains 5");
    //    }
    //    */

    //    /* 
    //    //set.remove
    //    set.remove(1);
    //    if(set.contains(1))
    //    {
    //     System.out.println("set contains 1");
    //    }
    //     */

    //    //size
    //    System.out.println(set.size());
    //    set.clear();
    //    System.out.println(set.size());
    //    System.out.println(set.isEmpty());
       
    // //Iteration on hashSets
    // HashSet<String> cities=new HashSet<>();
    // cities.add("delhi");
    // cities.add("mumbai");
    // cities.add("Noida");
    // cities.add("Bengaluru");

    // //--> using iterators
    //  Iterator it=cities.iterator();
    //  while(it.hasNext())
    //  {
    //     System.out.println(it.next());
    //  }
     
    // //enhanced for loop
    //  for(String city: cities)
    //  {
    //     System.out.println(city);
    //  }

    //  //Linked HashSet -->Ordered
    //  LinkedHashSet<String> lhs=new LinkedHashSet<>();
    //  lhs.add("delhi");
    // lhs.add("mumbai");
    // lhs.add("Noida");
    // lhs.add("Bengaluru");
    // System.out.println(lhs);
    // lhs.remove("delhi");
    

    //  //TreeSet
    // TreeSet<String> ts=new TreeSet<>();
    //     ts.add("Delhi");
    //     ts.add("Mumbai");
    //     ts.add("Noida");
    //     ts.add("Bengaluru");

    //     System.out.println(ts);

    // //Count distinct Elements
    // countdistinct();

    // //union & Intersection of 2 Arrays
    // unionandintersection();

    //iternary for tickets
    //  HashMap<String, String> tickets = new HashMap<>();

    //     tickets.put("Chennai", "Bengaluru");
    //     tickets.put("Mumbai", "Delhi");
    //     tickets.put("Goa", "Chennai");
    //     tickets.put("Delhi", "Goa");

    //     String start = getStart(tickets);

    //     System.out.print(start);

    //     for (int i = 0; i < tickets.size(); i++) {
    //         System.out.print(" -> " + tickets.get(start));
    //         start = tickets.get(start);
    //     }

    //     System.out.println();

    //largest subarray with sum zero
    subarraysum();

    }
}
