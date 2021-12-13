package clean.code.design_patterns.requirements;

public class Show extends Video {
	private int numberOfSeasons;
	private int numberOfEpisodesPerSeason;

	public Show(String title, int releaseYear, int numberOfSeasons, int numberOfEpisodesPerSeason) {
		super(title, releaseYear);

		this.numberOfSeasons = numberOfSeasons;
		this.numberOfEpisodesPerSeason = numberOfEpisodesPerSeason;
	}

	@Override
	public String toString() {
		return "Show{" +
				"title='" + this.getTitle() + '\'' +
				", releaseYear=" + this.getReleaseYear() +
				", numberOfSeasons=" + numberOfSeasons +
				", numberOfEpisodesPerSeason=" + numberOfEpisodesPerSeason +
				'}';
	}
}
