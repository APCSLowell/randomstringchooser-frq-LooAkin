import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> stringList;
  public RandomStringChooser( String [] chosenArray){
    stringList = new ArrayLsit <String> ();
    for(int i = 0; i < chosenArray.length; i++)
      stringList.add(chosenArray[i]);
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
