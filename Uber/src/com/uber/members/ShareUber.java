package com.uber.members;



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShareUber {

	static BufferedReader br = null;

	public static void main(String[] args) {
		UberStart uberStart = new UberStart();
	}

	public static BufferedReader getReader() {
		if (br == null) {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		return br;
	}

}
