public class Item{

    private String name;
    private double price;
    private int index;

    Item(String name, double price){
    this.name = name;
    this.price= price;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double  getPrice(){
        return price;
    }
    public void setPrice(double number){
        this.price = number;
    }

    public int getIndex(){
        return this.index;
    }
    public void setIndex(int index){
        this.index = index;
    }

}
  