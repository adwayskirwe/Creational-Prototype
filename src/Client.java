
public class Client {
    public static void main(String[]args){
        System.out.println("Deep copy:");
        Person p=new Person("Dad","Chevrolet Beat");
        System.out.println("Original person: ->");
        System.out.println(p.getName()+"  "+p.getCar().getName());
        //Cloning
        Person q=(Person)p.clone();
        System.out.println("Cloning with no changes: clone person: ->");
        System.out.println(q.getName()+"  "+q.getCar().getName());

        q.setName("Mom");
        q.getCar().setName("Bajaj ct100");
        System.out.println("CLoning with changes: clone person: ->");
        System.out.println(q.getName()+"  "+q.getCar().getName());

        System.out.println("Original person: After cloning ->");
        System.out.print(p.getName()+"  "+p.getCar().getName());
    }
}
