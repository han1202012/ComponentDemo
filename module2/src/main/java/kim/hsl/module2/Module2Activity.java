package kim.hsl.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/module2/Module2Activity")
public class Module2Activity extends AppCompatActivity {

    private static final String TAG = "Module2Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);
    }

    public void onClick(View view) {
        Log.i(TAG, "跳转到 app");
        ARouter.getInstance().build("/app/MainActivity").navigation();
        finish();
    }
}