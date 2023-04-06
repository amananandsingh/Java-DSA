import java.util.HashMap;

public class fr {
    public static void main(String[] args) {
        String name="ram kumar";
        HashMap<Character,Integer > map =new HashMap<>();
        for(int i =0;i<name.length();i++){
            char singleChar =name.charAt(i);
            if(map.get(singleChar)==null){
                map.put(singleChar, 1 );
            }
            else{
                int count=map.get(singleChar);
                map.put(singleChar,count+1);
            }
            System.out.println(count);
        }



    }
    
}
