package comxmausoleumx.httpsgithub.pairity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        Button createNewPairing = (Button) findViewById(R.id.createNewPairing);
        createNewPairing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCreateNewPairingPage();
            }
        });
        Button linkExistingButton = (Button) findViewById(R.id.linkExistingButton);
        linkExistingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLinkExistingPage();
            }
        });
        Button removeLinkButton = (Button) findViewById(R.id.removeLinkButton);
        removeLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRemoveLinkPage();
            }
        });
        Button settingsButton = (Button) findViewById(R.id.settingsButton);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSettingsPage();
            }
        });
    }


    private void goToCreateNewPairingPage(){
        Intent intent = new Intent(this, createNewPairingPage.class);
        startActivity(intent);
    }

    private void goToLinkExistingPage(){
        Intent intent = new Intent(this, linkExistingPage.class);
        startActivity(intent);
    }

    private void goToRemoveLinkPage(){
        Intent intent = new Intent(this, removeLinkPage.class);
        startActivity(intent);
    }

    private void goToSettingsPage(){
        Intent intent = new Intent(this, mainPageSettings.class);
        startActivity(intent);
    }


}
