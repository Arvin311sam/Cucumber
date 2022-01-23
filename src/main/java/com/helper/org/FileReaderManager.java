package com.helper.org;

import java.io.IOException;

public class FileReaderManager {
	public FileReaderManager() {
		
	}
	public static FileReaderManager getinstanceFRM() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
	}
	public ConfigurationReader getinstanceCR() throws IOException {
		ConfigurationReader cr= new ConfigurationReader();
		return cr;

	}
}
