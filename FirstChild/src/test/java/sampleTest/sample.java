package sampleTest;

import org.testng.annotations.Test;

import generics.GenericsTest;
import paautomation.PAAutomation;

public class sample {

	@Test
	public void test() {
		System.out.println("1st test execution");
		PAAutomation paAutomation = new PAAutomation();
		GenericsTest generics= new GenericsTest();
		
		paAutomation.testdemo("resuse module test");
		generics.testmultimodulechild("reuse multimodule child");
		
	}
}
