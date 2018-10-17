package tiendas3b.com.mx.datamidemo;

import android.app.Application;

import com.datami.smi.SmiSdk;

import java.util.List;

public class Tiendas3BApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        String apiKey = "ak-e803f376-313b-4d87-a944-9530b8f2477d";
        String userId = "opelayoa";
        List exclusionDomains = null;
        int iconId = -1;
        boolean showMessaging = true;

        SmiSdk.initSponsoredData(apiKey, this, userId, iconId, showMessaging, exclusionDomains);

    }
}
