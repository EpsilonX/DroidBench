package de.ecspride;

import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;

public class Button2Listener implements OnClickListener {
	
	private final MainActivity act;
	
	public Button2Listener(MainActivity parentActivity) {
		this.act = parentActivity;
	}

	@Override
	public void onClick(View arg0) {
    	SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage("+49", null, act.imei, null, null);  //sink, leak
	}

}
