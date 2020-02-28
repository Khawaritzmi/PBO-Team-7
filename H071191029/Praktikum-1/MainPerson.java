public class MainPerson{
    public static void main(String[] args) {
        Person p = new Person();
        Person p2 = new Person();
        p.setName("Leeminho");
        p.setAge(20);
        p.setGender(true);

        p2.setName("Nisa");
        p2.setAge(18);
        p2.setGender(false);

        System.out.printf("Nama \t: %s\nUmur \t: %d\nGender \t: %s",p.getName(),p.getAge(),p.getGender());
        
    }
}