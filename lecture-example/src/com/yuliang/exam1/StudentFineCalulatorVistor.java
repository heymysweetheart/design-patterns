package com.yuliang.exam1;

public class StudentFineCalulatorVistor implements Visitor{

  private double fine;

  public double getFine() {
    return fine;
  }

  public void setFine(double fine) {
    this.fine = fine;
  }

  @Override
  public void visit(Book book) {
    double fee = book.getFeePerDayForStudent() * book.getDueDays();
    fine += fee < book.getMaxFeeForStudent() ? fee : book.getMaxFeeForStudent();
  }

  @Override
  public void visit(Magazine magazine) {
    double fee = magazine.getFeePerDayForStudent() * magazine.getDueDays();
    fine += fee < magazine.getMaxFeeForStudent() ? fee : magazine.getMaxFeeForStudent();
  }

  @Override
  public void visit(ResearchPaper researchPaper) {
    double fee = researchPaper.getFeePerDayForStudent() * researchPaper.getDueDays();
    fine += fee < researchPaper.getMaxFeeForStudent() ? fee : researchPaper.getMaxFeeForStudent();
  }
}
