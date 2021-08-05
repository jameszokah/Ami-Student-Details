import java.util.Random;

public class MODEL {

  private int indexNumber;

  MODEL() {

  }
// sets a random number
private int setIndexNumber() {

  Random random = new Random();
  this.indexNumber = Math.abs(random.nextInt(64589));
  return this.indexNumber;
}

// Get Index Number
public int getIndexNumber() {
  return this.setIndexNumber();
}

public int setYearAdmitted(int setYear) {
 String year = String.valueOf(setYear);
  if(year.lenght >= 4) return;

  return Integer.parseInt(year);
}

public int getYearAdmitted() {
  return this.setYearAdmitted();
}

}