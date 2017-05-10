
public class Person implements Cloneable{
    Car car;
    String name;

    public Person(String pname,String cname){
        name=pname;
        car=new Car(cname);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public Car getCar(){
        return car;
    }

    public Object clone(){

            //Shallow copy->
            //return super.clone();

            //Deep copy->
            Person p=new Person(name,car.getName());
            return p;


    }
}
