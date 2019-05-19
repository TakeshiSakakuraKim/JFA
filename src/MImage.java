import static daoda.Next.*;

public class MImage {
	public  class Points {
		public double x;
		public double y;
		public Points(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public Points(String x, String y) {
			this.x = Double.valueOf(x);
			this.y = Double.valueOf(y);
		}
	}
	private static final String  PYTHON_PATH =  getProperty("user.home") + "/anaconda3/bin/python";
	private static String defalutPath = "image/";
	private String imageName;
	private String landmark;
	private Points [] landmarks = new Points[700];

	public MImage(String name) {
		this.imageName = name;
		this.landmark = doProcessValue(true, new String[]{this.PYTHON_PATH, "src/main.py", "image/" + this.imageName});
		this.landmark = this.landmark.substring(1, this.landmark.length() -1);
		this.landmark = this.landmark.replace('[', ' ').replace(']', ' ');
		String [] temp = this.landmark.split("[\\s]* [\\s]*");
		println(temp.length);
		for (int i = 1;  i*2 < temp.length; i ++) {
			println(i*2 - 1);
			this.landmarks[i - 1] = new Points(temp[i*2 - 1], temp[i*2]);
		}
	}
	public Points[] getLandmark() {
		return this.landmarks;
	}
	public String toString() {
		return this.landmark;
	}

}
