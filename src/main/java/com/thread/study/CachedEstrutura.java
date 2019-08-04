package com.thread.study;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CachedEstrutura {

	public  static  ConcurrentHashMap<String,Object>  cachedMap = new  ConcurrentHashMap<>();
	public static void main(String[] args) {
     
	}
	//concurrentHashMap ���컺��
	public  Object  CacdeEstruturaByConcurrentHashMap(String key){
		//��ȥ�����У����û�о�ȥ���ݿ��ѯ
		String  value="";
		if(("").equals(key)&&key!=null&&cachedMap.containsKey(key)){
		    return  cachedMap.get(key);
		}else{
			  value="aaa";
			cachedMap.put(key, value);
		}
		return value ;
	}

	public Object CacdeEstruturaByReentrantReadWrite(String key, Object value) {
		// ��ȥ�����У����û�о�ȥ���ݿ��ѯ
		ReadWriteLock rwi = new ReentrantReadWriteLock();
		Boolean IsExist = false;
		if (("").equals(key) && key != null && cachedMap.containsKey(key)) {
			rwi.readLock().lock();
			try {
				IsExist = cachedMap.get(key) == IsExist ? true : false;
				if (IsExist) {
					return value;
				}else {
					rwi.writeLock().lock();
					value = "aaa";
					cachedMap.put(key, value);
				}
			} catch (Exception e) {
			} finally {
				rwi.readLock().unlock();
			}
		} else {
			value = "aaa";
			cachedMap.put(key, value);
		}
		return value;
	}
	
	
}
