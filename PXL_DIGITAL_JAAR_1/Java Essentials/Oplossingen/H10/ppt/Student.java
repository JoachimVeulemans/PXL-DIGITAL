package ppt;

public class Student extends Persoon {

	private int leerkrediet = 0;
	private int studentnr;
	private String opleiding;
	private static int count = 0;

	{
		count++;
	}

	public static int getAantal() {
		return count;
	}

	public Student() {
		this("onbekend", "onbekend");
	}

	public Student(String naam, String voornaam) {
		this(naam, voornaam, 15999999, "XXX");
	}

	public Student(String naam, String voornaam, int studentnr, String opleiding) {
		super(naam, voornaam);
		this.studentnr = studentnr;
		this.opleiding = opleiding;
		this.leerkrediet = 140;
	}

	public Student(Student student) {
		this(student.getNaam(), student.getVoornaam(), student.getStudentnr(), student.getOpleiding());
		this.leerkrediet = student.getLeerkrediet();
	}

	public void setLeerkrediet(int getal) {
		this.leerkrediet = getal;
		if (this.leerkrediet < 0) {
			this.leerkrediet = 0;
		} else {
			if (this.leerkrediet > 140) {
				this.leerkrediet = 140;
			}
		}
	}

	public int getLeerkrediet() {
		return this.leerkrediet;
	}

	public int getStudentnr() {
		return studentnr;
	}

	public void setStudentnr(int studentnr) {
		this.studentnr = studentnr;
	}

	public String getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(String opleiding) {
		this.opleiding = opleiding;
	}

	@Override
	public void print() {
		System.out.println(this.getNaam());
		System.out.println(this.leerkrediet);
	}
}
