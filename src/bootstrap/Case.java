package bootstrap;

import tools.Point;

/**
 * @author v.lafosse
 *
 */
public class Case {

    int weight, x, y;

    Case above;

    Case below;

    Case left;

    Case right;

    public Case() {
	// TODO Auto-generated constructor stub
    }

    public void addNeighbor(Case neighbor, NeighborType type) {
	switch (type) {
	case ABOVE:
	    this.above = neighbor;
	    break;
	case LEFT:
	    this.left = neighbor;
	    break;
	case RIGHT:
	    this.right = neighbor;
	    break;
	case BELOW:
	    this.below = neighbor;
	    break;
	default:
	    new Exception("Erreur lors de l'attribution des voisins. ");
	}
    }

    public void setX(int xInput) {
	this.x = xInput;
    }

    public void setY(int yInput) {
	this.y = yInput;
    }

    public void setWeight(int inputValue) {
	this.weight = inputValue;
    }

    public int getX() {
	return this.x;
    }

    public int getY() {
	return this.y;
    }

    public int getWeight() {
	return this.weight;
    }

    public Point<Integer, Integer> getCurrentPosition(Case currentPosition) {
	Point<Integer, Integer> point = new Point<>();

	point.setValeur(currentPosition.getX(), currentPosition.getY());
	return point;
    }

    // retourner l object Case en passant les coordonnees d un point
    // public Case getCase(Point point) {
    //
    // // complete pour recup l object case
    // return null;
    // }
}
