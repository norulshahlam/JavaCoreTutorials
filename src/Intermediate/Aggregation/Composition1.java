package Intermediate.Aggregation;
/*
Composition is a special case of aggregation. In a more specific manner, a restricted aggregation is called composition. When an object contains the other object, if the contained object cannot exist without the existence of container object, then it is called composition. 

Example: A class contains students. A student cannot exist without a class. There exists composition between class and students.
                  
Composition is more restrictive. When there is a composition between two objects, the composed object cannot exist without the other object. This restriction is not there in aggregation. Though one object can contain the other object, there is no condition that the composed object must exist. The existence of the composed object is entirely optional. In both aggregation and composition, direction is must. The direction specifies, which object contains the other object.

Example: A Library contains students and books. 
Relationship between library and student is aggregation. 
Relationship between library and book is composition. 
A student can exist without a library and therefore it is aggregation. 
A book cannot exist without a library and therefore its a composition.

Composition in java is the design technique to implement has-a relationship in classes. We can use java inheritance or Object composition in java for code reuse.

Benefits
We can control the visibility of other object to client classes and reuse only what we need.

Also if there is any change in the other class implementation, for example getSalary returning String, we need to change Person class to accommodate it but client classes doesn’t need to change.

Composition allows creation of back-end class when it’s needed, for example we can change Person getSalary method to initialize the Job object at runtime when required.
*/
public class Composition1 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println(person.getSalary());
    }
}

class Person {

    // composition has-a relationship - Person has-a job
    private Job job;

    public Person() {
        this.job = new Job();
        job.setSalary(1000L);
    }

    public long getSalary() {
        return job.getSalary();
    }
}
class Job {
    private String role;
    private long salary;
    private int id;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
