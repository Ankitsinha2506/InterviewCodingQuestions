package praticeown;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9,400,200,10,11,12,13,14,15,16,17,18);
       List<Integer> filterlist = list.stream()
               .filter(x -> x%2 ==0)
               .map(x -> x/2)
               .distinct()
               .sorted((a,b)-> b-a)
               .limit(8)
               .skip(2)
               .collect(Collectors.toList());
       System.out.println(filterlist);

      
    }
}
