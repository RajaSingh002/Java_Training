package Day10.Test;
public class client extends Auto{
    client(String name){
        super(name);
    }
    @Override
    void pay() {
        // TODO Auto-generated method stub
        System.out.println(this.name +"is paying 500");
    }
    
}
