package clean.code.design_patterns.requirements;

import java.util.HashMap;

public class VideosDB {
	// instanta singletone-ului
	private static VideosDB instance = null;

	// lista de video-uri (perechi titlu:video)
	private HashMap<String, Video> videos;

	private VideosDB() {
		this.videos = new HashMap<String, Video>();
	}

	public static VideosDB getInstance() {
		if (instance == null) {
			// Daca instanta e nula, realizam instantierea singleton-ului
			// lazy instantiation
			instance = new VideosDB();
		}

		return instance;
	}

	public void addVideo(Video video) {
		// Daca exista deja un video cu acelasi titlu, nu facem nimic
		if (this.videos.containsKey(video.getTitle())) {
			return;
		}

		this.videos.put(video.getTitle(), video);
	}

	public Video getVideo(String title) {
		return this.videos.get(title);
	}

	public HashMap<String, Video> getVideos() {
		return this.videos;
	}
}

