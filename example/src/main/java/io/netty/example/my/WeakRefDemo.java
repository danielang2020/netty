package io.netty.example.my;

import java.lang.ref.WeakReference;

/**
 *
 * @program: netty
 * @author: daniel
 * @create: 2021-09-12 08:41
 **/
public class WeakRefDemo {
	public static void main(String[] args) {
		WeakRefDemo weakRefDemo = new WeakRefDemo();
		weakRefDemo.weakRefNotRemoved();
		System.out.println("-------------");
		weakRefDemo.weakRefRemoved();
	}

	public void weakRefRemoved() {
		WeakReference<Apple> weakReference = new WeakReference<>(new Apple("green-apple"));

		System.gc();

		if (weakReference.get() == null) {
			System.out.println("GC remove weakReference!");
		} else {
			System.out.println("weakReference still alive");
		}
	}

	public void weakRefNotRemoved() {
		Apple apple = new Apple("green-apple");
		WeakReference<Apple> weakReference = new WeakReference<>(apple);

		System.gc();

		if (weakReference.get() == null) {
			System.out.println("GC remove weakReference!");
		} else {
			System.out.println("weakReference still alive");
		}
	}

	public static class Apple {

		private String name;

		public Apple(String name) {
			this.name = name;
		}

		@Override
		protected void finalize() throws Throwable {
			super.finalize();
			System.out.println("Apple： " + name + " finalized。");
		}

		@Override
		public String toString() {
			return "Apple{" + "name='" + name + '\'' + '}' + ", hashCode:" + this.hashCode();
		}
	}
}
