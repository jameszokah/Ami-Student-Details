class Main {
  public static void main(String[] args) {

    MODEL model = new MODEL();

    int index = model.getIndexNumber();
    new GUI();
    //System.out.printIn("2021" + index);

    model.setYearAdmitted(2021);
     System.out.println("2021" + model.getYearAdmitted());
  }
}