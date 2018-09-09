package com.dev1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapSort
{
	public static void main(String[] args)
	{
		Map<String, Integer> map = new HashMap<>();
		map.put("key1", 1005);
		map.put("key9", 1001);
		map.put("key8", 1004);
		map.put("key3", 1008);
		map.put("key2", 1007);
		map.put("key7", 1006);
		map.put("key6", 1003);
		map.put("key5", 1002);
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
		{
			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) 
			{
				// TODO Auto-generated method stub
				//return e1.getValue().compareTo(e2.getValue());
				//return - e1.getValue().compareTo(e2.getValue());
				return 1;
			}
		});
		list.forEach(System.out:: println);
	}
}
