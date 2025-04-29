public class EqualsHascodeContract {
    public static void start() {
        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setName("Ajay");

        Student s = s1;

        Student s2 = new Student();
        s2.setRollNo(1);
        s2.setName("Ajay");

        Student s3 = new Student();
        s3.setRollNo(2);
        s3.setName("Vijay");


        System.out.println("s1==s2 " + (s1==s2));
        System.out.println("s1==s3 " + (s1==s3));
        System.out.println("s1==s " + (s1==s)); //both point to same reference,compares reference
        System.out.println("s1.equals(s2) "+s1.equals(s2));
    }
}
