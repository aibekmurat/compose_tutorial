package com.example.composetutorial

import android.icu.text.IDNA.Info
import android.media.Image
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    InfoText(
        title = stringResource(R.string.main_title),
        description = stringResource(R.string.main_descript),
        text = stringResource(R.string.info_text),
        image = painterResource(R.drawable.bg_compose_background)
    )
}

@Composable
private fun InfoText(title: String, description: String, text: String, image: Painter, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
    ) {
        Image(painter = image, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)

        )
        Text(
            text = text,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ComposePreview(){
    ComposeTutorialTheme{
        MainScreen()
    }
}

