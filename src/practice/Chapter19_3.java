package practice;

//バイナリファイルの書き込みには、FileOutputStreamクラスを使います。
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chapter19_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//writeメソッドは引数がint型とbyte[]型のものがあります。
		//前者は1バイトを書き込み、後者は複数バイトを書き込みます。
		//画像データなどを書き込みたい場合はbyte[]型にしてからデータを書き込みます。
		
		// try-with-resourcesを使用
				try (FileOutputStream fos = new FileOutputStream("C:\\eclipse\\pleiades\\workspace\\test.txt")) {
					fos.write(0x41); // 16進で41はAを表す
				} catch (FileNotFoundException e) {
					System.out.println("ファイルがありませんでした");
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("エラーです");
					e.printStackTrace();
				}

	}

}
