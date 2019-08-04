package com.thread.study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListstudy {

	@org.junit.Test
	public void test() {
		List list = new ArrayList();
		//list.remove(index);
		list.add("1");
		list.add("2");
		list.add("3");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			if ("1".equals(item)||"2".equals(item)) {
				iterator.remove();
			}else{
				System.out.println(item);
			}
		}
	}

	@org.junit.Test
	public void CopyOnWriteArraylistTest() {
		List list = new CopyOnWriteArrayList<>();
		//list.remove(index);
		list.add("1");
		list.add("2");
		list.add("3");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String item = iterator.next();
			if ("1".equals(item)||"2".equals(item)) {
				list.remove(item);
			}else{
				System.out.println(item);
			}
		}
	}
}
