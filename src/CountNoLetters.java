import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Iterator;
public class CountNoLetters{
public static void main(String args[])
{
    HashSet hs=new HashSet();
    String str="AarruN";
    char arr[]=new char[str.length()];
    for(int i=0;i<str.length();i++)
    {
        arr[i]=str.charAt(i);
    }
    for(int j=0;j<str.length();j++)
    {
        int c=0;
        for(int k=0;k<str.length();k++)
        {
            if(arr[j]==arr[k])
            c++;
        }
        hs.add(arr[j]+"="+c+",");
    }
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
             System.out.print(it.next());
        }
  }
}
