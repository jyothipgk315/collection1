package setTreeSet;

import java.util.*;

public class Symbol implements Comparator< NewCard> 
{
	public int compare(NewCard c1,NewCard c2)
	{
		return c1.getSymbol().compareTo(c2.getSymbol());
	}

}
