plugins {
    id("com.android.application") // quyết định app builld theo kiểu app hay library
}

android {
    namespace = "com.example.android_day01"//vị trí
    compileSdk = 33//phiên bản sdk

    defaultConfig {
        applicationId = "com.example.android_day01"//id của ứng dụng , để phân biệt với các ứng dunụng khc
        minSdk = 25 // sdk tối thiểu ,  xác định phiên bản tối thiểu của hệ điều hành android mà ứng dụng hỗ trợ
        targetSdk = 33
        versionCode = 1 // phiên bản code khi up lên chợ ứng dụng , để xác định xem phiên bản trước đó có giống hiện tại không
        versionName = "1.0" // hiển thị

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes { // có 2 loại buildType . và debug
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}