import java.util.Arrays;

public class Hotel extends Person implements Family,Lease,address  {


    public Hotel() {
        System.out.println("Гостиницанын  жашоочулары");
      Person person = new Person("Dastan","Taipolotov",27);
        Person person1 = new Person("Dastan","Taipolotov",27);
        Person person2 = new Person("Dastan","Taipolotov",27);
        Person person3 = new Person("Dastan","Taipolotov",27);
        Person person4 = new Person("Dastan","Taipolotov",27);
        Person person5 = new Person("Dastan","Taipolotov",27);
        Person [] res= new Person[]{person,person1,person2,person3,person4,person5};
        int counter=0;
        for (int i = 0; i < res.length; i++) {
            counter++;
        }
        System.out.println("адамдын саны "+counter);
    }

    @Override
    public void adam() {

        System.out.println();

        }


    @Override
    public void Arenda() {
        System.out.println(" Ательде жашагандар аренда толошот");

    }

    @Override
    public void address1() {
        System.out.println( "адресс: первомиская 9 к2");

    }


}

