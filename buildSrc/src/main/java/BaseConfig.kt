/**
 * ================================================
 * @author ：echizen
 * @date   ：2021/06/25
 * describe：版本信息，第三方依赖库统一管理
 *
 * Copyright(c) 2021, echizen.
 * ================================================
 */
object BuildConfig {
    val compileSdkVersion = 30
    val buildToolsVersion = "30.0.3"
    val applicationId = "me.echizen.toolkits"
    val minSdkVersion = 19
    val targetSdkVersion = 30
    val versionCode = 1
    val versionName = "1.0.0"
}

object StoreInfo {
    val storeFile = "signkey.jks"
    val storePassword = "123456"
    val keyAlias = "signed"
    val keyPassword = "123456"
}

object Versions {
    const val buildGradleVersion = "4.0.2"
    const val kotlinVersion = "1.4.10"

    const val appcompatVersion = "1.2.0"
    const val recyclerviewVersion = "1.1.0"
    const val coreVersion = "1.3.1"
    const val constraintlayout = "2.0.4"
    const val coordinatorlayout = "1.1.0"
    const val cardviewVersion = "1.0.0"
    const val multidexVersion = "2.0.1"
    const val viewpagerVersion = "1.0.0"
    const val webkitVersion = "1.1.0"

    const val materialVersion = "1.2.1"
    const val gsonVersion = "2.8.5"
    const val flexboxVersion = "2.0.1"

    const val eventbusVersion = "3.1.1"
    const val butterknifeVersion = "10.0.0"
    const val glideVersion = "4.11.0"
    const val brvahVersion = "2.9.50"

}

object AndroidX {
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerviewVersion}"
    val core = "androidx.core:core:${Versions.coreVersion}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreVersion}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout:${Versions.coordinatorlayout}"
    val cardview = "androidx.cardview:cardview:${Versions.cardviewVersion}"
    val multidex = "androidx.multidex:multidex:${Versions.multidexVersion}"
    val webkit = "androidx.webkit:webkit:${Versions.webkitVersion}"
    val viewpager = "androidx.viewpager:viewpager:${Versions.viewpagerVersion}"
}

object Google {
    val material = "com.google.android.material:material:${Versions.materialVersion}"
    val gson = "com.google.code.gson:gson:${Versions.gsonVersion}"
    val flexbox = "com.google.android:flexbox:${Versions.flexboxVersion}"
}

object Test {
    val junitRunner = "androidx.test.runner.AndroidJUnitRunner"
    val junit = "junit:junit:4.+"
    val extJunit = "androidx.test.ext:junit:1.1.2"
    val espresso = "androidx.test.espresso:espresso-core:3.3.0"
}

object Dependencies {
    val buildGradle = "com.android.tools.build:gradle:${Versions.buildGradleVersion}"
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"

    val butterknife = "com.jakewharton:butterknife:${Versions.butterknifeVersion}"
    val butterknifeCompiler = "com.jakewharton:butterknife-compiler:${Versions.butterknifeVersion}"
    val butterknifeGradlePlugin =
        "com.jakewharton:butterknife-gradle-plugin:${Versions.butterknifeVersion}"

    val eventbus = "org.greenrobot:eventbus:${Versions.eventbusVersion}"

    val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
    val glideOkhttp3 = "com.github.bumptech.glide:okhttp3-integration:${Versions.glideVersion}"

    val brvah = "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.brvahVersion}"

    val smartRefreshLayout = "com.scwang.smartrefresh:SmartRefreshLayout:1.1.3"
    val smartRefreshHeader = "com.scwang.smartrefresh:SmartRefreshHeader:1.1.3"

    val immersionbar = "com.gyf.immersionbar:immersionbar:3.0.0"

    val rxHttp = "com.github.goweii:RxHttp:2.2.9"
    val anyPermission = "com.github.goweii:AnyPermission:1.1.2"
    val anyDialog = "com.github.goweii:AnyDialog:3.0.3"
    val anyLayer = "com.github.goweii:AnyLayer:3.4.1-androidx"
    val actionBarEx = "com.github.goweii:ActionBarEx:3.3.0"

    val roundedimageview = "com.makeramen:roundedimageview:2.3.0"
    val circleimageview = "de.hdodenhof:circleimageview:2.2.0"
    val magicIndicator = "com.github.hackware1993:MagicIndicator:1.6.0"
    val photoView = "com.github.chrisbanes:PhotoView:2.3.0"
    val materialProgressBar = "me.zhanghai.android.materialprogressbar:library:1.4.2"

    val banner = "com.youth.banner:banner:1.4.10"
    val persistentCookieJar = "com.github.franmontiel:PersistentCookieJar:v1.0.1"

    val swipelayout = "com.daimajia.swipelayout:library:1.2.0@aar"
    val disklrucache = "com.jakewharton:disklrucache:2.0.2"
    val multiStateView = "com.github.Kennyc1012:MultiStateView:2.1.2"
    val pictureSelector = "com.github.LuckSiege.PictureSelector:picture_library:v2.5.8"

    val tbs = "com.tencent.tbs.tbssdk:sdk:43697"
    val qrcode = "cn.bingoogolapple:bga-qrcode-zxing:1.3.7"
    val qrzbar = "cn.bingoogolapple:bga-qrcode-zbar:1.3.7"

    val arouterApi = "com.alibaba:arouter-api:1.4.1"
    val arouterCompiler = "com.alibaba:arouter-compiler:1.2.2"

    val blurred = "com.github.goweii:blurred:1.3.0"
    val crashActivity = "cat.ereza:customactivityoncrash:2.2.0"
    val shadowLayout = "com.github.lihangleo2:ShadowLayout:3.1.8"
    val pickerView = "com.contrarywind:Android-PickerView:4.1.9"
    val pageindicatorview = "com.romandanylyk:pageindicatorview:1.0.3"


    //loading 动画
    val spinkit = "com.github.ybq:Android-SpinKit:1.4.0"

    val bottombarlayout = "com.github.chaychan:BottomBarLayout:1.2.0"

    val scrollable = "ru.noties:scrollable:1.3.0"
    val spliteditview = "com.open.keeplearn:SplitEditTextView:1.2.3"


    //微信开源项目，替代SP
    val mmkv = "com.tencent:mmkv:1.0.22"

    val fragmentationx = "me.yokeyword:fragmentationx:1.0.2"
    val fragmentationxSwipeback = "me.yokeyword:fragmentationx-swipeback:1.0.2"

    // Activity作用域的EventBus，通信更安全
    val eventbusActivityScope = "me.yokeyword:eventbus-activity-scope:1.1.0"
}