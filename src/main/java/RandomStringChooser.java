import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> stringList;
  public RandomStringChooser( String [] chosenArray){
    stringList = new Arraylist <String>();
    for(int i = 0, i < chosenArray.length(); i++)
      stringList.add(chosenArray[i]);
  }
  public String getNext(){
    String temp = "NONE";
    if(stringList.Size()>0){
    int choice = (int) (Math.random*stringList.Size());
    temp = stringList.get(choice);
    stringList.remove(choice);
    }
    return temp;
  }
}
