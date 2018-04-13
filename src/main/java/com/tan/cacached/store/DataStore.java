package com.tan.cacached.store;

public interface DataStore<K, V> {

	public ValueHolder<V> get(K key);
	
	public PutStatus put(K key,V value);
	
	public ValueHolder<V> remove(K key);
	
	public void clear(K key);
}
