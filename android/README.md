# Android Apps


## Features

Click on the links below to read about the features of the apps.

- [Robot App](app/README.md)
<!-- - [Controller App](controller/README.md) -->

## Install the apps

You can then open the apk on your phone and [install](https://www.lifewire.com/install-apk-on-android-4177185) it. Note that the apk is only signed with a debug key.
 
You can download by scanning below QRCode.

<table style="width:100%;border:none;text-align:center">
  <tr>
    <td>  
        <a href="https://tinyurl.com/cvpro-openbot" target="_blank">
          <img alt="🤖 App" width="20%" src="../docs/images/CVPRO_OpenBot-QRCode.png" />
        </a>
    </td>
  </tr>
  <tr>
    <td>🤖 App</td>
  </tr>
</table>

<!--
  <td>
  <a href="https://app.openbot.org/controller" target="_blank">
    <img alt="🎮 App" width="50%" src="../docs/images/controller_app_qr_code.png" />
  </a>
      </td>
  </tr>
  <tr>
    <td>🤖 App</td>
    <td>🎮 App</td>
  </tr>
</table> -->


Alternatively, you can download the apks from the assets of any [release](https://github.com/robotixdevteam/CVPro_OPENBOT/releases). 
<!-- If you want the latest app from the master branch, you can also download it from the build artifacts [here](https://github.com/intel-isl/OpenBot/actions?query=workflow%3A%22Java+CI+with+Gradle%22). Note, that it may not be stable. If you would like to make changes to the app later, follow the steps below to compile the app and deploy it on your phone. -->

## Build the apps

### Prerequisites

- [Android Studio 3.2 or later](https://developer.android.com/studio/index.html) for building and installing the apks.
- Android device and Android development environment with minimum API 26.
- Currently, we use API 30 as compile SDK and API 29 as target SDK. It should get installed automatically, but if not you can install the SDK manually. Go to Android Studio -> Preferences -> Appearance & Behaviour -> System Settings -> Android SDK. Make sure API 30 is checked and click apply.

![Android SDK](../docs/images/android_studio_sdk.jpg)

### Build process

1. Open Android Studio and select *Open an existing Android Studio project*.
2. Select the OpenBot/android directory and click OK.
3. If you want to install the [OpenBot app](app/README.md) make sure to select the *app* configuration. Confirm Gradle Sync if neccessary. To perform a Gradle Sync manually, click on the gradle icon.
  ![Gradle Sync](../docs/images/android_studio_bar_gradle.jpg)
4. Connect your Android device and make sure USB Debugging in the [developer options](https://developer.android.com/studio/debug/dev-options) is enabled. Depending on your development environment [further steps](https://developer.android.com/studio/run/device) might be necessary. You should see your device in the navigation bar at the top now.
  ![Phone](../docs/images/android_studio_bar_phone.jpg)
5. Click the Run button (the green arrow) or select Run > Run 'android' from the top menu. You may need to rebuild the project using Build > Rebuild Project.
  ![Run](../docs/images/android_studio_bar_run.jpg)
6. If it asks you to use Instant Run, click *Proceed Without Instant Run*.

