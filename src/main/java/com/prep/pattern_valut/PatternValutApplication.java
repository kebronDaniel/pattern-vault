package com.prep.pattern_valut;


import com.prep.pattern_valut.structural.decorator.CompressorFileStorageDecorator;
import com.prep.pattern_valut.structural.decorator.EncryptingFileStorageDecorator;
import com.prep.pattern_valut.structural.decorator.FileStorage;
import com.prep.pattern_valut.structural.decorator.LocalFileStorage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {
		FileStorage storage = new CompressorFileStorageDecorator(
				new EncryptingFileStorageDecorator(new LocalFileStorage()));
		storage.store("test.txt", new byte[3]);
	}

}
