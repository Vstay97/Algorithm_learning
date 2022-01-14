package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: Vstay
 * @Date: 2022/1/14 13:32
 */
public class Iterator_ {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
		coll.add(new Book("红楼梦","曹雪芹",2.34));
		coll.add(new Book("三国演义","罗贯中",5.45));
		coll.add(new Book("三体","刘慈欣",8.23));
		// 需要遍历coll集合
		// 1.先得到迭代器
		Iterator iterator = coll.iterator();
		// 使用while遍历
			// 快捷键 itit , 显示所有快捷键: ctrl+j
			// 判断是否还有数据
		while (iterator.hasNext()) {
			// 返回下一个元素, 类型是Object
			Object obj =  iterator.next();
			System.out.println("obj:"+obj);
		}
		// 3.当while退出循环后,这是iterator对象指向最后的元素
		// iterator.next();     -->>    NoSuchElementException
		// 4.如果需要再次遍历,需要重置迭代器
		System.out.println("========== 第二次迭代============");
		iterator = coll.iterator();
		while (iterator.hasNext()) {
			Object next =  iterator.next();
			System.out.println("第二次迭代 next:"+next);
		}
	}
}
class Book {
	private String name;
	private String author;
	private double price;
	
	public Book(String name,String author,double price){
		this.name = name;
		this.author = author;
		this.price= price;
	}
	
	@Override
	public String toString() {
		return "Book{" +
				"name='" + name + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				'}';
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}