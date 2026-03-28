package nikola;

public class Glavni {

	public static void main(String[] args) {
		Person person = new Person("Ana", 20, false);
        System.out.println(person);
        person = new Person("Aca", 47, true);
        System.out.println(person);        
	}

}
