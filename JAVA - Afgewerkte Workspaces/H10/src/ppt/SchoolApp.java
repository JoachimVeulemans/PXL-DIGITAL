package ppt;

public class SchoolApp {

	public static void main(String[] args) {
		Persoon p2 = new Persoon();
		Student s1 = new Student();
		
		s1.setNaam("Van Camp");
		s1.setVoornaam("Camenbeire");
		
		System.out.println(s1.getNaam());
		System.out.println(s1.getVoornaam());
		
		s1.setLeerkrediet(-10000);
		s1.setOpleiding("IT");
		s1.setStudentnr(1005005151);
		
		System.out.println(s1.getLeerkrediet());
		System.out.println(s1.getOpleiding());
		System.out.println(s1.getStudentnr());
		
		s1.print();
		
		Persoon p1 = new Student(); //GEEN PERSOON MAAR STUDENT
		
		p1.getNaam();
		p1.print();
		
		Lector l1 = new Lector("Beckx", "Tommie", 50, 65442);
		l1.setSalaris(5000);
		l1.setAanstellingspercentage(100);
		l1.setAanstellingspercentage(50);
		l1.print();
		
		System.out.println("Aantal Persoon: " + Persoon.getAantal());
		System.out.println("Aantal Student: " + Student.getAantal());
		System.out.println("Aantal Lector: " + Lector.getAantal());
	}

}
