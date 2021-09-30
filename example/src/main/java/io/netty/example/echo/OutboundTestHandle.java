package io.netty.example.echo;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

import java.net.SocketAddress;

/**
 *
 * @program: netty
 * @author: daniel
 * @create: 2021-09-25 17:15
 **/
public class OutboundTestHandle extends ChannelOutboundHandlerAdapter {
	@Override
	public void bind(ChannelHandlerContext ctx, SocketAddress localAddress, ChannelPromise promise) throws Exception {
		super.bind(ctx, localAddress, promise);
		System.out.println("bind...");
	}

	@Override
	public void connect(ChannelHandlerContext ctx, SocketAddress remoteAddress, SocketAddress localAddress,
			ChannelPromise promise) throws Exception {
		super.connect(ctx, remoteAddress, localAddress, promise);
		System.out.println("connect...");
	}

	@Override
	public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		super.disconnect(ctx, promise);
		System.out.println("disconnect...");
	}

	@Override
	public void close(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		super.close(ctx, promise);
		System.out.println("close...");
	}

	@Override
	public void deregister(ChannelHandlerContext ctx, ChannelPromise promise) throws Exception {
		super.deregister(ctx, promise);
		System.out.println("deregister...");
	}

	@Override
	public void read(ChannelHandlerContext ctx) throws Exception {
		super.read(ctx);
		System.out.println("read...");

	}

	@Override
	public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
		super.write(ctx, msg, promise);
		System.out.println("write..");
	}

	@Override
	public void flush(ChannelHandlerContext ctx) throws Exception {
		super.flush(ctx);
		System.out.println("flush..");
	}

//	@Override
//	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
//		cause.printStackTrace();
//	}
}
