package clean.code.design_patterns.requirements;

// parametrii necesari pentru crearea unui film
public class MovieCreationParams extends VideoCreationParams {
	public double duration;

	public MovieCreationParams(String title, int releaseYear, double duration) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.duration = duration;
	}
}
