import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SpellChecker 
{ 

    //if words are incorrect return a set of suggested words
    // keep track of misspelled words 
    public TreeSet<String> spellCheck(HashSet<String> hashSet)
    {
        TreeSet<String> treeSet = new TreeSet<String>();
        Iterator<String> i = hashSet.iterator();
        Iterator<String> j = App.spellCheck.iterator();
        while (i.hasNext()) 
        {

                if (App.spellCheck.contains(i.next()) == false)
                {
                    
                }
        }
        return treeSet;
    }

    //if there are no viable suggestions then return no suggestions 
}
