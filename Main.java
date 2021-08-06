class Main {
  public static void main(String[] args) {

    MODEL model = new MODEL();

    int index = model.getIndexNumber();

    GUI student = new GUI();

    String indexNumber = "2021" + index; // student.yearAdmitted.getText() + index;

    //System.out.printIn("2021" + index);
     model.setFirstName(student.firstName.getText());
   // model.setYearAdmitted(2021);

    //student.submitButton.addActionListener()
     System.out.println(model.getFirstName());
     System.out.println(indexNumber);
  }
}