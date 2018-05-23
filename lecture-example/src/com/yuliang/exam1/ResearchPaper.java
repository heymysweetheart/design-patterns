package com.yuliang.exam1;

public class ResearchPaper implements LibraryItem{

  private double feePerDayForStudent;
  private double maxFeeForStudent;
  private double feePerDayForFaculty;
  private double maxFeeForFaculty;
  private int dueDays;

  public ResearchPaper(double feePerDayForStudent, double maxFeeForStudent, double feePerDayForFaculty, double
      maxFeeForFaculty, int dueDays) {
    this.feePerDayForStudent = feePerDayForStudent;
    this.maxFeeForStudent = maxFeeForStudent;
    this.feePerDayForFaculty = feePerDayForFaculty;
    this.maxFeeForFaculty = maxFeeForFaculty;
    this.dueDays = dueDays;
  }

  public int getDueDays() {
    return dueDays;
  }

  public void setDueDays(int dueDays) {
    this.dueDays = dueDays;
  }

  public double getFeePerDayForStudent() {
    return feePerDayForStudent;
  }

  public void setFeePerDayForStudent(double feePerDayForStudent) {
    this.feePerDayForStudent = feePerDayForStudent;
  }

  public double getMaxFeeForStudent() {
    return maxFeeForStudent;
  }

  public void setMaxFeeForStudent(double maxFeeForStudent) {
    this.maxFeeForStudent = maxFeeForStudent;
  }

  public double getFeePerDayForFaculty() {
    return feePerDayForFaculty;
  }

  public void setFeePerDayForFaculty(double feePerDayForFaculty) {
    this.feePerDayForFaculty = feePerDayForFaculty;
  }

  public double getMaxFeeForFaculty() {
    return maxFeeForFaculty;
  }

  public void setMaxFeeForFaculty(double maxFeeForFaculty) {
    this.maxFeeForFaculty = maxFeeForFaculty;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
