package HackerRankQuestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Question 1 Implement a function to process a 2D array of strings, logs.
 * representing AWS CloudWatch log data. Each inner list in logs includes the
 * year, date, status, and message. class Result public static
 * listliststringstrate The function should:
 * 
 * 1. Filter out and return all logs with "ERROR" or "CRITICAL" status
 * 
 * 2. Sort the filtered logs by their time of arrival
 * 
 * 3. Maintain original order for logs with identical arrival times
 * 
 * 4. Handle log dates in DD-MM-YYYY format and times in HH:MM format Example
 * 
 * logs = [["01-01-2023", "14:00", "ERROR", "failed"]. ["01-01-2023",
 * "15:00","INFO", "established"], ["01-01-2023", "01:30", "ERROR", "failed"] ].
 * 28 30 > public class Solution Log Index 1 2 Date Time Status Message
 * 01-01-2023 01:30 ERROR failed 01-01-2023 14:00 ERROR failed 3 01-01-2023
 * 15:00 INFO established The answer is [["01-01-2023", "01:30", "ERROR",
 * "failed"], ["01-01-2023", "14:00", "ERROR", "failed"]]. This is because the
 * input contains two log entries with ERROR status, and They are sorted in
 * ascending order of when they arrived. Note: Do not use Datetime modules since
 * this will slow Town code performance.
 */

public class AWSCloudWatch {

	public static List<List<String>> processLogs(List<List<String>> logs) {

		// 1️⃣ FILTER: keep only ERROR and CRITICAL logs
		Iterator<List<String>> iterator = logs.iterator();
		while (iterator.hasNext()) {
			List<String> logData = iterator.next();
			String status = logData.get(2);

			if (!status.equals("ERROR") && !status.equals("CRITICAL")) {
				iterator.remove(); // remove unwanted logs
			}
		}

		// 2️⃣ SORT: by date + time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

		Comparator<List<String>> compareLogs = (log1, log2) -> {
			LocalDateTime t1 = LocalDateTime.parse(log1.get(0) + " " + log1.get(1), formatter);

			LocalDateTime t2 = LocalDateTime.parse(log2.get(0) + " " + log2.get(1), formatter);

			return t1.compareTo(t2);
		};

		Collections.sort(logs, compareLogs); // stable sort

		return logs;
	}

	public static void main(String[] args) {

		List<List<String>> logs = new ArrayList<>();

		logs.add(new ArrayList<>(List.of("05-02-2023", "09:15", "INFO", "system boot")));
		logs.add(new ArrayList<>(List.of("05-02-2023", "09:15", "ERROR", "disk failure")));
		logs.add(new ArrayList<>(List.of("05-02-2023", "08:45", "CRITICAL", "kernel panic")));
		logs.add(new ArrayList<>(List.of("05-02-2023", "10:00", "WARNING", "high memory")));
		logs.add(new ArrayList<>(List.of("05-02-2023", "09:15", "ERROR", "network timeout")));
		logs.add(new ArrayList<>(List.of("04-02-2023", "23:59", "ERROR", "auth failed")));

		List<List<String>> result = processLogs(logs);

		System.out.println(result);
	}
}
