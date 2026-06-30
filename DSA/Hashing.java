import java.util.*;
public class Hashing {

    public static void main(String[] args) {
       //create
       HashMap<String,Integer> hm=new HashMap<>();

       //insert--O(1)
       hm.put("india", 100);
       hm.put("china",120);
       hm.put("usa", 50);
       System.out.println(hm);

       //to know size
       System.out.println(hm.size());

       //Is Empty()
       hm.clear();
       System.out.println(hm.isEmpty());


       //get--O(1)
      int population= hm.get("india");
      System.out.println(population);
      
      System.out.println(hm.get("indonesia"));

      //contains--O(1)
      System.out.println(hm.containsKey("india"));
      System.out.println(hm.containsKey("uk"));

      //remove--O(1)
      System.out.println(hm.remove("china"));
      System.out.println(hm);

      System.out.println(hm.remove("uk"));
    }
}
