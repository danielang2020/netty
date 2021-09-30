package io.netty.example.my;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 *
 * @program: netty
 * @author: daniel
 * @create: 2021-09-29 09:52
 **/
public class LeakDemo {
	public static void main(String[] args) throws Exception{
//		ResourceLeakDetector.setLevel(ResourceLeakDetector.Level.PARANOID);
//		ByteBuf byteBuf = PooledByteBufAllocator.DEFAULT.heapBuffer(100);
//		ArrayList<Object> objects = new ArrayList<>();
//		objects.add(byteBuf);
//		System.gc();
//		ByteBuf byteBuf1 = PooledByteBufAllocator.DEFAULT.heapBuffer(100);
//		System.out.println(byteBuf1.toString());

		Field f = Unsafe.class.getDeclaredField("theUnsafe");
		f.setAccessible(true);
		Unsafe unsafe = (Unsafe) f.get(null);
		int[] bytes = new int[]{10,8,1,2};
		System.out.println(unsafe.getLong(bytes,-1L));
		long aLong = unsafe.getLong(bytes, -1L);
		System.out.println(unsafe.getInt(bytes,4));
	}
}
