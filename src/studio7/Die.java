public class Die {
    
  private int sides; 
  

  public Die (int sides) {

    this.sides = sides; 

   
  }

  public int valueReturned(){
    return (int)(Math.random()*this.sides+1);

}

  public static void main(String[] args) {
     Die s1 = new Die(200);
     System.out.println(s1.valueReturned());
  }
}
