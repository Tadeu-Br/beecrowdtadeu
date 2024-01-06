import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 1259 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> l = new ArrayList<>();
		List<Integer> p 	= new ArrayList<>();
		List<Integer> i = new ArrayList<>();
		
		int n = sc.nextInt();
		for (int i=0 ; i<n ; i++)
			l.add(sc.nextInt());
				
		for (Integer x: l){
			if (x%2==0)
				p.add(x);
			else
				i.add(x);
		}
		
		Collections.sort(p);
		Collections.sort(i);
		Collections.reverse(i);
		
		for (Integer y: p)
			System.out.println(y);
		for (Integer z: i)
			System.out.println(z);
		
		sc.close();
	}
}