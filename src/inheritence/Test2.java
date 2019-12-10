package inheritence;

public class Test2 {

    public static void main(String[] args) {

        Teacher1 t1 = new Teacher1();
        t1.setName("Soumik");
        t1.setAge(30);
        t1.setQualification("Bsc");

        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getQualification());

    }
}
