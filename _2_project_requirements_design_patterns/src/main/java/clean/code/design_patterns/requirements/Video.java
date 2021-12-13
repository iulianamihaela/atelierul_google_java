package clean.code.design_patterns.requirements;

public abstract class Video {
	private String title;
	private int releaseYear;

	public Video(String title, int releaseYear) {
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public String getTitle() {
		return this.title;
	}

	public int getReleaseYear() {
		return this.releaseYear;
	}

	@Override
	public String toString() {
		return "Video{" +
				"title='" + title + '\'' +
				", releaseYear=" + releaseYear +
				'}';
	}
}
