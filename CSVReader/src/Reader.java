import java.util.Arrays;

public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotionProfileData data = new MotionProfileData("files/something_left.csv", false, false, false);
		
		System.out.println("Number of lines: " + data.getNumLines());
		System.out.println(Arrays.deepToString(data.getData()));
	}

}
