package tools;

/**
 * Generique class Java for map's point.
 * 
 * @author v.lafosse
 *
 * @param <X>
 * @param <Y>
 */
public class Point<X, Y> {

	private X xValeur;

	private Y yValeur;

	public Point() {}

	public Point(X valX, Y valY) {
		this.xValeur = valX;
		this.yValeur = valY;
	}

	public void setValeur(X val1, Y val2) {
		this.xValeur = val1;
		this.yValeur = val2;
	}

	public X getValueX() {
		return this.xValeur;
	}

	public Y getValueY() {
		return this.yValeur;
	}

}
