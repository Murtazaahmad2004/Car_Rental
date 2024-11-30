plugins {
    alias(libs.plugins.android.application) apply false
    // Remove the alias for google services
    id("com.google.gms.google-services") version "4.4.2" apply false
}