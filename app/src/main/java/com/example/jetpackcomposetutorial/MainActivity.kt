package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PracticeGreetingWithImage(tittle = "", firstParagraph = "", secondParagraph = "")
                }
            }
        }
    }
}

@Composable
fun PracticeGreetingWithImage(tittle: String, firstParagraph: String, secondParagraph: String) {
//    Text(text = "Hello $name!")
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column() {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxWidth()
        )
        PracticeGreetingWithText(tittle, firstParagraph, secondParagraph)
    }
}
@Composable
fun PracticeGreetingWithText(tittle: String,firstParagraph: String, secondParagraph: String){
    Column {
        Text(
            text = tittle,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp),
        )
        Text(text = firstParagraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = secondParagraph,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp,
                    top = 16.dp
                )
        )

    }
}

@Preview(showBackground = true)
@Composable
fun JetPackPreview() {
    JetpackComposeTutorialTheme{
        PracticeGreetingWithImage(stringResource(R.string.tittle_text), stringResource(R.string.first_paragraph),
        stringResource(R.string.second_paragraph))
    }

}