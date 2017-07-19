package tutorialspoint2.encapsulation;


public class RunEncap {

    public static void main(String args[]) {

        EncapTest encap = new EncapTest();

        encap.setName("Andrea");
        encap.setAge(47);
        encap.setIdNum("70");

        System.out.print("Name : " + encap.getName() + " and her Age is : " + encap.getAge());
    }
}
