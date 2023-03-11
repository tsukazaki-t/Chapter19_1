package practice;

//バイト配列に対して1バイトずつ読み書きを行う
//ByteArrayOutputStream、ByteArrayInputStreamクラスがあります。

import java.io.ByteArrayOutputStream;

public class Chapter19_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//こちらはメモリに対してバイナリデータを少しずつ読み書きを行えます。
		//画像ファイルをメモリ上に読み込み、
		//その内容を別のストリームへ書き込むといった用途で使います。
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		bos.write(0x41); // A
		bos.write(0x42); // B
		bos.write(0x43); // C
		
		//toByteArrayメソッドでByteArrayOutputStreamをバイト配列に変換
		byte[] data = bos.toByteArray();
		// dataは「0x41,0x42,0x43」が入った要素数3のbyte型配列
		for (byte b : data) {
			//Javaで10進数から16進数に変換するtoHexStringメソッド★
			System.out.print(Integer.toHexString(b) + " ");
		}

	}

}
