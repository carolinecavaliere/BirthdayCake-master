package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CakeController implements View.OnClickListener
{
    private CakeView viewCake = null;
    private CakeModel cakeModel = null;

    public CakeController(CakeView c)
    {
        viewCake = c;
        cakeModel = c.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        Log.d("button2", "Blow Out");
        cakeModel.isLit = false;
        viewCake.invalidate();
    }
}
