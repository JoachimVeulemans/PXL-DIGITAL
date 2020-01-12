package vraag1;

public interface Berekenbaar {
	int BTW = 21;

	double totalePrijs();

	default double totalePrijsExclBtw() {
		return this.totalePrijs() / (1 + (Berekenbaar.BTW / 100));
	}
}
