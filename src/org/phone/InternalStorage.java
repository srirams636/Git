package org.phone;

public class InternalStorage {
	
	private void ramSize() {

		System.out.println("\nRAM size is 16 GB");
	}
	
	private void processorName() {

		System.out.println("\nProcessor Name is intel");
	}
	

	private void method() {
		
		System.out.println("method");
		
	}

	private void storageName() {
		
		System.out.println("Internal");

	}
	
	public static void main(String[] args) {

		InternalStorage i = new InternalStorage();
		i.ramSize();
		i.processorName();
		
		ExternalStorage e = new ExternalStorage();
		e.size();
	}
}
