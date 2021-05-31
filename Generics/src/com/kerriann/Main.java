package com.kerriann;

public class Main {

    public static void main(String[] args) {
	    Milk milk = new Milk();
	    Oranges orange = new Oranges();

	    Box<Milk> boxOfMilk = new Box<>();
	    Box<Oranges> boxOfOranges = new Box<>();

	    debugAdd(milk, boxOfMilk);
	    debugAdd(orange, boxOfOranges);

        boxOfMilk.remove().drink();
        boxOfOranges.remove().juggle();
    }

    static <T> void debugAdd(T item, Box<T> box) {
		System.out.println("Type: " + item.getClass().getSimpleName());
		box.add(item);;
	}
}
