public class Keyboard extends techItem{

  //instance variables
  private int sizePercent;
  private boolean isMechanical;
  private String switches;
  //constructor methods
  public Keyboard(){
    super();
    sizePercent=100;
    isMechanical= false;
    switches="Not available";
  }

  /*parameterized constructor so that the program can call by value of
  arguments and we can use overloading effectively.
  */
  public Keyboard(double price, String name, boolean forGaming, boolean isWireless, int sizePercent, boolean isMechanical, String switches){
    super(price, name, forGaming, isWireless);
    this.sizePercent=sizePercent;
    this.isMechanical= isMechanical;
    this.switches=switches;
  }

  //accessor methods
  public int getSizePercent(){
    return sizePercent;
  }
  public boolean getMechanical(){
    return isMechanical;
  }
  public String getSwitches(){
    return switches;
  }

  //mutator methods
  public void setSize(int sizePercent){
    this.sizePercent= sizePercent;
  }
   public void setMechanical(boolean isMechanical){
    this.isMechanical= isMechanical;
  }
   public void setSwitches(String switches){
    this.switches= switches;
  }
  public String toString(){
    return super.toString()+"\nSize: "+sizePercent+"%"+"\nIs Mechanical: "+isMechanical+"\nSwitches: " +switches;
}
}