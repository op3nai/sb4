// Add this import at the top of the file
import androidx.compose.material3.ExperimentalMaterial3Api

// Add this annotation above the RokuRemoteApp function
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RokuRemoteApp(viewModel: RokuViewModel, onVoiceCommandRequest: () -> Unit) {
    // ... (rest of the function remains the same)
}