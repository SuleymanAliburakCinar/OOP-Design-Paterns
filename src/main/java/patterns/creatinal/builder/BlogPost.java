package patterns.creatinal.builder;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class BlogPost {

    private String title;
    private String content;

    private String summary;
    private List<String> categories;
    private LocalDateTime scheduledPublishTime;
    private boolean isCommentsEnabled;

    private BlogPost(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.summary = builder.summary;
        this.categories = builder.categories;
        this.scheduledPublishTime = builder.scheduledPublishTime;
        this.isCommentsEnabled = builder.isCommentsEnabled;
    }

    public static class Builder {
        // Required Parameters
        private String title;
        private String content;
        // Optional Parameters
        private String summary;
        private List<String> categories;
        private LocalDateTime scheduledPublishTime;
        private boolean isCommentsEnabled;

        public Builder(String title, String content) {
            this.title = title;
            this.content = content;
        }

        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        public Builder categories(List<String> categories) {
            this.categories = categories;
            return this;
        }

        public Builder scheduledPublishTime(LocalDateTime scheduledPublishTime) {
            this.scheduledPublishTime = scheduledPublishTime;
            return this;
        }

        public Builder isCommentsEnabled(boolean isCommentsEnabled) {
            this.isCommentsEnabled = isCommentsEnabled;
            return this;
        }

        public BlogPost build() {
            return new BlogPost(this);
        }
    }
}
