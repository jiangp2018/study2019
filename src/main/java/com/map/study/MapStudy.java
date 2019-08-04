package com.map.study;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapStudy {
   
//ѭ�h����1 map.enrtySet
	@Test
  public void testHashMap1() {
	  Map<String, Object> map = new HashMap<>();
	 map.put("Key1", "value1");
	 map.put("Key2", "value2");
	 map.put("Key3", "value3");
	 map.put("Key4", "value4");
	 map.put("Key5", "value5");
	 map.put("Key1", "value1");
	 for(Entry<String,Object> entry:map.entrySet()){
		 System.out.println("===key"+entry.getKey()+ "============value"+entry.getValue());
	 }
	}
	
	//ѭ�h����2 Map.entrySet.iterator;
		@Test
	public void testHashMap2() {
		 Map<String, Object> map = new HashMap<>();
		 map.put("Key1", "value1");
		 map.put("Key2", "value2");
		 map.put("Key3", "value3");
		 map.put("Key4", "value4");
		 map.put("Key5", "value5");
		 map.put("Key1", "value1");
		 Iterator<Entry<String, Object>> iterator = map.entrySet().iterator();
		 while(iterator.hasNext()){
			 Entry<String, Object> key= iterator.next();
			 
			Object value=  key.getValue();
			System.out.println(key.getKey());
			System.out.println(key.getValue());
		 }
		}
		// Iterator.
		 
		 //�����ֲ��� map.keySet ,��ʽ
	@Test
	public void testHashMap3() {
		 Map<String, Object> map = new HashMap<>();
		 map.put("Key1", "value1");
		 map.put("Key2", "value2");
		 map.put("Key3", "value3");
		 map.put("Key4", "value4");
		 map.put("Key5", "value5");
		 map.put("Key1", "value1");
		 Set<String> set = map.keySet();
		 for(String str :set){
			System.out.println(str);
			System.out.println(map.get(str));
		 }
  }
	
	 //�����ֲ��� map.vaues ,��ȡ���е�ֵ
	@Test
	public void testHashMap4() {
		 Map<String, Object> map = new HashMap<>();
		 map.put("Key1", "value1");
		 map.put("Key2", "value2");
		 map.put("Key3", "value3");
		 map.put("Key4", "value4");
		 map.put("Key5", "value5");
		 map.put("Key1", "value1");
		 
		 for(Object obj :map.values()){
			System.out.println(obj);
		 }
 }
	
	
	 //��5�ֲ��� map.keySet ,��ȡ���е�ֵ
	@Test
	public void testHashMap5() {
	      //Map map = 	new LinkedHashMap();
	      //map.put(key, value);
		 Map<String, Object> map = new HashMap<>();
		 for(int i=1 ; i<10;i++){
			 map.put("key"+i, "value"+i);
		 }
		 Iterator<String> iterator= map.keySet().iterator();
		 while(iterator.hasNext()){
			String key = iterator.next();
			Object value = map.get(key);
			System.out.println(key+ value);
		 }
}
	
	
	
	
}
