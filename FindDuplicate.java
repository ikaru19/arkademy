import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        FindDuplicate duplicate = new FindDuplicate();
        duplicate.trimmedString("adobe");
      }

    public void trimmedString(String kata){
        Map<Character, Integer> map = new HashMap<Character, Integer>(); 
        String str = kata.replaceAll("\\s","");
        char[] chars = str.toCharArray();
        for(Character ch:chars){
            if(map.containsKey(ch)){
               map.put(ch, map.get(ch)+1);
            } else {
               map.put(ch, 1);
              }
          }
       
        Set<Character> keys = map.keySet();
        
        
       
        if(map.keySet().isEmpty()){
            System.out.println("Tidak ada karakter yang berulang!");
        }else{
            for(Character ch:keys){
                if(map.get(ch) > 1){
                    System.out.println("Char "+ch+" "+map.get(ch));
                }
            }
    
        }
        
    }  
}
  