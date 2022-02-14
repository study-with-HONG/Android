----- MainActivity.kt
import android.content.ContentValues
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.study01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /*  lazy 사용하려면 build.gradle(:app)에
        buildFeatures{
            viewBinding true
        }  추가
    */
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. lazy 이용하는 방법
        /*setContentView(binding.root) // lazy 처리하면 binding은 여기서 초기화
        binding.button.setOnClickListener { // 버튼 클릭하면 실행
            Log.i(ContentValues.TAG, "버튼 클릭!!") // 실행 창에 출력
            println("버튼 클릭")
            binding.textView.setText("버튼 클릭")       // 화면 textView에 출력
        }*/

        // 2. 기본적인 방법
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            text.text = "버튼을 클릭했습니다"

            // Toast 띄우기
            val toast = Toast.makeText(this.applicationContext, "버튼 클릭", Toast.LENGTH_SHORT)
            toast.show() // 이걸 안 하면 toast가 안 보임

            // alert 창 띄우기
            AlertDialog.Builder(this@MainActivity)
                .setTitle("Welcome")
                .setMessage("반갑습니다")
                .setCancelable(false)
                .setNeutralButton("닫기", DialogInterface.OnClickListener{dialog, which->
                    //닫기 버튼 클릭하면 처리할 내용
                }).show()
        }
    }
}

----- activity_main.xml
<?xml version="1.0" encoding="utf-8"?><!-- ConstraintLayout : 해상도 자동 맞춤 -->
<androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">
    <TextView
            android:id="@+id/textView"
            android:text="Hello World!" android:textSize="20sp"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.477"/>
    <Button
            android:id="@+id/button"
            android:text="click" android:textSize="30sp"
            android:layout_width="187dp"
            android:layout_height="75dp"
            app:layout_constraintStart_toStartOf="parent" app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintBottom_toBottomOf="parent" app:layout_constraintTop_toTopOf="parent"
            app:layout_constraintVertical_bias="0.592"/>
</androidx.constraintlayout.widget.ConstraintLayout>
