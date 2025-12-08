import java.util.List;
import java.util.ArrayList;

class F1 {
	static double totalTime(List<Double> lapTimes) {
//		lapTimes.remove(0);
		double sum = totalTime(lapTimes);
		int laps = lapTimes.size();
		return time/laps;
	}
	public static void main(String[] args) {
		List <Double> lapTimes = new ArrayList <> ();
		lapTimes.add(31.0);
		lapTimes.add(20.9);
		lapTimes.add(21.0);
		lapTimes.add(21.3);

		System.out.printf("Общее время: %.1f c\n", totalTime(lapTimes));
		System.out.printf("Среднее время: %.1f c\n", avgTime(lapTimes));
	}
}

