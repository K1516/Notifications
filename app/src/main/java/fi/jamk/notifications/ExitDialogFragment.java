package fi.jamk.notifications;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;



/**
 * Created by Risto on 17.9.2017.
 */

public class ExitDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class to create a Dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_title)
                .setMessage(R.string.dialog_exit)
                .setPositiveButton(R.string.dialog_yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Close application
                        Toast.makeText(getActivity(), "Click again", Toast.LENGTH_SHORT).show();


                    }
                })
                .setNegativeButton(R.string.dialog_stop, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        Toast.makeText(getActivity(), "Something went wrong,cClick again", Toast.LENGTH_SHORT).show();



                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

}
