public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService ();
        Person sarah = new Person ("Sarah", 30);
        Person john = new Person("John","13");
        sarah.child = john;
        john = new Person("Alternativajoh", 30);
        john = null;



        personService.setAgeToEighteen (sarah);
        if (sarah.child != null){
            if (sarah.child.getName() != null) {
                System.out.println("sarah.child.getName().length() = " + sarah.child.getName().length());
            } else {
                System.out.println(0);
            }
        }
        System.out.println( "sarah.getAge () = "+ sarah.getAge);
        if (sarah.child != null) {
            System.out.println("sarah.child.getName() = " + sarah.child.getName());
        } else {
            System.out.println("No child ");
        }
        System.out.println("john.getName() = " + john.getName());
        System.out.println("sarah.child.getName() = " + sarah.child.getName());
        personService.changePersonToDani (sarah);
    }
}