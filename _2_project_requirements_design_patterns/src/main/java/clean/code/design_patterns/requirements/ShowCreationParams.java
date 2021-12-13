package clean.code.design_patterns.requirements;

// parametrii necesari pentru crearea unui serial
public class ShowCreationParams extends VideoCreationParams {
	public int numberOfSeasons;
	public int numberOfEpisodesPerSeason;

	public ShowCreationParams(String title, int releaseYear, int numberOfSeasons, int numberOfEpisodesPerSeason) {
		this.title = title;
		this.releaseYear = releaseYear;
		this.numberOfSeasons = numberOfSeasons;
		this.numberOfEpisodesPerSeason = numberOfEpisodesPerSeason;
	}
}
