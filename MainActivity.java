package com.example.myapplicationsemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plugins {
            id 'com.android.application'
        }

        android {
            compileSdkVersion 30
            buildToolsVersion "30.0.2"

            defaultConfig {
                applicationId "com.estebangarriga.petagram"
                minSdkVersion 24
                targetSdkVersion 30
                versionCode 1
                versionName "1.0"

                testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
            }

            buildTypes {
                release {
                    minifyEnabled false
                    proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
                }
            }
            compileOptions {
                sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
            }
        }

        dependencies {

            implementation 'androidx.appcompat:appcompat:1.2.0'
            implementation 'com.google.android.material:material:1.2.1'
            implementation 'androidx.constraintlayout:constraintlayout:2.0.4'
            implementation "androidx.cardview:cardview:1.0.0"
            implementation 'androidx.recyclerview:recyclerview:1.1.0'

            testImplementation 'junit:junit:4.13.1'
            androidTestImplementation 'androidx.test.ext:junit:1.1.2'
            androidTestImplementation 'androidx.test.espresso:espresso-core:3.3.0'
        }
    }
}