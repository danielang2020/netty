package io.netty.example.my;

/**
 *
 * @program: netty
 * @author: daniel
 * @create: 2021-09-09 22:38
 **/
public class ThreadLocalDemo {
	static ThreadLocal<String> stringThreadLocal = new ThreadLocal<String>();
	static ThreadLocal<String> stringThreadLocal_duplicate = new ThreadLocal<String>();
	public static void main(String[] args) {

		new Thread(()->{

			stringThreadLocal.set("a_1");
			stringThreadLocal.set("a_1_1");
			System.gc();
			try {
				//休眠一下，在运行的时候加上虚拟机参数-XX:+PrintGCDetails，输出gc信息，确定gc发生了。
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(stringThreadLocal.get());
			stringThreadLocal.set("a_1_1_1");
			System.out.println(stringThreadLocal.get());
//			stringThreadLocal_duplicate.set("a_d_1");
//			stringThreadLocal_duplicate.set("a_d_1_1");
//			stringThreadLocal_duplicate.set("a_d_1_1");
//			System.out.println(stringThreadLocal_duplicate.get());
		},"t1").start();

//		new Thread(()->{
//			stringThreadLocal.set("b_2");
//			stringThreadLocal.set("b_2_2");
//			stringThreadLocal.set("b_2_2_2");
//			System.out.println(stringThreadLocal.get());
//		},"t2").start();


//		ThreadLocalDemo obj = new ThreadLocalDemo();
//		WeakReference sf = new WeakReference(obj);
//		obj = null;
//		System.out.println("Is Collected: "+sf.get());
//		System.gc();
//		System.out.println("Is Collected: "+sf.get());
	}
}
