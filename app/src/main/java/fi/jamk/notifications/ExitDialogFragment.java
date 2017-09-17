package fi.jamk.notifications;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;


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



                        //android.os.Process.killProcess(android.os.Process.myPid());
                        //System.exit(1);
                    }
                })
                .setNegativeButton(R.string.dialog_continue, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // User cancelled the dialog
                        Toast.makeText(getActivity(), "Click again", Toast.LENGTH_SHORT).show();



                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }

}
