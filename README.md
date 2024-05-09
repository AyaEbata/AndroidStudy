# Android Study
久々のAndroid、勉強するよ。  
[これ](https://developer.android.com/courses/android-basics-compose/course?index=..%2F..android-kotlin-fundamentals&hl=ja#0) をやっていくよ。  
全部で約100時間コースだwwww

## Kotlinメモ
- 実装: `AndroidStudy/app/src/main/java/com/example/androidstudy/kotlinstudy` 配下
    1. Kotlin の概要: `Overview.kt`
    2. Kotlin の基礎: `Base1.kt`
    3. Kotlin の基礎（その他）: `Base2.kt`
- スタイルについて
    - 関数名はキャメルケース
    - 関数本体はスペース 4 つ分インデントする
    - スタイルガイドの詳細: https://developer.android.com/kotlin/style-guide?hl=ja
        - Go は `userID` のように書くけど、 Kotlin は `userId` なので気を付けること！
- 戻り値の型を指定しなかった場合、デフォルトの戻り値の型は `Unit` になる
    - Unit は、関数が値を返さないことを意味する
    - 戻り値の型が `Unit` の場合、指定は省略できる
- 関数を定義するときは、関数の呼び出し時に渡すパラメータを定義する（今回の場合は `name` 変数のこと）
- 関数を呼び出すときには、パラメータに対応する引数を渡す（今回の場合は文字列 "Rover" のこと）
- `in` を使用して、条件の範囲を示すことができる
- `is` を使用して、データ型を確認することができる
- `class` の前に `open` をつけると、継承可能なクラスとして定義できる
- `constructor` の定義でプロパティが可変か不変かを指定していない場合は、指定したパラメータはクラスプロパティにはならず、このクラスでは使用できない
    - スーパークラスのコンストラクタに渡すだけのもの
    - （`SmartTvDevice` クラスにて記載）
- 関数を値として参照するには、関数参照演算子（ `::` ）を使用する
    - 例: `val trickFunction = ::trick1`
- ラムダ式のパラメータを省略する場合は `it` で指定する
- 後置ラムダ構文: 再度にラムダがある場合は、引数の閉じ括弧の後にラムダを式を書くことができる
    - 例: `trickOrTreat(false) { "$it quarters" }`
- アクションを実行するメソッドが含まれないデータのみのクラスの場合、「データクラス」として定義する
- `companion object` は `static` 的なやつ
- 配列はサイズ変更不可能で、各要素の値の変更は可能
- リスト
    - List: アイテムの読み取り専用 
    - MutableList: 要素の追加や削除など、リストを変更するメソッドを定義して、List インターフェースを拡張する
- セットは特定の順序を持たないコレクションであり、重複値を許可しない
- `groupBy()` を用いると指定した関数からリストをマップにできる
    - リストを 2 つに分けるだけでよい場合は、代わりに `partition()` 関数を使用できる
- `fold()` 関数は、コレクションから単一の値を生成するために使用する
    - 合計価格を計算する場合や、リスト内のすべての要素を合計して平均値を求める場合などに使用
    - 初期値がない場合は `reduce()`
    - 足し算するだけなら `sum()` や `sumOf()` もある
- 定数はclassの外だと `private const val hoge = 0` みたいにかける
    - classの中だと `companion object` でくくる
- バッキング プロパティ
    - `var count = 0` で読み書きするのではなくて `private var _count = 0` と別にgetter変数を用意する
    - 外から変更できなくなる
- `dat aclass` の `copy()` を使用してオブジェクトをコピーすると、一部のプロパティを変更し、残りのプロパティはそのままにするということができる
- `@VisibleForTesting` はテストのためにpublicやprotected、package privateにする場合につける

## Androidメモ
- Android アプリの UI 要素では、2 種類の測定単位がある
    - 密度非依存ピクセル（DP）: レイアウトに使用する単位
    - 拡張可能ピクセル（SP）: フォントサイズの単位で、ユーザーがスマートフォン設定で選択するテキストサイズに基づいて変更される
- 画像は Resource Manager の Import drawables からインポートする
- `drawable-nodpi` ディレクトリに画像をおくとサイズ変更が行われなくなる
    - Android システムが処理できるよりも大きな画像のサイズを変更しようとするとメモリ不足エラーがスローされるため、写真や背景画像はここに置く
- `res/` ディレクトリにて画像や文字列などのアプリリソースを管理する
    - 画像リソースは `drawable/` ディレクトリ
    - ランチャー アイコンは `mipmap/` ディレクトリ
    - 文字列リソースは `values/` ディレクトリ
    - その他のリソースタイプ: https://developer.android.com/guide/topics/resources/available-resources?hl=ja
- 文字列があるところで `Extract string resource` （option + Enterで出てくる）を選択すると文字列をリソース ファイルに抽出することができる
    - 注意として、 `getString()` 関数に置き換えられてしまう場合があるので、手動で関数を `stringResource()` に変更する必要がある
- 自動テスト
    - ローカルテスト: 関数、クラス、プロパティをテストできる
    - インストルメンテーション テスト: UI テスト
- ライフサイクル
    - `onCreate()` はアクティビティの初期化直後に1回呼び出される
        - `onDestroy()` と対 
    - `onStart()` は `onCreate()` の直後に呼び出される（何度も呼び出される）
        - `onStop()` と対 
        - `onStop()` はユーザーがアプリを起動してからデバイスのホーム画面に戻るときに呼び出される
        - `onRestart()` はアクティビティがすでに作成されていていてアプリを再表示する際に `onStop()` の後に呼び出される
    - `onResume()` は `onStart()` の直後に、ユーザーが操作できるようになったときに呼び出される
        - 呼び出されたらアプリはユーザー フォーカスを取得する -> ユーザーはアプリを操作できるようになる -> それをフォアグラウンドの存続期間という
        - `onPause()` と対
        - 共有ボタン押して下から共有の画面が出てきた時とか、 `onStop()` まで呼ばれずに `onPause()` だけが呼ばれる
- ライブサイクルについて: https://developer.android.com/reference/android/app/Activity#activity-lifecycle
- アーキテクチャについて: https://developer.android.com/topic/architecture?hl=ja
- テストメソッドは、テスト インスタンスの状態が可変であることによる予期しない副作用を避けるために、各テストメソッドが実行される前に JUnit がテストクラスの新しいインスタンスを作成する

## Android Studioメモ
- `Control+O` でオーバーライドできるメソッドを呼び出して選択できる

## Jetpack Composeメモ
- Jetpack Compose は、ネイティブ UI を作成するための Android の最新のツールキット
- ガイドライン: https://github.com/androidx/androidx/blob/androidx-main/compose/docs/compose-api-guidelines.md
- `@Composable` アノテーションが付いている場合は、関数名は名詞でパスカルケースを使用して名前を付ける
- `onCreate` から呼び出している関数（今回の場合は `Greeting()` ）を直接プレビューするのではなく、プレビュー用の別の関数（今回の場合は `GreetingPreview()` ）を追加
- `@Preview` ではプレビューの設定ができる
    - `showBackground = true` を指定すると、アプリのプレビューに背景が追加される
    - `showSystemUi = true` を指定すると、時間とかのバーが追加される
    - `name = "greeting"` を指定すると、名前をつけられる
- 基本的な標準レイアウト要素として、 `Column` 、 `Row` 、 `Box` の 3 つのコンポーザブルがある
    - コンポーザブルの子要素に修飾子パラメータを渡す `Column(modifier = modifier) { ... }`
    - `Box` レイアウトは、要素を別の要素の上に重ねるときに使用する
- `painterResource()` 関数は、ドローアブル画像リソースを読み込む
    - `Image()` の `contentDescription` はコンテンツの説明を書くとアプリのユーザー補助機能を強化がされる（読み上げてくれるやつ）
    - `androidparty.png` の画像は装飾目的のみで使用されているため、画像にコンテンツの説明を追加すると TalkBack で利用しにくくなる
- `ContentScale.Crop` パラメータを使用すると、画像の幅と高さが、それぞれ画面の幅と高さと等しいかそれ以上になるように、アスペクト比を維持しながら均等に画像を拡大してくれる
- `@Composable` がついた関数に `modifier` パラメータを渡すことができる
    - パラメータの値を渡すかどうかを決めることができる
    - 独自の `Modifier` オブジェクトを渡せば、UI の動作と装飾をカスタマイズできる
    - `Modifier` オブジェクトを渡さない場合は、デフォルトの値（プレーンな `Modifier` オブジェクト）であるとみなされる
    - デフォルトの値があってもわざわざ `Modifier` 引数を渡すのは、これは、コンポーザブルが再コンポーズされる可能性があるため
        - `Modifier` が再作成される可能性がある
- `fillMaxWidth` は、コンポーザブルを親から与えられた最大幅に合わせて調整する
- 親によって許可されているすべての高さを子レイアウトで埋めるには、 `fillMaxHeight` 修飾子を追加
- `fillMaxSize` を使用した場合、親が使用できるすべてのスペースを使用する
- `wrapContentSize()` メソッドは、利用可能なスペースが少なくとも内部のコンポーネントと同じ大きさである必要があるということを指定する
    - ただし `fillMaxSize()` メソッドを使用している場合、利用可能なスペースよりレイアウト内部のコンポーネントが小さい場合は、`Alignment` オブジェクトを `wrapContentSize()` メソッドに渡して、利用可能なスペース内でコンポーネントをどのように配置するかを指定できる
- コンポーザブルは、デフォルトではステートレスなので、値は保持されず、システムがいつでも再コンポーズでき、結果的に値がリセットされる
    - `remember` コンポーザブルを使用してオブジェクトをメモリに格納できる
    - 例: `var result by remember { mutableStateOf(1) }`
- `Button` を使わなくても `clickable` を使えばクリックできるようになる
- `@StringRes` アノテーションは、渡される整数が `values/strings.xml` ファイルの文字列リソースであることを示す
- `LazyColumn` コンポーザブルを使用してスクロール可能なリストを作成できる
- 構成の変更の際に Compose が状態を保持するようにするには、`rememberSaveable` を使用する
    - 画面を回転させても値を保持してくれる！
- `ViewModel` は状態を保持するやつ
    - アクティビティを破棄して再作成しても、データを保持してくれるけど、プロセスの終了の場合はデータを破棄する
- `enableEdgeToEdge()` を追加するとはシステムバーを透明にする
  - https://developer.android.com/develop/ui/views/layout/edge-to-edge?hl=ja#enable-edge-to-edge-display
- `OutlinedTextField` コンポーザブルは枠線があるテキストフィールドで、 `TextField` コンポーザブルは下線があるテキストフィールド
- `StateFlow` ( `MutableStateFlow ` )は状態を保持する監視可能なやつ
    - https://developer.android.com/kotlin/flow/stateflow-and-sharedflow?hl=ja#stateflow
- `OutlinedTextField` ( `TextField` )の `keyboardActions` の `onDone` 設定し忘れそう
- Compose ライブラリのバージョン管理には、Compose BOMを使うとよい
    - テストでBOMを使用する場合は `androidTestImplementation` でもBOMの宣言をする
- 最新の Android 開発では、マルチスクリーン アプリの作成に Jetpack Navigation コンポーネントを使用する
- 画面遷移をする場合は `NavHost()` と `navController.navigate()` を使用する
    - `navController.popBackStack()` で戻れる
    - `navController.popBackStack()` の引数
        - `inclusive = false` : 指定した戻りたい画面が再度開かれる（他はクローズされる）
        - `inclusive = true` : 全てクローズした後に戻りたい画面を再度表示する

## マテリアルデザインメモ
- テーマビルダー: https://m3.material.io/theme-builder#/custom
- アイコン: https://fonts.google.com/icons
- typographyの種類: https://m3.material.io/styles/typography/applying-type

## サンプルコード Unscramble メモ
- https://github.com/google-developer-training/basic-android-kotlin-compose-training-unscramble/tree/starter
- デイレクトリ構成
    - `app/src/main/java/com/example/unscramble` : 直下に `MainActivity.kt` を格納
    - `app/src/main/java/com/example/unscramble/data` （データレイヤ）: ベタ書きのデータを格納
    - `app/src/main/java/com/example/unscramble/ui` （UI レイヤ）: コンポーネント、ViewModelを格納
    - `app/src/main/java/com/example/unscramble/ui/theme` : `Color.kt` 、 `Shape.kt` 、 `Theme.kt` 、 `Type.kt` を格納
- `GameViewModel.kt` で定義した `uiState` は画面表示の状態で、画面表示しない場合は `mutableStateOf()` などで変数として宣言する

## サンプルコード Cupcake メモ
- https://github.com/google-developer-training/basic-android-kotlin-compose-training-cupcake/tree/starter
- デイレクトリ構成
    - `app/src/main/java/com/example/cupcake` : `MainActivity.kt` （メイン画面へのメソッドを置いてるだけ）、メイン画面のコンポーネントである `CupcakeScreen.kt` を格納
    - `app/src/main/java/com/example/cupcake/CupcakeScreen.kt` : AppBarや画面遷移の定義を書く
    - `app/src/main/java/com/example/cupcake/data` : データソース、UI Statusを保持
    - `app/src/main/java/com/example/cupcake/data/DataSource.kt` : 羅列したいボタン情報のリストなど
    - `app/src/main/java/com/example/cupcake/ui` : ViewModelや各画面（ `○○Screen.kt` という命名）を格納
    - `app/src/main/java/com/example/cupcake/ui/components` : 共通UIを格納
    - `app/src/main/java/com/example/cupcake/ui/theme` : `Color.kt` 、 `Shape.kt` 、 `Theme.kt` 、 `Type.kt` を格納

## 参考になったリンク
- [関数(Function)とプロパティ(Property)、どちらを使うべき？](https://zenn.dev/pytokyo/articles/63f862678958d335812a)
- [navController.popBackStack()のinclusiveについて](https://medium.com/@banmarkovic/jetpack-compose-clear-back-stack-popbackstack-inclusive-explained-14ee73a29df5)
