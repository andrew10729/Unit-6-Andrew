public class Album {
    private String title;
    private String artist;
    private int numTrack;
    private double playTime;


    public Album(String title, String artist, int numTrack, double playTime){
        this.title = title;
        this.artist = artist;
        this. numTrack = numTrack;
        this.playTime = playTime;
    }


    @Override
    public String toString() {
        String result = "";
        result += title + " by " + artist + " | " + numTrack +  " tracks";
        result += ", Time: " + playTime + " min";
        return result;
    }

    public String getTitle() {
        return title;
    }


    public String getArtist() {
        return artist;
    }
}
