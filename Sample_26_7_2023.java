package com.gqt.advance.java;

/*
 * there are two interface comparable and comparator
 * comparable privileged to use target class-- compareTo()
 * comparator does not have privileged to use the target class  compare()
 * -1 then we have to swap  +1 don't swap 0 don't swap
 *  this next or existing object 
 *  
 *  complex object is an object which contains more than two parameters
 *  here cricket is an complex object
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Cricket implements Comparable<Cricket>{
	String name;
	int id;
	int runs;
	int catches;
	int wickets;
	
	Cricket(String cName,int cId,int cRuns,int cCatches,int cWickets)
	{
		this.name=cName;
		this.id=cId;
		this.runs=cRuns;
		this.catches=cCatches;
		this.wickets=cWickets;
	}

	@Override
	public String toString() {
		return "Cricket [name= " + name + ", id= " + id +"   catches=" + catches +"]";
	}
	
	public int compareTo(Cricket c)
	{
//		return this.runs-c.runs;
		if(this.catches>c.catches)
		{
			return -1;// descending order
			// return 1;  --ascending order
		}
		else
		{
			return 1;
		}	
	}	
}

class OrderById implements Comparator<Cricket>
{
	@Override
	public int compare(Cricket c1,Cricket c2)
	{
		return c1.id-c2.id;
	}
}

public class Sample_26_7_2023
{
	public static void main(String...args)
	{
		Cricket c1=new Cricket("Dhoni",1,2000,50,10);
    	Cricket c2=new Cricket("Yuvaraj",3,8000,100,5);
		Cricket c3=new Cricket("Dhoni",5,9000,130,20);
		Cricket c4=new Cricket("virat",2,3000,120,10);
		
		ArrayList<Cricket> array=new ArrayList<>();
		array.add(c1);array.add(c2);array.add(c3);array.add(c4);
		
		
		Collections.sort(array,new OrderById());
		for(Cricket c:array)
		{
			System.out.println(c);
		}
		System.out.println("----------------------");
		
		Collections.sort(array);
		for(Cricket t:array)
		{
			System.out.println(t);
		}
	}

}
