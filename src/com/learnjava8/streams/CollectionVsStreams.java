package com.learnjava8.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStreams {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Rajesh");
		names.add("Leonard");
		names.add("Sheldon");
		
		names.remove(0);
		
		System.out.println(names);
		
		Stream namesStream = names.stream();//cant add remove on stream
		
		namesStream.forEach(System.out:: println);
		namesStream.forEach(System.out:: println);//cant be used again
	}

}
