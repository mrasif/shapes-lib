# shapes-lib
Shapes is an Android Drawing Library. Using this Library you can draw any kind of shape.

## For Gradle:
Step 1. Add it in your root build.gradle at the end of repositories:
```
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
Step 2. Add the dependency:
```
dependencies {
        implementation 'com.github.mrasif:shapes-lib:v1.0.0'
}
```
### For Maven:
Step 1. Add the JitPack repository to your build file:
```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
Step 2. Add the dependency:
```
<dependency>
    <groupId>com.github.mrasif</groupId>
    <artifactId>shapes-lib</artifactId>
    <version>v1.0.0</version>
</dependency>
```
### For SBT:
Step 1. Add the JitPack repository to your build.sbt file:
```
resolvers += "jitpack" at "https://jitpack.io"
```
Step 2. Add the dependency:
```
libraryDependencies += "com.github.mrasif" % "shapes-lib" % "v1.0.0"
```
### For Leiningen:
Step 1. Add it in your project.clj at the end of repositories:
```
:repositories [["jitpack" "https://jitpack.io"]]
```
Step 2. Add the dependency:
```
:dependencies [[com.github.mrasif/shapes-lib "v1.0.0"]]
```

### Add this in your layout xml file:
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="5dp">

        <in.mrasif.libs.shapes.Square
            android:layout_width="100dp"
            android:layout_height="60dp"
            app:color="#060759"
            />

        <in.mrasif.libs.shapes.Triangle
            android:layout_width="60dp"
            android:layout_height="60dp"
            android:layout_marginLeft="10dp"
            app:points="0.1,0.2,0,0.9,0.5,0.8"
            app:color="#093504"
            />

        <in.mrasif.libs.shapes.Rectangle
            android:layout_width="100dp"
            android:layout_height="60dp"
            app:color="#bf0f0f"
            app:points="0,0.2,1,0.1,0.9,0.9,0.1,0.8"/>
        <in.mrasif.libs.shapes.Circle
            android:layout_width="60dp"
            android:layout_height="60dp"
            android:layout_marginLeft="10dp"
            app:pivotX="0.5"
            app:pivotY="0.5"
            app:radius="0.5"
            app:color="#30032e"/>
    </LinearLayout>
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="5dp">
        <in.mrasif.libs.shapes.Circle
            android:layout_width="60dp"
            android:layout_height="60dp"
            android:layout_marginLeft="10dp"
            app:pivotX="0.5"
            app:pivotY="0.5"
            app:radius="0.5"
            app:color="#30032e"
            app:border="10"
            app:border_color="#34d40c"/>
    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="5dp">
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <in.mrasif.libs.shapes.Square
                android:layout_width="match_parent"
                android:layout_height="70dp"
                app:color="#30032e"/>
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:gravity="center_vertical">
                <in.mrasif.libs.shapes.Circle
                    android:layout_width="60dp"
                    android:layout_height="60dp"
                    android:layout_marginLeft="5dp"
                    android:layout_marginTop="5dp"
                    android:layout_marginBottom="5dp"
                    app:pivotX="0.5"
                    app:pivotY="0.5"
                    app:radius="0.5"
                    app:color="#ffffff"
                    app:border="10"
                    app:border_color="#34d40c"/>
                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="10dp"
                    android:text="Android"
                    android:textStyle="bold"
                    android:textSize="20sp"
                    android:textColor="#FFF"/>
            </LinearLayout>
            <TextView
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:text="1"
                android:textStyle="bold"
                android:textSize="30sp"
                android:textColor="#30032e"
                android:gravity="center"/>
            <in.mrasif.libs.shapes.Triangle
                android:layout_width="60dp"
                android:layout_height="70dp"
                app:color="#FFF"
                app:points="0.2,0,1,0,1,1"
                android:layout_alignParentRight="true"
                android:layout_alignParentEnd="true"
                android:visibility="gone"/>
        </RelativeLayout>

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="5dp">
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            <in.mrasif.libs.shapes.Square
                android:layout_width="match_parent"
                android:layout_height="70dp"
                app:color="#30032e"/>
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:gravity="center_vertical">
                <in.mrasif.libs.shapes.Circle
                    android:layout_width="60dp"
                    android:layout_height="60dp"
                    android:layout_marginLeft="5dp"
                    android:layout_marginTop="5dp"
                    android:layout_marginBottom="5dp"
                    app:pivotX="0.5"
                    app:pivotY="0.5"
                    app:radius="0.5"
                    app:color="#ffffff"
                    app:border="10"
                    app:border_color="#34d40c"/>
                <TextView
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="10dp"
                    android:text="Linux"
                    android:textStyle="bold"
                    android:textSize="20sp"
                    android:textColor="#FFF"/>
            </LinearLayout>
            <TextView
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:text="2"
                android:textStyle="bold"
                android:textSize="30sp"
                android:textColor="#30032e"
                android:gravity="center"/>
            <in.mrasif.libs.shapes.Triangle
                android:layout_width="60dp"
                android:layout_height="70dp"
                app:color="#FFF"
                app:points="0.2,0,1,0,1,1"
                android:layout_alignParentRight="true"
                android:layout_alignParentEnd="true"
                android:visibility="gone"/>
        </RelativeLayout>

    </LinearLayout>

</LinearLayout>
```

You are done.
