//******************************************************************************** activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".MainActivity">
    <Button
            android:text="Button1"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" android:id="@+id/button"/>
    <Button
            android:text="Button2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" android:id="@+id/button2"/>
    <LinearLayout
            android:orientation="horizontal"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        <Button
                android:text="Button3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" android:id="@+id/button3" android:layout_weight="1"/>
        <Button
                android:text="Button4"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" android:id="@+id/button4" android:layout_weight="1"/>
        <Button
                android:text="Button5"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content" android:id="@+id/button5" android:layout_weight="1"/>
    </LinearLayout>
    <!--android:orientation을 "vertical"로 하면 요소가 세로로 쌓이고
                              "horizontal"로 하면 가로로 쌓임-->
</LinearLayout>
