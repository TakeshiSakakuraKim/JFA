import static daoda.Next.*;
public class Main {
	public static void main(String []args) {
		MImage img = new MImage("temp.jpg");
		MImage.Points arr[] = img.getLandmark();
		for (int i = 0; i < arr.length; i++) {
			println(i + ":" + arr[i].x + "/" + arr[i].y);
		}
	}
}
