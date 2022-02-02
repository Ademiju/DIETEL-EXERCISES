package diaryPhiles;

import java.time.LocalDateTime;

public class Gist {
    private String title;
    private LocalDateTime time = LocalDateTime.now();
    private String fullGist;

    @Override
    public String toString() {
        return "Gist{" +
                "title='" + title + '\'' +
                ", time=" + time +
                ", gist='" + fullGist + '\'' +
                '}';
    }

    public Gist(String title, String gist){
        this.title = title;
        this.fullGist = gist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getFullGist() {
        return fullGist;
    }

    public void setFullGist(String fullGist) {
        this.fullGist = fullGist;
    }
}

