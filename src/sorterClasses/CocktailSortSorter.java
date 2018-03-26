package sorterClasses;

public class CocktailSortSorter<E> extends AbstractSorter<E>{

	//Worst case: O(n*n)
	
	public CocktailSortSorter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected void relocateMaxValueToLastPositionBetween(int i, int j) {
		while(i<j) {
			if (cmp.compare(arr[i], arr[i+1]) > 0)
				super.swapArrayElements(i, i+1);
			i++;
		}
	}
	
	protected void relocateMinValueToFirstPositionBetween(int i, int j) {
		while(j>i) {
			if (cmp.compare(arr[j], arr[j-1]) < 0)
				super.swapArrayElements(j, j-1);
			j--;
		}
	}

	@Override
	protected void auxSort() {
		int top = arr.length-1;
		int bottom = 0;
		while (!(top == bottom + 1)) {
			relocateMaxValueToLastPositionBetween(bottom, top);
			top--;
			relocateMinValueToFirstPositionBetween(bottom, top);
			bottom++;
		}
	}
}
