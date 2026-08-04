package com.prep.pattern_valut;

import com.prep.pattern_valut.creational.factory.Document;
import com.prep.pattern_valut.creational.factory.DocumentService;
import com.prep.pattern_valut.creational.factory.DocumentStorageFactory;
import com.prep.pattern_valut.creational.factory.StorageType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		DocumentService documentService = new DocumentService(new DocumentStorageFactory());
		String result  = documentService.upload(StorageType.LOCAL,new Document("test-file",new byte[3]));
		System.out.println(result);
	}

}
