package single_threaded_execution;

public class Gate {
    private int count = 0;
    private String name = "Nobody";
    private String address = "Nowhere";
    public synchronized void pass(String name,String address){
        this.count++;
        this.name = name;
        this.address = address;
        check();
    }
    public String toString(){
        return "No."+count+": "+name+", "+address;
    }
    private void check(){
        if(name.charAt(0)!=address.charAt(0)){
            System.out.println("****** broken ******"+toString());
        }
    }
}
