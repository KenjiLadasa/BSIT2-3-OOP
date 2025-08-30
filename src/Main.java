import java.util.*;

public class Main {
    public static void main(String[] args) {
        PostManager manager = new PostManager();

        String postTitle = "Java Programming Tips";
        int[] interactions = {150, 75, 25};
        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        String[] authors = {"Alice", "Bob", "Alice", "Charlie", "Bob"};

        int engagementScore = manager.calculateEngagement(interactions);
        String category = manager.getCategoryRating(engagementScore);

        manager.displayPostStats(postTitle, engagementScore);
        manager.displayPostStats(postTitle, engagementScore, category);

        ArrayList<String> uniqueHashtags = manager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Advanced Java Tutorial", "Spring Boot Guide"));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Advanced Java Tutorial", 600);
        postEngagement.put("Spring Boot Guide", 450);
        LinkedList<String> trendingPosts = manager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);

        HashSet<String> uniqueAuthors = manager.getUniqueAuthors(authors);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
