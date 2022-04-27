class EmployeeDet {  

    int phoneNo;  
    String name, address, position;  
    public int getphoneNo() {
        return phoneNo;  
    }  
    public void setphoneNo(int phoneNo) {  
        this.phoneNo = phoneNo;  
    }
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getAddress() {  
        return address;  
    }  
    public void setAddress(String address) {  
        this.address = address;  
    }  
    public String getposition() {  
        return position;
    }  
    public void setposition(String position) {  
        this.position = position;  
    }  
    public String toString() {  
        return "name = " + name + ", phoneNo = " + phoneNo + ", address = " + address  + ", position = " + position;  
        }  
          
    }  
    public class Employee{  
      
        public static void main(String args[]) {  
            EmployeeDet emp = new EmployeeDet();  
            emp.setphoneNo(99110101);  
            emp.setName("Bataa");  
            emp.setposition("Manager");
            emp.setAddress("3-r horoo");
            System.out.println(emp);
        }  
    } 