# 2-mal-clevertec-multiproject

### 1. To connect the plugin, copy this code in the build.gradle:

    buildscript {
        repositories {
            mavenLocal()
        }
        dependencies {
            classpath 'ru.clevertec.pluginFileImage:ru.clevertec.pluginFileImage.gradle.plugin:1.0'
        }
    }
    
    plugins {
        id 'java'
    }
    apply plugin: 'ru.clevertec.pluginFileImage'
    
    group 'ru.clevertec'
    version '1.0'
    
    subprojects {
        repositories {
            mavenCentral()
            mavenLocal()
        }
    }

### 2. After reassembling, a plug in File Image will appear in gradle.other
Run "load image"
### 3. The picture will be saved in the folder where the project is located