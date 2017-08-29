package testmap;

import java.util.HashMap;
import java.util.Map;

public class EXEC {

	public static void main(String[] args) {
		Map<String,Object> lst=new HashMap<String, Object>();
		
		lst.put("name", "islam");
		lst.put("age", 27);
		lst.put("height", 175.5);
		
		
		for (Map.Entry<String, Object> entry : lst.entrySet()) {
			
			System.out.println(entry.getKey()+" - "+entry.getValue()+" - "+entry.getValue().getClass().getCanonicalName());
//		    if (entry.getValue() instanceof String) {
//		        // Do something with entry.getKey() and entry.getValue()
//		    } else if (entry.getValue() instanceof Class) {
//		        // Do something else with entry.getKey() and entry.getValue()
//		    } else {
//		        throw new IllegalStateException("Expecting either String or Class as entry value");
//		    }
		}
		System.out.println("Done");

	}

}
