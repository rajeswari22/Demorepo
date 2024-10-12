package com.tvl.demoapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	@Test
	public void shouldAnswerWithTrue() {
		ChromeDriver browser = new ChromeDriver();
		browser.get("https://ebay.com");
		browser.close();
	}
}
