public class Room {
    private String name;
    private int capacity;

    public Room (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity (){
        return capacity;
    }

    public String getName (){
        return name;
    }

    public String toString () {
        return "Name: " + getName() + "| Capacity: " + getCapacity();
    }
}
