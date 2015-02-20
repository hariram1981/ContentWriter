package com.hariram.contentwriter;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.hariram.contentwriter.WriterUtil.FILE_TYPE;

public class CSVWriterTest {

	@Test
	public void testCSVWriter() {
		Writer writer = new CSVWriter("","test.csv");
		
		Map<String, List<String>> dataMap = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("1.0");
		list.add("1.5");
		list.add("2.0");
		list.add("2.5");
		dataMap.put(null, list);
		
		list = new ArrayList<String>();
		list.add("2.0");
		list.add("2.5");
		list.add("3.0");
		list.add("3.5");
		//list.add("3.0");
		dataMap.put("B", list);

		list = new ArrayList<String>();
		list.add("col1");
		list.add("col2");
		list.add("col3");
		list.add("col4");
		//list.add("3.0");
		dataMap.put("ad2_columns", list);
		
		writer.write(dataMap);
		
		assertTrue(true);
	}
	
	@Test
	public void testCSVWriterUtil() {
		Writer writer = WriterUtil.getWriter("","test1.csv", FILE_TYPE.CSV);
		
		Map<String, List<String>> dataMap = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		list.add("1.0");
		list.add("1.5");
		list.add("2.0");
		list.add("2.5");
		dataMap.put(null, list);
		
		list = new ArrayList<String>();
		list.add("2.0");
		list.add("2.5");
		list.add("3.0");
		list.add("3.5");
		//list.add("3.0");
		dataMap.put("B", list);

		list = new ArrayList<String>();
		list.add("col1");
		list.add("col2");
		list.add("col3");
		list.add("col4");
		//list.add("3.0");
		dataMap.put("ad2_columns", list);
		
		writer.write(dataMap);
		
		assertTrue(true);
	}

}
