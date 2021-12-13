package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        // VideosDB e singleton
        VideosDB videosDatabase = VideosDB.getInstance();
        // factory respecta factory pattern in crearea video-urilor (filme si seriale)
        VideoFactory factory = new VideoFactory();

        videosDatabase.addVideo(
            factory.getVideo(
                    "MOVIE",
                    new MovieCreationParams("Pe aripile vantului", 2003, 2.15)
            )
        );
        videosDatabase.addVideo(
                factory.getVideo(
                        "SHOW",
                        new ShowCreationParams("Simpsons", 1996, 20, 15)
                )
        );
        videosDatabase.addVideo(
                factory.getVideo(
                        "MOVIE",
                        new MovieCreationParams("Capra cu trei iezi", 1996, 1.5)
                )
        );
        videosDatabase.addVideo(
                factory.getVideo(
                        "SHOW",
                        new ShowCreationParams("Riverdale", 2019, 6, 20)
                )
        );
        videosDatabase.addVideo(
                factory.getVideo(
                        "MOVIE",
                        new MovieCreationParams("Fast and Furious", 2012, 1.33)
                )
        );

        for (Video video : videosDatabase.getVideos().values()) {
            System.out.println(video);
        }
    }
}
