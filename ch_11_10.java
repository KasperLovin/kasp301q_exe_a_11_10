import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ch_11_10
{
    /*Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
    odd length from the set.*/

    public static void main(String[] args)
    {
        Set<String> length = new HashSet<>();
        length.add("a");
        length.add("ab");
        length.add("abc");
        length.add("abcd");

        System.out.println(removeOddLength(length));
    }

    public static Set<String> removeOddLength(Set<String>newLength)
    {
        Iterator<String> iterator = newLength.iterator();
        for (int i = 0; i < newLength.size() ; i++)
            {
                if (iterator.next().length() % 2 != 0)
                {
                    iterator.remove();
                }
            }
            return newLength;
    }
}
