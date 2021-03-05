public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "WATER";
		String firsthalf = "";
		for(int i=0;i<=(input.length()/2)+1;i++) {
			System.out.println(input.substring(input.length()/2, (input.length()/2)+i));
			firsthalf = input.substring(input.length()/2, (input.length()/2)+i);
		}
		for(int i=1;i<=input.length()/2;i++) {
			System.out.println(firsthalf+input.substring(0, i));
		}
	}

}
