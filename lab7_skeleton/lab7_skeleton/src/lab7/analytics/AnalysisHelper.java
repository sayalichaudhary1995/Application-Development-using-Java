/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("average of likes per comments: " + likeNumber / commentNumber);
            System.out.println("-------------------");
    }
    
    public void getMostLikedComment(){
          Map<Integer, Comment> comment = DataStore.getInstance().getComments();
        int max = Integer.MIN_VALUE;
        int maxId = 0;

        for (Comment c : comment.values()) {

            int count = c.getLikes();

            if (count > max) {
                max = count;
                maxId = c.getPostId();
            }

        }
        
        System.out.println("2) Post with most liked comments:");
        System.out.println("Post Id: " + maxId + "  Total Number of Likes: " +max);
        System.out.println("-------------------");
  
    }
    
    public void getMostCommentedPost()
    {
         Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        int max = Integer.MIN_VALUE;
        int maxId = 0;

        for (Post p : posts.values()) {
            int count = p.getComments().size();

            if (count > max) {

                max = count;
                maxId = p.getPostId();

            }

        }

        System.out.println("3) Post with most comments:");
        System.out.println("Post Id: " + maxId + "  Total number of Comments : " + max);
         System.out.println("-------------------");
    }
    
}
