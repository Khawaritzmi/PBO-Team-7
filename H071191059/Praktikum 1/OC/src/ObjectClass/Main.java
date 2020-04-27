package ObjectClass;

class Main {
    public static void main(String[] args) {
        // CLASS PERSON
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Upin");
        person1.setAge(5);
        person1.setGender(true);

        person2.setName("Mei-mei");
        person2.setAge(4);
        person2.setGender(false);

        System.out.println("// CLASS PERSON");
        System.out.println("Nama\t\t : " + person1.getName());
        System.out.println("Umur\t\t : " + person1.getAge() + " tahun");
        System.out.println("Jenis kelamin\t : " + person1.getGender());
        System.out.println();
        System.out.println("Nama\t\t : " + person2.getName());
        System.out.println("Umur\t\t : " + person2.getAge() + " tahun");
        System.out.println("Jenis kelamin\t : " + person2.getGender());
        System.out.println();

        
        // CLASS RECTANGLE
        Rectangle rec = new Rectangle();
        rec.height = 15;
        rec.width = 10;
        System.out.println("// CLASS RECTANGLE");
        System.out.println("Luas = " + rec.getArea());
    }
}