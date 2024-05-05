package com.example.androidstudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidstudy.ui.theme.SuperheroesTheme
import com.example.androidstudy.ui.theme.ThirtyDaysTheme
import java.text.NumberFormat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            AndroidStudyTheme {
            // A surface container using the 'background' color from the theme
            // 1. 自己紹介カードの作成
//                Surface(color = MaterialTheme.colorScheme.background) {
//                    Greeting("Aya")
//                }

            // 2. バースデーカードの作成
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background,
//                ) {
//                    GreetingText(message = "Happy Birthday Sam!", from = "From Emma")
//                }

            // 3. 背景画像のあるバースデーカードの作成
//                Surface(color = MaterialTheme.colorScheme.background) {
//                    GreetingImage(stringResource(R.string.happy_birthday_text),
//                        stringResource(R.string.signature_text))
//                }

            // 4. 記事ページの作成
//                Surface(color = MaterialTheme.colorScheme.background) {
//                    Article()
//                }

            // 5. タスクをすべて完了したときに表示される画面の作成
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background,
//                ) {
//                    CompletedTask()
//                }

            // 6. 4分割の画面を作成
//                Surface {
//                    Quarter()
//                }

            // 7. サイコロアプリの作成
//                DiceRollerApp()

            // 8. Lemonadeアプリの作成
//                LemonadeApp()

            // 9. チップ計算アプリの作成
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                ) {
//                    TipTimeLayout()
//                }

            // 10. 画像アプリの作成
//                ImageApp()

            // 11. スクロール可能なリスト
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    AffirmationsApp()
//                }

            // 12. コース一覧アプリの作成
//                Courses(modifier = Modifier.padding(8.dp))
//            }

            // 13. 犬アプリ
//            WoofTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize()
//                ) {
//                    WoofApp()
//                }
//            }

            // 14. Superheroesアプリ
//            SuperheroesTheme {
//                SuperheroesApp()
//            }

            // 15. 30日間アプリ
            ThirtyDaysTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    ThirtyDaysApp()
                }
            }
        }
    }
}

// 1. 自己紹介カードの作成
//@Composable
//fun Greeting(name: String) {
//    // Surface は、外観（背景色や枠線など）を変更できる UI のセクションを表すコンテナ。
//    Surface(color = Color.Magenta) {
//        Text(
//            text = "Hi, my name is $name!",
//            modifier = Modifier.padding(24.dp)
//        )
//    }
//}

// 2. バースデーカードの作成
//@Composable
//fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        modifier = modifier,
//    ) {
//        Text(
//            text = message,
//            fontSize = 100.sp,
//            lineHeight = 116.sp,
//            textAlign = TextAlign.Center,
//        )
//        Text(
//            text = from,
//            fontSize = 36.sp,
//            modifier = Modifier
//                .padding(16.dp)
//                .align(alignment = Alignment.End),
//        )
//    }
//}

// 3. 背景画像のあるバースデーカードの作成
//@Composable
//fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        modifier = modifier
//    ) {
//        Text(
//            text = message,
//            fontSize = 100.sp,
//            lineHeight = 116.sp,
//            textAlign = TextAlign.Center,
//        )
//        Text(
//            text = from,
//            fontSize = 36.sp,
//            modifier = Modifier
//                .padding(16.dp)
//                .align(alignment = Alignment.CenterHorizontally)
//        )
//    }
//}
//
//@Composable
//fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
//    val image = painterResource(R.drawable.androidparty)
//    Box {
//        Image(
//            painter = image,
//            contentDescription = null,
//            contentScale = ContentScale.Crop,
//            alpha = 0.5F,
//        )
//        GreetingText(
//            message = message,
//            from = from,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(8.dp),
//        )
//    }
//}

// 4. 記事ページの作成
//@Composable
//fun Article() {
//    Column {
//        Image(
//            painter = painterResource(id = R.drawable.bg_compose_background),
//            contentDescription = null,
//            modifier = Modifier.fillMaxWidth(),
//        )
//        Text(
//            text = "Jetpack Compose tutorial",
//            fontSize = 24.sp,
//            modifier = Modifier.padding(16.dp),
//        )
//        Text(
//            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
//            modifier = Modifier.padding(16.dp),
//            textAlign = TextAlign.Justify,
//        )
//        Text(
//            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
//            modifier = Modifier.padding(16.dp),
//            textAlign = TextAlign.Justify,
//        )
//    }
//}

