# Java  Face Authentication(JFA)

## 環境構築
まずAnaconda入れてください。でないと出直してください。
ちなみにAnacondaのインストールは[ここ](https://www.anaconda.com/distribution/)
ダウンロードしたらちゃんとAnacondaのPATHを通してください。
```
$ conda
```
上記のconda打って、何も出ないならググってください([ここ](https://www.google.com/search?rlz=1C5CHFA_enJP739JP739&ei=RhDhXPPvEsaB8gWzha6QAQ&q=anaconda+path+%E9%80%9A%E3%81%99&oq=anaconda+PATH&gs_l=psy-ab.1.0.35i39j0l7.3114.6233..7675...1.0..0.84.540.7......0....1..gws-wiz.......0i71j0i4j35i39i19j35i304i39j0i13.wJAZ7KujD_Q) )

ちなみにPATHも解らないなら([ここ](https://www.google.com/search?rlz=1C5CHFA_enJP739JP739&ei=8BDhXPayI5yBr7wPpaafwAw&q=%E7%92%B0%E5%A2%83%E5%A4%89%E6%95%B0&oq=%E7%92%B0%E5%A2%83%E5%A4%89%E6%95%B0&gs_l=psy-ab.3..35i39l2j0i67l2j0i4i37l2j0i67j0i4i37.61507.65164..66172...5.0..0.108.1244.13j1......0....1..gws-wiz.......0i4i10i37j0i131j0i131i4i37.FAr9hQOgjBY))



## Eclipse で開発
まず先にプロジェクトをインポートしてください。[参考](https://www.javadrive.jp/eclipse3/project/index4.html)
Landmarkについて
[参考](https://www.pyimagesearch.com/2017/04/03/facial-landmarks-dlib-opencv-python/)
### コード
```
import static daoda.Next.*;
public class Main {
	public static void main(String []args) {
		MImage img = new MImage("temp.jpg"); <- src/image/に画像を入れてそれの名前
		MImage.Points arr[] = img.getLandmark(); <- 画像のlandmarkを取得
		for (int i = 0; i < arr.length; i++) {
			println(i + ":" + arr[i].x + "/" + arr[i].y);
		}
	}
}

```





# Advance Preparation
**Install for pyhon and java by Anaconda**
```
conda install -c menpo dlib 
conda install -c anaconda scikit-image 
conda install -c menpo opencv3 
```

