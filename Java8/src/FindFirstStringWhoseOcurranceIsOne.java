import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FindFirstStringWhoseOcurranceIsOne {

public static String firstUniqueProduct(String[] products) {
	
		
		List<String> productList = Arrays.asList(products);
		Map<String, Long> map = productList.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		System.out.println(map);
		Iterator<String> itr = map.keySet().iterator();
	

		Optional<Long> value = map.values().stream().filter(e -> e==1).findFirst();
		
		if(value.isPresent()) {
			while(itr.hasNext()) {
				String key = itr.next();
				if(map.get(key) == 1) {
					return key;
				}
			}
			
		}
		else {
			return null;
		}
		
		
		//List<String> productList = Arrays.asList(products);
		/**
		Set<String> set = new HashSet<>();
		List<String> values = productList.stream().filter(e -> set.add(e)).collect(Collectors.toList());
		System.out.println(values);
		if(values.isEmpty()) {
			System.out.println("null");
		}
		else {
			System.out.println(values.get(0));
		}
		*/
		
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag"  }));
        //System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag", "Computer","Bag"  }));
        //System.out.println(firstUniqueProduct(new String[] { "Apple", "Computer", "Apple", "Bag", "Computer","Bag"  }));
        
    }

}
