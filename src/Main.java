import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.LinkedTransferQueue;

import javax.sound.sampled.LineListener;

public class Main extends Object {
	public static void main(String [] args) {
		Generics<Integer> iobj = new Generics<Integer>();
		System.out.println("Object is of Type " + iobj.getObject());
		
		Generics<String> sobj = new Generics<String>();
		System.out.println("Object is of Type " + sobj.getObject());
	
		
		List l1 = new ArrayList();		
		
		
	}
}


class Generics<T> {
	T object;

	public Object getObject() {
		return this.getClass();
		
	}	
}
