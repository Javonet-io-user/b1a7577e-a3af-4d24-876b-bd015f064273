package TestDotNetProject;

public enum TestEnum {
  jeden(1L),
  dwa(2L),
  sto(100L),
  tysiac(1000L),
  ;
  private long numVal;

  TestEnum(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