// 5. タスクをすべて完了したときに表示される画面の作成
//@Composable
//fun CompletedTask() {
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.ic_task_completed),
//            contentDescription = null,
//        )
//        Text(
//            text = "All tasks completed",
//            fontWeight = FontWeight.Bold ,
//            modifier = Modifier
//                .padding(
//                    top = 24.dp,
//                    bottom = 8.dp,
//                ),
//        )
//        Text(
//            text = "Nice work!",
//            fontSize = 16.sp,
//        )
//    }
//}

// 6. 4分割の画面を作成
//@Composable
//fun Quarter() {
//    Column {
//        Row(modifier = Modifier.weight(1f)) {
//            Panel(
//                title = "Text composable",
//                description = "Displays text and follows the recommended Material Design guidelines.",
//                modifier = Modifier
//                    .weight(1f)
//                    .background(color = Color(0xFFEADDFF)),
//            )
//            Panel(
//                title = "Image composable",
//                description = "Creates a composable that lays out and draws a given Painter class object.",
//                modifier = Modifier
//                    .weight(1f)
//                    .background(color = Color(0xFFD0BCFF)),
//            )
//        }
//        Row(modifier = Modifier.weight(1f)) {
//            Panel(
//                title = "Row composable",
//                description = "A layout composable that places its children in a horizontal sequence.",
//                modifier = Modifier
//                    .weight(1f)
//                    .background(color = Color(0xFFB69DF8)),
//            )
//            Panel(
//                title = "Column composable",
//                description = "A layout composable that places its children in a vertical sequence.",
//                modifier = Modifier
//                    .weight(1f)
//                    .background(color = Color(0xFFF6EDFF)),
//            )
//        }
//    }
//}
//
//@Composable
//fun Panel(title: String, description: String, modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier
//            .fillMaxSize()
//            .padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Text(
//            text = title,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.padding(bottom = 16.dp),
//        )
//        Text(
//            text = description,
//            textAlign = TextAlign.Justify,
//        )
//    }
//}

