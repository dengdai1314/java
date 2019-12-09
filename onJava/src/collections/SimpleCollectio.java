package collections;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class SimpleCollectio {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>();
		for(int i=1;i<10;i++) {
			collection.add(i);
		}
		for (Integer t:collection) {
			System.out.println(t);
		}
	}
}
