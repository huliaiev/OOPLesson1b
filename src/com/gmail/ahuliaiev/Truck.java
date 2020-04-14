package com.gmail.ahuliaiev;

public class Truck {

    private int length;
    private int width;
    private int height;
    private int weight;
        
    public Truck(int length, int width, int height, int weight) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}

	public Truck() {
		super();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getVolume() {
        int volume = length * width * height;
        return volume;
    }

	@Override
	public String toString() {
		return "Truck [length=" + length + ", width=" + width + ", height=" + height + ", weight=" + weight + "]";
	}

}