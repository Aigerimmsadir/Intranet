package d;

public class AcademicReport {
	private String name;
	private String author;
	public String report;

	
	public AcademicReport(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void writeReport(String report) {
		this.report = report;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

