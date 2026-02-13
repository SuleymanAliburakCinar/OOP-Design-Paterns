package patterns.creatinal.builder;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        System.out.println("------------------ inner class builder------------------\n");
        BlogPost blogPost = new BlogPost.Builder("Post Title", "Post Content")
                .isCommentsEnabled(true)
                .summary("BlogPost creating with builder pattern")
                .categories(List.of("oop", "design-pattern", "builder"))
                .build();

        System.out.println(blogPost);

        System.out.println("------------------ generic builder ------------------\n");
        Email email = GenericBuilder.of(Email::new)
                .with(Email::setTo, "oop@example.com")
                .with(Email::setSubject, "Design Pattern")
                .with(Email::setBody, "This is a generic builder example.")
                .build();

        System.out.println(email);
    }
}
