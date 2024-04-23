import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> stringList;
  public RandomStringChooser( String [] chosenArray){
    String [] stringList = new String[chosenArray.length()];
    for(int i = 0; i < chosenArray.length(); i++)
      stringList[i] = chosenArray[i];
    return stringList;
  }
  public String getNext(){
    String temp = "NONE";
    if(stringList.size()>0){
    int choice = (int) (Math.random()*stringList.size());
    temp = stringList.remove(choice);
    }
    return temp;
  }
}
