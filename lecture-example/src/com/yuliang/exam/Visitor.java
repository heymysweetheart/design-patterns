package com.yuliang.exam;

public interface Visitor {
  void visit(Book book);
  void visit(Magazine magazine);
  void visit(ResearchPaper researchPaper);
}
