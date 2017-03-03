/**
 * Created by Polina_Z on 27.02.17.
 */
public class Airplanes extends Company {



    private String name;
    private int capacity;
    private int content;
    private int distance;
    private int consumption;


    public Airplanes(String name, int capacity, int content, int distance, int consumption) {

        this.name = name;
        this.capacity = capacity;
        this.content = content;
        this.distance = distance;
        this.consumption = consumption;




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return "Airplanes{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", content=" + content +
                ", distance=" + distance +
                ", consumption=" + consumption +
                '}';
    }


    @Override
    public String getFly() {
        boolean flies = false;
        if (flies)
            System.out.println("Plane can fly");
        flies = true;

        return getFly();

    }
}
