package com.sampletest;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.samplecode.Sample;

public class SampleTest {
	Sample s = new Sample();
	@Test
	public void testLogin1() throws IOException {
		Assert.assertEquals( 0,s.userLogin("abc", "abcgmail.com"),"verify login scenario");
	}
	@Test
	public void testLogin2() throws IOException {
		Assert.assertEquals( 1,s.userLogin("abc", "abc@gmail.com"),"verify login scenario");
	}

}
