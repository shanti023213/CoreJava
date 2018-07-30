package failFastAndSafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String,String>();
		
		List<String> list = new ArrayList<String>();
		//mapIterator(map);
		listIterator(list);
	

	}
	
	
	public static void mapIterator(Map<String,String> map){
		map.put("Seetha", "1");
	
		map.put("Geetha", "2");
		map.put("Radha", "3");
		
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			
			String key = it.next();
			if(key.equals("Seetha")){
				it.remove();
			}
			System.out.println(key+" - "+ map.get(key));
		}
		
		System.out.println("******");
	}
	
	
	public static void listIterator(List<String> list){
		
		list.add("Seetha");
		list.add("Geetha");
		list.add("Radha");
		
		ArrayList list1 = new ArrayList(100);
		ListIterator<String> it = list.listIterator();
		while(it.hasNext()){
			
			String key = it.next();
			if(key.equals("Seetha")){
				it.remove();
				it.add("Sudha");
				//list.add("Suji");
			}
		}
		String a ="5";
		System.out.println(a.hashCode());
		
		for(String str:list){
			System.out.println(str);
		}

	}
	
}
