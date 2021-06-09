package com.seanutf.android.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.seanutf.android.compose.ui.theme.ComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeApplicationTheme {
        //Greeting("Android")
        NewsStory1()
    }
}

@Composable
fun NewsStory1() {
    Box(){

    }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image( painter = painterResource(R.drawable.header),
            contentDescription = null,
            modifier = Modifier.height(40.dp).width(40.dp).
            clip(shape = RoundedCornerShape(20.dp)),
            contentScale = ContentScale.Crop)
        Column {
            Text("Davenport, California")
            Text("December 2018")
        }
    }
}

@Composable
fun NewsStory() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp,vertical = 16.dp),
    ){
        Image(
            painter = painterResource(R.drawable.header),
            contentDescription = null,
            modifier = Modifier.height(180.dp).fillMaxWidth().
            clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(Modifier.height(16.dp))
        Text("这是一段中文的测试文案，用于测试文案这是一段中文的测试文案，用于测试文案这是一段中文的测试文案，用于测试文案这是一段中文的测试文案，用于测试文案这是一段中文的测试文案，用于测试文案这是一段中文的测试文案，用于测试文案"
            ,
            style = MaterialTheme.typography.h6,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis)
        Text("Davenport, California")
        Text("December 2018")
    }
}