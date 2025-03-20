package Day11.Abstract_Challenge;

 interface Animal {
    int x=10; //By default public static final
    public void move();
    default void speed(int x){
        System.out.println("nkfmndklf");
    }
    static void speed(){
        System.out.println("nkfmndklf"); 
    }

    private  void speed(String x){
        System.out.println("nkfmndklf");
    }

    private  static void speed(String x,int y){
        System.out.println("nkfmndklf");
    }

    
}
