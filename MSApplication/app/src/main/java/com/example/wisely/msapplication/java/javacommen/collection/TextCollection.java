package com.example.wisely.msapplication.java.javacommen.collection;

/**
 * Created by wisely on 2017/3/2.
 *
 * text - 1
 */

public class TextCollection {

/*
===================java 集合=======================
===================================================
collection
       |List
	     |ArrayList
		 |LinkedList
		 |Vector
	   |Set
	    |HashSet
		|TreeSet
                | LinkedHashSet
--------------------------------------------------
===================================================================
collection
       |List:元素是有序的，元素可以重复。因为该集合体系有索引
	    |ArrayList  ：底层使用的数据结构是数组结构.特点：查询速度快。增加删除有点慢，1.2出现的
		               元素越多表现越明显。线程不同步
                       可变长度数组：
					   默认长度是10的空列表。如果超了，就会延长50%
		|LinkedList :底层使用的数据结构是链表结构.查询非常慢。但是增加和删除非常快

		|Vector   ：底层使用的数据结构是：数组数据结构。 1.0版 比ArrayList早  是多线程同步的 .基本被ArrayList替代了
		              可变长度数组：
					   默认长度是10的空列表。如果超了，就会延长100%
	   |Set : 元素师无序(存入和取出的顺序不一定一致)的，元素不可以重复
                    set与list的区别在于，set是在hashMap的基础上实现的。
                hashset是不能储存有相同的值，因为它是拿hashmap的key值当做储存值，如果插入相同的值，后来的值会覆盖掉已有的值
	           set集合的功能(方法)和collection一样的
	     |HashSet :底层数据结构式哈希表 ,线程时非同步的
		            如何保证元素唯一性？
					通过元素的两个方法，一个是hashCode（）和  equals（）来完成
					如果元素的hashCode值相同，才会判断equals是否为true
					如果，元素的hashCode值不同，不会调用equals
		 |TreeSet: 可以对Set集合中的元素进行排序.底层数据结构式二叉树。
		           保证元素唯一性的依据是：
				       compareTo方法return 0；

					它的 增加，删除，查找 都是基于上述compareTo方法

					TreeSet排序第一种方式：让元素自身具备比较性。
					元素需要实现comparable接口覆盖compareTo方法；
                    这种方式也成为元素的自然顺序，也是默认顺序

					TreeSet的第二种排序方式：
					当元素自身不具备比较性时，或者具备的比较性不是所需要的。
					这时，需要让集合自身具备比较性.

					在集合初始化时，就有了比较方式
					实现comparator 接口，复写 compare方法
===================================================================
以上具体内容在下面有详细介绍：
===================================================================
集合的出现
    ：面向对象语言对事物的体现以对象形式，所以，为了方便对
	多个对象的操作，就对对象进行存储。集合就是存储对象最常用
	的一种方式。

	数组和集合类容器有何不同？
	数组虽然也可以存储对象，但长度是固定的；集合长度
	是可以改变的。数组中可以存储基本数据类型，集合只能存储对象


	集合特点：
	  集合只用于存储对象，集合长度是可变的。集合可以存储不同类型的对象

	 为何会出现这么多容器？
	 每一种容器对数据的存储方式都有不同。
	 这个存储方式称之为：数据结构

	 迭代器：
	 其实就是集合的取出元素的方法。
	 ===================================================
	 取出方式定义在了集合内部，这样取出方式就可以直接访问集合内部元素

	 取出方式就被定义成了内部类。

	 而每一个容器的数据结构不同，
	 所以取出的动作细节也不一样。但是都有共性内容

	 判断和取出。那么可以将写共性抽取。

	 这些内部类都符合一个规则，这个规则就是iterator

	 如何获取集合的取出对象呢》
	 通过一个对外提供的方法。
	 iterator
-------------------------------------------

		ArrayList a2 = new ArrayList();

		//添加：
		a2.add("01");
		a2.add("02");
		a2.add("0c");
		a2.add("0d");


		Iterator it = a2.iterator();
		while (it.hasNext())
		{
			sop(it.next());
		}

		for (Iterator i = a2.iterator();i.hasNext() ; )
		{
			sop(i.next());
		}
===================================================
共性方法：
   以ArrayList为例子：
//创建一个集合容器
		ArrayList al = new ArrayList();

		//添加：
		al.add("01");
		al.add("02");
		al.add("03");
		al.add("04");

		sop("原集合："+al);  //[01,02,03,04]
		//删除
		al.remove("01");

		sop("删除01后："+al); [02,03,04]

		//查
		sop("集合是否包含 02:"+al.contains("02"));//true

        //al 是否为空
		sop("al是否为空:"+al.isEmpty());//false

        //al的长度
		sop("al的长度"+al.size());//3


        //清空
		al.clear();
		sop("al清空后"+al);//[]



----------//取交集：
		//创建一个集合容器
		ArrayList al = new ArrayList();

		//添加：
		al.add("01");
		al.add("02");
		al.add("03");
		al.add("04");


		ArrayList a2 = new ArrayList();

		//添加：
		a2.add("01");
		a2.add("02");
		a2.add("0c");
		a2.add("0d");

		//取交集
		al.retainAll(a2);
		sop("al："+al);//[01,02]
		sop("a2："+a2);//[01,02,0c,0d]


		//removeAll();
		al.removeAll(a2);//[01,02]
===================================================
List:
    特有的方法，凡是可以操作角标的方法都是该体系特有的方法
	增：
	    add(index,element);
		addAll(index,Collection);

	删：
	    remove(index);
	改：
	   set(index,element);
	查：
	    get(index);
		subList(from,to);
		ListIterator();
===================================================
list例子演示：
ArrayList a2 = new ArrayList();

		//老方法添加：
		a2.add("01");
		a2.add("02");
		a2.add("03");

        sop(a2);
		//特有方法：
		//指定位置添加
		a2.add(1,"1号指定位置添加");
		sop(a2);//[01,"1号指定位置添加",02,03]

		//删除
		//删除指定位置元素
		a2.remove(2);
		sop(a2);//[01,"1号指定位置添加",03]

		//修改：
		a2.set(2,"2号位修改");
		sop(a2);//[01,"1号指定位置添加","2号位修改"]

		//查
		//通过角标获取元素
		sop(a2.get(1));//"1号指定位置添加"

		//获取所有元素
		for(int x=0;x<a2.size();x++)
		{
			sop("a2["+x+"]:"+a2.get(x));
		}

		//通过迭代器的
		for (Iterator it = a2.iterator();it.hasNext(); )
		{
			sop(it.next());
		}

		//通过indexOf获取对象位置
		sop(a2.indexOf("2号位修改"));//2


        //获取1-3位上的子对象
		List sub = a2.subList(1,3);
		sop("sub:"+sub);//["1号指定位置添加","2号位修改"]
===================================================
list的Iterator:有局限性：remove()  hasNext() next()
注意：
//演示列表迭代器
        ArrayList a2 = new ArrayList();

		//老方法添加：
		a2.add("01");
		a2.add("02");
		a2.add("03");

        //在迭代器中，准备添加或者删除元素
		for (Iterator it = a2.iterator();it.hasNext() ; )
		{
			//sop(it.next());
			Object o = it.next();
			if (("02").equals(o))
			{
				it.remove();
			}
			sop(o);
		}


		 for (Iterator it = a2.iterator();it.hasNext() ; )
		{
			sop(it.next());
		}

===================================================
新功能：ListIterator
List集合特有的迭代器，是Iterator的子接口
在迭代时，不可以通过集合对象的方法操作集合中的元素，因为会放生
集合异常，
所以在迭代时，只能用迭代器的方法来操作元素
但是 Iterator的方法有局限性只有三个，如果想要其他操作
如：添加，修改等，就需要使用List特有的迭代器：ListIterator

该接口只能通过List集合的listIterator方法获取
===================================================
例子：新功能：
//演示列表迭代器
        ArrayList a2 = new ArrayList();

		//老方法添加：
		a2.add("01");
		a2.add("02");
		a2.add("03");

        //在迭代器中，准备添加或者删除元素
		for (ListIterator it = a2.listIterator();it.hasNext() ; )
		{
			//sop(it.next());
			Object o = it.next();
			if (("02").equals(o))
			{
				//增加
				//it.add("ootianjia");

				 //shan
                 //it.remove();

				 //改
				// it.set("xiugai");

			}
			sop(o);//打印的是原集合
		}


		 for (Iterator it = a2.iterator();it.hasNext() ; )
		{
			sop(it.next());
		}
         sop("");

正向遍历和逆向遍历：
		//演示列表迭代器
        ArrayList a2 = new ArrayList();

		//老方法添加：
		a2.add("01");
		a2.add("02");
		a2.add("03");


         //前置元素
		 sop("正向遍历：=========================");
	     ListIterator i = a2.listIterator();

		   while (i.hasNext())
		   {
				sop(i.next());
		   }
            sop("逆向遍历：=========================");
		   while (i.hasPrevious())
		   {
			   sop("previous:"+i.previous());
		   }

===================================================
vector：
单独解析：枚举
Vector v = new Vector();

		v.add("01");
		v.add("02");
		v.add("03");
		v.add("04");

		//特有的东西：elements()
		//枚举：是vector的特有取出方式
		//枚举和迭代器很像
		//其实枚举和迭代式一样的，因为枚举的名称以及方法的名称都过长。
		//所以被迭代器取代了。枚举就郁郁而终了
		Enumeration en = v.elements();

		while (en.hasMoreElements())
		{
			sop(en.nextElement());
		}

===================================================
LinkedList:
链表结构的特有方法
addFirst();
addLast();
getFirst();
getLast();
removeFirst();
removeLast();


        jdk1.5以后新特性：

		//offerFirst();
		//offerLast();
		//添加元素



		//peekFirst();
		//peekLast();
		//获取元素，但不删除，如果集合中没有元素，返回null



		//pollFirst();
		//pollLast();
		//获取元素，但是元素被删除，如果集合中没有元素，会返回null

===================================================
        //LinkedList 练习：
		//模拟一个堆栈或者队列数据结构
		//堆栈数据结构：先进后出  如同一个杯子
		//队列数据结构：先进先出  如同一个水管
LinkedList:例子
LinkedList lk = new LinkedList();

		//addFirst的添加
		lk.addFirst("01");
		lk.addFirst("02");
		lk.addFirst("03");
		lk.addFirst("04");

		sop("用addFirst添加后中的内容："+lk);

		sop("用getFirst头："+lk.getFirst());
		sop("用getFirst头："+lk.getFirst());

		sop("用getLast尾："+lk.getLast());


        sop("长度：："+lk.size());


		//获取但不移除：
		//offerFirst();
		//offerLast();
		//添加元素



		//peekFirst();
		//peekLast();
		//获取元素，但不删除，如果集合中没有元素，返回null



		//pollFirst();
		//pollLast();
		//获取元素，但是元素被删除，如果集合中没有元素，会返回null
		sop("获取不移除方法："+lk.peekFirst());

		sop("removeFirst:"+lk.removeFirst());
		sop("长度：："+lk.size());


		sop("removeLast:"+lk.removeLast());
		sop("removeLast:"+lk.removeLast());
		sop("长度：："+lk.size());
        sop("此时里面内容："+lk);


        //删除方式的额遍历：
		while (!lk.isEmpty())
		{
			sop(lk.removeFirst());
		}

		sop("遍历完毕后里面内容"+lk);
        //链接列表，成为链表


===================================================
ArrayList:练习：
去除重复元素:
public static ArrayList singleEmement(ArrayList al)
	{
		ArrayList a = new ArrayList();

		ArrayList a2 = new ArrayList();

		for (Iterator it = al.iterator();it.hasNext() ; )
		{
			Object o = it.next();

			if(!(a2.contains(o)))
			{
				a2.add(o);
			}

		}
        //Iterator i = al.iterator();
		//while (i.hasNext())
		//{
			//Object o = i.next();
			//if(!(a2.contains(o)))
			//{
				//a2.add(o);
			//}

		//}
		return a2;


	}
	public static void main(String[] args)
	{
		//System.out.println("Hello World!");
		//注意：next调用一次 hasNext就要判断一次
        ArrayList t = new ArrayList();
		t.add("01");
		t.add("02");
		t.add("03");
		t.add("01");
		t.add("04");
		t.add("01");
		sop(t);
		sop("==============================");

		t = singleEmement(t);
		sop(t);



	}
}
//注意：next调用一次 hasNext就要判断一次
===================================================
ArrayList例子：判断对象是否是相同
去除重复对象
//将自定义对象存储到ArrayList里面，并去除重复元素
//List集合判断元素是否相同，依据的是元素的equals方法。
//其他的集合和List不一样
//注意：contains() remove()方法底层也是调用的equals方法 list
class Person
	{
		private String name;
		private int age;
        Person(String name,int age)
		{
			this.name = name;
			this.age = age;
		}
		public boolean equals(Object obj)
		{
			if(!(obj instanceof Person))
				return false;
		    Person p = (Person)obj;
			//System.out.println("===============");
			//System.out.println(p.name+":"+p.age);
			return this.name.equals(p.name)&& this.age == p.age;
		}

		public String getName()
		{
			return this.name;
		}

		public int getAge()
		{
			return this.age;
		}
	}

import java.util.*;
class Day14a
{
	public static void sop(Object o)
	{
		System.out.println(o);
	}


	public static ArrayList singleEmement(ArrayList al)
	{
		ArrayList a = new ArrayList();

		ArrayList a2 = new ArrayList();

		for (Iterator it = al.iterator();it.hasNext() ; )
		{
			Object o = it.next();

			if(!(a2.contains(o)))
			{
				a2.add(o);
			}

		}
        //Iterator i = al.iterator();
		//while (i.hasNext())
		//{
			//Object o = i.next();
			//if(!(a2.contains(o)))
			//{
				//a2.add(o);
			//}

		//}
		return a2;
	}

	public static void main(String[] args)
	{
		//System.out.println("Hello World!");
	    //将自定义对象存储到ArrayList里面，并去除重复元素
		//List集合判断元素是否相同，依据的是元素的equals方法。
		//其他的集合和List不一样
		ArrayList at = new ArrayList();
		at.add(new Person("lili",12));
		at.add(new Person("lisi",12));
		at.add(new Person("liwu",14));
		at.add(new Person("lili",12));

       at =  singleEmement(at);

	    for (Iterator it = at.iterator();it.hasNext() ; )
	    {
			Object obj = it.next();
			Person p = (Person)obj;
			sop(p.getName()+":"+p.getAge());
	    }
	}
}

===================================================
补充：
    元素很多，涉及到增删操作比较频繁用：LinkedList
	涉及到增删，涉及查询多 用  ArrayList

	没有选择，用ArrayList
===================================================
哈希：
练习：重写hashCode的值来减少对象在存储过程中的比较次数
class Person
	{
		private String name;
		private int age;
        Person(String name,int age)
		{
			this.name = name;
			this.age = age;
		}
		public int hashCode()
		{
			return name.hashCode+age*27;
		}

		public boolean equals(Object obj)
		{
			if(!(obj instanceof Person))
				return false;
		    Person p = (Person)obj;
			//System.out.println("===============");
			//System.out.println(p.name+":"+p.age);
			return this.name.equals(p.name)&& this.age == p.age;
		}

		public String getName()
		{
			return this.name;
		}

		public int getAge()
		{
			return this.age;
		}
	}

===================================================
HashSet：删除和判断的依据
    对于添加 删除  判断元素是否存在，等操作，依赖的是
	元素的hashCode和equals 方法。 先判断hashCode然后才判断equals

	ArrayList只依赖equals
===================================================
TreeSet:
特点：可以对set中的元素进行排序
排序时，如果主要条件相同一定要看一下次要条件
===================================================
TreeSet例子：
import java.util.*;
class Day14a
{
	public static void sop(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args)
	{
		//System.out.println("Hello World!");
		TreeSet ts = new TreeSet();
		ts.add(new Person("lili",12));
		ts.add(new Person("lisi",12));
		ts.add(new Person("liwu",13));
		ts.add(new Person("lili",12));

		for(Iterator it = ts.iterator();it.hasNext();)
		{
			Object o = it.next();
			Person p = (Person)o;
			sop(p.getName()+"::"+p.getAge());
		}
	}

}
class Person implements Comparable  //强制让该接口具有比较性
{
	private String name;
	private int age;

    Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return age;
	}

	public int compareTo(Object obj)
	{
		if (!(obj instanceof Person))
		{
			throw new RuntimeException("不是学生类");
		}

		Person p  = (Person)obj;
		if (this.age>p.age)
		      return 1;
		if (this.age==p.age)
		{
			return this.name.compareTo(p.name);
		}

		return -1;

	}
}

===================================================
TreeSet例子：
package com.itheima;
import java.util.*;
class Student implements Comparable
{
	 private  String name;
	 private  int age;
	 private  int score;

	 public Student(String argname,int argage, int argscore)
	 {
		 this.name = argname;
		 this.age = argage;
		 this.score = argscore;
	 }
	 public String getname()
	{
		 return this.name;
	 }

	  public int getage()
	{
		 return this.age;
	 }

	  public int getscore()
	{
		 return this.score;
	 }


	 public int compareTo(Object obj)
	 {
		 if(!(obj instanceof Student))
			 throw new RuntimeException ("不是学生对象");
		 Student s = (Student)obj;
		 if(this.score>s.score)
		 {
			 return 1;
		 }
		 if(this.score==s.score)
		 {

			 if(this.age > s.age)
			 {
				 return 1;
			 }
			 if(this.age==s.age)
			 {
				 return this.name.compareTo(s.name);
			 }
			 return -1;
		 }
		 return -1;
	 }

}

public class Test10
{
	 public static void sop(Object obj)
	 {
		 System.out.println(obj);
	 }
	public static void main(String args[])
	{
		Student st1 = new Student("lili",12,90);
		Student st2 = new Student("lucy",13,90);
		Student st3 = new Student("lisan",14,92);
		Student st4 = new Student("juck",12,95);
		Student st5 = new Student("lisi",12,90);

		TreeSet ts = new TreeSet();
		ts.add(st1);
		ts.add(st2);
		ts.add(st3);
		ts.add(st4);
		ts.add(st5);

        Iterator it = ts.iterator();
        while(it.hasNext())
		{
			Student s = (Student)it.next();
			sop(s.getscore());
			sop(s.getage());
			sop(s.getname());
		}
	}
}

===================================================
二叉树：
TreeSet的底层机构：
1代表所放的值放左侧，-1放右侧。0代表两个数相同
===================================================
TreeSet中特殊情况：比较器
第二种排序方式：实现comparator 接口，复写 compare方法
import java.util.*;
class Day14a
{
	public static void sop(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args)
	{
		//元素不具有比较性，或者具备的比较性不是需要的
		//这时需要让容器自身具有比较性
		//
	    TreeSet ts = new TreeSet(new MyCompare());
		ts.add(new Person("lili3",12));
		ts.add(new Person("lili2",12));
		ts.add(new Person("lili1",13));
		ts.add(new Person("lili1",12));

		for(Iterator it = ts.iterator();it.hasNext();)
		{
			Object o = it.next();
			Person p = (Person)o;
			sop(p.getName()+"::"+p.getAge());
		}
	}

}
class Person implements Comparable  //强制让该接口具有比较性
{
	private String name;
	private int age;

    Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return age;
	}

	public int compareTo(Object obj)
	{
		if (!(obj instanceof Person))
		{
			throw new RuntimeException("不是学生类");
		}

		Person p  = (Person)obj;
		if (this.age>p.age)
		      return 1;
		if (this.age==p.age)
		{
			return this.name.compareTo(p.name);
		}

		return -1;
	}
}

class MyCompare implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		Person p1 = (Person)o1;
		Person p2 = (Person)o2;

		int num = p1.getName().compareTo(p2.getName());

		if(num==0)
		{
			//num = p1.getAge() - p2.getAge();
		   return	new Integer(p1.getAge()).compareTo(p2.getAge());
		}

		return num;
	}
}
===================================================
TreeSet练习：
//根据长度来排序，注意长度相同但是字符串不同的情况
import java.util.*;
class Day14a
{
	public static void sop(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args)
	{
		//元素不具有比较性，或者具备的比较性不是需要的
		//这时需要让容器自身具有比较性
		//
	    TreeSet ts = new TreeSet(new MyCompare());
		ts.add("ab");
		ts.add("abc");
		ts.add("wwab");
		ts.add("ab");
		ts.add("eeeab");
		ts.add("aab");
		ts.add("cccccccccab");


		for(Iterator it = ts.iterator();it.hasNext();)
		{
			Object o = it.next();
			sop(o);
		}
	}

}


class MyCompare implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1  =  (String)o1;
        String s2  =  (String)o2;

		int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));
		if (num==0)
		{
			return s1.compareTo(s2);
		}
		return num;
	}
}
===================================================
===================================================
===================================================

*/
//    import java.util.*;
//    class Day14a
//    {
//        public static void sop(Object o)
//        {
//            System.out.println(o);
//        }
//        public static void main(String[] args)
//        {
//            //元素不具有比较性，或者具备的比较性不是需要的
//            //这时需要让容器自身具有比较性
//            //
//            TreeSet ts = new TreeSet(new MyCompare());//
//            ts.add("ab");
//            ts.add("abc");
//            ts.add("wwab");
//            ts.add("ab");
//            ts.add("eeeab");
//            ts.add("aab");
//            ts.add("cccccccccab");
//
//
//            for(Iterator it = ts.iterator(); it.hasNext();)
//            {
//                Object o = it.next();
//                sop(o);
//            }
//        }
//
//    }
//
//
//    class MyCompare implements Comparator
//    {
//        public int compare(Object o1,Object o2)
//        {
//            String s1  =  (String)o1;
//            String s2  =  (String)o2;
//
//            int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));
//            if (num==0)
//            {
//                return s1.compareTo(s2);
//            }
//            return num;
//        }
//    }
}
