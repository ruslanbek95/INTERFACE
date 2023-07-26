public class Flat extends Person implements Family,Comynalnay,address {


    @Override
    public void adam() {
        System.out.println("квартиранын жашоочулары");
        Person person = new Person();
        Person person0 = new Person("Ruslan","Taipolotov",27);
        Person person1 = new Person("Rustam","Taipolotov",27);
        Person person2 = new Person("Dastan","Taipolotov",26);
        Person person3= new Person("Azamat","Taipolotov",23);
        Person person4 = new Person("ALihan","Taipolotov",22);
        Person person5 = new Person("Ruslan","Taipolotov",27);
        Person person6 = new Person("Rustam","Taipolotov",27);
        Person person7 = new Person("Dastan","Taipolotov",26);
        Person person8= new Person("Azamat","Taipolotov",23);
        Person person9 = new Person("ALihan","Taipolotov",22);

        Person[] rees= new Person[]{person1,person0,person2,person3,person4,person5,person6,person7,person8,person9};
      int counter =0;
        for (int i = 0; i < rees.length; i++) {
            counter++;
        }
        System.out.println("адамдын саны " + counter);


    }//Cvartira;

    @Override
    public void Com() {
        System.out.println("Квартирада жашагандар  комунальная услуга толошот");

    }

    @Override
    public void address1() {
        System.out.println("адресс: соколина горы 12б");

    }
}
