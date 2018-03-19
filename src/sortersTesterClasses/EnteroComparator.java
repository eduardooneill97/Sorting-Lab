package sortersTesterClasses;

import java.util.Comparator;

public class EnteroComparator implements Comparator<Entero>{

	@Override
	public int compare(Entero o1, Entero o2) {
		if(o1.getValue() == o2.getValue())
			return 1;
		return -1;
	}

	

}
