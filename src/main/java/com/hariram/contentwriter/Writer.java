/**
 * 
 */
package com.hariram.contentwriter;

import java.util.List;
import java.util.Map;

/**
 * @author hariram
 *
 */
abstract public class Writer {
	protected String filePath = "/var/www/";
	protected String fileName = "";
	/**
	 * 
	 * @param dataMap
	 */
	abstract public void write(Map<String, List<String>> dataMap);

	/**
	 * 
	 * @return
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * 
	 * @param filePath
	 */
	public void setFilePath(String filePath) {
		if(filePath != null || !filePath.equals("")) {
			this.filePath = filePath;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * 
	 * @param fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
