class b {
  public static void main(String args[]) {
    b b = new b();
    System.out.println(b.show());
  }

  second show() {
    return new second();
  }

  class second {
    public static void main(String args[]) {
      b b = new b();
      System.out.println(b.show());
    }
  }

}