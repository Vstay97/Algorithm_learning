package hello.oop.demo12.interface_;

/**
 * @Author: Vstay
 * @Date: 2022/1/12 16:43
 */
public interface UserService {
	/**
	 * interface 定义的关键字, 接口都需要有实现类
	 */
	/**
	 * 接口中的变量: 等于 public static final, 常量
	 * 接口中的方法: 等于 public abstract
	 */
	int AGE = 99;
	
	void add(String name);
	void delete(String name);
	void update(String name);
	void query(String name);
	
}
