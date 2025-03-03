plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.gms.google.services) // 保留這一行

    // 刪除這一行，因為 `google-services` 已經在上面配置
    // id("com.google.gms.google-services")
}

android {
    namespace = "tw.pu.edu.csim.hsiien.newrefrigerator"
    compileSdk = 35

    defaultConfig {
        applicationId = "tw.pu.edu.csim.hsiien.newrefrigerator"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.firebase.storage)
    implementation(libs.firebase.database)
    implementation(libs.firebase.auth.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // 保留這一行，已經有 libs.firebase.bom 了
    implementation(libs.firebase.bom)

    // Firebase Authentication（用戶登入）
    implementation(libs.firebase.auth)

    // Firebase Firestore（雲端資料庫）
    implementation(libs.firebase.firestore)

    // Firebase Realtime Database（即時資料庫）
    implementation(libs.firebase.database)

    // Firebase Storage（雲端儲存）
    implementation(libs.firebase.storage)
}
