package week9.Ex18.domain;

public class Item implements Thing, Comparable<Item> {
	private String name;
	private int volume;
	public Item(String name, int volume) {
		this.name = name;
        this.volume = volume;
	}
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    @Override
    public String toString() {
        return name + " (" + volume + " dm³)";
    }
    @Override
    public int compareTo(Item i) {
        return Integer.compare(this.volume, i.volume);
    }
}
