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
	protected String filePath = "";
	protected String fileName = "";
	
	abstract public void write(Map<String, List<String>> dataMap);

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
