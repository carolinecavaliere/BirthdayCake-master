package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener
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

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        cakeModel.hasCandles = b;
        viewCake.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        cakeModel.numCandles= i;
        viewCake.invalidate();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
