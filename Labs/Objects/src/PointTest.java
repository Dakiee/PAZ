public class PointTest {

	public static void main(String[] args) {

		Point px = new Point(0, 8);

		Point py = new Point(5, 9);

		double distance = px.getDistance(py);

		System.out.println("Hoorondoh zai ni: " + distance);
	}

}