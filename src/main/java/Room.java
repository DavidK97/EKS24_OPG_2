public class Room {
    private String name;
    private int capacity;
   // private boolean isAvailable;


    public Room (String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        //isAvailable = true;

    }

    public int getCapacity (){
        return capacity;
    }

    public String getName (){
        return name;
    }
}
