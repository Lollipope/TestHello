# TestHello
测试上传library到github中

添加README
Step 1.Add it in your root build.gradle at the end of repositories:
        allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }

Step 2. Add the dependency
        dependencies {
                compile 'com.github.Lollipope:TestHello:v1.0.0'
        }