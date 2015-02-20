/**
 * 
 */
package com.hariram.contentwriter;

/**
 * @author hariram
 * date 20-02-2015
 */
public class WriterUtil {
	
	public enum FILE_TYPE {CSV, XLS};
	
	/**
	 * 
	 * @param filePath
	 * @param fileName
	 * @param fileType
	 * @return
	 */
	public static Writer getWriter(String filePath, String fileName, FILE_TYPE fileType) {
		Writer writer = null;
		 
		switch (fileType) {
			case CSV:
				writer = new CSVWriter(filePath, fileName);
				break;
			case XLS:
				break;
			default:
				break;
		}
		
		return writer;
	}
}
