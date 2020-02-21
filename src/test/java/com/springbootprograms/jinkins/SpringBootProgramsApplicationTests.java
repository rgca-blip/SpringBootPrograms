package com.springbootprograms.jinkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootProgramsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootProgramsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Execute logger ....");
		assertEquals(true, true);
	}

}
