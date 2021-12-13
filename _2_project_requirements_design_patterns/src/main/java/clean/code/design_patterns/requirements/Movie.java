package clean.code.design_patterns.requirements;

public class Movie extends Video {
	private double duration;

	public Movie(String title, int releaseYear, double duration) {
		super(title, releaseYear);

		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"title='" + this.getTitle() + '\'' +
				", releaseYear=" + this.getReleaseYear() +
				", duration=" + duration +
				'}';
	}
}
