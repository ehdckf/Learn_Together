package com.ehdcjf.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ehdcjf.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Tutorial(
                            title= stringResource(id = R.string.post_title),
                            header= stringResource(id = R.string.post_header),
                            body= stringResource(id = R.string.post_body),
                            imagePainter = painterResource(id = R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }
}

@Composable
fun Tutorial(title:String, header:String, body:String, imagePainter: Painter, modifier: Modifier = Modifier) {

    Column(modifier = modifier){
        Image(painter =imagePainter , contentDescription = null, )
        Text(
            text = title,
            fontSize=24.sp,
            modifier = Modifier.padding(all = 16.dp)
        )
        Text(
            text = header,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = body,
            modifier = Modifier.padding(all = 16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TutorialPreview() {
    LearnTogetherTheme {
        Tutorial(  title= stringResource(id = R.string.post_title),
            header= stringResource(id = R.string.post_header),
            body= stringResource(id = R.string.post_body),
            imagePainter = painterResource(id = R.drawable.bg_compose_background)
        )
    }
}