// 7. サイコロアプリの作成
//@Composable
//fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
//    var result by remember { mutableStateOf(1) }
//
//    val imageResource = when (result) {
//        1 -> R.drawable.dice_1
//        2 -> R.drawable.dice_2
//        3 -> R.drawable.dice_3
//        4 -> R.drawable.dice_4
//        5 -> R.drawable.dice_5
//        else -> R.drawable.dice_6
//    }
//
//    Column(
//        modifier = modifier,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        Image(
//            painter = painterResource(imageResource),
//            contentDescription = result.toString(),
//        )
//        Spacer(modifier = Modifier.height(16.dp))
//        Button(onClick = { result = (1..6).random() }) {
//            Text(stringResource(R.string.roll))
//        }
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DiceRollerApp() {
//    DiceWithButtonAndImage(
//        modifier = Modifier
//            .fillMaxSize()
//            .wrapContentSize(Alignment.Center),
//    )
//}

// 8. Lemonadeアプリの作成
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LemonadeApp() {
//    Scaffold(
//        topBar = {
//            CenterAlignedTopAppBar(
//                colors = TopAppBarDefaults.largeTopAppBarColors(
//                    containerColor = Color.Yellow,
//                    titleContentColor = Color.Black,
//                ),
//                title = {
//                    Text(
//                        text = "Lemonade",
//                        fontWeight = FontWeight.Bold,
//                    )
//                }
//            )
//        },
//    ) { innerPadding ->
//        Lemonade(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(innerPadding)
//                .wrapContentSize(Alignment.Center)
//        )
//    }
//}
//
//@Composable
//fun Lemonade(modifier: Modifier = Modifier) {
//    Column(
//        modifier = modifier,
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        LemonadeImageButton()
//        Spacer(modifier = Modifier.height(24.dp))
//        Text(text = stringResource(id = R.string.lemon_tree_description))
//    }
//}
//
//@Composable
//fun LemonadeImageButton() {
//    var step by remember { mutableIntStateOf(1) }
//    var squeeze by remember { mutableIntStateOf(0) }
//
//    Button(
//        colors = ButtonDefaults.textButtonColors(Color(0xFFAFE1AF)),
//        shape = RoundedCornerShape(24.dp),
//        onClick = {
//            when (step) {
//                1 -> {
//                    step++
//                    squeeze = (1..10).random()
//                }
//                2 -> if (squeeze == 1) step++ else squeeze--
//                3 -> step++
//                4 -> step = 1
//            }
//        },
//    ) {
//        Image(
//            painter = painterResource(id = lemonadeImage(step)),
//            contentDescription = stringResource(id = R.string.lemon_tree),
//        )
//    }
//}
//
//private fun lemonadeImage(step: Int): Int {
//    return when (step) {
//        1 -> R.drawable.lemon_tree
//        2 -> R.drawable.lemon_squeeze
//        3 -> R.drawable.lemon_drink
//        4 -> R.drawable.lemon_restart
//        else -> 0
//    }
//}

// 9. チップ計算アプリの作成
@Composable
fun TipTimeLayout() {
    var amountInput by remember { mutableStateOf("") }
    val amount = amountInput.toDoubleOrNull() ?: 0.0

    var tipInput by remember { mutableStateOf("") }
    val tipPercent = tipInput.toDoubleOrNull() ?: 0.0

    var roundUp by remember { mutableStateOf(false) }

    val tip = calculateTip(amount, tipPercent, roundUp)

    Column(
        modifier = Modifier
            .padding(40.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = stringResource(R.string.calculate_tip),
            modifier = Modifier
                .padding(bottom = 16.dp, top = 40.dp)
                .align(alignment = Alignment.Start)
        )
        EditNumberField(
            label = R.string.bill_amount,
            leadingIcon = R.drawable.money,
            value = amountInput,
            onValueChanged = { amountInput = it },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth(),
        )
        EditNumberField(
            label = R.string.how_was_the_service,
            leadingIcon = R.drawable.percent,
            value = tipInput,
            onValueChanged = { tipInput = it },
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Done
            ),
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth()
        )
        RoundTheTipRow(
            roundUp = roundUp,
            onRoundUpChanged = { roundUp = it },
            modifier = Modifier.padding(bottom = 32.dp),
        )
        Text(
            text = stringResource(R.string.tip_amount, tip),
            style = MaterialTheme.typography.displaySmall
        )
        Spacer(modifier = Modifier.height(150.dp))
    }
}

@Composable
fun EditNumberField(
    @StringRes label: Int,
    @DrawableRes leadingIcon: Int,
    value: String,
    onValueChanged: (String) -> Unit,
    keyboardOptions: KeyboardOptions,
    modifier: Modifier = Modifier,
) {
    TextField(
        label = { Text(stringResource(label)) },
        leadingIcon = { Icon(painter = painterResource(id = leadingIcon), null) },
        value = value,
        onValueChange = onValueChanged,
        singleLine = true,
        keyboardOptions = keyboardOptions,
        modifier = modifier
    )
}

@Composable
fun RoundTheTipRow(
    roundUp: Boolean,
    onRoundUpChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .size(48.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(R.string.round_up_tip))
        Switch(
            checked = roundUp,
            onCheckedChange = onRoundUpChanged,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End),
        )
    }
}

@VisibleForTesting
internal fun calculateTip(
    amount: Double,
    tipPercent: Double = 15.0,
    roundUp: Boolean
): String {
    var tip = tipPercent / 100 * amount
    if (roundUp) {
        tip = kotlin.math.ceil(tip)
    }
    return NumberFormat.getCurrencyInstance().format(tip)
}

