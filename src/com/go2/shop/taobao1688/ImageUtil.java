package com.go2.shop.taobao1688;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ImageUtil {

	public static byte[] toByte(String file) throws IOException {
		FileInputStream in = new FileInputStream(new File(file));
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] b = new byte[1024];
		int len = 0;
		while ((len = in.read(b)) != -1) {
			out.write(b, 0, len);
		}
		out.close();
		in.close();
		return out.toByteArray();
	}
}
