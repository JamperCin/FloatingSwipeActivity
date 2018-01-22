# FloatingSwipeActivity
Easily customize the feel and look of your activity by making your activity float with nice rounded corners, and adding activity dismissal to  Activity by swiping up or down
[![](https://www.jitpack.io/v/JamperCin/FloatingSwipeActivity.svg)](https://www.jitpack.io/#JamperCin/FloatingSwipeActivity)

**Step 1: Add this to your root build.gradle(Project level) at the end of repositories:**

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  **Step 2: Add the dependency to your dependencies in the build.gradle (Module:App level)**

	dependencies {
	       compile 'com.github.JamperCin:FloatingSwipeActivity:1.0.1'
	}
  
 

**Step 3: Extend it from the Activity you want to apply it on like below... **

**A. When you want to apply both FLOATING and SWIPING gestures to the same activity, you extend FLoatingSwipeActivity**

```
  public class TestActivity extends FloatingSwipeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_layout);
    }
}
```
**B. When you want to apply only FLOATING  to the activity, you extend FLoatingActivity**

```
public class TestActivity extends FloatingActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_layout);
    }
}

```

**Step 4: In your styles, extend the parent style from Theme.FloatingSwipe like below...**

```
   <!-- Base application theme. -->
    <style name="FloatingAppTheme" parent="Theme.FloatingSwipe">
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
    </style>

```

**Apply the custom style to your Activity from Manifest like below**
```
   <activity
            android:name=".TestActivity"
            android:theme="@style/FloatingAppTheme" />
```



