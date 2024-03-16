package mx.dev1.sportchrono

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mx.dev1.sportchrono.ui.components.SportButtonContainer
import mx.dev1.sportchrono.ui.models.SportButton
import mx.dev1.sportchrono.ui.theme.SportChronoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SportChronoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.TopStart
                    ) {
                        val buttons = remember {
                            mutableListOf(
                                SportButton("Boxing"),
                                SportButton("Football"),
                                SportButton("Soccer"),
                                SportButton("Running"),
                                SportButton("Cycling"),
                            )
                        }

                        Column {
                            /* TrainingDuration("25:00")

                            Spacer(
                                modifier = Modifier.height(32.dp)
                            )*/

                            LazyVerticalGrid(
                                columns = GridCells.Fixed(2),
                                verticalArrangement = Arrangement.spacedBy(16.dp),
                                horizontalArrangement = Arrangement.spacedBy(16.dp),
                                contentPadding = PaddingValues(16.dp)
                            ) {
                                items(buttons) {
                                    SportButtonContainer(
                                        title = it.title,
                                        onClick = {
                                            Log.d(MainActivity::class.qualifiedName, it.title)
                                        }
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
