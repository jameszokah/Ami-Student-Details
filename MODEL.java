import java.swt.Random;

public class MODEL {

  private int indexNumber;

  MODEL() {

  }
// sets a random number
private int setIndexNumber() {

  Random random = new Random();
  this.uuid = Math.abs(random.nextInt(4589));
  return this.indexNumber;
}

public int getIndexNumber() {
  return this.setIndexNumber();
}

}