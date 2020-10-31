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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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
    
        public void getTopFiveInactiveUsersBasedOnTotalPostNumber() {

        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Integer> users = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        int maxId = 0;

        for (Post p : posts.values()) {

            int count = 1;

            if (users.containsKey(p.getUserId())) {
                count = users.get(p.getUserId());
                count++;
            }

            users.put(p.getUserId(), count);
        }

        Set entrySet = users.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue() - b.getValue();
            }
        });

        System.out.println("4) Top 5 inactive users based on total number of posts:");
        for (int i = 0; i < list.size() && i < 5; i++) {
            int userid = list.get(i).getKey();
            int numberOfPosts = list.get(i).getValue();
            System.out.println("User :" + userid + " posted " + numberOfPosts + " post");
             
        }
        System.out.println("-------------------");

    }
 
        
          public void getTopFiveInactiveUsersBasedOnTotalCommentsTheyCreated() {

        Map<Integer, Comment> comments = DataStore.getInstance().getComments();

        Map<Integer, Integer> users = new HashMap<>();

        for (Comment c : comments.values()){

        c.getUserId();


        int count = 1;

        if(users.containsKey(c.getUserId())){
            count = users.get(c.getUserId());
            count++;
        }

        users.put(c.getUserId(),count);
        
        }
     
        Set entrySet = users.entrySet(); 
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue() - b.getValue();
            }
        });
        
        System.out.println("5) Top 5 Inactive users based on total comments they created:");
        int prevNumberOfPosts = -1;
        int count = 0;
        for (int i = 0; i < 5 && count <= 4; i++) {
            int userid = list.get(i).getKey();
            int numberOfPosts = list.get(i).getValue();
            
            if(prevNumberOfPosts != numberOfPosts){
                count++;
            }
            prevNumberOfPosts = numberOfPosts;
            System.out.println("User Id :" + userid + " Created " + numberOfPosts + " Comments");
        }
        System.out.println("-------------------");

        
    }
       
       
    public List<Map.Entry<Integer,Integer>> someName(final String order){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();

        Map<Integer, Integer> totalCount = new HashMap<>();

        for (Comment c : comments.values()) {                
            totalCount.put(c.getUserId(), totalCount.getOrDefault(c.getUserId(), 0) + c.getLikes() + 1);   
        }

        for (Post p : posts.values()) {
            totalCount.put(p.getUserId(), totalCount.getOrDefault(p.getUserId(), 0) + 1);
        }
            
        Set<Map.Entry<Integer,Integer>> entrySet = totalCount.entrySet();
            
           
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(entrySet);
        Comparator<Map.Entry<Integer, Integer>> cmp = new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                if(order.equals("asc")){
                    return a.getValue() - b.getValue();  
                }else{
                    return b.getValue() - a.getValue();
                }
                   
                   
            }
        };
           
        Collections.sort(list, cmp);
            
        return list;
    }
       
        public void getTopFiveInactiveUsersOverallBasedonSumOfCommentsLikesAndPosts() {

            
            List<Map.Entry<Integer, Integer>> list = someName("asc");
            
            System.out.print("6) Top 5 Inactive user based on Sum of likes, comments, posts are:\n");
            for (int i = 0; i < list.size() && i < 5; i++) {
            int userid = list.get(i).getKey();
            int totalSum = list.get(i).getValue();
            System.out.println("User Id : " + userid + " has total " + totalSum );
        }      
            System.out.println("-------------------");
    }
        
              
        public void getTopFiveActiveUsersOverallBasedonSumOfCommentsLikesAndPosts() {

        List<Map.Entry<Integer, Integer>> list = someName("dsc");
            
            
            System.out.print("7) Top 5 Active user based on sum of likes, comments, posts are:\n");
            for (int i = 0; i < list.size() && i < 5; i++) {
            int userid = list.get(i).getKey();
            int totalSum = list.get(i).getValue();
            System.out.println("User Id : " + userid + " has total " + totalSum );
        }   System.out.println("-------------------");     
    }
            
}
