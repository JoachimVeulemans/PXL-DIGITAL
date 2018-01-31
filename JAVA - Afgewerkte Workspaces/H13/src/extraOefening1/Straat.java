package extraOefening1;

public class Straat implements Doorloopbaar {

	private Structuur[] structuren;

	public Straat() {
		structuren = new Structuur[Doorloopbaar.MAX];
	}

	public void voegStructuurToe(Structuur s) {
		int count = 0;
		int posEersteNull = -1;
		int arrayVol = 0;
		for (int i = 0; i < structuren.length; i++) {
			if (structuren[i] != null && structuren[i].equals(s)) {
				count++;
			}
			if (structuren[i] == null && posEersteNull == -1) {
				arrayVol++;
				if (posEersteNull == -1) {
					posEersteNull = i;
				}
			}
		}
		if (count == 0) {
			structuren[posEersteNull] = s;
		}

		if (arrayVol == structuren.length) {
			Structuur[] temp = new Structuur[structuren.length];
			for (int i = 0; i < structuren.length; i++) {
				temp[i] = structuren[i];
			}
			structuren = new Structuur[temp.length + Doorloopbaar.MAX];
			for (int i = 0; i < temp.length; i++) {
				structuren[i] = temp[i];
			}
		}
	}

	@Override
	public int getAantal() {
		int count = 0;
		for (int i = 0; i < structuren.length; i++) {
			if (structuren[i] != null) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Object getWaarde(int waarde) {
		return structuren[waarde];
	}

}
