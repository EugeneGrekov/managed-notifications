package guru.msgs.sdk_lib_w;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import guru.msgs.sdk_lib.utils.CollectData;
import guru.msgs.sdk_lib.utils.ExportData;
import guru.msgs.sdk_lib.utils.SaveStatisticsBase;

public class SaveStatistics extends SaveStatisticsBase
{
    public SaveStatistics(Context context) {
        super(context);
    }

    public ExportData Export() {
        return super.Export();
    }

    public void Update(CollectData d) {
        super.Update(d);
    }


}
