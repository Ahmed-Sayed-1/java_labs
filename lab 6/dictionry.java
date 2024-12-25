import java.util.*;
class dictionry 
{
    public static void main(String[] args) 
    {
        SortedMap<Character, SortedMap<String, String>> dic = new TreeMap<>(); 
        data D = new data();
        D.getData(dic);
        System.out.println("Dictionary contents:");
        insertDate("Gmal","ckmdnbchjcdhchdhd",dic);
        displayAll(dic);
        displaybyletter('A', dic);
    }
}