// 10. 画像アプリの作成
//@Composable
//fun ImageApp() {
//    var imageNumber by remember { mutableIntStateOf(0) }
//
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//    ) {
//        ImageContainer(
//            imageNumber = imageNumber,
//            modifier = Modifier
//                .weight(1f)
//                .wrapContentHeight(),
//        )
//        ButtonContainer(
//            next = { if (imageNumber < 2) imageNumber++ },
//            previous = { if (imageNumber > 0) imageNumber-- }
//        )
//    }
//}
//
//@Composable
//fun ImageContainer(imageNumber: Int, modifier: Modifier = Modifier) {
//    val images = ImageInfoDatasource.load()
//
//    Column(modifier = modifier.width(320.dp)) {
//        Image(
//            painter = painterResource(id = images[imageNumber].image),
//            contentDescription = images[imageNumber].title,
//            modifier = Modifier
//                .shadow(8.dp)
//                .padding(40.dp),
//        )
//        Spacer(modifier = Modifier.height(32.dp))
//        Surface(modifier = Modifier.padding(horizontal = 8.dp)) {
//            Description(images[imageNumber])
//        }
//    }
//}
//
//@Composable
//fun Description(imageInfo: ImageInfo) {
//    Column(
//        modifier = Modifier
//            .background(color = Color(0xFFECEBF3))
//            .padding(16.dp)
//            .fillMaxWidth(),
//    ) {
//        Text(
//            buildAnnotatedString {
//                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
//                    append(imageInfo.artist)
//                }
//                append(" (${imageInfo.year})")
//            }
//        )
//    }
//}
//
//@Composable
//fun ButtonContainer(next: () -> Unit, previous: () -> Unit) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(8.dp),
//        horizontalArrangement = Arrangement.SpaceBetween,
//    ) {
//        Button(
//            colors = ButtonDefaults.textButtonColors(
//                containerColor = Color(0xFF4D5C8E),
//                contentColor = Color.White,
//            ),
//            onClick = { previous() },
//        ) {
//            Text(text = "Previous")
//        }
//        Button(
//            colors = ButtonDefaults.textButtonColors(
//                containerColor = Color(0xFF4D5C8E),
//                contentColor = Color.White,
//            ),
//            onClick = { next() },
//        ) {
//            Text(text = "Next")
//        }
//    }
//}

// 11. スクロール可能なリスト
//@Composable
//fun AffirmationsApp() {
//    AffirmationList(
//        affirmationList = AffirmationDatasource.load(),
//    )
//}
//
//@Composable
//fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
//    LazyColumn(modifier = modifier) {
//        items(affirmationList) { affirmation ->
//            AffirmationCard(
//                affirmation = affirmation,
//                modifier = Modifier.padding(8.dp)
//            )
//        }
//    }
//}
//
//@Composable
//fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
//    Card(modifier = modifier) {
//        Column {
//            Image(
//                painter = painterResource(affirmation.imageResourceId),
//                contentDescription = stringResource(affirmation.stringResourceId),
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(194.dp),
//                contentScale = ContentScale.Crop
//            )
//            Text(
//                text = LocalContext.current.getString(affirmation.stringResourceId),
//                modifier = Modifier.padding(16.dp),
//                style = MaterialTheme.typography.headlineSmall
//            )
//        }
//    }
//}

// 12. コース一覧アプリの作成
//@Composable
//fun Courses(modifier: Modifier = Modifier) {
//    LazyVerticalGrid(
//        columns = GridCells.Fixed(2),
//        verticalArrangement = Arrangement.spacedBy(8.dp),
//        horizontalArrangement = Arrangement.spacedBy(8.dp),
//        modifier = modifier
//    ) {
//        items(TopicDatasource.topics) { topic ->
//            Topic(topic)
//        }
//    }
//}
//
//@Composable
//fun Topic(topic: Topic) {
//    Card {
//        Row {
//            Image(
//                painter = painterResource(id = topic.imageRes),
//                contentDescription = stringResource(id = topic.titleRes),
//                modifier = Modifier.size(68.dp)
//            )
//            Column {
//                Text(
//                    text = stringResource(id = topic.titleRes),
//                    style = MaterialTheme.typography.bodyMedium,
//                    modifier = Modifier.padding(top = 16.dp, start = 16.dp, bottom = 8.dp),
//                )
//                Row(verticalAlignment = Alignment.CenterVertically) {
//                    Icon(
//                        painter = painterResource(id = R.drawable.ic_grain),
//                        contentDescription = null,
//                        tint = Color.Black,
//                        modifier = Modifier.padding(start = 16.dp, end = 8.dp),
//                    )
//                    Text(
//                        text = topic.courseCount.toString(),
//                        style = MaterialTheme.typography.labelMedium,
//                    )
//                }
//            }
//        }
//    }
//}

