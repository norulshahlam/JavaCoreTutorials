import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String args[] ) throws Exception {
      Scanner sc = new Scanner(System.in);

      String[] lineArray = sc.nextLine().split(" ");
      Chat newChat = new Chat();
      newChat.add(lineArray);

      lineArray = sc.nextLine().split(" ");

      int[] files = new int[lineArray.length];
      for (int i=0; i < lineArray.length; i++) {
          files[i] = Integer.parseInt(lineArray[i]);
      }
      newChat.add(files);

      String line = sc.nextLine();
      int numberOfMessages = Integer.parseInt(line);

      for (int i=0; i < numberOfMessages; i++) {
          line = sc.nextLine();
          newChat.add(i, line);
      }

      lineArray = sc.nextLine().split(" ");
      newChat.remove(lineArray);

      lineArray = sc.nextLine().split(" ");
      int[] filesRemoved = new int[lineArray.length];
      for (int i=0; i < lineArray.length; i++) {
          filesRemoved[i] = Integer.parseInt(lineArray[i]);
      }
      newChat.remove(filesRemoved);

      lineArray = sc.nextLine().split(" ");
      for (int i=0; i < lineArray.length; i++) {
          newChat.remove(Integer.parseInt(lineArray[i]));
      }

      newChat.printConversation();
  }
}
class Chat{
    
  public List<String> members;
  public List<Integer> files;
  public HashMap<String, Integer> message;
  
  public Chat(){}
  
  public Chat(List<String> members, List<Integer> files, HashMap<String, Integer> message){
      this.members=members;
      this.files=files;
      this.message=message;        
  }
  
  public void add(String[] names){
      for(String s : names){
          members.add(s);
      System.out.println(3);
      }
  }
   public void add(int[] ids){
        for(int i=0; i<ids.length; i++){
          files.add(ids[i]);
      }
  }
  public void add(int id, String newMessage){
      message.put(id, newMessage);
  }
  
  public void remove(String[] names){
      for(int i=0; i<names.length; i++){
          
         boolean result= members.remove(names[i]);
         if(!result){
             System.out.println("Member with name "+names[i]+" does not exists");
         }
  //    if(members.equals(names[i])){
  //        members.remove(i);
  //    }
      }
  }
  
  public void remove(int[] ids){
      for(int i=0; i<ids.length; i++){
         String result= members.remove(ids[i]);
        if(result.isEmpty()){
         System.out.println(result);
        }
      }
  }
  
  public void remove(int id){
      message.remove(id);
  }
  
  public void printConversation(){
      System.out.println("Total number of members in the conversation are "+members.size());
      String c = "";
      for(String st : members){
          c+= st+", ";
      }
      System.out.println("The names of these members are "+c);
      System.out.println("Total number of files in the conversation are "+files.size());
           
      System.out.println("The messages in the conversation are");
  }
  
  
}
