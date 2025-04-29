import java.util.Objects;

public class Student {
    private int rollNo;
    private String name;

    public Student() {
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //equal objects must have equal hash codes, so override both together

    //Step 1. Check if object is null or not of same class type
    //Step 2. Check if object is pointing to ame reference then will have same value also.
    //Step 3. Compare each value
    //equals need to be overriden in custom objects, whereas in Strings class its already overriden
    //so for string objects compare it works
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if(o == this) {
            return true;
        }
        Student s = (Student) o; //typecast the obj: The parameter o is of type Object.
        return rollNo == s.rollNo && Objects.equals(name, s.getName());
    }

    //hashcode for same object should always return same hashcode
    //if hashcode of two objects is same it doesnt mean they are equal, its collision
    //if hashcode of two same (equals()) objects is different than it will be added as seprate keys in hashmap which is wrong
    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}