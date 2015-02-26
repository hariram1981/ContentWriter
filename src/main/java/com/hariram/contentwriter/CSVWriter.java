package com.hariram.contentwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author hariram
 *
 */
class CSVWriter extends Writer {
	BufferedWriter writer = null;

	/**
	 * 
	 * @param filePath
	 * @param fileName
	 */
	public CSVWriter(String filePath, String fileName) {
		if(filePath != null || !filePath.equals("")) {
			this.filePath = filePath;
		}
		this.fileName = fileName;
		try {
			writer = new BufferedWriter(new FileWriter(this.filePath + this.fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	/**
	 * 
	 */
	@Override
	public void write(Map<String, List<String>> dataMap) {
		String lastKey = dataMap.keySet().stream()
			.reduce((previous, current)-> current).get();
		System.out.println(lastKey);
		System.out.println(dataMap);
		//Write header columns
		dataMap.keySet().stream()
			.filter(key -> key!= null && key.equals(lastKey))
			.forEach(key -> {
				List<String> cols = dataMap.get(key);
				writeStr(key + ",");
				cols.stream()
					.forEach(col -> {
						writeStr(col + ",");
					});
				writeStr("\n");
			});
		//Write other columns
		dataMap.keySet().stream()
		.filter(key -> key == null || !key.equals(lastKey))
		.forEach(key -> {
			List<String> cols = dataMap.get(key);
			writeStr(key + ",");
			cols.stream()
				.forEach(col -> {
					writeStr(col + ",");
				});
			writeStr("\n");
		});
	}	
	/**
	 * 
	 * @param str
	 */
	private void writeStr(String str) {
		if(writer != null) {
			try {
				writer.write(str);
				writer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
