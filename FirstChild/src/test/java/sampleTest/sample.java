package sampleTest;

import org.testng.annotations.Test;

import paautomation.PAAutomation;

public class sample {

	@Test
	public void test() {
		System.out.println("1st test execution");
		PAAutomation paAutomation = new PAAutomation();
		paAutomation.testdemo("resuse module test");
		// boolean flg = System.out.println(flg);
	}
}
