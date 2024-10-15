package m.exam02;

public class Human {
    private String name;
    private  int height;
    private  int weight;

    Human(String n, int h, int w){
        name= n; height=h;weight = w;
    }
    String getName(){return name;}
    int getHeight(){return height;}
    int getWeight(){return weight;}

    void gainWeight(int w) {weight +=w;}
    void reduceWeight(int w) {weight -=w;}
}
