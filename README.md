# HelloKotlin

Kotlinを触ってみる。

以下はメモ。

## とりあえずHello World
https://kotlinlang.org/docs/tutorials/getting-started.html

outディレクトリはなんだ？

.classファイルとかいるから.gitignore行きでよいのかしらん。。

とりあえずIDEA同梱のKotlin使っておけばOK？  

## 変数
`val 変数名: 型名 = 値`

- val: 再代入できる
- val: 再代入できない
- 型推論できる場合、型名省略可

## 文字列展開・式展開
```kt
val name = "Yamada"
println("Hello, $name!") // Hello, Yamada!

println("My score is ${12 + 34}.") // My score is 46.
```

## 制御文

- ifが式になっているので値を返すことができる
- switchの代わりにwhen

## 気になること

- テストは？
