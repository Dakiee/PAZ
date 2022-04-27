public class Employee{
    
    private String name;
    private String position;
    private String address;
    private int phoneNo;
    
    public Employee(){        
    }
    
    public Employee(String address, String name, String position){
        this.address = address;
        this.name = name;
        this.position = position;
    }
    public Employee(String address, String name, String position, int phoneNo){
        this.address = address;
        this.name = name;
        this.position = position;
        this.phoneNo = phoneNo;
    }
 
    public String getaddress() {
        return address;
    }
 
    public void setaddress(String address) {
        this.address = address;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getposition() {
        return position;
    }
 
    public void setposition(String position) {
        this.position = position;
    }
    
    public int getphoneNo() {
        return phoneNo;
    }
 
    public void setphoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
 
    public String getContactInfo(){
 
        return "name" + this.getName() + "address" + this.getaddress() +  "position" + this.getposition();
    }
 
}