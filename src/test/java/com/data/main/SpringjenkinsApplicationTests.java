package com.data.main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sun.org.slf4j.internal.LoggerFactory;


@RunWith(SpringRunner.class)
@SpringBootTest
class SpringjenkinsApplicationTests {
	public static Logger logger=(Logger) LoggerFactory.getLogger(SpringjenkinsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("in test");
		assertEquals(true,true);
	}

}
