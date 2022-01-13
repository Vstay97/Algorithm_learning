package collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Author: Vstay
 * @Date: 2022/1/13 22:50
 */
public class CollectionMethod {
	/**
	 * Collection接口常用方法, 以实现子类ArrayList来演示
	 * @add: 添加单个元素
	 * @remove: 删除指定元素
	 * @contains: 查找元素是否存在
	 * @size: 获取元素个数
	 * @isEmpty: 判断是否为空
	 * @clear: 清空
	 * @addAll: 添加多个元素
	 * @containAll: 查找多个元素是否都存在
	 * @removeAll: 删除多个元素
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		// add: 添加单个元素
		list.add("jack");
			// 本质是: list.add(new Integer(10));
		list.add(10);
		list.add(true);
		System.out.println("list"+ list);
		// remove: 删除指定元素
			// 删除第一个元素
//		list.remove(0);
			// 指定删除某个元素
//		list.remove("jack");
		// contains: 查找元素是否存在
			// False
		System.out.println(list.contains("jack~"));
		// size: 获取元素个数
		System.out.println(list.size());
		// isEmpty: 判断是否为空
		System.out.println(list.isEmpty());
		// clear: 清空
		list.clear();
		System.out.println("list="+list);
		// addALL: 添加多个元素
			// 只要是实现了Collection接口的对象,都可以作为一个集合传进去
		ArrayList list2 = new ArrayList();
		list2.add("红楼梦");
		list2.add("三国演义");
		list.addAll(list2);
		System.out.println(list);
		// containsAll: 查找多个元素是否都存在
		System.out.println(list.containsAll(list2));
		// removeAll: 删除多个元素
		list.add("聊斋");
		list.removeAll(list2);
	}
}
