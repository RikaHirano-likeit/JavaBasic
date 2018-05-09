package practice10;

public class Car {

	/* フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	int serialNo;
	String color;
	int gasoline;

	public int run() {
		this.gasoline --;
		int moveOn = new java.util.Random().nextInt(15);
		moveOn ++;

		if(gasoline <= -1) {
			return -1 ;
		}
		return moveOn;
	}
}

