package kim.hsl.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/module1/Module1Activity")
public class Module1Activity extends AppCompatActivity {

    private static final String TAG = "Module1Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1);
    }

    public void onClick(View view) {
        Log.i(TAG, "跳转到 Module2");
        ARouter.getInstance().build("/module2/Module2Activity").navigation();
        finish();
    }
}