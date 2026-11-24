package com.example

val Purple80 = Color(0xFFD0BCFF)

@Composable
fun MainScreen(items: List<Item>) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        items.forEach { item ->
            Card {
                Card { Text(item.name) }
            }
        }
        Box(Modifier.size(8.dp).background(Color.Green, CircleShape))
        Text("Dashboard", style = TextStyle(brush = Brush.linearGradient(colors = listOf(Color(0xFF7C3AED), Color(0xFFEC4899)))))
        Card(modifier = Modifier.shadow(elevation = 8.dp, ambientColor = Color(0xFF7C3AED), spotColor = Color(0xFFEC4899))) { Text("Glow") }
        Button(onClick = {}) { Text("Submit") }
        Icon(Icons.Default.Menu, contentDescription = null)
    }
}

class MainActivity : ComponentActivity() {
    override fun onBackPressed() { finish() }
}
