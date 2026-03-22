# MLTextExtractor 🔍

**MLTextExtractor** is a high-performance Android application that leverages **Google ML Kit** to provide seamless text recognition and extraction from images. It allows users to capture photos directly via the camera, instantly convert physical text into digital format, and manage the results with built-in copy and erase tools.

## 🚀 Features

*   **Fast Text Recognition:** Uses Google ML Kit's on-device Text Recognition API for high accuracy and speed.
*   **Camera Integration:** Directly capture images using your device's camera for instant extraction.
*   **Easy Clipboard Access:** Copy the extracted text to your clipboard with a single tap.
*   **Interactive Onboarding:** A smooth introduction to the app's features using a dedicated tutorial flow.
*   **Clean UI:** Minimalist and intuitive interface designed for maximum productivity.
*   **Offline Processing:** Recognizes text on-device without requiring an internet connection.

## 🛠️ Tech Stack & Topics Covered

*   **Language:** Kotlin (Main logic) & Java (Onboarding implementation).
*   **Machine Learning:** [Google ML Kit Text Recognition](https://developers.google.com/ml-kit/vision/text-recognition) (Latin script).
*   **UI/UX:** Material Design components, `ConstraintLayout`, and `Edge-to-Edge` display.
*   **Android Fundamentals:**
    *   **Implicit Intents:** To trigger the system camera (`MediaStore.ACTION_IMAGE_CAPTURE`).
    *   **Activity Results:** Handling data flow using `onActivityResult`.
    *   **Splash Screen:** Implementation using `Handler` and `Looper`.
    *   **Clipboard API:** Managing system clipboard for text copying.
    *   **Resource Management:** Custom drawables, layouts, and manifest configurations.

## 📋 How to Use

1.  **Launch the App:** View the splash screen followed by the onboarding tutorial.
2.  **Capture Image:** Tap the **Camera Icon** to take a photo of the text you want to extract.
3.  **View Results:** The extracted text will automatically appear in the editable text field.
4.  **Copy/Clear:**
    *   Tap the **Copy Icon** to save the text to your clipboard.
    *   Tap the **Erase Icon** to clear the text and start over.

## 📦 Key Dependencies
gradle dependencies { // Google ML Kit Text Recognition implementation("com.google.mlkit:text-recognition:16.0.1")

// Onboarding Tutorial Library
implementation("com.github.msayan:tutorial-view:v1.0.10")

// Android Support Libraries
implementation("androidx.appcompat:appcompat:1.7.1")
implementation("com.google.android.material:material:1.13.0")
implementation("androidx.activity:activity-ktx:1.9.3")


## 📂 Project Structure

*   `OpeningScreen.kt`: Handles the initial splash screen animation and delay.
*   `OnBoardingScreen.java`: Implements the feature introduction tutorial.
*   `MainActivity.kt`: Contains the core logic for camera interaction, ML Kit processing, and UI event handling.

---

### Installation

1.  Clone the repository: `git clone https://github.com/yourusername/MLTextExtractor.git`
2.  Open the project in **Android Studio**.
3.  Sync Gradle and run the app on a physical device for the best camera experience.
