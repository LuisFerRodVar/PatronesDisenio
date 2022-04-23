package AdapterPattern;

public class Main {

    public static void main(String[] args) {
        OldCustomer oldCustomer = new OldCustomer();
        oldCustomer.setName("Sergio");
        oldCustomer.setAge("22");
        oldCustomer.setAddress("Pueblo Civil,22,60703,Golfito");

        Customer customer = new CustomerAdapter(oldCustomer);
        System.out.println(customer.getName());
        System.out.println(customer.getAge());
        System.out.println(customer.getAddress());
    }
}
