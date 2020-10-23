
public class Record {
	private int id; // random
	private String recordTitle; // null or empty
	private String singerName; // null or empty
	private double recordLength; // more than 0;
	private int recordRanking; // more than 0 & less than 6;
	
	public Record(String recordTitle, String singerName, double recordLength, int recordRanking) {
		setId();
		setRecordTitle(recordTitle);
		setSingerName(singerName);
		setRecordLength(recordLength);
		setRecordRanking(recordRanking);
	}
	
	public void setId() {
		int randomNum = (int)(Math.random() * (1000 - 100 + 1)) + 100;
		this.id = randomNum;
	}
	
	public void setRecordTitle(String recordTitle) {
		if (!recordTitle.equalsIgnoreCase(null) || !recordTitle.isEmpty()) {
			this.recordTitle = recordTitle;
		}
	}
	
	public void setSingerName(String singerName) {
		if (!singerName.equalsIgnoreCase(null) || !singerName.isEmpty()) {
			this.singerName = singerName;
		}
	}

	public void setRecordLength(double recordLength) {
		if (recordLength > 0) {
			this.recordLength = recordLength;
		}
	}
	
	public void setRecordRanking(int recordRanking) {
		if (recordRanking > 0 && recordRanking < 6) {
			this.recordRanking = recordRanking;
		}
	}
	
	public int getId() {
		return id;
	}
	
	public String getRecordTitle() {
		return recordTitle;
	}
	
	public String getSingerName() {
		return singerName;
	}
	
	public double getRecordLength() {
		return recordLength;
	}
	
	public int getRecordRanking() {
		return recordRanking;
	}
	
}