// 13. 犬アプリ
//@Composable
//fun WoofApp() {
//    Scaffold(
//        topBar = {
//            WoofTopAppBar()
//        }
//    ) { it ->
//        LazyColumn(contentPadding = it) {
//            items(dogs) {
//                DogItem(
//                    dog = it,
//                    modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small)),
//                )
//            }
//        }
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun WoofTopAppBar(modifier: Modifier = Modifier) {
//    CenterAlignedTopAppBar(
//        title = {
//            Row(verticalAlignment = Alignment.CenterVertically) {
//                Image(
//                    modifier = Modifier
//                        .size(dimensionResource(id = R.dimen.image_size))
//                        .padding(dimensionResource(id = R.dimen.padding_small)),
//                    painter = painterResource(R.drawable.ic_woof_logo),
//                    contentDescription = null
//                )
//                Text(
//                    text = stringResource(R.string.woof),
//                    style = MaterialTheme.typography.displayLarge,
//                )
//            }
//        },
//        modifier = modifier
//    )
//}
//
//@Composable
//fun DogItem(
//    dog: Dog,
//    modifier: Modifier = Modifier
//) {
//    var expanded by remember { mutableStateOf(false) }
//    val color by animateColorAsState(
//        targetValue = if (expanded) MaterialTheme.colorScheme.tertiaryContainer
//        else MaterialTheme.colorScheme.primaryContainer,
//        label = "",
//    )
//
//    Card(modifier = modifier) {
//        Column(
//            modifier = Modifier
//                .animateContentSize(
//                    animationSpec = spring(
//                        dampingRatio = Spring.DampingRatioNoBouncy,
//                        stiffness = Spring.StiffnessMedium,
//                    )
//                )
//                .background(color = color),
//        ) {
//            Row(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(dimensionResource(R.dimen.padding_small))
//            ) {
//                DogIcon(dog.imageResourceId)
//                DogInformation(dog.name, dog.age)
//                Spacer(modifier = Modifier.weight(1f))
//                DogItemButton(
//                    expanded = expanded,
//                    onClick = { expanded = !expanded },
//                )
//            }
//            if (expanded) {
//                DogHobby(
//                    dog.hobbies,
//                    modifier = Modifier.padding(
//                        start = dimensionResource(R.dimen.padding_medium),
//                        top = dimensionResource(R.dimen.padding_small),
//                        end = dimensionResource(R.dimen.padding_medium),
//                        bottom = dimensionResource(R.dimen.padding_medium)
//                    )
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun DogIcon(
//    @DrawableRes dogIcon: Int,
//    modifier: Modifier = Modifier
//) {
//    Image(
//        modifier = modifier
//            .size(dimensionResource(R.dimen.image_size))
//            .padding(dimensionResource(R.dimen.padding_small))
//            .clip(MaterialTheme.shapes.small),
//        painter = painterResource(dogIcon),
//        contentScale = ContentScale.Crop,
//        contentDescription = null,
//    )
//}
//
//@Composable
//fun DogInformation(
//    @StringRes dogName: Int,
//    dogAge: Int,
//    modifier: Modifier = Modifier
//) {
//    Column(modifier = modifier) {
//        Text(
//            text = stringResource(dogName),
//            style = MaterialTheme.typography.displayMedium,
//            modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small)),
//        )
//        Text(
//            text = stringResource(R.string.years_old, dogAge),
//            style = MaterialTheme.typography.bodyLarge,
//        )
//    }
//}
//
//@Composable
//private fun DogItemButton(
//    expanded: Boolean,
//    onClick: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//    IconButton(
//        onClick = onClick,
//        modifier = modifier
//    ) {
//        Icon(
//            imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
//            contentDescription = stringResource(R.string.expand_button_content_description),
//            tint = MaterialTheme.colorScheme.secondary,
//        )
//    }
//}
//
//@Composable
//fun DogHobby(
//    @StringRes dogHobby: Int,
//    modifier: Modifier = Modifier
//) {
//    Column(
//        modifier = modifier
//    ) {
//        Text(
//            text = stringResource(R.string.about),
//            style = MaterialTheme.typography.labelSmall
//        )
//        Text(
//            text = stringResource(dogHobby),
//            style = MaterialTheme.typography.bodyLarge
//        )
//    }
//}

// 14. Superheroesアプリ
//@Composable
//fun SuperheroesApp() {
//    Scaffold(topBar = { SuperheroesTopBar() }) {
//        HeroesScreen(contentPadding = it, modifier = Modifier.padding(16.dp))
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun SuperheroesTopBar(modifier: Modifier = Modifier) {
//    CenterAlignedTopAppBar(
//        title = {
//            Text(
//                text = stringResource(id = R.string.superheroes),
//                style = MaterialTheme.typography.displayLarge,
//            )
//        },
//        modifier = modifier,
//    )
//}

// 15. 30日間アプリ
@Composable
fun ThirtyDaysApp() {
    Scaffold(topBar = { ThirtyDaysTopBar() }) {
        Surface(modifier = Modifier.padding(it)) {
            ThirtyDaysList(modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThirtyDaysTopBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.thirty_days_of_android),
                style = MaterialTheme.typography.displayLarge,
            )
        },
        modifier = modifier,
    )
}

// 1. 自己紹介カードの作成
//@Preview(
//    showBackground = true,
//    showSystemUi = true,
//    name = "greeting",
//)
//@Composable
//fun GreetingPreview() {
//    AndroidStudyTheme {
//        Greeting("Aya")
//    }
//}

// 2. バースデーカードの作成
//@Preview(showBackground = true)
//@Composable
//fun BirthdayCardPreview() {
//    AndroidStudyTheme {
//        GreetingText(message = "Happy Birthday Sam!", from ="From Emma")
//    }
//}

// 3. 背景画像のあるバースデーカードの作成
//@Preview(showBackground = true)
//@Composable
//fun BirthdayCardPreview() {
//    AndroidStudyTheme {
//        GreetingImage("Happy Birthday Sam!", "From Emma")
//    }
//}

// 4. 記事ページの作成
//@Preview(showBackground = true)
//@Composable
//fun ArticlePreview() {
//    AndroidStudyTheme {
//        Article()
//    }
//}

// 5. タスクをすべて完了したときに表示される画面の作成
//@Preview(showBackground = true)
//@Composable
//fun CompletedTaskPreview() {
//    AndroidStudyTheme {
//        CompletedTask()
//    }
//}

// 6. 4分割の画面を作成
//@Preview(showBackground = true)
//@Composable
//fun QuarterPreview() {
//    AndroidStudyTheme {
//        Quarter()
//    }
//}

// 8. Lemonadeアプリの作成
//@Preview(showBackground = true)
//@Composable
//fun LemonadeAppPreview() {
//    AndroidStudyTheme {
//        LemonadeApp()
//    }
//}

// 9. チップ計算アプリの作成
//@Preview(showBackground = true)
//@Composable
//fun TipTimeLayoutPreview() {
//    AndroidStudyTheme {
//        TipTimeLayout()
//    }
//}

// 10. 画像アプリの作成
//@Preview(showBackground = true)
//@Composable
//fun ImageAppPreview() {
//    AndroidStudyTheme {
//        ImageApp()
//    }
//}

// 11. スクロール可能なリスト
//@Preview
//@Composable
//private fun AffirmationCardPreview() {
//    AffirmationCard(Affirmation(R.string.affirmation1, R.drawable.image1))
//}
//
//@Preview(showBackground = true)
//@Composable
//private fun AffirmationsAppPreview() {
//    AffirmationsApp()
//}

// 12. コース一覧アプリの作成
//@Preview(showBackground = true)
//@Composable
//fun CoursesPreview() {
//    AndroidStudyTheme {
//        Courses(modifier = Modifier.padding(8.dp))
//    }
//}

// 13. 犬アプリ
//@Preview(showBackground = true)
//@Composable
//fun WoofPreview() {
//    WoofTheme(darkTheme = false) {
//        WoofApp()
//    }
//}
//
//@Preview
//@Composable
//fun WoofDarkThemePreview() {
//    WoofTheme(darkTheme = true) {
//        WoofApp()
//    }
//}

// 14. Superheroesアプリ
//@Preview
//@Composable
//fun SuperheroesAppPreview() {
//    SuperheroesTheme {
//        SuperheroesApp()
//    }
//}

// 15. 30日間アプリ
@Preview
@Composable
fun ThirtyDaysAppPreview() {
    ThirtyDaysTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            ThirtyDaysApp()
        }
    }
}
