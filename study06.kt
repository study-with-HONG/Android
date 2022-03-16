************************************************** MainActivity.kt
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.example.sample05.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){
    /*  build.gradle(:app) > android{}에 추가
            buildFeatures{
                viewBinding true
            }
    */
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // textView 전광판 효과 나타내기
//        setContentView(R.layout.activity_main)
//        val tv = findViewById<TextView>(R.id.textView)
//        tv.isSelected = true

        // editText 실시간 입력
        setContentView(binding.root)
        binding.editText.addTextChangedListener {
            Log.d("EditText", "실시간 입력 : ${it.toString()}")
        }
    }
}
************************************************** activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

    <!--android:text 내용은 strings.xml에서 변경-->
    <TextView
            android:id="@+id/textView" android:text="@string/addStr"
            android:textColor="#ff0000" android:background="@color/black"
            android:textSize="30sp"
            android:ellipsize="marquee"
            android:focusable="true" android:singleLine="true"
            android:layout_width="match_parent" android:layout_height="50dp"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintBottom_toBottomOf="parent"/>

    <!--android:inputType에서 키보드 변경 가능 ex) 글자, 숫자-->
    <EditText
            android:id="@+id/editText"
            android:hint="글자를 입력하시오"
            android:inputType="textPersonName"
            android:layout_width="300dp" android:layout_height="50dp"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintTop_toBottomOf="@+id/textView"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintVertical_bias="0.1"/>
</androidx.constraintlayout.widget.ConstraintLayout>
************************************************** strings.xml
<!--app > src > main > res > values > strings.xml-->
<!--여기에 정의해 놓은 텍스트를 가져다 사용하면 다국어 처리, 텍스트 수정 등 앱관리에 용이-->
<resources>
    <string name="app_name">study04</string>
    <string name="addStr">
        [00시청] 0월 00일(요일) 00:00 기준 00시 코로나 19 신규확진자 00,000명 발생
        [중대본] 18세 이상은 코로나19 2차접종 3개월 경과시 3차접종을 받으시기 바랍니다.</string>
</resources>
