/*
Greedy is an algorithmic paradigm that builds up a solution piece by piece,always choosing the new piece that offers
the most obvious and immediate benefit. So the problems where choosing locally optimal also leads to global solution are best fit for 
Greedy
*/

// In this tutorial , we are getting a greedy strategy to extract data from a social network using its API
//Using Greedy Algorithm, we can assume that the user with the most followers is the only one to consider : In the end, we need only four queries.


public class SocialConnector{
  private boolean isCounterEnabled =true;
  private int counter= 4;
  @Getter @Setter
  List users;
  
  public SocialConnector(){
    users = new ArrayList<>();
  }
  
  public boolean switchCounter(){
    this.isCounterEnabled = !this.isCounterEnabled;
    return this.isCounterEnabled;
  }
}

//Add a method to retrieve the followers list of a specific account

public List getFollowers(String account){
  if(counter < 0){
    throw new IllegalStateException("API Limit reached");
  }else{
    if (this.isCounterEnabled){
      counter--;
    }
    for(SocialUser user :users){
      if(user.getUsername().equals(account)){
        return user.getFollowers();
      }
    }
  }
  return new ArrayList<>();
}

public class SocialUser{
  @Getter
  private String username;
  @Getter 
  private List<SocialUser> followers;
  
  @Override
  public boolean equals(Object obj){
    return (socialUser)obj.getUsername().equals(username);
  }
  
  public SocialUser(String username,List<SocialUser> followers){
    this.followers.addAll(followers);
  }
  
  
 //Greedy Algorithm
  
 public class GreedyAlgorithm{
   int currentLevel =0;
   final int maxLevel =3;
   SocialConnector sc;
   public GreedyAlgorithm(SocialConnector sc){
     this.sc = sc;
   }
 }
  
 //We need to insert a method findMostFollowersPath
  
 public long findMostFollowersPath(String account){
   long max= 0;
   SocialUser toFolowe =  null;
   
   List followers = sc.getFollowers(acoount);
   for(SocialUser el : followers){
     long follwersCount = el.getFollowerCount();
     if(followerCount > max){
       toFollower = el;
       max = followersCount;
     }
   }
   if(currentLeve <maxLevel -1){
     currentLevel++;
     max+= findMostFollowerPath(toFollow.getUsername());
   }
   return max;
 
   
 //unit test
  public void greedyAlgorithmTest() {
    GreedyAlgorithm ga = new GreedyAlgorithm(prepareNetwork());
    assertEquals(ga.findMostFollowersPath("root"), 5);
}
     
      
