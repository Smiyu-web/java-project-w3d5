import java.util.Scanner;

public class Driver {
	
	// print just one object which pass as an argument
	public static void printSinger(Record x) {
		System.out.println("ID : " + x.getId() + "\n" +
				           "Singer Name : " + x.getSingerName() + "\n" +
				           "Title of song : " + x.getRecordTitle() + "\n" +
				           "Length of record : " + x.getRecordLength() + "\n" +
				           "Ranking of record : " + x.getRecordRanking());
	}
	
	// method to iterate through the array and find the index of record equals to title
	// return -1 if input is wrong
	public static int findIndexOfTitle(Record[] singer, String title) {
		for (int i = 0; i < singer.length; i++) {
			if (singer[i].getRecordTitle().equalsIgnoreCase(title)) {
				return i;
			}
		}
		return -1;
	}

	// getAverage of recordLength -> return average
	public static void getRecordLengthAverage(Record[] singer) {
		double sum = 0;
		for (int i = 0; i < singer.length; i++) {
			if (singer[i].getRecordLength() > 0) {
		         sum += singer[i].getRecordLength();
			}
		}
		System.out.println("Total length is " + sum);
		System.out.println("Length average is " + sum / singer.length);

	}
	
	public static void getRecordRankingAverage(Record[] singer) {
		int sum = 0;
		for (int i = 0; i < singer.length; i++) {
			if (singer[i].getRecordRanking() > 0) {
		         sum += singer[i].getRecordRanking();
			}
		}
		System.out.println("Total Ranking is " + sum);
		System.out.println("Ranking average is " + sum / singer.length);

	}
	

	// getAverage of ranking -> return average
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// create 7 projects
		Record s1 = new Record("7 rings", "Ariana Grande", 100, 1);
		Record s2 = new Record("Lovely", "Billie Eilish", 120, 2);
		Record s3 = new Record("Adore You", "Harry Style", 300, 3);
		Record s4 = new Record("22", "Taylor Swift", 220, 4);
		Record s5 = new Record("Wonder", "Shawn Mendes", 180, 5);
		Record s6 = new Record("Don't Start Now", "Dua Lipa", 330, 6);
		Record s7 = new Record("Lose You To Love Me", "Selena Gomez", 250, 7);

		// create array and add these objects to array
		Record[] singer = new Record[7];
		singer[0] = s1;
		singer[1] = s2;
		singer[2] = s3;
		singer[3] = s4;
		singer[4] = s5;
		singer[5] = s6;
		singer[6] = s7;


		// ask the user to enter the title of record
		System.out.print("Please enter the title of record : ");
		
		// read the input
		String enteredTitle = input.nextLine();

    	// findRecord and print the record
		int index = findIndexOfTitle(singer, enteredTitle);
		
		if (index == -1) {
			System.err.println("We don't have " + enteredTitle);
		} else {
		    printSinger(singer[index]);
		}
		
		System.out.println();
		// print the average
		getRecordLengthAverage(singer);
		getRecordRankingAverage(singer);

	}

}
