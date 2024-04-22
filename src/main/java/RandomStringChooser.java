import java.util.*;
public class RandomStringChooser
{
  public void RandomStringChooser( String [] chosenArray){
    private ArrayList <String> stringList = new Arraylist <String>();
    for(int i = 0, i < chosenArray.length(); i++)
      stringList.add(chosenArray[i]);
  }
  public String [] getNext(){
    String temp = "NONE";
    if(stringList.Size()>0){
    int choice = (int) (Math.random*stringList.Size());
    temp = stringList.get(choice);
    stringList.remove(choice);
    }
    return temp;
  }
}
