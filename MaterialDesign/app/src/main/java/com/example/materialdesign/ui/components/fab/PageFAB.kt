import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.materialdesign.ui.components.fab.CustomFAB
import com.example.materialdesign.ui.components.fab.CustomFABExtended
import com.example.materialdesign.ui.components.fab.CustomFABLarge
import com.example.materialdesign.ui.components.fab.CustomFABSmall

@Composable
fun FAB() {
    Scaffold(
        //                   topBar = {SmallTopAppBar()},
        //                    bottomBar = { CustomBottomAppBar()}
    )
    { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center

        )
        {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {

                CustomFAB(onClick = { println("CustomFAB") })
                CustomFABSmall(onClick = { println("CustomFABSmall") })
                CustomFABLarge(onClick = { println("Custom FAB Large") })
                CustomFABExtended(
                    onClick = { println("Custom FAB Extended") })
                // CustomFilledButton(onClick =  println("asdsad"),
                //  CustomFilledTonalButton(onClick =  println("asdsad"),
                //  CustomOutLinedButton(Click =  println("asdsad")


            }
        }

    }
}