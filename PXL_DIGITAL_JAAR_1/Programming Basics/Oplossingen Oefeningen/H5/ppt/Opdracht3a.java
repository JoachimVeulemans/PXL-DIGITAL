package ppt;

public class Opdracht3a {
	public static void main(String[] args) {
		byte aByte = 2;
		short aShort = 1568;
		
		//sShort = aByte; --> werkt perfect
		
		aByte = (byte)aShort; //Opgelet! Wel gegevensverlies!
		System.out.println(aByte);
		
		float f = 12.3F;
		long l = 12345678977L;
				
	}
}
