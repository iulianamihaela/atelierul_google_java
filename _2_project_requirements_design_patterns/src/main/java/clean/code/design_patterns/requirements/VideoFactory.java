package clean.code.design_patterns.requirements;

public class VideoFactory {
	// videoParams reprezinta obiectul ce retine valorile necesare pentru
	// instantierea unui video (film sau serial)
	public Video getVideo(String videoType, VideoCreationParams videoParams){
		if(videoType == null){
			return null;
		}

		if(videoType.equalsIgnoreCase("MOVIE")){
			// Instantierea unui film

			// Facem cast la MovieCreationParams
			MovieCreationParams params = (MovieCreationParams)videoParams;

			// returnam filmul
			return new Movie(params.title, params.releaseYear, params.duration);
		} else if(videoType.equalsIgnoreCase("SHOW")) {
			// Instantierea unui serial

			// Facem cast la ShowCreationParams
			ShowCreationParams params = (ShowCreationParams)videoParams;

			// returnam serialul
			return new Show(params.title, params.releaseYear, params.numberOfSeasons, params.numberOfEpisodesPerSeason);
		}

		return null;
	}
}
