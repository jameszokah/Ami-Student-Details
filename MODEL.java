import java.util.Random;
// import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MODEL {

  private int indexNumber;
  private int yearAdmitted;// = new Date().getYear();
  private String firstName;
  private String lastName;

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
 String year = String.valueOf(yearAdmitted);
   if(year.length() >= 4 || year.length() <= 4) return 2021;
    setYear = Integer.parseInt(year);
  return setYear;
}

public int getYearAdmitted() {
  return this.yearAdmitted;
}

private String regexMatcher(String name) {
    Pattern pattern = Pattern.compile("^[a-zA-Z]{3,}$", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(name);
    boolean matchFound = matcher.find();
    if(matchFound) {
      //System.out.println("Match found");
      return name;
    } else {
      //System.out.println("Match not found");
      return "Sorry Invalid Name";
    }

}

public String setFirstName(String name) {
  firstName = name;
  return this.regexMatcher(firstName);
}

public String setLastName(String name) {
  lastName = name;
  return this.regexMatcher(lastName);
}

public String getFirstName() {
     return firstName;
  }


public String getLastName() {
     return this.regexMatcher(lastName);
  }


}