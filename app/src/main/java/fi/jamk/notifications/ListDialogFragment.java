package fi.jamk.notifications;

import fi.jamk.notifications.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Risto on 17.9.2017.
 */

public class ListDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // create a dialog builder
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // set title
        builder.setTitle(R.string.listdialog_title)
                // set items and item listener
                .setItems(R.array.messagetypes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int index) {
                        Resources res = getResources();
                        String[] messageTypes = res.getStringArray(R.array.messagetypes);
                        Toast.makeText(getActivity(), "Selected messageType = " + messageTypes[index], Toast.LENGTH_SHORT).show();
                    }
                });
        return builder.create();
    }
}
