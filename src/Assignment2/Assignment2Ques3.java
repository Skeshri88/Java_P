package Assignment2;

import java.util.HashMap;
import java.util.Map;

public class Assignment2Ques3 {

	public static void main(String[] args)
	{
		Map<String,String> map=new HashMap<>();
		map=getDataForMap();
		for(int i=0;i<args.length;i++){
		System.out.println("Hello "+args[i]);
		System.out.println("Your Title "+map.get(args[i]));


		}

		}

		private static Map<String, String> getDataForMap() {
		Map<String,String> dataInMap=new HashMap<>();
		dataInMap.put("Name1","Title1");
		dataInMap.put("Name2","Title2");
		dataInMap.put("Name3","Title3");
		dataInMap.put("Name4","Title4");
		dataInMap.put("Name5","Title5");
		dataInMap.put("Name6","Title6");
		return dataInMap;
		}

	}


