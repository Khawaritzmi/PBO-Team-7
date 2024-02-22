public class Person{
    
    //Atribut
    String name;
    int age;
    boolean isMale;
    
    //Set
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }

    //Get
    public void getAge(){
        return age;
    }

    public void getName(){
        return name;
    }

    public void getGender(){
        return isMale;
    }
}