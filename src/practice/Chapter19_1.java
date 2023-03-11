package practice;

//ファイル関係をインポート
import java.io.FileWriter;
import java.io.IOException;

public class Chapter19_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//文字ファイルを書き込むための簡易クラス
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("C:\\eclipse\\pleiades\\workspace\\test.txt", true);
			fw.write("あいうえお");
		} catch (IOException e) {
			System.out.println("エラーです");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
