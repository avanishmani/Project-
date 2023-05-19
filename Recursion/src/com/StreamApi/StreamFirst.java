package com.StreamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFirst {

	public static void main(String[] args) {
	List<String> list=Arrays.asList("one","two","three","four","five");
	Stream<String> st=list.stream();
//	st.forEach(e->System.out.println(e.toUpperCase()));
    List<String> li= st.filter(e->e.startsWith("f")).collect(Collectors.toList());
    System.out.println(li);
	}

}
