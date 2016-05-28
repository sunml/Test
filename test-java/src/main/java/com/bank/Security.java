package com.bank;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Security implements Serializable {

	private static final long serialVersionUID = 5979998703965193048L;

	private String key;
	private List<String> ips;

	public Security() {
		ips = new ArrayList<String>();
	}

	public Security(String key) {
		this.key = key;
		ips = new ArrayList<String>();
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String get(int index) {
		return ips.get(index);
	}

	public boolean add(String e) {
		return ips.add(e);
	}

	public String remove(int index) {
		return ips.remove(index);
	}

	public boolean remove(Object o) {
		return ips.remove(o);
	}

	public boolean isEmpty() {
		return ips.isEmpty();
	}

	public void clear() {
		ips.clear();
	}

}
