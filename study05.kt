import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.example.study08.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edit = findViewById<EditText>(R.id.editText)
        val ok = findViewById<Button>(R.id.okBtn)
        val remove = findViewById<Button>(R.id.removeBtn)

        ok.setOnClickListener{
            AlertDialog.Builder(this@MainActivity)
                .setTitle("입력내용")
                .setMessage(edit.text)
                .setCancelable(false)
                .setNeutralButton("확인", DialogInterface.OnClickListener { _, _ ->
                    // 닫기 버튼 클릭하면 처리할 내용
                }).show()
        }
        remove.setOnClickListener {
            AlertDialog.Builder(this@MainActivity)
                .setTitle("삭제")
                .setMessage("입력 내용을 삭제하시겠습니까?")
                .setCancelable(false)
                .setNeutralButton("확인", DialogInterface.OnClickListener { _, _ ->
                    edit.setText("")
                }).show()
        }
    }
}
