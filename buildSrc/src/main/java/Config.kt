/**
 * Created by Min Phone on 7/26/18.
 */

// Version Name
private const val versionMajor = 1 // plz increase every new phases
private const val versionMinor = 0 // plz increase every new features, redesign and goal completed
private const val versionPatch = 0 // plz increase every bugfix completed

// build plugin dependencies
private const val kotlinVersion = "1.2.61"
private const val androidGradleVersion = "3.1.4"

// Compile dependencies
private const val supportVersion = "28.0.0-rc02"
private const val constraintLayoutVersion = "1.1.3"
private const val daggerVersion = "2.16"
private const val retrofitVersion = "2.4.0"
private const val okhttpVersion = "3.9.1"
private const val moshiVersion = "1.6.0"
private const val glideVersion = "4.7.1"
private const val rxAndroidVersion = "2.0.2"
private const val rxKotlinVersion = "2.2.0"
private const val javaxInjectVersion = "1"
private const val javaxAnnotationVersion = "1.0"
private const val timberVersion = "4.5.1"
private const val archCompVersion = "1.1.1"
private const val stethoVersion = "1.5.0"
private const val androidKTXVersion = "0.3"
private const val rabbitVersion = "0.0.3"

// Test dependecies
private const val jUnitVersion = "4.12"
private const val espressoVersion = "3.0.2"
private const val androidJUnitVersion = "1.0.2"
private const val assertJVersion = "3.8.0"
private const val robolectricVersion = "3.4.2"
private const val mockitoVersion = "2.21.0"
private const val glassfishAnnotationVersion = "10.0-b28"
private const val mockitoKotlinVersion = "2.0.0-RC1"

object Config {
  val buildPlugins = BuildPlugins
  val android = Android
  val libs = Libs
  val testLibs = TestLibs
}

object BuildPlugins {
  val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
  val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
}

object Android {
  val minSdkVersion = 21
  val targetSdkVersion = 28
  val compileSdkVersion = 28
  val applicationId = "co.minphone.personal"
  val versionCode = generateVersionCode()
  val versionName = generateVersionName()
}

object Libs {
  val appCompact = "com.android.support:appcompat-v7:$supportVersion"
  val recyclerview = "com.android.support:recyclerview-v7:$supportVersion"
  val cardview = "com.android.support:cardview-v7:$supportVersion"
  val design = "com.android.support:design:$supportVersion"
  val androidAnnotation = "com.android.support:support-annotations:$supportVersion"
  val timber = "com.jakewharton.timber:timber:$timberVersion"
  val constraintLayout = "com.android.support.constraint:constraint-layout:$constraintLayoutVersion"

  val glideRuntime = "com.github.bumptech.glide:glide:$glideVersion"
  val glideComplier = "com.github.bumptech.glide:compiler:$glideVersion"

  val dagger = "com.google.dagger:dagger:$daggerVersion"
  val daggerComplier = "com.google.dagger:dagger-compiler:$daggerVersion"
  val daggerSupport = "com.google.dagger:dagger-android-support:$daggerVersion"
  val daggerProcessor = "com.google.dagger:dagger-android-processor:$daggerVersion"

  val rxAndroid = "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion"
  val rxKotlin = "io.reactivex.rxjava2:rxkotlin:$rxKotlinVersion"
  val javaxAnnotation = "javax.annotation:jsr250-api:$javaxAnnotationVersion"
  val javaxInject = "javax.inject:javax.inject:$javaxInjectVersion"
  val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
  val glassfishAnnotation = "org.glassfish:javax.annotation:$glassfishAnnotationVersion"

  val roomRuntime = "android.arch.persistence.room:runtime:$archCompVersion"
  val roomCompiler = "android.arch.persistence.room:compiler:$archCompVersion"
  val roomRxJava = "android.arch.persistence.room:rxjava2:$archCompVersion"

  val moshi = "com.squareup.moshi:moshi:$moshiVersion"
  val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion"
  val okHttp = "com.squareup.okhttp3:okhttp:$okhttpVersion"
  val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:$okhttpVersion"
  val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
  val retrofitConverter = "com.squareup.retrofit2:converter-gson:$retrofitVersion"
  val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"

  val archRuntime = "android.arch.lifecycle:runtime:$archCompVersion"
  val archExtensions = "android.arch.lifecycle:extensions:$archCompVersion"
  val archCompiler = "android.arch.lifecycle:compiler:$archCompVersion"
  val archCoreRuntime = "android.arch.core:runtime:$archCompVersion"
  val archCommon = "android.arch.core:common:$archCompVersion"
  val archLiveDataCore = "android.arch.lifecycle:livedata-core:$archCompVersion"
  val archLiveCycle = "android.arch.lifecycle:viewmodel:$archCompVersion"
  val dataBinding = "com.android.databinding:compiler:$androidGradleVersion"

  val androidKTX = "androidx.core:core-ktx:$androidKTXVersion"

  val stetho = "com.facebook.stetho:stetho:$stethoVersion"

  val rabbit = "org.rabbit-converter.rabbit:rabbit:$rabbitVersion"
}

object TestLibs {
  val espressoCore = "com.android.support.test.espresso:espresso-core:$espressoVersion"
  val espressoIntents = "com.android.support.test.espresso:espresso-intents:$espressoVersion"
  val espressoContrib = "com.android.support.test.espresso:espresso-contrib:$espressoVersion"
  val rxIdler = "com.squareup.rx.idler:rx2-idler:0.9.0"
  val jUnit = "junit:junit:$jUnitVersion"
  val jUnitRunner = "com.android.support.test:runner:$androidJUnitVersion"
  val jUnitRules = "com.android.support.test:rules:$androidJUnitVersion"
  val mockito = "org.mockito:mockito-core:$mockitoVersion"
  val mockitoInline = "org.mockito:mockito-inline:$mockitoVersion"
  val mockitoAndroid = "org.mockito:mockito-android:$mockitoVersion"

  val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:$mockitoKotlinVersion"
  val assertj = "org.assertj:assertj-core:$assertJVersion"
  val kotlinJUnit = "org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion"
  val robolectric = "org.robolectric:robolectric:$robolectricVersion"
  val roomTesting = "android.arch.persistence.room:testing:$archCompVersion"
  val archTesting = "android.arch.core:core-testing:$archCompVersion"
}

fun generateVersionName(): String {
  return "$versionMajor.$versionMinor.$versionPatch"
}

fun generateVersionCode(): Int {
  return versionMajor * 10000 + versionMinor * 1000 + versionPatch * 100
}