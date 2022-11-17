import java.util.Objects;

public class Customer {
    long id;
    String NameCustomer;
    String address;
    String userName;
    long password;
    boolean isInsert;

    public Customer(){
        this.isInsert = false;
    }
    public Customer(long id, String NameCustomer, String address, String userName, long password) {
        this.id = id;
        this.NameCustomer = NameCustomer;
        this.address = address;
        this.userName = userName;
        this.password = password;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return NameCustomer;
    }

    public void setNameCustomer(String NameCustomer) {
        this.NameCustomer = NameCustomer;
    }

    public String getAddrees() {
        return address;
    }

    public void setAddrees(String addrees) {
        this.address = addrees;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    public boolean isIsInsert() {
        return isInsert;
    }

    public void setIsInsert(boolean isInsert) {
        this.isInsert = isInsert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && password == customer.password && isInsert == customer.isInsert && Objects.equals(NameCustomer, customer.NameCustomer) && Objects.equals(address, customer.address) && Objects.equals(userName, customer.userName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", NameCustomer='" + NameCustomer + '\'' +
                ", address='" + address + '\'' +
                ", userName='" + userName + '\'' +
                ", password=" + password +
                ", isInsert=" + isInsert +
                '}';
    }
}
