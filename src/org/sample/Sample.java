package org.sample;

public class Sample {
	private void tc01() {
		System.out.println("test1");
	}
	private void tc02() {
		System.out.println("test2");
	}
private void tc03() {
	System.out.println("test3");
}
public static void main(String[] args) {
	Sample s = new Sample();
	s.tc01();
	s.tc02();
	s.tc03();
}
}