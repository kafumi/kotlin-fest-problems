# mixi Kotlin Problems for Kotlin Fest 2019

以下4つの問題に挑戦してください。

評価時に処理速度のみベンチマークをとります。
同点の場合、ランキング表示では全体の処理時間が短い人ほど上位になります。
評価時に全回答の処理時間の合計が4分を越えた場合は失格とします。
テストケースは企画終了後に公開とします。

# 回答フォーム

https://forms.gle/3pTnurkXmpvdr6kp6

## Q1

2つの連結リストをたし算する関数を実装してください。
それぞれの連結リストは最初の要素の値から順に1の位、10の位、100の位として表現されます。
たとえば(1 -> 2 -> 3) というリストであれば、10進数の321として扱ってください。
評価に用いる入力は3桁とは限りません。

```
入力例: (2 -> 4 -> 3) ,  (5 -> 6 -> 4)
期待値: (7 -> 0 -> 8)
実際の計算: 342 + 465 = 807
```

出典:  
世界で闘うプログラミング力を鍛える本(問題2.5)


## Q2

酒井さんと黒川さんはオフィスでクリスマスツリーの飾りつけの準備をしています。
二人の手元には赤、青、黄の3種類のオーナメントがたくさんあります。

黒川さんの話では美しい飾りつけにはちょっとした法則があるそうです。

1.青いオーナメントは黄色いオーナメントの数より1つだけ多いこと。
2.赤いオーナメントは青いオーナメントの数より1つだけ多いこと。

この法則に従うと、もし黄色いオーナメントが8個、青いオーナメントが13個、赤いオーナメントが9個あった場合、例えば黄色を4個、青を5個、赤を6個使えば美しい飾り付けになります。

いっぽうで酒井さんはとにかくたくさんのオーナメントを使いたいそうです。

したがって2人の希望に沿うと、黄7青8赤9の組み合わせ(合計24個)が最も満足の行くものになります。

しかし2人はこの後リリース作業の準備で忙しいようで、あなたは最適なオーナメントの組み合わせを見つけるように依頼されました。そこで以下のような関数を実装してください。

```
入力:
用意されたオーナメントの個数が色別に入力されます。
引数を3つ取り、それぞれy(黄色), b(青), r(赤)とします。
それぞれの値は次の条件を見たします
1≤y≤100
2≤b≤100
3≤r≤100

出力:
2人が最も満足の行く飾り付けにした場合、全部で何個のオーナメントを使ったかを出力します。

入力例:
y:13, b:3, r:6
期待する出力:
9
```

出典:  
https://codeforces.com/contest/1171/problem/B

## Q3

入力として与えられたN ( 1 <= N <= 1,000,000,000) に対し、1以上N以下の偶数の和を求めてください。なお、答えはintの範囲に収まらない可能性があります。

```
入力例: 10
期待する出力: 30
実際の計算:  2+4+6+8+10
```

## Q4

1以上100万以下であることが保証されている1,000,000,000個の整数（1 <= a_i <= 1,000,000）がテキストファイルとして与えられます。

この中で登場 *しない* 数字をすべて列挙して出力してください。ただしメモリは1MBしか使えないものとします。

```
入力: Fileオブジェクト
出力: listOf(...)
```

