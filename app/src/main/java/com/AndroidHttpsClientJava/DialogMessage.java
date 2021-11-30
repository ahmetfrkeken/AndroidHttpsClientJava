package com.AndroidHttpsClientJava;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DialogMessage {
    private Activity activity;
    private AlertDialog alertDialog;

    Resources resources;
    int colorGreen;
    int colorRed;

    int iconSuccess;
    int iconFail;

    View view;
    ImageView imageView;
    TextView textView;
    Button button;

    private DialogMessage(Activity activity) {
        this.activity = activity;

        resources = activity.getResources();

        colorGreen = resources.getColor(R.color.apartSoftGreenTextColor, activity.getTheme());
        colorRed = resources.getColor(R.color.red, activity.getTheme());

        iconFail = R.drawable.ic_fail;
        iconSuccess = R.drawable.ic_success;
    }

    public static DialogMessage create(Activity activity) {
        return new DialogMessage(activity);
    }

    public void startLoadingDialog(boolean isProcessSuccess, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();

        View customView = inflater.inflate(R.layout.dialog_message, null);

        view = customView.findViewById(R.id.viewTopColorBar);
        imageView = customView.findViewById(R.id.imageViewMessageDialogIcon);
        textView = customView.findViewById(R.id.textViewMessage);
        button = customView.findViewById(R.id.buttonBack);

        setColorsView(isProcessSuccess);

        textView.setText(message);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismissDialog();
            }
        });

        builder.setView(customView);
        builder.setCancelable(true);

        alertDialog = builder.create();
        alertDialog.show();

    }

    private void setColorsView(boolean isProcessSuccess) {
        int color;
        if (isProcessSuccess) {
            color = colorGreen;
            imageView.setImageResource(iconSuccess);
        } else {
            color = colorRed;
            imageView.setImageResource(iconFail);
        }

        view.setBackgroundColor(color);
        button.setBackgroundColor(color);
    }

    public void dismissDialog() {
        alertDialog.dismiss();
    }

}
