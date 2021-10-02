import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class testing3 {

  
class Chat{
    
  public List<String> members;
  public List<Integer> files;
  public HashMap<Integer,String> message;
  
  public Chat(){}
  
  public Chat(List members, List files, HashMap message){
      this.members=members;
      this.files=files;
      this.message=message;        
  }
  
  public void add(String[] names){
      for(String s : names){
          members.add(s);
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
  }
  
  
}


  public static void main(String[] args) {

    String[] s = { "apple", "banana", "carrot", "donkey" };
    String b = "basdhtdfhnana";
    String c = "";
    List<String> ss = new ArrayList<>();

    for (String s1 : s) {
      ss.add(s1);
    }
    System.out.println(ss);
    for (String st : ss) {
      c += st + ", ";
    }

    System.out.println(c);
    boolean a = ss.remove(b);
    System.out.println(a);

    

    // List<Integer> numbers = new ArrayList<Integer>();
    // numbers.add(12);
    // numbers.add(8);
    // numbers.add(2);
    // numbers.add(23);

    // Iterator<Integer> i = numbers.iterator();
    // while (i.hasNext()) {
    //   System.out.println(i.next());
    // }
  }
}
//
//
//
//
