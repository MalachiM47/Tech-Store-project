public class Mouse extends techItem {

  //instance variables
  private int dpi;
  private boolean hasSideButtons;
  private double weight;
  //constructor methods
  public Mouse(){
    super();
    dpi=800;
    hasSideButtons= false;
    weight=100;
  }
  public Mouse(double price, String name, boolean forGaming, boolean isWireless, int dpi, boolean hasSideButtons, double weight){
    super(price, name, forGaming, isWireless);
    this.dpi=dpi;
    this.hasSideButtons= hasSideButtons;
    this.weight=weight;
  }

  //accessor methods
  public int getDpi(){
    return dpi;
  }
  public boolean getSideButtons(){
    return hasSideButtons;
  }
  public double getWeight(){
    return weight;
  }
  public String toString(){
  return super.toString() +"\nDpi: "+dpi+"\nHas Side Buttons: "+hasSideButtons+"\nWeight: " +weight;
  }
}